
public class FuleGuage {
	private double fuel = 0; //fuel fields
		
	//method that adds 1 to the fuel every time it is called
	public double getFillUp(){
		//if the fuel is less than 15 adds 1 to the fuel every time it is called
		if(fuel < 15.00 ){
			fuel++; //adds 1
		}
		return fuel;
	}
	
	//method that takes fuel away every time it is called
	public double getFuelLose(){
		// if fuel is less than 1 then fuel would go down by 1 every time it is called
		if(fuel > 1){
			fuel--; // subtracts 1
		}
		return fuel;
	}

	
	//fuel getter
	public double getFuel() {
		return fuel;
	}

	//fuel setter
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

}
