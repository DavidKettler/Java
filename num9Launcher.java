import java.util.Scanner;

public class num9Launcher {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		num9Grade p1 = new num9Grade();
		
		for(int i = 0; i < 5; i++){
			System.out.println("Enter the students name :");
			String student = keyboard.nextLine();
			p1.setName(student);
			if (i == 0){
				p1.setStudent1();
			}else if(i == 1){
				p1.setStudent2();
			}else if (i == 2){
				p1.setStudent3();
			}else if(i == 3){
				p1.setStudent4();
			}else if(i == 4){
				p1.setStudent5();
			}
			
			p1.getCount();
		}
		
		for(int i = 0; i <p1.getStudentNumber(); i++){
			System.out.println(p1.getName()[i]+ "'s Average is "
					+ p1.getAVG()[i]+ " with a letter grade "
					+ "of " + p1.getLetter()[i]);
		}


	}

}
