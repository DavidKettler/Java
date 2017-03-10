import java.util.Scanner;
public class TestScoresLauncher {

	public static void main(String[] args) throws InvalidTestScore {
		//Initialize the userInput variable and TestScore Array
		double userInput = 0;
		double[] TestScores = new double[10];
		//opens the scanner object
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < TestScores.length; i++) {
			//asks for a test score
			System.out.println("Enter a test score: (Enter 999 to quit)");
			//if they do not enter 999
			if (userInput != 999) {
				//checks to see if the number the user enters is less than 0 and greater than 100
				if (userInput < 0 || userInput > 100) {
					//if it is less than 0 and greater than 100 then it throws the custom exception InvalidTestScore()
					throw new InvalidTestScore();
				} else {
					//if the user input is not less than 0 and greater than 100 then it adds the user input to the TestScores array
					userInput = keyboard.nextDouble();
					TestScores[i] = userInput;
				}
			} else {
				//if the user input is 999 then it breaks out of the loop
				break;
			}
		}
		for(int t = 0; t < TestScores.length; t++) {
			//prints the array to the screen
			System.out.println("Test" + (t + 1) + ": " + TestScores[t]);
		}
		@SuppressWarnings("unused")
		//Initializes the TestScore object and passes it the TestScores array
		TestScores test1 = new TestScores(TestScores);
		
		//closes the keyboard object
		keyboard.close();
	}

}
