import java.util.Arrays;

public class num6Driver {
	private String[] correctANS = {"B","D","A","A","C",
			"A","B","A","C","D",
			"B","C","D","A","D",
			"C","C","B","D","A",};
	private int totalCorrect;
	private int totalIncorrect;
	private String questionsMissed;
	

	public num6Driver(String[] student) {
		for(int i = 0; i < correctANS.length; i++){
			if(student[i].equals(correctANS[i])){
				setTotalCorrect();
			}
			else {
				setTotalIncorrect();
				setQuestionsMissed(i, 1);
			}
		}
	}
	public boolean passed(){
		if(totalCorrect >= 15){
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * @return the totalCorrect
	 */
	public int getTotalCorrect() {
		return totalCorrect;
	}
	/**
	 * @param totalCorrect the totalCorrect to set
	 */
	public void setTotalCorrect() {
		this.totalCorrect++;
	}
	/**
	 * @return the totalIncorrect
	 */
	public int getTotalIncorrect() {
		return totalIncorrect;
	}
	/**
	 * @param totalIncorrect the totalIncorrect to set
	 */
	public void setTotalIncorrect() {
		this.totalIncorrect++;
	}
	/**
	 * @return the questionsMissed
	 */
	public String getQuestionsMissed() {
		return questionsMissed;
	}
	/**
	 * @param questionsMissed the questionsMissed to set
	 */
	public void setQuestionsMissed(int questions, int count) {
		if (count != 1){
		questionsMissed += " " + (questions + 1);
		}
		else {
			questionsMissed = " " + (questions + 1);
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		num6Driver other = (num6Driver) obj;
		if (!Arrays.equals(correctANS, other.correctANS)) {
			return false;
		}
		return true;
	}

}
