
public class Population {
	private double startingNumber ; // starting number of organisms
	private double dailyIncrease; //average daily increase
	private double daysMultiplied; //number of days a species will multiply
	private double currentPopulation; //current population variable
	
	//current population getter
	public double getCurrentPopulation() {
		//multiply current population by the daily increase and add that result by the current population
		 this.currentPopulation = ((this.currentPopulation * this.dailyIncrease) + this.currentPopulation);
		 //return the current population
		 return this.currentPopulation;
	}
	//currentPopulation setter
	public void setCurrentPopulation(double currentPopulation) {
		this.currentPopulation = currentPopulation;
	}
	//starting number getter
	public double getStartingNumber() {
		return startingNumber;
	}
	//starting number setter
	public void setStartingNumber(double startingNumber) {
		this.startingNumber = startingNumber;
	}
	//daily increase getter
	public double getDailyIncrease() {
		return dailyIncrease;
	}
	//daily increase setter
	public void setDailyIncrease(double dailyIncrease) {
		this.dailyIncrease = dailyIncrease;
	}
	//days multiplied getter
	public double getDaysMultiplied() {
		return daysMultiplied;
	}
	//days multiplied setter
	public void setDaysMultiplied(double daysMultiplied) {
		this.daysMultiplied = daysMultiplied;
		//sets the current population = daysMultiplied as well
		this.currentPopulation = daysMultiplied;
	}
	//current population setter
	public void setCurrentPopulation() {
		this.currentPopulation = this.startingNumber;
		//loops for the amout of days entered
		for (int i = 1; i < this.daysMultiplied; i++) {
			this.currentPopulation = getCurrentPopulation();	
		}
	}
	//display population method that returns nothing
	public void displayPopulationSize(){
		//displays results to the screen
		System.out.println("----------- Species Population -----------");
		System.out.println("Starting population: " + this.startingNumber);
		System.out.println("Average population increase: " + this.dailyIncrease);
		System.out.println("Numbers of days multiplied: " + this.daysMultiplied);
		System.out.println("Ending population: " + this.getCurrentPopulation());
	}
}
