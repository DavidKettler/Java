import java.util.Scanner;
public class PetLauncher {

	public static void main(String[] args) {
		String name;
		String type;
		int age;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter pets name: ");
		name = keyboard.nextLine();
		System.out.print("Enter pet type: ");
		type = keyboard.nextLine();
		System.out.print("Enter pets age: ");
		age = keyboard.nextInt();
		Pet info = new Pet(name, type, age);

		System.out.printf("you have a %s named %s is %d that is years old", 
				info.getType(), info.getName(), info.getAge());	
		keyboard.close();
	}

}
