
public class Payroll {
	private double[] employeeID = new double[7];
	
	public Payroll(double[] EmployeeID) {
		this.employeeID = EmployeeID;
	}

	public double[] getEmployeeID() {
		return employeeID;	
	}
	public void setEmployeeID(double[] employeeID) {
		this.employeeID = employeeID;
	}

}
