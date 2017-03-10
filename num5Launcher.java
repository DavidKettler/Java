import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class num5Launcher {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		num5ChargeWritter p1 = new num5ChargeWritter();
		
		final int SIZE = 18;
		int[] numbers = new int[SIZE];
		int index = 0; // loop control variable
		// open file
		File file = new File("Values.txt");
		Scanner inputFile = new Scanner(file);
		
		//read the file contents into the array.
		while (inputFile.hasNext() && index < numbers.length){
			numbers[index] = inputFile.nextInt();
			index++;
		}	
		inputFile.close();
		
		
		int userInput = 0;
		do {
			System.out.println("Enter the number or 999 to quit");
			userInput = keyboard.nextInt();
			if (userInput != 999){
				if (p1.squaetialSearch(numbers, userInput) == -1){
					System.out.println("The number was not found");
				}
				else {
					System.out.println("The number was found");
				}	
			}
		}while(userInput != 999);
	}

}
