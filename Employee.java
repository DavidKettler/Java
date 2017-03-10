public class Employee {
	private String employeeName;
	private String employeeNumber;
	private String hireDate;
	
	public Employee() {
		
	}
	
	public Employee(String EmployeeName, String EmployeeNumber, String HireDate) {
		this.employeeNumber = EmployeeName;
		this.employeeName = EmployeeName;
		this.hireDate = HireDate;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	public void clockIn() {
		System.out.println("Employee just clocked in");
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeNumber=" + employeeNumber + ", hireDate=" + hireDate + "]";
	}

}
