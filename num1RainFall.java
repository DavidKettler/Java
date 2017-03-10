
public class num1RainFall {

	private int lowest;
	private int highest;
	private double avg;
	public num1RainFall() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the lowest
	 */
	public int getLowest() {
		return lowest;
	}
	/**
	 * @param lowest the lowest to set
	 */
	public void setLowest(int lowest) {
		this.lowest = lowest;
	}
	/**
	 * @return the highest
	 */
	public int getHighest() {
		return highest;
	}
	/**
	 * @param highest the highest to set
	 */
	public void setHighest(int highest) {
		this.highest = highest;
	}
	/**
	 * @return the avg
	 */
	public double getAvg() {
		return avg / 12.0;
	}
	/**
	 * @param avg the avg to set
	 */
	public void setAvg(double avg) {
		this.avg += avg;
	}
	
}
