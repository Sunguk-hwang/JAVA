package sec02.exam01;

import java.util.Scanner;

public class TryCatchFinallyEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("첫 번째 값: ");
				int x = Integer.parseInt(scanner.nextLine());
				System.out.print("두 번째 값: ");
				int y = Integer.parseInt(scanner.nextLine());
				int result = x + y;
				System.out.println("결과: " + result);
				break;
			} catch(Exception e) {
					System.out.println("입력 값은 숫자입니다.");
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
