import java.util.Scanner;
public class PayrollLauncher {

	public static void main(String[] args) {
		String name;
		int ID;
		double PayRate;
		int HoursWorked;
		Scanner keybord = new Scanner(System.in);
		System.out.println("Enter the employee name:");
		name = keybord.nextLine();
		System.out.println("Enter the employee ID number:");
		ID = keybord.nextInt();
		System.out.println("Enter the Pay Rate: ");
		PayRate = keybord.nextDouble();
		System.out.println("Enter the amount of hours the employee worked:");
		HoursWorked = keybord.nextInt();
		Payroll person1 = new Payroll(name, ID, PayRate, HoursWorked);
		
		System.out.println("Name: " + person1.getName());
		System.out.println("ID number: " + person1.getID());
		System.out.println("Pay Rate: " + person1.getHourlyPayRate());
		System.out.println("Hours Worked: " + person1.getHoursWorked());
		System.out.println("Gross Pay: " + person1.Maths());
		keybord.close();
	}

}
