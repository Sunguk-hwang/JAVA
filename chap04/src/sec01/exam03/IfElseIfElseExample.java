package sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		
		int score = 80;
		
		if(score >= 90) {
			System.out.println("90점 이상이다");
		}
		
		else if (score>=80) {
			System.out.println("80점 이상이다");
		}
		
		else {
			System.out.println("점수가 개판이다.");
		}

	}

}
