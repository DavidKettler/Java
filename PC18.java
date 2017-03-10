import java.text.NumberFormat;
public class PC18 {

	public static void main(String[] args) {
		//declaring variables
		double shares = 1000;
		double price = 32.87;
		double stock = shares * price;
		double commission = stock * 0.02;
		double total = stock + commission;
		//currency format object
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		System.out.println("Joe bought the paid " + formatter.format(stock) + " for the stock and " + formatter.format(commission) + " in commission so in total joe paid " + formatter.format(total));
		
		//declaring variables
		double soldPrice = 33.92;
		double soldStock = shares * soldPrice;
		double soldComm = soldStock * 0.02;
		double soldTotal = soldStock - soldComm;
		System.out.println("Joe sold the stock for " + formatter.format(soldStock) + ". " + formatter.format(soldComm) + " in commission");
		double profit = total - soldTotal;
		System.out.println(formatter.format(profit) + " total profit");
	}

}
