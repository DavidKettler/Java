
public class MonthsLauncher {

	public static void main(String[] args) {
		try{
			//objects were created
			Months object1 = new Months();
			Months object2 = new Months("March");
			//set function
			object1.setMonthNumber(13);
			System.out.println("Month: "+object1.toString());
			}
			catch(InvalidNumber e){
			System.out.println(e.getMessage());
			}
	}

}
