package sec02.test;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		int total = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		program: while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			String input = scanner.nextLine();
			int inputNum = Integer.parseInt(input);
			switch(inputNum) {
				case 1:
					System.out.print("예금액>");
					String input1 = scanner.nextLine();
					int inputNum1 = Integer.parseInt(input1);
					if(inputNum1 < 0) {
						System.out.println("!입력 불가!");
						break;
					}
					total += inputNum1;
					break;
				case 2:
					System.out.print("출금액>");
					String input2 = scanner.nextLine();
					int inputNum2 = Integer.parseInt(input2);
					if(total<inputNum2) {
						System.out.println("!잔고 부족!");
						break;
					}
					total -= inputNum2;
					break;
				case 3:
					System.out.println("잔고>" + total);
					break;
				case 4:
					System.out.println();
					break program;
				default:
					System.out.println("!다시 선택!");						
			}
		}
		System.out.println("프로그램 종료");

	}

}
