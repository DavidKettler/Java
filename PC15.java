import java.util.Scanner;
public class PC15 {

	public static void main(String[] args) {
			//declaring variables
			double sugar = 1.5;
			double butter = 1;
			double flour = 2.75;
			double Batch = 48;
			double input; 
			double expectedSugar;
			double expectedButter;
			double expectedFlour;
			//scanner object
			Scanner keybord = new Scanner( System.in );
			System.out.println("Please enter number of cookies"); 
			input = keybord.nextInt();
			expectedSugar = ( input / Batch ) * sugar;
			expectedButter = ( input / Batch ) * butter;
			expectedFlour = ( input / Batch ) * flour;
			System.out.println( "For " + input + " cookies, you will need " + expectedSugar + " cups of sugar, " + expectedButter +
					" cups of butter and " + expectedFlour + " cups of flour." );
			keybord.close();
		}
	}
