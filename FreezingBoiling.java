
public class FreezingBoiling {
	private double degree;
	public double getDegree() {
		return degree;
	}
	public void setDegree(double degree) {
		this.degree = degree;
	}
	public FreezingBoiling(double Degree) {
		this.degree = Degree;
	}
	public boolean isEthylFreezing(){
	boolean isFreeze = false;
	if (degree <= -173){
	isFreeze = true;
	}
	return isFreeze;
	}
	public boolean isOxygenFreezing(){
	boolean isFreeze = false;
	if (degree <= -362){
	isFreeze = true;
	}
	return isFreeze;
	}
	public boolean isWaterFreezing(){
	boolean isFreeze = false;
	if (degree <= 32){
	isFreeze = true;
	}
	return isFreeze;
	}
	public boolean isEthylBoiling(){
	boolean isBoil = false;
	if (degree >= 172){
	isBoil = true;
	}
	return isBoil;
	}
	public boolean isOxygenBoiling(){
	boolean isBoil = false;
	if (degree >= -306){
	isBoil = true;
	}
	return isBoil;
	}
	public boolean isWaterBoiling(){
	boolean isBoil = false;
	if (degree >= 212){
	isBoil = true;
	}
	return isBoil;
	}
}
