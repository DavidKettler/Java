import java.util.Scanner;
public class AreaLauncher {

	public static void main(String[] args) {
		//variables
		String Shape;
		float radius;
		double width, length, height;
		int loop = 5;
		
		Scanner keyboard = new Scanner(System.in); //Scanner object
		Area getArea1 = new Area(); //initilizes the Area object
		while (loop != 1) {
			//asks what shape the user wants to enter
			System.out.println("What shape do you want to calculate the area for");
			System.out.println("Enter C for circle, R for rectangle or Y for cylinder");
			Shape = keyboard.nextLine();
			if (Shape.length() == 1) { // if the user input is 1 letter
				if (Shape.equalsIgnoreCase("c")) { //if user input is c or C for circle
					System.out.println("Enter the radius of the circle: ");
					radius = keyboard.nextFloat();
					getArea1.getArea(radius); //calls the getArea getter and passes it the radius
					System.out.println();
					break; //stops the loop
				} else if (Shape.equalsIgnoreCase("r")) { // if the user input is r or R
					System.out.println("Enter the length of the rectangle: "); // asks for the length
					length = keyboard.nextDouble();
					System.out.println("Enter the Width of the rectangle: "); // asks for the width
					width = keyboard.nextDouble();
					getArea1.getArea(length, width); //calls the getArea getter and passes it length and with
					System.out.println();
					break; // stopps the loop
				} else if (Shape.equalsIgnoreCase("y")) { // if the user input is y or Y
					System.out.println("Enter the radius of the cylinder: "); // asks for the radius
					radius = keyboard.nextFloat();
					System.out.println("Enter the height for the cylinder: "); // asks for the height
					height = keyboard.nextDouble();
					getArea1.getArea(radius, height); //calls the getArea getter and passes it radius and height
					System.out.println();
					break; //ends the loop
				} else {
					//displays an error messege if they enter anything other than C, R, Y
					System.out.println("Error: Should only be a C for circle, R for rectangle or Y for a cylinder");
					System.out.println();
				}
			} else {
				//Displays an error if the user enters more than 1 letter
				System.out.println("Error: Should only be a C for circle, R for rectangle or Y for a cylinder");
				System.out.println();
			}
		}
		keyboard.close();
	}
}
