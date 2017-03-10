import java.util.Scanner;
public class Hot3Launcher {

	public static void main(String[] args) {
		int decision, num1, num2, num3;
		Scanner keyboard = new Scanner(System.in);
		Hot3Driver maths1 = new Hot3Driver();
		System.out.println("Do you want to add 2 numbers or 3?");
		decision = keyboard.nextInt();
		if (decision == 2) {
			System.out.println("Enter number 1: ");
			num1 = keyboard.nextInt();
			System.out.println("Enter number 2: ");
			num2 = keyboard.nextInt();
			System.out.println("Total" +Hot3Driver.SickDriver(num1, num2));
		} else if (decision == 3) {
			System.out.println("Enter number 1: ");
			num1 = keyboard.nextInt();
			System.out.println("Enter number 2: ");
			num2 = keyboard.nextInt();
			System.out.println("Enter number 3: ");
			num3 = keyboard.nextInt();
			System.out.println("Total: " +Hot3Driver.SickDriver(num1, num2, num3));
		} else {
			System.out.println("ERROR: Enter either a 2 or a 3");
		}
		keyboard.close();
	}

}
