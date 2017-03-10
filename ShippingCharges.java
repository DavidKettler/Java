
public class ShippingCharges {
	private double weight;
	private int miles;
	public ShippingCharges(double Weight, int Miles) {
		this.weight = Weight;
		this.miles = Miles;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	public double ShippingFees() {
		double fee = 0;
		int maths1;
		double maths2;
		if (weight <= 2) {
			fee = 1.10;
		} else if (weight > 2 && weight <= 6) {
			fee = 2.20;
		} else if (weight > 6 && weight <= 10) {
			fee = 3.70;
		} else if (weight > 10) {
			fee = 4.80;
		}
		maths1 = (miles / 500);
		maths2 = maths1 * fee;
		return maths2;
	}
}
