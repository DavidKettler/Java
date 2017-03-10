
public class Odometer {
	//more fields
	private double mileage = 0;
	private FuleGuage useage;
	
	public Odometer() {
		//un-used constructor
	}
	
	//overloaded constructor setting the passed fuelGuage to the object fuleguage
	public Odometer(FuleGuage useage) {
		this.useage = useage;
	}

	//adds a mile every time its called
	public double getAddMile(){
		if(mileage > 999999){
			mileage = 0;
		} else {
			mileage++;
		}
		return mileage;
	}
	//car gets 24mpg and if there are any remainders then it will subtract 1 from the fuel usage
	public void getBurn(){
		if ((mileage % 24) == 0){
			double total;
			total = useage.getFuel() - 1;
			useage.setFuel(total);
		}
	}
// mileage getter
	public double getMileage() {
		return mileage;
	}
}
