
public class Rainfall {
	private double[] months;
	
	public double[] getMonths() {
		return months;
	}

	public void setMonths(double[] months) {
		this.months = months;
	}

	public Rainfall(double[] Months) {
		this.months = Months;
	}
	
	public double TotalRainfall() {
		double total = 0;
		for (int i = 0; i < months.length; i++) {
			total += months[i];
		}
		return total;
	}
	
	public double AverageRainfall() {
		double total = 0;
		for (int i = 0; i < months.length; i++) {
			total += months[i];
		}
		total = total / months.length;
		return total;
	}
	
	public int Most() {
		double greatest = 0.0;
		int month = 0;
		for (int i = 0; i < months.length; i++) {
			if (months[i] > greatest) {
				greatest = months[i];
				month = i + 1;
			}
		}
		return month;
	}
	
	public int Least() {
		double least = 999999999;
		int month = 0;
		for (int i = 0; i < months.length; i++) {
			if (months[i] < least) {
				least = months[i];
				month = i + 1;
			}
		}
		return month;
	}

}
