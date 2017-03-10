

public class num2Payroll {
	int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
	int[] hours = new int[7];
	double[] payRate = new double[7];
	double[] wages = new double[7];
	private int count = 0;
	public num2Payroll() {
		}
	public void addCount(){
		count++;
	}
	/**
	 * @return the employeeId
	 */
	public int[] getEmployeeId() {
		return employeeId;
	}
	/**
	 * @return the hours
	 */
	public int[] getHours() {
		return hours;
	}
	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours[count] = hours;
	}
	/**
	 * @return the payRate
	 */
	public double[] getPayRate() {
		return payRate;
	}
	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		this.payRate[count] = payRate;
	}
	/**
	 * @return the wages
	 */
	public double[] getWages() {
		return wages;
	}
	/**
	 * @param wages the wages to set
	 */
	public void setWages() {
		this.wages[count] = payRate[count] * hours[count];
	}
	
}

