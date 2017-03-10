
public class Area {
	// Area constuctor
	public Area() {
		
	}
	
	//calculates the area of a circle
	public void getArea(float radius) {
		double area;
		// area formula
		area = Math.PI * (radius * radius);
		//prints the circle area to the screen
		System.out.println("The area of the circle is " + area);
	}
	
	//calculates the area of a rectangle
	public void getArea(double length, double width) {
			double area;
			//area of a rectangle formula
			area = width * length;
			//prints rectangle formula to the screen
			System.out.println("The area of the rectangle is " + area);
	}
	
	//calculates the area of a cylinder
	public void getArea(float radius, double height) {
		double area;
		//area of a cylinder formula
		area = Math.PI * ((radius * radius) * height);
		//prints the area of a cylinder to the screen
		System.out.println("The area of the cylinder is " + area);
	}

}
