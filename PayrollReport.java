import java.text.DecimalFormat;
public class PayrollReport {
	private int employeeNumber; // employee number
	private double grossPay; // gross pay
	private double stateTax;// state tax
	private double federalTax;// federal tax
	private double fica;//FICA withholdings
	
	public PayrollReport() {
		
	}
	
	public double getNetPay(){
		return (grossPay - stateTax - federalTax - fica);
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}

	public double getStateTax() {
		return stateTax;
	}

	public void setStateTax(double stateTax) {
		this.stateTax = stateTax;
	}

	public double getFederalTax() {
		return federalTax;
	}

	public void setFederalTax(double federalTax) {
		this.federalTax = federalTax;
	}

	public double getFica() {
		return fica;
	}

	public void setFica(double fica) {
		this.fica = fica;
	}
	
	public void printEmployeeReport(){
		DecimalFormat format1 = new DecimalFormat("$###, ##0.00");
				
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" + 
	"Employee Number: " + this.getEmployeeNumber() + "\n" + 
	"Gross pay" + format1.format(this.getGrossPay()) + "\n" +
	"state tax" + format1.format(this.getStateTax()) + "\n" +
	"federal tax" + format1.format(this.getFederalTax()) + "\n" +
	"FICA Withholding:" + format1.format(this.getFica()) + "\n" +
	"net pay" + format1.format(this.getNetPay()));
	}
	public void printTotals( double grossPay, double stateTax, double federalTax, double fica, double netPay){
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
				
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
				"All employee totals" + "\n" +
			"Gross pay" + formatter.format(grossPay) + "\n" +
			"state tax" + formatter.format(stateTax) + "\n" +
			"federal tax" + formatter.format(federalTax) + "\n" +
			"FICA Withholding:" + formatter.format(fica) + "\n" +
			"net pay" + formatter.format(netPay));
			}
	
}
