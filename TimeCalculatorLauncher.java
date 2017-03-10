import java.util.Scanner;
public class TimeCalculatorLauncher {

	public static void main(String[] args) {
		double seconds;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amout of seconds");
		seconds = keyboard.nextDouble();
		TimeCalculator seconds1 = new TimeCalculator(seconds);
		if (seconds1.getSeconds() < 60) {
			System.out.println("Enter a number more than 60 plz");
		} else {
			System.out.printf("Seconds: %.2f \n", seconds1.getSeconds());
			System.out.printf("Minoutes: %.2f \n", seconds1.getMinoutes());
			System.out.printf("Hours: %.2f \n", seconds1.getHours());
			System.out.printf("Days: %.2f", seconds1.getDays());
		}
		keyboard.close();
	}

}
