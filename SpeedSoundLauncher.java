import java.util.Scanner;
import java.text.DecimalFormat;
public class SpeedSoundLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter 1 for air 2 for water 3 for steel ");
		double Choose = keyboard.nextDouble();
		System.out.print("Enter a distence to travel: ");
		double distance = keyboard.nextDouble();
		SpeedSound stuff1 = new SpeedSound(distance);
		DecimalFormat format1 = new DecimalFormat("#,##0.00");
		//prints out results
		if (Choose == 1){
		System.out.print("You would reach the distance in: " +
		format1.format(stuff1.getAir())+" seconds");
		}
		if (Choose == 2){
		System.out.print("You would reach the distance in: " +
		format1.format(stuff1.getDistance())+" seconds");
		}
		if (Choose == 3){
		System.out.print("You would reach the distance in: " +
		format1.format(stuff1.getSteel())+" seconds");
		}
		keyboard.close();
		}
	}
