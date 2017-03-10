
public class TestScores {
	private double testScore1;
	private double testScore2;
	private double testScore3;
	public double getTestScore1() {
		return testScore1;
	}
	public void setTestScore1(double testScore1) {
		this.testScore1 = testScore1;
	}
	public double getTestScore2() {
		return testScore2;
	}
	public void setTestScore2(double testScore2) {
		this.testScore2 = testScore2;
	}
	public double getTestScore3() {
		return testScore3;
	}
	public void setTestScore3(double testScore3) {
		this.testScore3 = testScore3;
	}
	public TestScores(double testScore1, double testScore2, double testScore3) {
		this.testScore1 = testScore1;
		this.testScore2 = testScore2;
		this.testScore3 = testScore3;
	}
	public double getAverage() {
		return (testScore1 + testScore2 + testScore3) /3;
	}
	public String getLettlerGrade() {
		String grade = " ";
		if (getAverage() >= 90 && getAverage() <= 100) {
			grade = "A";
		} else if (getAverage() >= 80 && getAverage() <= 89) {
			grade = "B";
		} else if (getAverage() >= 70 && getAverage() <= 79) {
			grade = "c";
		} else if (getAverage() >= 60 && getAverage() <= 69) {
			grade = "D";
		} else if (getAverage() < 60) {
			grade = "F";
		}
		return grade;
	}

}
