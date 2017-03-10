
public class RetailItemLauncher {

	public static void main(String[] args) throws NegativeNumber, NegativeUnits {
		System.out.println("Description" + "\t \t UnitsOnHand" + "\t \t Price");
		//Passes data into the RetailItem object (Description, UnitsOnHand, Price)
		RetailItem retail = new RetailItem("Jacket", -12, 59.95);
		RetailItem retail2 = new RetailItem("Designer Jeans", -40, 34.95);
		RetailItem retail3 = new RetailItem("Shirt", 20, 24.95);
		//prints the data from the Retail Objects to the screen
		System.out.println("Item 1: \t " + retail.getDescription() + "\t \t" +  retail.getUnitsOnHand() + "\t \t" + retail.getPrice());
		System.out.println("Item 2: \t " + retail2.getDescription() + "\t \t" + retail2.getUnitsOnHand() + "\t \t" + retail2.getPrice());
		System.out.println("Item 3: \t " + retail3.getDescription() + "\t \t" +  retail3.getUnitsOnHand() + "\t \t" + retail3.getPrice());
	}

}
