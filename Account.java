public class Account {
	private double balance;
	private int accountNumber;
	private String firstName;
	private String LastName;
	private String streetAdress;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;
	private boolean preferredCustomer;
	private String accountType;
	private String accountNotes;
	public Account(String FirstName, String LastName, String StreetAdress, String City, String State, int Zip, String PhoneNumber, boolean PreferredCustomer, double Balance, String AccountType) {
		this.accountNotes = "none";
		setFirstName(FirstName);
		setLastName(LastName);
		setStreetAdress(StreetAdress);
		setCity(City);
		setState(State);
		setZip(Zip);
		setPhoneNumber(PhoneNumber);
		setPreferredCustomer(PreferredCustomer);
		setBalance(Balance);
		setAccountType(AccountType);
		setAccountNumber((int) (Math.random() * 2000000000 ));
	}
	public double getBalance() {
		if (balance < 0) {
			negativeBalanceLetter();
		}
		return balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getStreetAdress() {
		return streetAdress;
	}
	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isPreferredCustomer() {
		return preferredCustomer;
	}
	public void setPreferredCustomer(boolean preferredCustomer) {
		this.preferredCustomer = preferredCustomer;
	}
	public String getAccountType() {
		switch (accountType) {
		case "check":
			accountType = "Checking";
		case "save":
			accountType = "Savings";
		case "invest":
			accountType = "Investment";
		default:
			accountType = "Standard";
		}
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountNotes() {
		return accountNotes;
	}
	public void setAccountNotes(String accountNotes) {
		this.accountNotes = accountNotes;
	}
	public void negativeBalanceLetter() {
		this.accountNotes = "Negative balance letter has been sent";
	}

}
