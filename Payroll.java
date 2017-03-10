
public class Payroll {
	//initalizes the following fields
	private String name;
	private int ID;
	private double hourlyPayRate;
	private int hoursWorked;
	
	//Payroll cunstructor that passes the name, id, HourlyPayRate, and hoursWorked
	public Payroll(String Name, int ID, double HourlyPayRate, int HoursWorked) {
		//sets the passed data from the constructor to the fields
		this.name = Name;
		this.ID = ID;
		this.hourlyPayRate = HourlyPayRate;
		this.hoursWorked = HoursWorked;
	}
	//name getter
	public String getName() {
		return name;
	}
	//name setter
	public void setName(String name) {
		this.name = name;
	}
	//id getter
	public int getID() {
		return ID;
	}
	//id setter
	public void setID(int iD) {
		ID = iD;
	}
	//HourlyPayRate getter
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}
	//HourlyPayRate setter
	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}
	//HoursWorked getter
	public int getHoursWorked() {
		return hoursWorked;
	}
	//HoursWorked setter
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	//Maths method that returns a double
	public double Maths() {
		//HoursWorked * HourlyPayRate = gross pay
		return this.hoursWorked * this.hourlyPayRate;
	}
}
