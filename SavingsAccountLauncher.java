import java.util.Scanner;
import java.text.DecimalFormat;
public class SavingsAccountLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double startBalance; //variable for the original balance as a double
		double anualIntrest; // variable for the annual interest as a double
		int months;// variable months as an int
		double deposit;//variable deposit as double
		double withdrawn;// variable withdrawn as a double
		
		System.out.println("What is your starting balance :");
		startBalance = keyboard.nextDouble();// sets the balance
		SavingsAccount bal = new SavingsAccount(startBalance);//sends the balance to the constructor
		
		System.out.println("What is the anual intrest rate: ");
		anualIntrest = keyboard.nextDouble();// sets the annual Interest Rate
		bal.setMonthlyIntrest(anualIntrest);//passes the annual Interest to monthly interest
		
		System.out.println("How many months have passed since the acount was created: ");
		months = keyboard.nextInt();// gets the number of months
		for(int i = 1; i <= months; ++i){// for loop runs the number of months the user entered
			System.out.println("How much was deposited in month " + i + ": ");
			deposit = keyboard.nextDouble();// sets deposit variable
			bal.deposit(deposit);// passes it to deposit method
			bal.setDeposit(deposit);// passes deposit to the total deposit setter
			
			System.out.println("How much was withdrawn in month " + i + ": ");
			withdrawn = keyboard.nextDouble();
			bal.withdrawn(withdrawn); 
			bal.setWithdraw(withdrawn);
			bal.intrest();
		}
		DecimalFormat money = new DecimalFormat("$#,##0.00");//sets decimal format
		DecimalFormat percent = new DecimalFormat("#0.00%");
		
		//Dispalys to the screen
		System.out.println("The ending balance is: "+ money.format(bal.getBalance()));
		System.out.println("The total amount of deposits is: " +
		money.format(bal.getDeposit()));
		System.out.println("The total amount of withdrawals is: " +
		money.format(bal.getWithdraw()));
		System.out.println("Your monthly Intrest rate is: " +
		percent.format(bal.getMonthlyIntrest()));
		System.out.println("The total amount of intrest earned is: " +
		money.format(bal.getIntrest()));
		
		keyboard.close();
	}

}
