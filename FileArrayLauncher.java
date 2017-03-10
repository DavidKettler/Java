import java.io.IOException;
import java.util.Scanner;

public class FileArrayLauncher {

	public static void main(String[] args) throws IOException {
		//Initialize the name and array and user input variables 
		String Name;
		int[] Arrays = new int[10];
		int[] Array2 = new int[Arrays.length];
		int userInput = 0;
		//opens the scanner object
		Scanner keyboard = new Scanner(System.in);
		//asks for the name of the file
		System.out.println("Enter the name of the file:");
		//stores the name in
		Name = keyboard.nextLine();
		for (int i = 0; i < Arrays.length; i++) {
			//asks the user for 10 numbers
			System.out.println("Enter a number");
			userInput = keyboard.nextInt();
			if (userInput != 999) {
				//if the user does not enter 999 then it stores the user input in an array
				Arrays[i] = userInput;
			} else {
				//if they do enter 999 then  it breaks out of the array
				break;
			}
		}
		//creates the FileArray object and calls the WriteArray method
		FileArray array1 = new FileArray();
		FileArray.WriteArray(Name, Arrays);
		
		//calls the readArray method and returns the array from the FileArray object and sets it to Array2 array
		Array2 = FileArray.readArray(Name, Arrays);
		//prints the array got from the file to the screen
		for (int t = 0; t < Array2.length; t++) {
			System.out.println(Array2[t]);
		}
		//closes the keyboard object
		keyboard.close();
	}

}
