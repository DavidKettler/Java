import java.util.Scanner;

public class num8Grade {

	private final int StudentNumber = 5;
	private String[] name = new String[StudentNumber];
	private char[] letter = new char[StudentNumber];
	private double[] AVG = new double[StudentNumber];
	private double[] student1 = new double[4];
	private double[] student2 = new double[4];
	private double[] student3 = new double[4];
	private double[] student4 = new double[4];
	private double[] student5 = new double[4];
	private int count = 0;
	private final double testNum = 4.0;
	Scanner keyboard = new Scanner(System.in);
	public num8Grade() {
	}
	
	/**
	 * @return the studentNumber
	 */
	public int getStudentNumber() {
		return StudentNumber;
	}

	/**
	 * return count
	 */
	public void getCount(){
		count++;
	}
	
	/**
	 * @return the name
	 */
	public String[] getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name[count] = name;
	}
	
	/**
	 * @return the aVG
	 */
	public double[] getAVG() {
		return AVG;
	}

	/**
	 * @param aVG the aVG to set
	 */
	public void setAVG(double aVG) {
		double avg = aVG / testNum; 
		AVG[count] = avg;
		setLetter(avg);
	}

	/**
	 * @return the letter
	 */
	public char[] getLetter() {
		return letter;
	}
	/**
	 * @param letter the letter to set
	 */
	public void setLetter(double avg) {
		
		if (avg <= 59){
			this.letter[count] = 'F';
		}else if (avg <= 69){
			this.letter[count] = 'D';
		}else if (avg <= 79){
			this.letter[count] = 'C';
		}else if (avg <= 89){
			this.letter[count] = 'C';
		}else {
			this.letter[count] = 'A';
		}
	}
	/**
	 * @return the student1
	 */
	public double[] getStudent1() {
		return student1;
	}
	/**
	 * @param student1 the student1 to set
	 */
	public void setStudent1() {
		double total = 0;// total of tests
		for(int x = 0; x < 4; x++){
			System.out.println("Enter test " + (x+1)+ ": ");
			double test = keyboard.nextDouble();// gets the user input
			while(test <= 0 || test > 100){// checks to make sure data is valid
				System.out.println("Invalid Data Re-Enter test " + (x+1)+ ": ");
				test = keyboard.nextDouble();
			}
			this.student1[x] = test;// sets test
			total+= test;// adds to total
		}
		setAVG(total);// passes total to get letter grade
	}
	/**
	 * @return the student2
	 */
	public double[] getStudent2() {
		return student2;
	}
	/**
	 * @param student2 the student2 to set
	 */
	public void setStudent2() {
		double total = 0;// total of tests
		for(int x = 0; x < 4; x++){
			System.out.println("Enter test " + (x+1)+ ": ");
			double test = keyboard.nextDouble();// gets the user input
			while(test <= 0 || test > 100){// checks to make sure data is valid
				System.out.println("Invalid Data Re-Enter test " + (x+1)+ ": ");
				test = keyboard.nextDouble();
			}
			this.student2[x] = test;// sets test
			total+= test;// adds to total
		}
		setAVG(total);// passes total to get letter grade
	}
	/**
	 * @return the student3
	 */
	public double[] getStudent3() {
		return student3;
	}
	/**
	 * @param student3 the student3 to set
	 */
	public void setStudent3() {
		double total = 0;// total of tests
		for(int x = 0; x < 4; x++){
			System.out.println("Enter test " + (x+1)+ ": ");
			double test = keyboard.nextDouble();// gets the user input
			while(test <= 0 || test > 100){// checks to make sure data is valid
				System.out.println("Invalid Data Re-Enter test " + (x+1)+ ": ");
				test = keyboard.nextDouble();
			}
			this.student3[x] = test;// sets test
			total+= test;// adds to total
		}
		setAVG(total);// passes total to get letter grade
	}
	/**
	 * @return the student4
	 */
	public double[] getStudent4() {
		return student4;
	}
	/**
	 * @param student4 the student4 to set
	 */
	public void setStudent4() {
		double total = 0;// total of tests
		for(int x = 0; x < 4; x++){
			System.out.println("Enter test " + (x+1)+ ": ");
			double test = keyboard.nextDouble();// gets the user input
			while(test <= 0 || test > 100){// checks to make sure data is valid
				System.out.println("Invalid Data Re-Enter test " + (x+1)+ ": ");
				test = keyboard.nextDouble();
			}
			this.student4[x] = test;// sets test
			total+= test;// adds to total
		}
		setAVG(total);// passes total to get letter grade
	}
	/**
	 * @return the student5
	 */
	public double[] getStudent5() {
		return student5;
	}
	/**
	 * @param student5 the student5 to set
	 */
	public void setStudent5() {
		double total = 0;// total of tests
		for(int x = 0; x < 4; x++){
			System.out.println("Enter test " + (x+1)+ ": ");
			double test = keyboard.nextDouble();// gets the user input
			while(test <= 0 || test > 100){// checks to make sure data is valid
				System.out.println("Invalid Data Re-Enter test " + (x+1)+ ": ");
				test = keyboard.nextDouble();
			}
			this.student5[x] = test;// sets test
			total+= test;// adds to total
		}
		setAVG(total);// passes total to get letter grade
	}
	
}
