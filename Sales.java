import java.util.Scanner;
import java.io.*;
public class Sales {

	public static void main(String[] args) throws FileNotFoundException {
		double[] day = new double[5];
		double total = 0;
		Scanner keyboard = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter("WeeklySales");
		System.out.println("Enter the sales for a company for 5 days");
		for (int i = 0; i < 5; i++) {
			System.out.print("Day " + (i + 1) + ": ");
			day[i] = keyboard.nextDouble();
			if (day[i] < 0) {
				System.out.println("ERROR: Can not be a negative number");
				i--;
			} else {
				total += day[i];
				outputFile.println("Day" + (i + 1) + ": " + day[i]);
			}
		}
		outputFile.println("Weekly Total: " + total);
		
		keyboard.close();
		outputFile.close();
	}

}
