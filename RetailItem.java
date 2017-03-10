
public class RetailItem {
	//Initializes the following fields
	private String description;
	private int unitsOnHand;
	private double price;
	
	//empty constructor
	public RetailItem() {
		
	}
	//RetailItem constructor that asks for the description, unitsOnHand, and price as an argument and throws NegativeNumber and Negative units
	public RetailItem(String description, int unitsOnHand, double price) throws NegativeNumber,NegativeUnits{
		//sets the passed variables of the method to the fields
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;
		//if the unitsOnHand is a negative number it throws the custom NegativeUnits Exception
		if(this.unitsOnHand < 0){
			throw new NegativeUnits();
		}
		//if the price is a negative number it throws the custom NegativeNumber Exception
		if(this.price < 0){
			throw new NegativeNumber();
		}
	}

	//Description Getter
	public String getDescription() {
		return description;
	}
	//Description Setter
	public void setDescription(String description) {
		this.description = description;
	}
	//UnitsOnHand getter
	public int getUnitsOnHand() {
		return unitsOnHand;
	}
	//UnitsOnHand setter
	public void setUnitsOnHand(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}
	//price Getter
	public double getPrice() {
		return price;
	}
	//price setter
	public void setPrice(double price) {
		this.price = price;
	}
}
