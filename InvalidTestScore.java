
public class InvalidTestScore extends Exception {
	//extends the Exception class

	public InvalidTestScore() {
		//sends this error message to the Exception object
		super("Error: Test Score can not be less than 0 or more than 100");
	}

}
