import java.util.Scanner;
public class ScoresLauncher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		TestScores test = new TestScores();
		//3 test scores
		for(int i = 0; i < 3; ++i){
			//display test score
			System.out.print("Enter Test Score: ");
			double score = keyboard.nextDouble();
			test.setScores(score);
		}
		//average display
		System.out.printf("The average of the scores is %.2f", test.getScores());
		keyboard.close();

	}

}
