
public class InventoryItemLauncher {

	public static void main(String[] args) {
		InventoryItem item1 = new InventoryItem("It does stuff", 5);
		InventoryItem item2 = new InventoryItem(item1);
		System.out.println("Item2 Description: " + item2.getDescription());
		System.out.println("Item2 Units: " + item2.getUnits());
	}

}
