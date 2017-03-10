
public class Temperature {
	private double ftemp;
	
	public Temperature(double Ftemp) {
		this.ftemp = Ftemp;
	}
	
	public double getFahrenheit() {
		return ftemp;
	}
	
	public void setFahrenheit(double ftemp) {
		this.ftemp = ftemp;
	}
	
	public void getCelsius() {
		double celsius = (5.0/9.0) * (ftemp - 32.0);
		System.out.printf("Celsius: %.2f", celsius);
	}
	
	public void getKelvin() {
		double kelvin = ((5.0/9.0) * (ftemp - 32.0)) + 273.0;
		System.out.printf("Kelvin: %.2f", kelvin);
	}
}
