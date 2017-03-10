
public class DistanceTraveled {
	private int hours;//hours variable for the object
	private int speed;//speed variable for the object
	private int distance;//distance variable for the object
	
	//distance getter
	public void getDistance() {
		//loops for the amount of time the user enters
		for (int i = 1; i <= this.hours; i++) {
			//multiplies i by the speed to get the distance
			distance = this.speed * i;
			//prints to the screen
			System.out.println(i + "\t\t\t" + distance);
		}
	}
	//hours getter
	public int getHours() {
		return hours;
	}
	//hours setter
	public void setHours(int hours) {
		this.hours = hours;
	}
	//speed getter
	public int getSpeed() {
		return speed;
	}
	//speed setter
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//constructor that gets the hours and speed from the launcher and sets them to the object
	public DistanceTraveled(int Hours, int Speed) {
		this.hours = Hours;
		this.speed = Speed;
	}

}
