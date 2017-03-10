import java.util.Scanner;
public class DistanceTraveledLauncher {

	public static void main(String[] args) {
		int speed;//speed variable
		int time;//time variable
		int loop = 5;//loop variable set to 5
		Scanner keyboard = new Scanner(System.in);//Scanner Object
		//continously loops if the loop variable is not = to 1
		do {
			//asks the user for the speed
			System.out.println("How fast are you traveling? (MPH)");
			speed = keyboard.nextInt(); //sets the speed
			//if speed is less than 0 it displays an error
			if (speed < 0 ) {
				//displays an error
				System.out.println("The speed can not be a negitive number");
			} else {
				//if speed is > 0 then it asks for the time it took to reach the destination
				System.out.println("How long did it take you to get to your destination going at that speed? (Hours)");
				time = keyboard.nextInt(); //sets the time variable
				//if time is less than 1 it displays an error
				if (time < 1) {
					//displays an error
					System.out.println("Time can not be less then 1");
				} else {
					//displays results to the screen
					DistanceTraveled travel1 = new DistanceTraveled(time, speed); //passes time and speed to the object
					System.out.println("Hour \t \t Distance Traveled");
					System.out.println("-------------------------------------");
					travel1.getDistance(); // calls the getDistance getter
				}
			}
		} while (loop != 1); //loop conditional
		keyboard.close();
	}
}
