
public class ProductionWorker extends Employee{
	private int Shift;
	private double HourlyPayRate;
	
	public ProductionWorker(int shift, double hourlyRate) {
		this.Shift = shift;
		this.HourlyPayRate = hourlyRate;
	}

	public int getShift() {
		return Shift;
	}

	public void setShift(int shift) {
		Shift = shift;
	}

	public double getHourlyPayRate() {
		return HourlyPayRate;
	}

	public void setHourlyPayRate(double hourlyPayRate) {
		HourlyPayRate = hourlyPayRate;
	}

	@Override
	public String toString() {
		return "ProductionWorker [Shift=" + Shift + ", HourlyPayRate=" + HourlyPayRate + "]";
	}

}
