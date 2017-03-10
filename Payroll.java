
public class Payroll {
	private String name;
	private int ID;
	private double hourlyPayRate;
	private int hoursWorked;

	public Payroll(String Name, int ID, double HourlyPayRate, int HoursWorked) {
		this.name = Name;
		this.ID = ID;
		this.hourlyPayRate = HourlyPayRate;
		this.hoursWorked = HoursWorked;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}
	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double Maths() {
		return this.hoursWorked * this.hourlyPayRate;
	}
}
