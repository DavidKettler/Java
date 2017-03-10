import java.util.Scanner;
public class BankChargesLauncher {

	public static void main(String[] args) {
		int numChecks;
		double accountBalance;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amount of checks written");
		numChecks = keyboard.nextInt();
		System.out.println("Enter the account balance");
		accountBalance = keyboard.nextDouble();
		BankCharges account1 = new BankCharges(numChecks, accountBalance);
		System.out.println("Number of checks written: " + account1.getNumChecks());
		System.out.println("Account Balance: " + account1.getAccountTotal());
		System.out.println("Service fees for the month: " + account1.serviceFees());
		keyboard.close();
	}

}
