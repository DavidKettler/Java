import java.util.Scanner;
public class TestScoresLauncher {

	public static void main(String[] args) {
		double Test1;
		double Test2;
		double Test3;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a test Score:");
		Test1 = keyboard.nextDouble();
		System.out.println("Enter a test Score:");
		Test2 = keyboard.nextDouble();
		System.out.println("Enter a test Score:");
		Test3 = keyboard.nextDouble();
		TestScores test1 = new TestScores(Test1, Test2, Test3);
		System.out.println("Test1: " + test1.getTestScore1());
		System.out.println("Test2: " + test1.getTestScore2());
		System.out.println("Test3: " + test1.getTestScore3());
		System.out.println("Average: " + test1.getAverage());
		System.out.println("Letter Grade: " + test1.getLettlerGrade());
		keyboard.close();
	}

}
