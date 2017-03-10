import java.util.Scanner;
public class GeometryCalculatorLauncher {
	public static void main(String[] args) {
		double radius, length, width, base, height; // local variables
		int userInput = 0;
		Scanner keyboard = new Scanner(System.in); // Scanner object
		
		//asks the user what shapes they want to calculate tha area for (if they enter 4 the program closes
		System.out.println("Geometry Calculator");
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		System.out.println("4. Quit");
		System.out.println("Enter your choice (1-4)");
		while (userInput != 4) { // if the userInput is not 4 it will continously loop
			userInput = keyboard.nextInt();
			
			if (userInput < 1 || userInput > 4) { // if userInput is not 1-4 then it will display an error
				System.out.println("ERROR: the value you entered can not be a negative number or a value over 4");
				System.out.println("Enter your choice (1-4)");
				continue;
			} else {
				if (userInput == 1) { // if the user enters 1 for circle 
					System.out.println("Enter the radius of the circle: "); //asks for the radius of the circle
					radius = keyboard.nextDouble();
					if (radius < 0) { // if radius is a negative number
						System.out.println("Radius can not be a negative number"); //displays an error
					} else {
						//gets the area and displays it to the screen
						System.out.println("Area = " + GeometryCalculator.circleArea(radius)); 
					}
				} else if (userInput == 2) { //if the userInput enters 2 for rectangle
					System.out.println("Enter the length of the rectangle: "); // asks for the length of the rectangle
					length = keyboard.nextDouble();
					if (length < 0) { //if length is a negative number
						System.out.println("Length can not be a negative number"); //displays an error
					} else {
						System.out.println("Enter the width of the rectangle: "); //asks for the width of the rectangle
						width = keyboard.nextDouble();
						if (width < 0) { //if the width is a negative number
							System.out.println("Width can not be a negative number"); //displays an error
						} else {
							//gets the area and displays it to the screen
							System.out.println("Area = " + GeometryCalculator.rectangleArea(length, width));
						}
					}
				} else if (userInput == 3) { // if the userInout is 3 for triangle
					System.out.println("Enter the base of the triangle: "); //asks for the base of the triangle
					base = keyboard.nextDouble();
					if (base < 0) { //if the base is a negative number
						System.out.println("Base can not be a negative number"); //displays an error
					} else {
						System.out.println("Enter the height of the triangle: ");  //asks for the height of the triangle
						height = keyboard.nextDouble();
						if (height < 0) { //if the height is a negaitve number
							System.out.println("Height can not be a negative number"); //displays an error
						} else {
							//get the area of the triangle and displays it to the screen
							System.out.println("Area = " + GeometryCalculator.triangleArea(base, height));
						}
					}
				}
			}
		}
		keyboard.close();// close the keyboard object
	}

}
