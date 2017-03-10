
public class SoftwareSales {
	private double units;
	public double getUnits() {
		return units;
	}
	public void setUnits(double units) {
		this.units = units;
	}
	public SoftwareSales(double Units) {
		this.units = Units;
	}
	
	public double discount() {
		double discount = 1;
		if (units >= 10 && units <= 19) {
			discount = 0.20;
		} else if (units >= 10 && units <= 49) {
			discount = 0.30;
		} else if (units >= 50 && units <= 99) {
			discount = 0.40;
		} else if (units >= 100) {
			discount = 0.50;
		}
		return units * discount;
	}
}
