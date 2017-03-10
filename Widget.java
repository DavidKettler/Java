
public class Widget {
	private double NoW;
	public Widget(double nOw) {
		this.NoW = nOw;
	}
	public double getNoW() {
		return NoW;
	}
	public void setNoW(int noW) {
		NoW = noW;
	}
	public double HowLong() {
		return (this.NoW * 6) / 60;
	}

}
