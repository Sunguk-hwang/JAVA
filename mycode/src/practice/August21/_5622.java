package practice.August21;

import java.util.Scanner;

public class _5622 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] check = new String[]{"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		int time = 0;
		for(int p=0; p<input.length(); p++) {
			for(int q=0; q<check.length; q++) {
				if(check[q].contains(String.valueOf(input.charAt(p)))) {
					time += 2 + 1 + q;
				}
			}
		}
		System.out.println(time);
		sc.close();
	}
}