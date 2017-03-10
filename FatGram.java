
public class FatGram {
	private double calories;
	private double fatGrams;
	public FatGram(double Calories, double FatGrams) {
		this.calories = Calories;
		this.fatGrams = FatGrams;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public double getGrams() {
		return fatGrams;
	}
	public void setGrams(int grams) {
		this.fatGrams = grams;
	}

	public double percFat() {
		double fatCalories;
		double percFat;
		fatCalories = fatGrams * 9;
		percFat = (fatCalories / calories) * 100;
		return percFat;
	}
}
