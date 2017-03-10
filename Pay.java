import java.text.NumberFormat;
public class Pay {

	public Pay() {
		
	}
	
	public double[] employeeRaise(double[] Arrays) {
		for (int i = 0; i < Arrays.length; i++) {
			Arrays[i] += 2.0;
		}
		return Arrays;
	}
	
	public void displayHighLow(String[] Name, double[] Wage) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		double highest = Wage[0];
		for(int i = 0; i < Wage.length; i++) {
			if (Wage[i] > highest) {
				highest = Wage[i];
			}
		}
		System.out.println("Jill makes the most money at " + formatter.format(highest) + " per hour.");
		
		double lowest = Wage[0];
		for(int t = 0; t < Wage.length; t++) {
			if (Wage[t] < lowest) {
				lowest = Wage[t];
			}
		}
		System.out.println("Jessica makes the least money at " + formatter.format(lowest) + " per hour.");
	}

}
