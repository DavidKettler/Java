import java.util.Scanner;
public class AverageRainfall {
	private double Average; //average variable as double
	private double Years; // years variable as double
	private final double Months = 12; //months variable
	//returns the average
	public double getAverage() {
		return Average;
	}
	//sets the average rainfall
	public void setAverage(double average) {
		Scanner keyboard = new Scanner(System.in);//Scanner object
		double rainAmount;
		double totalRain = 0;
		// loop for how many years the user entered
		for(int i = 1; i <= Years; i++){
			//nested loop for 12 months
			for(int x = 1; x <= 12; x++){
				//asks the user for the amount of rainfall each month
				System.out.print("For year " + i + ", month " + x + " How much rain fell in inches: ");
				rainAmount = keyboard.nextDouble(); //sets the rainAmount variable
				//continously loops if the rainAmout is less than 0 and gives the user an error
				while(rainAmount < 0){
					System.out.print("Error: rainfall must be greater than 0. \nFor year "+i+", month "+x+" How much rain fell in inches: ");
					rainAmount = keyboard.nextDouble();
				}
				totalRain += rainAmount; //keeps adding the rainAmount to the total rain
			}
		}
		average = totalRain / (Years * Months); // the months for each year / total rain
		Average = average; //sets the average object
		keyboard.close();
	}
	//returns the years
	public double getYears() {
		return Years;
	}
	//sets the years object
	public void setYears(double years) {
		Years = years;
	}
}
