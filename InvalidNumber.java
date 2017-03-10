
public class InvalidNumber extends Exception {
	//extends the Exception object

	public InvalidNumber() {
		//passes this error message to the Exception Object
		super("Cannot be less than 1 and greater than 12 ");
	}

}
