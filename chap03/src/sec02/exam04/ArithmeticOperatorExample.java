package sec02.exam04;
import java.util.Scanner;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = '1';
		char c2 = '2';
		char c3 = (char)(c1 + c2);
		System.out.println(c3);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		
		int num = Integer.parseInt(scanner.nextLine());
		
		if(num % 2 == 0) {
			System.out.println("짝수네요");
		}
		else
			System.out.println("홀수네요");
		
		/*char c1 = 'A';
		char c2 = 'B';
		char c3 = (char)(c1 + c2);
		System.out.println(c3);*/
	}

}
