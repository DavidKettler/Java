
public class SpeedSound {
	private double air;
	private double water;
	private double steel;
	private double distance;
	public double getAir() {
		air = distance/1100;
		return air;
	}
	public void setAir(double air) {
		this.air = air;
	}
	public double getWater() {
		water = distance / 4900;
		return water;
	}
	public void setWater(double water) {
		this.water = water;
	}
	public double getSteel() {
		steel = distance / 16400;
		return steel;
	}
	public void setSteel(double steel) {
		this.steel = steel;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public SpeedSound(double Distance) {
		this.distance = Distance;
	}
	

}
