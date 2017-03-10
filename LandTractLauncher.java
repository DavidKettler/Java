import java.util.Scanner;
public class LandTractLauncher {

	public static void main(String[] args) {
		//variables
		double length1, width1, length2, width2;
		Scanner keyboard = new Scanner(System.in); // Scanner Object
		
		System.out.println("Enter the length for tract1"); // asks for the length for tract one
		length1 = keyboard.nextDouble();
		System.out.println("Enter the width for tract1"); // asks for the width for tract one
		width1 = keyboard.nextDouble();
		
		System.out.println("Enter the length for tract2"); // asks for the length for tract two
		length2 = keyboard.nextDouble();
		System.out.println("Enter the width for tract2"); // asks for the width for tract two
		width2 = keyboard.nextDouble();
		
		System.out.println();
		
		// passes the length and width of tract1 to the tract1 object
		LandTract land1 = new LandTract(length1, width1);
		// passes the length and width of tract2 to the tract2 object
		LandTract land2 = new LandTract(length2, width2);
		
		//calls the toString method to display the data to the screen
		land2.toString(land1, land2);
		
		keyboard.close();
	}

}
