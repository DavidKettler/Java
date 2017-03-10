import java.util.Scanner;

public class num6Launcher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		String[] student = new String[20];
		
		System.out.println("Pick the best Answer: ");
		for(int i = 0; i < student.length; i++){
			System.out.println("A");
			System.out.println("B");
			System.out.println("C");
			System.out.println("D");
			//System.out.println("Pick the best Answer: ");
			student[i] = keyboard.nextLine().toUpperCase();
		}
		
		num6Driver p1 = new num6Driver(student);
		if (p1.passed() == true){
			System.out.println("You Passed");
		}else {
			System.out.println("You failed");
		}
		System.out.println("Your Total Correct is: " + p1.getTotalCorrect());
		System.out.println("The Total Incorect is: " + p1.getTotalIncorrect());
		System.out.println("You missed the Following Questions" + p1.getQuestionsMissed());
	}

}
