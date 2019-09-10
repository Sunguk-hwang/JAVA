package practice.August21;

import java.util.Scanner;

public class _2902 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String result = "";
		for(int p=0; p<input.length()-1; p++) {
			if(p==0) {
				result += input.charAt(p);
			} else {
				if(input.charAt(p) == '-') {
					result += input.charAt(p+1);
				}
			}
		}
		System.out.println(result);
		
		sc.close();
	}

}
