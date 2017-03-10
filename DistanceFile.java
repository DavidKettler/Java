
public class DistanceFile {
	private int hours;
	private int speed;
	private int distance;
	public int getDistance(int i) {
		distance = speed * i;
		return distance;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public DistanceFile(int Hours, int Speed) {
		this.hours = Hours;
		this.speed = Speed;
	}

}
