import java.util.Scanner;
public class ShippingChargesLauncher {

	public static void main(String[] args) {
		double weight;
		int miles;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the weight of the package (kilograms)");
		weight = keyboard.nextDouble();
		System.out.println("Enter the amount of miles the package will ship over");
		miles = keyboard.nextInt();
		ShippingCharges package1 = new ShippingCharges(weight, miles);
		System.out.println("The package weighs: " + package1.getWeight());
		System.out.println("The package will travle " + package1.getMiles() + " Miles");
		System.out.println("Shipping fee's: " + package1.ShippingFees());
		keyboard.close();
	}

}
