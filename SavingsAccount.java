
public class SavingsAccount {
	private double MonthlyIntrest; // monthly intrest rate
	private double Balance; // balance
	private double Withdraw; // total amount for withdrawn
	private double Deposit; // total amount for deposits
	private double Intrest; // total dolar amount for intrest
	
	public SavingsAccount(double Balance) {
		setBalance(Balance);
	}
	public double getMonthlyIntrest() {
		return MonthlyIntrest / 100;
	}
	public void setMonthlyIntrest(double monthlyIntrest) {
		MonthlyIntrest = monthlyIntrest / 12;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public double getWithdraw() {
		return Withdraw;
	}
	public void setWithdraw(double withdraw) {
		Withdraw += withdraw;
	}
	public double getDeposit() {
		return Deposit;
	}
	public void setDeposit(double deposit) {
		Deposit += deposit;
	}
	public double getIntrest() {
		return Intrest;
	}
	public void setIntrest(double intrest) {
		Intrest = intrest;
	}
	public void deposit(double number){
		Balance = Balance + number;
	}
	public void withdrawn(double number){
		Balance = Balance - number;
	}
	public void intrest(){
		Intrest = Balance * (MonthlyIntrest / 100);
		Balance = Balance + (Balance * (MonthlyIntrest / 100));
		}
	
}
