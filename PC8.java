import java.util.Scanner;
public class PC8 {

	public static void main(String[] args) {
		double purchase;
		double state = 0.055;
		double county = 0.02;
		double total;
		Scanner keybord = new Scanner(System.in);
		System.out.println("Enter the amount of a purchase");
		purchase = Double.parseDouble(keybord.nextLine());
		System.out.println("State tax: " + purchase * state);
		System.out.println("County tax: " + purchase * county);
		total = purchase + (purchase * state) + (purchase * county);
		System.out.println("Total is: " + total);
		keybord.close();
	}

}
