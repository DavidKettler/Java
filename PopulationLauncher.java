import java.util.Scanner;
public class PopulationLauncher {
	public static void main(String[] args) {
		double userInput = -1;
		Population pop1 = new Population();
		Scanner keyboard = new Scanner(System.in);
		while(userInput < 2){
			//get the starting population from the user
			System.out.println("Enter the starting size of the population: ");
			userInput = keyboard.nextDouble();
			pop1.setStartingNumber(userInput);
			//display a friendly message
			if(userInput < 2){
			System.out.println("must be greater than 2");
			}
		}
		//reset input double 
		userInput = -1;
		while (userInput < 0){
		//get the average daily increase 
			System.out.println("Enter the daily increase");
		userInput = keyboard.nextDouble();
		pop1.setDailyIncrease(userInput);
		if (userInput < 0){
			System.out.println("must be greater than 1");
			}
		}
		//reset input double
		userInput = -1;
		while(userInput <0){
			//Get the number of days the organisms will multiply
			System.out.println("Enter the number of days they will multiply");
			userInput = keyboard.nextDouble();
			pop1.setDaysMultiplied(userInput);
			if (userInput < 0){
				System.out.println("must be greater than 1");
			}
		}
		pop1.setCurrentPopulation();
		pop1.displayPopulationSize();
		keyboard.close();
	}
}
