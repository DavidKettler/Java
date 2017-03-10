
public class Circle {
	private double Radius;
	private double Area;
	private double Diameter;
	private double Circumference;
	private double PI = 3.14159;
	public Circle() {
		
	}
	public double getRadius() {
		return Radius;
	}
	public void setRadius(double radius) {
		Radius = radius;
	}
	public double getArea() {
		return PI * (Radius * Radius);
	}
	public void setArea(double area) {
		Area = area;
	}
	public double getDiameter() {
		return Radius * 2;
	}
	public void setDiameter(double diameter) {
		Diameter = diameter;
	}
	public double getCircumference() {
		return 2* PI * Radius;
	}
	public void setCircumference(double circumference) {
		Circumference = circumference;
	}
	public double getPI() {
		return PI;
	}
	public void setPI(double pI) {
		PI = pI;
	}
}
