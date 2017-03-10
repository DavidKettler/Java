
public class personalInfoLauncher {

	public static void main(String[] args) {
		personalInfo mans1 = new personalInfo("David Kettler", 20, "133 Anabel Ave.", "314-662-4297");
		personalInfo mans2 = new personalInfo("Francisco Krollman", 20, "123 Idk Ave.", "314-123-4567");
		personalInfo mans3 = new personalInfo("Joe Kreke", 22, "4431 Finney Ave", "314-987-6543");

		System.out.println("Name: " + mans1.getName());
		System.out.println("Age: " + mans1.getAge());
		System.out.println("Address: " + mans1.getAddress());
		System.out.println("Phone Number: " + mans1.getPhoneNumber());
		System.out.println();
		System.out.println("Name: " + mans2.getName());
		System.out.println("Age: " + mans2.getAge());
		System.out.println("Address: " + mans2.getAddress());
		System.out.println("Phone Number: " + mans2.getPhoneNumber());
		System.out.println();
		System.out.println("Name: " + mans3.getName());
		System.out.println("Age: " + mans3.getAge());
		System.out.println("Address: " + mans3.getAddress());
		System.out.println("Phone Number: " + mans3.getPhoneNumber());
	}

}
