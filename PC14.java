import java.text.NumberFormat;

public class PC14 {

	public static void main(String[] args) {
		//declaring variables
		double shares = 1000;
		double price = 25.50;
		double commission = 0.02;
		double noComm = shares * price;
		double Comm = noComm * commission;
		double total = Comm + noComm;
		//number format object to format numbers to currency
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		//print to the mf screen
		System.out.println(formatter.format(noComm) + " in stock");
		System.out.println(formatter.format(Comm) + " in commission");
		System.out.println(formatter.format(total) + " total");
	}

}
