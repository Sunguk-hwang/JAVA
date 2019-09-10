package practice.August21;

import java.util.Scanner;

public class _10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		char[] charArr = new char[26];
		int[] resultArr = new int[26]; 
		for(int p=0; p<26; p++) {
			charArr[p] = (char)('a'+p);
			resultArr[p] = -1;
		}

		for(int p=0; p<input.length(); p++) {
			for(int q=0; q<26; q++) {
				if(charArr[q] == input.charAt(p) && resultArr[q] == -1) {
					resultArr[q] = p;
				}
			}
		}
		
		for(int p=0; p<26; p++) {
			System.out.print(resultArr[p]);
			if(p != 25) {
				System.out.print(" ");
			}
		}
	}
}