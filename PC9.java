import java.util.Scanner;
public class PC9 {

	public static void main(String[] args) {
		//declaring variables
		int miles;
		int gallons;
		int MPG;
		//scanner object for god sakes
		Scanner keybord = new  Scanner(System.in);
		System.out.println("Enter the number of miles driven");
		miles = keybord.nextInt();
		System.out.println("Enter the amount of gallons of gas used");
		gallons = keybord.nextInt();
		MPG = miles / gallons;
		System.out.println("MPG: " + MPG);
		keybord.close();
	}

}
