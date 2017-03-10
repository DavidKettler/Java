import java.util.Scanner;
public class PC5 {

	public static void main(String[] args) {
		String eaten;
		//scanner object
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How mant cookies did you eat?");
		eaten = keyboard.nextLine();
		//uses parseInt to convert a string to an int
		int servings = Integer.parseInt(eaten) / 4;
		int calories = Integer.parseInt(eaten) * 75;
		System.out.println("You ate " + eaten + " cookies! That is " + calories + " Calories and " + servings + " servings!");
		keyboard.close();
	}

}
