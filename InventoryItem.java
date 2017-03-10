
public class InventoryItem {
	private String Description;
	private int Units;
	
	public InventoryItem(String description, int units) {
		this.Description = description;
		this.Units = units;
	}
	
	public InventoryItem(InventoryItem item1) {
		this.Description = item1.Description;
		this.Units = item1.Units;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getUnits() {
		return Units;
	}

	public void setUnits(int units) {
		Units = units;
	}

}
