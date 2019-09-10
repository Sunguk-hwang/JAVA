package practice.August21;

import java.util.Scanner;

public class _1100 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int p=0; p<8; p++) {
			String input = sc.nextLine();
			int check = p % 2;
			for(int q=check; q<input.length(); q+=2) {
				if(input.charAt(q) == 'F') {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}