
public class TimeCalculator {
	private double seconds;
	
	public double getSeconds() {
		return seconds;
	}
	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}
	public double getMinoutes() {
		return seconds / 60;
	}
	public void setMinoutes(double seconds) {
		this.seconds = seconds;
	}
	public double getHours() {
		return (seconds / 60) / 60;
	}
	public void setHours(double seconds) {
		this.seconds = seconds;
	}
	public double getDays() {
		return ((seconds / 60) / 60) / 24;
	}
	public void setDays(double seconds) {
		this.seconds = seconds;
	}
	public TimeCalculator(double Seconds) {
		this.seconds = Seconds;
	}
	

}
