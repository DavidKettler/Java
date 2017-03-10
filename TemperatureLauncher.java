import java.util.Scanner;
public class TemperatureLauncher {

	public static void main(String[] args) {
		double input;
		Scanner keybord = new Scanner(System.in);
		System.out.println("Enter a temperature in Fahrenheit");
		input = keybord.nextDouble();
		Temperature temp1 = new Temperature(input);
		System.out.println("Fahrenheit: " + temp1.getFahrenheit());
		temp1.getCelsius();
		System.out.println();
		temp1.getKelvin();
		keybord.close();
	}

}
