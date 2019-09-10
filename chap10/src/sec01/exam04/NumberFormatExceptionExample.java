package sec01.exam04;

import java.util.Scanner;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("가격 입력: ");
			try {
				int price = Integer.parseInt(scanner.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("숫자만 입력");
			}
			
		}
		
		scanner.close();
	}

}
