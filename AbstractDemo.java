
public class AbstractDemo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.breathe("animal");
		
		Animal dog = new Dog();
		dog.blink();
		Animal cat = new Cat();
		cat.blink();
		
		dog.breathe("dog");
		dog.speak();
		
		cat.breathe("cat");
		cat.speak();

		System.out.println(dog.toString());
		System.out.println(cat.toString());
	}

}
