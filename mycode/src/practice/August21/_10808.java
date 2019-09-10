package practice.August21;

import java.util.Scanner;

public class _10808 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int[] count = new int[26];
		
		for(int p=0; p<input.length(); p++) {
			count[input.charAt(p) - 97]++;
		}
		
		for(int p=0; p<26; p++) {
			System.out.print(count[p]);
			if(p != 25) {
				System.out.print(" ");
			}
		}
		
		sc.close();
	}

}
