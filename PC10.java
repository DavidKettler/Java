import java.util.Scanner;
public class PC10 {

	public static void main(String[] args) {
		//declaring variables
		int[] test = new int[3];
		int average;
		Scanner keybord = new Scanner(System.in);
		//for loop for entering 3 test scores
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter a test score");
			test[i] = keybord.nextInt();
		}
		//displaying content
		System.out.println("Test 1: " + test[0]);
		System.out.println("Test 2: " + test[1]);
		System.out.println("Test 3: " + test[2]);
		average = (test[0] + test[1] + test[2]) / 3;
		System.out.println("Average: " + average);
		keybord.close();
	}

}
