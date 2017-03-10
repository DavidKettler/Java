
public class person {
	String name;
	int age;
	boolean white;
	
	public person(String n, int a, boolean w) {
		// TODO Auto-generated constructor stub
		this.name = n;
		this.age = a;
		this.white = w;
		System.out.println(name + " is " + age + " years old");
		if (white == true) {
			System.out.println("and he is white");
		} else {
			System.out.println("and he is black");
		}
	}

}
