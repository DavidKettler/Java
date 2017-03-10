
public class SumofNumbers {
	private int inputs;//input variable for the object
	//returns the input for the object
	public int getInputs() {
		return inputs;
	}
	//sets the input for the object
	public void setInputs(int inputs) {
		this.inputs = inputs;
	}
	//constroctor that passes the input value from the launcher to the object 
	public SumofNumbers(int Inputs) {
		this.inputs = Inputs;
	}
	//loop stuff method that returns a int
	public int loopStuff() {
		int num1 = 0;
		//loops for the amount of times the user inputs
		for (int i = 1; i <= inputs; i++) {
			//continously adds i to num1 variable
			num1 += i;
		}
		//returns num1
		return num1;
	}

}
