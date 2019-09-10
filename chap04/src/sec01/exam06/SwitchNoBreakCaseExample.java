package sec01.exam06;

import java.util.Scanner;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		
		
		System.out.print("랜덤으로 돌릴 숫자 갯수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int inputNum = Integer.parseInt(input);		
		
		int var = (int)(Math.random() * inputNum) + 1;
		
		System.out.println(var + "이 나왔습니다.");

		/*System.out.print("현재 시간을 입력 : ");
		keyCode = System.in.read();*/
		
		System.out.println("\n-------???-------");
		
		switch(var) {
			case 8:
				System.out.println("출근 합니다.");
			case 9:
				System.out.println("회의 합니다.");
			case 10:
				System.out.println("업무 봅니다.");
			case 11:
				System.out.println("외근 갑니다.");
				break;
			default:
				System.out.println("현재 시간을 확인하세요.");
		}
	}
}
