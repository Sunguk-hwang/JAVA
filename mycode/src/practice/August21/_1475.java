package practice.August21;

import java.util.Arrays;
import java.util.Scanner;

public class _1475 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int[] count = new int[9];
		for(int p=0; p<input.length(); p++) {
			if(input.charAt(p)-48 == 9) {
				count[6]++;
			} else {
				count[(int)input.charAt(p)-48]++;
			}
		}
		count[6] = (int)Math.ceil(count[6]/2.0);
		Arrays.sort(count);
		
		System.out.println(count[8]);
		
		sc.close();
	}
}