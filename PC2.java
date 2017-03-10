
public class PC2 {

	public static void main(String[] args) {
		//declaring variables
		String firstName = "David";
		String middleName = "Alexander";
		String lastName = "Kettler";
		//gets the first letter
		char firstInitial = firstName.charAt(0);
		char middleInitial = middleName.charAt(0);
		char lastInitial = lastName.charAt(0);
		//displays to screen
		System.out.println("My name is " + firstName + " " + middleName + " " + lastName + ".");
		System.out.println("My Initials are " + firstInitial + middleInitial + lastInitial);
	}

}
