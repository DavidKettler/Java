
public class CarInstrumentLauncher {

	public static void main(String[] args) {
		//initiates the object stuff
		FuleGuage p1 = new FuleGuage();
		//passes the fuleGuage object into the odometer object
		Odometer p2 = new Odometer(p1);
		
		int i = 24;
		for(int x = 0; x < 360; x++){ //loops 360 times
			if(p1.getFuel() <= 1){ // if the fuel is less than or equal to 1
				int y = 0;
				while(y <= 15.0){ //loops 15 times
					if(p1.getFuel() <= 15.0){ //checks if the fuel is less than 15
						p1.getFillUp(); //if it is it will fill up with gas
						System.out.println("fuel level: " + p1.getFuel()); //prints to the screen
					}
					y++;//adds 1 to Y every time it loops
				}
			}
			if(i == 24){ //if i is 24
				System.out.println("Milage: " + p2.getMileage()+ //prints the milage and fuel level to the screen
						" fuel level: " + p1.getFuel());
				i= 1; //sets i back to 1
			}else {
				i++; // adds 1 to i
			}
			p2.getAddMile(); //calls the addmile method
			p2.getBurn(); //calls the getBurn method
		}
	}

}
