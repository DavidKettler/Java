	
public class Animal extends LivingCreature {

	public Animal() {
		System.out.println("An animal has been created! ");
	}
	
	public Animal(String animalName) {
		System.out.println("The " + animalName + 
				" has been created and is alive!! ");
	}
	
	public void breathe(String animalName) {
		System.out.println("The " + animalName + 
				" is breathing. ");
	}
	
	public void speak() {
		System.out.println("The animal is speaking!");
	}
	
	public void blink() {
		System.out.println("Blink Blink");
	}
}
