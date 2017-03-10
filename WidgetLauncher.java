import java.util.Scanner;
public class WidgetLauncher {

	public static void main(String[] args) {
		double NoW;
		Scanner keybord = new Scanner(System.in);
		System.out.println("Enter the number of widgets you want: ");
		NoW = keybord.nextDouble();
		Widget order1 = new Widget(NoW);
		System.out.println("Number of widgets: " + order1.getNoW());
		System.out.println("Hours it will take to complete your order: " + order1.HowLong());
		keybord.close();
	}

}
