
public class TestScores {

	public TestScores(double[] TestScores) {
		//prints and calls the average of all the test scores
		System.out.println("Average: " + Average(TestScores));
	}
	
	public double Average(double[] Scores) {
		double average = 0;
		for(int i = 0; i < Scores.length; i++){
			//gets the sum of all the test scores
			average += Scores[i];
		}
		//Divides the sum of test scores by the length to find the average
		average = average / Scores.length;
		//returns the average
		return average;
	}

}
