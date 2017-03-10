
public class GeometryCalculator {
	
	public GeometryCalculator() {
		//un-used constructor
	}
	
	//method that returns the area of a circle
	public static double circleArea(double Radius) {
		double radius = Radius; //sets the passed userInput to a local variable 
		double area;
		//formula to find the area of a circle
		area = Math.PI * (radius * radius);
		return area; // returns the area
	}
	
	//method that returns the area of a rectangle
	public static double rectangleArea(double Length, double Width) {
		double length = Length;//sets the passed userInput to a local variable 
		double width = Width;//sets the passed userInput to a local variable 
		double area;
		//formula to find the area of a rectangle
		area = length * width;
		return area; //returns the area
	}

	//method that returns the area of a triangle
	public static double triangleArea(double Base, double Height) {
		double base = Base;//sets the passed userInput to a local variable 
		double height = Height;//sets the passed userInput to a local variable 
		double area;
		//formula to find the area of a triangle
		area = (base * height) * 0.5;
		return area; //returns the area
	}
}
