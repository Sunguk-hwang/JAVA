package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		
		int diceNum = (int) (6 * Math.random() + 1);
				
		System.out.print(diceNum + " : ");
		
		if(diceNum % 2 == 0) {
			System.out.println("짝수");
			}
		else {
			System.out.println("홀수");
		}
		
	}

}
