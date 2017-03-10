
public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem(String Description, int UnitsOnHand, double Price) {
		this.description = Description;
		this.unitsOnHand = UnitsOnHand;
		this.price = Price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String Description) {
		this.description = Description;
	}

	public int getUnitsOnHand() {
		return unitsOnHand;
	}

	public void setUnitsOnHand(int UnitsOnHand) {
		this.unitsOnHand = UnitsOnHand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double Price) {
		this.price = Price;
	}

}
