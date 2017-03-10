import java.text.DecimalFormat;
import java.util.Scanner;

public class num1Launcher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		num1RainFall p1 = new num1RainFall();
		double[] rainfall = new double[12];
		for(int i = 0; i < rainfall.length; i++){
			System.out.print("Enter the rainfall for month "+ (i + 1) +": ");
			rainfall[i] = keyboard.nextDouble();
			while(rainfall[i] < 0){
				System.out.println("Incorect data entered please Re-Enter");
				System.out.print("Enter the rainfall for month "+ (i + 1) +": ");
				rainfall[i] = keyboard.nextDouble();
			}
			p1.setAvg(rainfall[i]);
		}
		double low = rainfall[0];
		double high = rainfall[0];
		for (int i = 0; i < rainfall.length; i++ ){
			if(rainfall[i]< low){
				low = rainfall[i];
				p1.setLowest(i+1);
			}
		}
		for (int i = 0; i < rainfall.length; i++ ){
			if(rainfall[i] > high){
				high = rainfall[i];
				p1.setHighest(i+1);
			}
		}
		
		for(int i = 0; i < rainfall.length; i++){
			System.out.println("For month "+ (i+1) + " the rainfall is: " + rainfall[i]);
		}
		DecimalFormat multiple = new DecimalFormat("#,##0.00");
		System.out.println("The average is: " + multiple.format(p1.getAvg()));
		System.out.println("The month with the lowest rainfall is month " + p1.getLowest());
		System.out.println("The month with the highest rainfall is month " + p1.getHighest());
	}

}
