package sec04.exam05;

import java.util.Scanner;

public class ScannerExample2 {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출력횟수:");
		int num = Integer.parseInt(scanner.nextLine());
		
		System.out.print("출력내용:");
		String content = scanner.nextLine();
		
		for(int i=1; i<=num; i++) {
			System.out.println(content);
		}
	}
}
