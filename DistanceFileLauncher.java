import java.util.Scanner;
import java.io.*;
public class DistanceFileLauncher {

	public static void main(String[] args) throws FileNotFoundException {
		int speed;
		int time;
		String filename;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the name you want the file to be");
		filename = keyboard.nextLine();
		PrintWriter outputFile = new PrintWriter(filename);
		System.out.println("How fast are you traveling? (MPH)");
		speed = keyboard.nextInt();
		if (speed < 0 ) {
			System.out.println("The speed can not be a negitive number");
		} else {
			System.out.println("How long did it take you to get to your destination going at that speed? (Hours)");
			time = keyboard.nextInt();
			if (time < 1) {
				System.out.println("Time can not be less then 1");
			} else {
				DistanceFile travel2 = new DistanceFile(time, speed);
				outputFile.println("Hour \t \t Distance Traveled");
				outputFile.println("-------------------------------------");
				for (int i = 1; i <= time; i++) {
					outputFile.println(i + "\t\t\t" + travel2.getDistance(i));
				}
			}
		}
		keyboard.close();
		outputFile.close();
	}

}
