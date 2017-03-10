import java.util.Scanner;
public class SumofNumbersLauncher {

	public static void main(String[] args) {
		int Input;
		int loop = 1;//sets the loop variable to 1
		Scanner keyboard = new Scanner(System.in);//Scanner object
		System.out.println("Enter 9999 to stop the loop");
		do {
			// loops over and over to enter a number 
			System.out.print("Enter a number: ");
			//Gets the input from the user
			Input = keyboard.nextInt();
			if (Input <= 0) {
				//if the input is 0 or a negative number it will display an error message
				System.out.println("Number must be a positive number that is not 0");
			} else if (Input == 9999) { 
				//if the user input is 9999 it will break out of the loop
				break;
			} else {
				//calls the object and calls the loop method and displays them on the screen
				SumofNumbers stuffs1 = new SumofNumbers(Input);
				System.out.println("The sum of " + Input + " is " + stuffs1.loopStuff());
			}
		} while (loop != 0);
		//if the loop does not = 0 then it will continuously loop
		keyboard.close();
	}

}
