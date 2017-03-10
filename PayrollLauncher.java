import java.util.Scanner;
public class PayrollLauncher {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		//Initializes variables
		String name;
		int ID;
		double PayRate;
		int HoursWorked;
		//opens the Scanner object
		Scanner keybord = new Scanner(System.in);
		//asks for the employee name
		System.out.println("Enter the employee name:");
		name = keybord.nextLine();
		if (name == null) {
			//if the name is empty then it throws an IllegalArgumentException
			throw new IllegalArgumentException("Name must not be empty");
		}
		//asks for the Employee ID
		System.out.println("Enter the employee ID number:");
		ID = keybord.nextInt();
		if (ID <= 0) {
			//if the ID is a negative number then it throws a IllegalArgumentException
			throw new IllegalArgumentException("Can not be 0 or a negative number");
		}
		//asks for the Pay Rate
		System.out.println("Enter the Pay Rate: ");
		PayRate = keybord.nextDouble();
		if (PayRate < 0 || PayRate > 25) {
			//if the PayRate is less than 0 or greater than 25 then it throws an IllegalArgumentException
			throw new IllegalArgumentException("Can not be a negative number or more than 25");
		}
		//asks for the amount of hours worked
		System.out.println("Enter the amount of hours the employee worked:");
		HoursWorked = keybord.nextInt();
		if (HoursWorked < 0 || HoursWorked > 84) {
			//if hoursWorked is negative or HoursWorked is more than 84 it throws a IllegalArgumentException
			throw new IllegalArgumentException("Hours worked can not be a negative number or more than 84 hours");
		}
		//creates the Payroll object and passes the data to it
		Payroll person1 = new Payroll(name, ID, PayRate, HoursWorked);
		
		//prints everything to the screen
		System.out.println("Name: " + person1.getName());
		System.out.println("ID number: " + person1.getID());
		System.out.println("Pay Rate: " + person1.getHourlyPayRate());
		System.out.println("Hours Worked: " + person1.getHoursWorked());
		System.out.println("Gross Pay: " + person1.Maths());
		//closes the keyboard object
		keybord.close();
	}
}
