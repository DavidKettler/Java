
public class PenniesforPay {
	private int days;//days variable
	
	//days getter
	public int getDays() {
		return days;
	}
	//days setter
	public void setDays(int days) {
		this.days = days;
	}
	//constroctor that passes days to the object
	public PenniesforPay(int Days) {
		this.days = Days;
	}
	//salary method
	public void salary() {
		double salary = 0.01; //starting salary
		//displays to the screen
		System.out.println("Days \t\t\t Salary");
		System.out.println("----------------------------------");
		//loop that runs for every day the user entered
		for (int i = 1; i <= days; i++) {
			//prints result to screen
			System.out.println(i + "\t\t\t$" + salary);
			//multiplies the salary by 2
			salary = salary * 2;
		}
	}
}
