import java.text.NumberFormat;
public class Chapter1and2HoT {

	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		//bought
		final double NUM_BARS = 567;
		final double PURCHASE_PRICE = 11562;
		final double BROKER_COMM_RATE = 0.03;
		double goldPurchase = NUM_BARS * PURCHASE_PRICE;
		double purchaseComm = goldPurchase * BROKER_COMM_RATE;
		double amountPaid = goldPurchase + purchaseComm;
		System.out.println("Jack bought the bars for " + formatter.format(goldPurchase) + ".");
		System.out.println("He paid his broker " + formatter.format(purchaseComm) + ".");
		System.out.println("In total jack paid " + formatter.format(amountPaid) + ".");
		
		System.out.println();
		//sold
		final double SELLING_PRICE = 13243;
		double goldSale = NUM_BARS * SELLING_PRICE;
		double sellingComm = goldSale * BROKER_COMM_RATE;
		double amountRecieved = goldSale - sellingComm;
		double profitOrLoss = amountRecieved - amountPaid;
		System.out.println("Jack sold his gold bars for " + formatter.format(goldSale) + ".");
		System.out.println("He had to pay his broker " + formatter.format(sellingComm) + ".");
		System.out.println("In total Jack made " + formatter.format(amountRecieved) + ".");
		System.out.println("Jack profited " + formatter.format(profitOrLoss));
	}

}