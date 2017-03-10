import java.util.Scanner;
public class GreatestAndLeastLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		GreatestAndLeast num = new GreatestAndLeast();
		int number = 0;
		while (number != -99){
			System.out.println("Enter a number: (-99 to quit)");
			number = keyboard.nextInt();
			if (number != -99){
				num.setNumber(number);
			}
		}
		System.out.println("Highest: " + num.getLarge());
		System.out.println("Lowest: " + num.getSmall());
		keyboard.close();
	}

}
