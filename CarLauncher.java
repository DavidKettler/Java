
public class CarLauncher {

	public static void main(String[] args) {
		Car car1 = new Car(1998, "Saturn SC2");
		
		System.out.println(car1.getSpeed());
		for(int i = 0; i < 5; i++) {
			car1.accelerate();
			System.out.println(car1.getSpeed());
		}

		for(int i = 0; i < 5; i++) {
			car1.brake();
			System.out.println(car1.getSpeed());
		}
	}

}
