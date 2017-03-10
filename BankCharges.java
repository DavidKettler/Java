
public class BankCharges {
	private int numChecks;
	private double accountTotal;
	public int getNumChecks() {
		return numChecks;
	}
	public void setNumChecks(int numChecks) {
		this.numChecks = numChecks;
	}
	public double getAccountTotal() {
		return accountTotal;
	}
	public void setAccountTotal(double accountTotal) {
		this.accountTotal = accountTotal;
	}
	public BankCharges(int NumChecks, double AccountTotal) {
		this.numChecks = NumChecks;
		this.accountTotal = AccountTotal;
	}
	public double serviceFees() {
		double serviceFees = 0;
		double fee = 0;
		if (numChecks < 20) {
			fee = 0.10;
		} else if (numChecks >= 20 && numChecks <= 39) {
			fee = 0.08;
		} else if (numChecks >= 40 && numChecks <= 59) {
			fee = 0.06;
		} else if (numChecks > 60) {
			fee = 0.04;
		}
		if (accountTotal < 400) {
			serviceFees = 25 + (fee * numChecks);
		} else {
			serviceFees = 10 + (fee * numChecks);
		}
		return serviceFees;
	}
}
