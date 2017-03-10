import java.text.NumberFormat;

public class AccountLauncher {

	public static void main(String[] args) {
		Account person1 = new Account("Jack", "Reacher", "511 Somewhere Blvd", "Someplace", "AR", 23443, "541-985-6541", true, 2343.45, "check");
		Account person2 = new Account("Lincoln", "Rhyme", "423 Falcon Ave", "St. Louis", "MO", 63113, "314-256-5687", true, 7542.35, "save");
		Account person3 = new Account("Robert", "Langdon", "512 Omen Lane", "Symbolic", "NY", 77777, "524-653-1245", false, 23.14, "invest");
		Account person4 = new Account("Odd", "Thomas", "3312 Bodachs Street", "Pico Mundo", "CA", 59254, "826-333-7757", false, -123.14, "match");
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		System.out.println("***** Customer Info *****");
		System.out.println(person1.getFirstName() + " " + person1.getLastName());
		System.out.println(person1.getStreetAdress());
		System.out.println(person1.getCity());
		System.out.println(person1.getState());
		System.out.println(person1.getZip());
		System.out.println(person1.getPhoneNumber());
		System.out.println("Preferred Customer: " + person1.isPreferredCustomer());
		System.out.println("Account Number: " + person1.getAccountNumber());
		System.out.println("Balance: " + formatter.format(person1.getBalance()));
		System.out.println("Account Type: " + person1.getAccountType());
		System.out.println("Notes: " + person1.getAccountNotes());
		
		System.out.println();
		
		System.out.println("***** Customer Info *****");
		System.out.println(person2.getFirstName() + " " + person2.getLastName());
		System.out.println(person2.getStreetAdress());
		System.out.println(person2.getCity());
		System.out.println(person2.getState());
		System.out.println(person2.getZip());
		System.out.println(person2.getPhoneNumber());
		System.out.println("Preferred Customer: " + person2.isPreferredCustomer());
		System.out.println("Account Number: " + person2.getAccountNumber());
		System.out.println("Balance: " + formatter.format(person2.getBalance()));
		System.out.println("Account Type: " + person2.getAccountType());
		System.out.println("Notes: " + person2.getAccountNotes());

		System.out.println();
		
		System.out.println("***** Customer Info *****");
		System.out.println(person3.getFirstName() + " " + person3.getLastName());
		System.out.println(person3.getStreetAdress());
		System.out.println(person3.getCity());
		System.out.println(person3.getState());
		System.out.println(person3.getZip());
		System.out.println(person3.getPhoneNumber());
		System.out.println("Preferred Customer: " + person3.isPreferredCustomer());
		System.out.println("Account Number: " + person3.getAccountNumber());
		System.out.println("Balance: " + formatter.format(person3.getBalance()));
		System.out.println("Account Type: " + person3.getAccountType());
		System.out.println("Notes: " + person3.getAccountNotes());

		System.out.println();
		
		System.out.println("***** Customer Info *****");
		System.out.println(person4.getFirstName() + " " + person4.getLastName());
		System.out.println(person4.getStreetAdress());
		System.out.println(person4.getCity());
		System.out.println(person4.getState());
		System.out.println(person4.getZip());
		System.out.println(person4.getPhoneNumber());
		System.out.println("Preferred Customer: " + person4.isPreferredCustomer());
		System.out.println("Account Number: " + person4.getAccountNumber());
		System.out.println("Balance: " + formatter.format(person4.getBalance()));
		System.out.println("Account Type: " + person4.getAccountType());
		System.out.println("Notes: " + person4.getAccountNotes());
	}

}
