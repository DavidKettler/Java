
public class RunningRaceLauncher {
 //DOES NOT WORK THIS LAB IS STUPID
	public static void main(String[] args) {

		RunningRace person1 = new RunningRace("Joe", 5);
		RunningRace person2 = new RunningRace("Jack", 7);
		RunningRace person3 = new RunningRace("Jane", 4);
		
		Place(person1.getTime(), person2.getTime(), person3.getTime(), person1.getName(), person2.getName(), person3.getName());

	}
	public static void Place(int person1, int person2, int person3, String name1, String name2, String name3) {
		String first = " ";
		String Second = " ";
		String Third = " ";
		if (person1 > person2 && person1 > person3) {
			first = name1;
		} else if (person2 < person1 && person2 > person3) {
			Second = name2;
		} else if (person3 < person1 && person3 < person2) {
			Third = name3;
		} else if (person3 < person1 && person3 > person2) {
			Second = name3;
		} else if (person2 < person1 && person2 < person3) {
			Third = name2;
		} else if (person2 > person1 && person2 > person3) {
			first = name2;
		} else if (person1 < person2 && person1 > person3) {
			Second = name1;
		} else if (person3 < person2 && person3 < person1) {
			Third = name3;
		} else if (person1 < person2 && person1 < person3) {
			Third = name1;
		} else if (person3 > person2 && person3 > person1) {
			first = name3;
		} else if (person2 < person3 && person2 > person1) {
			Second = name2;
		} else if (person1 < person3 && person1 < person2) {
			Third = name1;
		} else if (person1 < person3 && person1 > person2) {
			Second = name1;
		} 
		System.out.println("First: " + first);
		System.out.println("Second: " + Second);
		System.out.println("Third: " + Third);
	}

}
