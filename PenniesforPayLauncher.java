import java.util.Scanner;
public class PenniesforPayLauncher {
	
	public static void main(String[] args) {
		int days;//days variable
		int loop = 5;//loop variable
		Scanner keyboard = new Scanner(System.in);//Scanner Object
		//continously loops if loop variable is not equal to 1
		while (loop != 1) {
			//asks the user to enter the amount of days
			System.out.println("You have a salary of $0.01 and your Salary doubles every day");
			System.out.println("Enter the amout of days: ");
			days = keyboard.nextInt(); //gets the days
			// if days is less than 0 it displays an error
			if (days < 0) {
				//displays an error
				System.out.println("Days can not be less than 0");
			} else {
				//if no error then displays reuslts to the screen
				//Pennies for pay object that sends the days varable to the object
				PenniesforPay person1 = new PenniesforPay(days);
				//calls the salary method 
				person1.salary();
			}
		}
		keyboard.close();
	}
}
