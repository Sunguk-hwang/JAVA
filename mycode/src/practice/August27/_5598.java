package practice.August27;

import java.util.Scanner;

public class _5598 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String result = "";
		for(int p=0; p<input.length(); p++) {
			if(input.charAt(p) <= 'C') {
				result += (char)(input.charAt(p)-3+26);
			} else {
				result += (char)(input.charAt(p)-3);
			}
		}
		System.out.println(result);
		sc.close();
	}
}