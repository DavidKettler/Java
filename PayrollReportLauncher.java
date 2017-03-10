import java.util.Scanner;
public class PayrollReportLauncher {

	public static void main(String[] args) {
		int userInputInt = -1; // for user input
		double userInputDouble = -1.0; // for user input
		double grossPayTotal = 0; //total gross pay
		double stateTaxTotal = 0;// total state tax
		double federalTaxTotal = 0;//total federal tax
		double ficaTotal = 0;// total Fica 
		double netPayTotal = 0;// total net pay
		
		//instantiate a scanner object for reading input
		Scanner keyboard = new Scanner(System.in);
		
		//instantiate a payroll report object
		PayrollReport report = new PayrollReport();
		
		while(userInputInt != 0){
			while(userInputInt < 0){
				//reset userInputInt
				userInputInt = -1;
			//ask user for employee number and store it in a variable 
			System.out.println("enter an employee number: ");
			userInputInt = keyboard.nextInt();
			//set the employee number 
			report.setEmployeeNumber(userInputInt);
			if(userInputInt < 0){
				//display a friendly message to the user
				System.out.println("please enter a greater number than 0\n");
				}//end if
			}//end while
			if(userInputInt == 0){
				break;
			}
			
			//reset userInputint
			userInputInt = -1;
			//reset userinputDouble
			userInputDouble = -1.0;
			if(userInputInt != 0){
				while(userInputDouble < 0){
					//reset userInputdouble
					userInputDouble = -1.0;	
			//ask user for gross pay and store it in a variable 
			System.out.println("enter the gross pay: ");
			userInputDouble = keyboard.nextDouble();
			//set the gross pay
			report.setGrossPay(userInputDouble);
			//get the gross pay and increment
			grossPayTotal += report.getGrossPay();
			if(userInputDouble < 0){
				//display a friendly message to the user
				System.out.println("please enter a greater number than 0\n");
				}//End if
			}//End while
				//Reset userInputDouble
				userInputDouble = -1.0;
				while(userInputDouble < 0 || userInputDouble > report.getGrossPay())
					//Reset userInputDouble
					userInputDouble = -1.0;	
			//ask user for state tax
			System.out.println("enter the state tax: ");
			userInputDouble = keyboard.nextDouble();
			//set state tax 
			report.setStateTax(userInputDouble);
			//get the state tax and increment
			stateTaxTotal += report.getStateTax();
			if(userInputDouble < 0){
				//display a friendly message to the user
				System.out.println("please enter a greater number than 0\n");
				//end if
				if(userInputDouble > report.getGrossPay()){
					//display a friendly message to the user 
					System.out.println("your state tax should not be greater than your gross pay");
				}//end if
				}//end while
				
			}
			
			
			//Reset userInputDouble
			userInputDouble = -1.0;
			while(userInputDouble < 0 || userInputDouble > report.getGrossPay())
				//Reset userInputDouble
				userInputDouble = -1.0;	
		//ask user for federal tax
			System.out.println("enter the federal tax: ");
			userInputDouble = keyboard.nextDouble();
			//set federal tax
			report.setFederalTax(userInputDouble);
			//get the federal tax amount 
			federalTaxTotal += report.getFederalTax();
			if(userInputDouble < 0){
				//display a friendly message
				System.out.println("Please enter a number greater than 0\n");
			}//end if
			if(userInputDouble > report.getFederalTax()){
				//display friendly message to the user 
				System.out.println("your federal tax should not be greater than your gross pay");
			}//end if
			}//end while
		
		
		//Reset userInputDouble
		userInputDouble = -1.0;
		while(userInputDouble < 0 || userInputDouble > report.getGrossPay()) {
			//Reset userInputDouble
			userInputDouble = -1.0;	
			//ask user for Fica withholdings
			System.out.println("enter the FICA withholdings: ");
			userInputDouble = keyboard.nextDouble();
			//set Fica 
			report.setFica(userInputDouble);
			//get fica
			ficaTotal += report.getFica();
			if(userInputDouble < 0){
				//display a friendly message
				System.out.println("Please enter a number greater than 0\n");
			}//end if
			if(userInputDouble > report.getFica()){
				//display friendly message to the user 
				System.out.println("your FICA should not be greater than your gross pay");
			}//end if
	
			//get the net pay	
			netPayTotal += report.getNetPay();
			if((report.getStateTax() + report.getFederalTax() + report.getFica()) > report.getGrossPay());
			//Display a friendly message to user
			System.out.println("your taxes should not be greater than the gross pay\n");
			grossPayTotal -= report.getGrossPay();
			stateTaxTotal -= report.getStateTax();
			federalTaxTotal -= report.getFederalTax();
			netPayTotal -= report.getNetPay();
			continue;
		}
			
			report.printEmployeeReport();
		if(report.getEmployeeNumber() == 0){
			report.printTotals(grossPayTotal, stateTaxTotal, federalTaxTotal, ficaTotal, netPayTotal);
		}

		keyboard.close();
	}

}
