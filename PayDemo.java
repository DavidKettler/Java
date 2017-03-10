import java.text.NumberFormat;

public class PayDemo {

	public static void main(String[] args) {
		Pay employee1 = new Pay();
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		String[] Employees = {"Joe", "Jill", "Jack", "Jessica", "James", "Jenn", "Jim"};
		double[] Wages = {17.25, 40.75, 15.00, 12.00, 20.65, 25.50, 13.50};
		double[][] Sales = {{153354.00, 453213.80, 743234.75, 475985.12},
				{546124.23, 521124.33, 854154.23, 546124.22},
				{537124.23, 224527.13, 200253.64, 765200.52}};
		
		for(String val1 : Employees)
			System.out.print(val1 + "\t");
		
		System.out.println();
		
		for(double val2 : employee1.employeeRaise(Wages))
			System.out.print(formatter.format(val2) + "\t");
		
		System.out.println();
		System.out.println();
		
		employee1.displayHighLow(Employees, Wages);
		
		System.out.println();
		System.out.println();
		
		for (int row = 0; row < Sales.length; row++) {
			System.out.print("Company" + (row + 1) + "\t");
			for (int col = 0; col < Sales[row].length; col++) {
				System.out.print(formatter.format(Sales[row][col]) + "\t");
			}
			System.out.println();
		}
	}

}
