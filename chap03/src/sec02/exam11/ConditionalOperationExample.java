package sec02.exam11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		
		int score = 73;
		
		String grade = (score > 90) ? "A grade" : (score > 80) ? "B grade" : "C grade";
		
		System.out.println(score + " is " + grade);

	}

}
