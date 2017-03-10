import java.util.Scanner;
public class pc11 {

	public static void main(String[] args) {
		//declaring variables
		double males;
		double females;
		double students;
		double percMales;
		double percFemales;
		//declaring scanner object
		Scanner keybord = new Scanner(System.in);
		System.out.println("Enter the amount of males");
		males = keybord.nextDouble();
		System.out.println("Enter the amount of females");
		females = keybord.nextDouble();
		students = males + females;
		percMales = males / students * 100;
		percFemales = females / students * 100;
		//displaying stuff
		System.out.printf("%.2f" + " percent is male \n", percMales);
		System.out.printf("%.2f" + " percent is female \n", percFemales);
		System.out.println("out of " + students + " students");
		keybord.close();
	}

}
