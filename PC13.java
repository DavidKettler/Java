import java.util.Scanner;
public class PC13 {

	public static void main(String[] args) {
		//declaring variables
		double charge;
		double tip = 0.18;
		double tax = 0.075;
		double totalTip;
		double totalTax;
		double total;
		//declaring scanner object
		Scanner keybord = new Scanner(System.in);
		System.out.println("Enter the amout the meal was");
		charge = keybord.nextDouble();
		totalTip = charge * tip;
		totalTax = charge * tax;
		total = charge + totalTip + totalTax;
		//print to screen
		System.out.println("Meal: " + charge);
		System.out.println("Tip: " + totalTip);
		System.out.println("Tax: " + totalTax);
		System.out.println("Total: " + total);
		keybord.close();
	}

}
