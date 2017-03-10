
public class Car {
	private int yearModel;
	private String make;
	private int speed;
	
	public Car(int YearModel, String Make) {
		this.yearModel = YearModel;
		this.make = Make;
		this.speed = 0;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int YearModel) {
		this.yearModel = YearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String Make) {
		this.make = Make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int Speed) {
		this.speed = Speed;
	}

	public void accelerate() {
		this.speed += 5;
	}
	
	public void brake() {
		this.speed -= 5;
	}
}
