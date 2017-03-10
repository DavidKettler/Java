
public class NegativeNumber extends Exception {
	//extends the Exception object

	public NegativeNumber() {
		//passes this error message to the Exception Object
		super("the price should be a postive number only");
	}

}
