import java.util.Scanner;
public class SoftwareSalesLauncher {
	
	public static void main(String[] args) {
		double packages;
		double total;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amount of packages");
		packages = keyboard.nextDouble();
		SoftwareSales order1 = new SoftwareSales(packages);
		System.out.println("Packages at $99 each: " + order1.getUnits());
		System.out.println("Discount: " + order1.discount());
		total = order1.getUnits() - order1.discount();
		System.out.println("Total: " + total);
		keyboard.close();
	}

}
