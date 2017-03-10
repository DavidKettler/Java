
public class LandTract {
	//length and width feilds for the tract
	private double length;
	private double width;
	
	//constructor that sets the length and width to the fields
	public LandTract(double Length, double Width) {
		this.length = Length;
		this.width = Width;
	}
	
	//length getter
	public double getLength() {
		return length;
	}
	
	//length setter
	public void setLength(double length) {
		this.length = length;
	}
	
	//width getter
	public double getWidth() {
		return width;
	}
	
	//width setter
	public void setWidth(double width) {
		this.width = width;
	}
	
	//area getter
	public double getArea() {
		double area;
		area = this.length * this.width;
		return area;
	}
	
	//checks to see if the 2 tracts are equal in size and returns a true or false
	public boolean Equals(LandTract land1, LandTract land2) {
		if (land1.getArea() == land2.getArea()) {
			return true;
		} else {
			return false;
		}
	}
	
	//toString method to display all the data on the screen
	public void toString(LandTract land1, LandTract land2) {
		System.out.println("Length of Tract1: " + land1.getLength());
		System.out.println("Width of Tract1: " + land1.getWidth());
		System.out.println("Area of Tract1: " + land1.getArea());
		
		System.out.println("");
		
		System.out.println("Length of Tract2: " + land2.getLength());
		System.out.println("Width of Tract2: " + land2.getWidth());
		System.out.println("Area of Tract2: " + land2.getArea());
		
		System.out.println("");
		
		System.out.println("Are Tract1 and Tract 2 the same size? " + this.Equals(land1, land2));
	}
}
