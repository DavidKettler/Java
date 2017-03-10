
public class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee(String Name, int IdNumber, String Department, String Position) {
		this.name = Name;
		this.idNumber = IdNumber;
		this.department = Department;
		this.position = Position;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int IdNumber) {
		this.idNumber = IdNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String Department) {
		this.department = Department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String Position) {
		this.position = Position;
	}
}
