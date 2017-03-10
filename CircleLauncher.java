import java.util.Scanner;
public class CircleLauncher {

	public static void main(String[] args) {
		Circle shape = new Circle();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a radius: ");
		double radius = keyboard.nextDouble();
		shape.setRadius(radius);
		System.out.printf(" the area is %.2f \n the diamter is %.2f \n" + " the circumference is %.2f"
		, shape.getArea(), shape.getDiameter(), shape.getCircumference());
		keyboard.close();
	}

}
