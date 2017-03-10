import java.util.Scanner;
public class FreezingBoilingLauncher {

	public static void main(String[] args) {
		double temp;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a temperature ");
		temp = keyboard.nextDouble();
		FreezingBoiling temp1 = new FreezingBoiling(temp);
		System.out.println(temp1.getDegree() + " Degrees:");
		if(temp1.isEthylBoiling()){
		System.out.println("Ethyl Alcohol is Boiling");
		}
		if(temp1.isEthylFreezing()){
		System.out.println("Ethyl Alcohol is Freezing");
		}
		if(temp1.isOxygenBoiling()){
		System.out.println("Oxegen is Boiling");
		}
		if(temp1.isOxygenFreezing()){
		System.out.println("Oxegen is Freezing");
		}
		if(temp1.isWaterBoiling()){
		System.out.println("Water is Boiling");
		}
		if(temp1.isWaterFreezing()){
		System.out.println("Water is Freezing");
		}
		keyboard.close();

	}

}
