import java.text.DecimalFormat;
import java.util.Scanner;

public class num2Launcher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		num2Payroll p1 = new num2Payroll();
			for(int i = 0; i  < p1.getEmployeeId().length; i++){
				System.out.println("For " + p1.getEmployeeId()[i]);
				System.out.println("Enter the hours worked: ");
				p1.setHours(keyboard.nextInt());
				while(p1.getHours()[i] < 0){
					System.out.println("Invalid data Re-Enter the hours worked: ");
					p1.setHours(keyboard.nextInt());
				}
				System.out.println("Enter the Pay Rate: ");
				p1.setPayRate( keyboard.nextDouble());
				while(p1.getPayRate()[i] < 6.00){
					System.out.println("Invalid Data Re-Enter the Pay Rate: ");
					p1.setPayRate( keyboard.nextDouble());
				}
				p1.setWages();
				p1.addCount();
			}
			DecimalFormat money = new DecimalFormat("$#,##0.00");
			System.out.println("Enter an eployee Id: ");
			int empId = keyboard.nextInt();
			for(int i = 0; i < 7; i++){
				if (empId == p1.getEmployeeId()[i]){
				System.out.println("Employee ID: "+ p1.getEmployeeId()[i]);
				System.out.println("Gross Wage: "+ money.format(p1.getWages()[i]));
				}
			}
	}

}
