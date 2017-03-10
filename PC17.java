import java.util.Scanner;
public class PC17 {

	public static void main(String[] args) {
		//declaring variables
		String name;
		int age;
		String myCity;
		String college;
		String profession;
		String animal;
		String petsName;
		//scanner object
		Scanner keybord = new Scanner(System.in);
		//adding data to variables using scanner object
		System.out.println("Enter your name");
		name = keybord.nextLine();
		System.out.println("Enter yout age:");
		age = Integer.parseInt(keybord.nextLine());
		System.out.println("What city do you live in?");
		myCity = keybord.nextLine();
		System.out.println("What collage do you attend?");
		college = keybord.nextLine();
		System.out.println("What is your profession?");
		profession = keybord.nextLine();
		System.out.println("What type of pet do you have?");
		animal = keybord.nextLine();
		System.out.println("What is your pets name?");
		petsName = keybord.nextLine();
		//display to screen
		System.out.println("There once was a person named " + name + " who lived in " + myCity + ". At the age of " + age + ", " + 
		name + " went to college at " + college + ". " + name + " graduated and went to work as a " + profession + ". Then, " + name
		+ " adopted a(n) " + animal + " named " + petsName + ". They both lived happily ever after!");
		keybord.close();
	}
}
