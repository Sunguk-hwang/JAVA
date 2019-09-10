package practice.August19;

import java.util.Arrays;
import java.util.Scanner;

public class _11656 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] strArr = new String[input.length()];
		
		for(int p=0; p<input.length(); p++){
			String str = "";
			for(int q=p; q<input.length(); q++) {
				str += input.charAt(q);
			}
			strArr[p] = str;
		}
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		sc.close();
	}
}