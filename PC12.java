import java.util.Scanner;
public class PC12 {

	public static void main(String[] args) {
		String city;
		//declaring scanner object
		Scanner keybord = new Scanner(System.in);
		System.out.println("Enter your favorite city");
		city = keybord.nextLine();
		System.out.println(city.length()); //length of city
		System.out.println(city.toUpperCase()); //all caps
		System.out.println(city.toLowerCase()); //all lower case
		System.out.println(city.charAt(0)); //first letter
		keybord.close();
	}

}
