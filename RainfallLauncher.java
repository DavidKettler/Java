import java.util.Scanner;
public class RainfallLauncher {

	public static void main(String[] args) {
		double[] Month = new double[12];
		double UserInput;
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < Month.length; i++) {
			System.out.println("Enter the amount of rainfall for Month " + (i + 1) + ": ");
			UserInput = keyboard.nextDouble();
			if (UserInput < 0) {
				System.out.println("ERROR: Number can not be less than 0");
				i--;
			} else {
				Month[i] = UserInput;
			}
			
		}
		Rainfall year1 = new Rainfall(Month);
		System.out.println("Total: " + year1.TotalRainfall());
		System.out.println("Average: " + year1.AverageRainfall());
		System.out.println("Highest month: " + year1.Most());
		System.out.println("Lowest month: " + year1.Least());
		keyboard.close();
	}

}
 