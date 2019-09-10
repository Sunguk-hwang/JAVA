package practice.july23th;

import java.util.Scanner;

public class TenToTen {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		for(int i=0; i<input.length();i+=10) {
			if(i+10 > input.length()) {
				System.out.println(input.substring(i));
				break;
			}
			System.out.println(input.substring(i, i+10));
		}
			
	}

}
