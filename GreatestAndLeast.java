
public class GreatestAndLeast {
	private int number;
	private int small = 2147483647;
	private int large =  -2147483647;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		int low = number;
		int high  = number;
		if(low < this.small){
			setSmall(low);
		}
		if(high > this.large){
			setLarge(high);
		}
	}

	public int getSmall() {
		return small;
	}

	public void setSmall(int small) {
		this.small = small;
	}

	public int getLarge() {
		return large;
	}

	public void setLarge(int large) {
		this.large = large;
	}

	public GreatestAndLeast() {
		
	}

}
