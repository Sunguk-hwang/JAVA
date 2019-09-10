package sec02.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		int x = 6;
		if((x % 2 == 0) && (x%3 == 0)) {
			System.out.println("x는 2의 배수 이면서 3의 배수 입니다.");
		}
		
		x = 9;
		if((x % 2 == 0) || (x%3 == 0)) {
			System.out.println("x는 2의 배수 또는 3의 배수 입니다.");
		}

	}

}
