
public class Month {
	private int monthNumber;
	
	public Month() {
		this.monthNumber = 1;
	}
	
	public Month(int MonthNumber) {
		if (MonthNumber > 12) {
			this.monthNumber = 1;
		} else if (MonthNumber < 1) {
			this.monthNumber = 1;
		} else {
			this.monthNumber = MonthNumber;
		}
	}
	
	public Month(String monthName) {
		if (monthName.equalsIgnoreCase("january")) {
			this.monthNumber = 1;
		} else if (monthName.equalsIgnoreCase("february")) {
			this.monthNumber = 2;
		} else if (monthName.equalsIgnoreCase("March")) {
			this.monthNumber = 3;
		} else if (monthName.equalsIgnoreCase("April")) {
			this.monthNumber = 4;
		} else if (monthName.equalsIgnoreCase("May")) {
			this.monthNumber = 5;
		} else if (monthName.equalsIgnoreCase("June")) {
			this.monthNumber = 6;
		} else if (monthName.equalsIgnoreCase("July")) {
			this.monthNumber = 7;
		} else if (monthName.equalsIgnoreCase("August")) {
			this.monthNumber = 8;
		} else if (monthName.equalsIgnoreCase("September")) {
			this.monthNumber = 9;
		} else if (monthName.equalsIgnoreCase("October")) {
			this.monthNumber = 10;
		} else if (monthName.equalsIgnoreCase("November")) {
			this.monthNumber = 11;
		} else if (monthName.equalsIgnoreCase("December")) {
			this.monthNumber = 12;
		}
	}

	public int getMonthNumber() {
		return monthNumber;
	}

	public void setMonthNumber(int monthNumber) {
		this.monthNumber = monthNumber;
	}

}
