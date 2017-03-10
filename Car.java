
public class Car extends Automobile implements Move {

	public Car() {
		System.out.println("A new car has been created!");
	}
	
	public Car(String Name) {
		System.out.println("A new " + Name + " has been created.");
	}

	@Override
	public void addFuel(double gallons) {
		
	}

	@Override
	public void moveVehicle() {
		
	}

}
