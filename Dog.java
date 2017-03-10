
public class Dog extends Animal{

	public Dog() {
		super("Dog");
	}
	
	public void speak() {
		System.out.println("Woof!!");
	}

	//Will not work when attempting to use dog.eat()
	public void eat() {
		System.out.println("Eating food...");
	}
	
	public String toString() {
		return "Dog\'s are awsome!";
	}
}
