import java.util.Scanner;
import java.text.DecimalFormat;
public class AverageRainfallLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//Scanner object
		AverageRainfall rain = new AverageRainfall();//AverageRainfall object
		int years; // years variable
		System.out.print("Enter the years you want to calculate: ");//asks the user for the years they want to calculate
		years = keyboard.nextInt(); // sets years variable
		//continously loops if years entered is less than 1 and gives an error
		while(years < 1){
			//dispays an error
			System.out.print("Error: Years must be grater than 0 \nEnter the years you want to calculate: ");
			years = keyboard.nextInt();//reEnter the years
		}
		rain.setYears(years);//passes years to the set years setter
		rain.setAverage(0);//passes the average of 0 to the set years setter
		DecimalFormat multiple = new DecimalFormat("#,##0.00");//decimal format
		//displays results to the screen
		System.out.println("For " + years + " year the average rainfall is " +
		multiple.format(rain.getAverage()));//calls the getAverage getter and formats the result
		keyboard.close();
	}

}
