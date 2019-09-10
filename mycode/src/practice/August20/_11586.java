package practice.August20;

import java.util.Scanner;

public class _11586 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		String[] input = new String[t];
		
		for(int p=0; p<t; p++) {
			input[p] = sc.nextLine();
		}
		
		int k = sc.nextInt();
		sc.nextLine();
		
		switch(k) {
		case 1:
			for(int p=0; p<t; p++) {
				System.out.println(input[p]);
			}
			break;
		case 2:
			for(int p=0; p<t; p++) {
				for(int q=input[0].length()-1; q>=0; q--) {
					System.out.print(input[p].charAt(q));
				}
				System.out.println();
			}
			// 오 이게 더 간단하네. 똑똒이 인정.
			break;
		case 3:
			for(int p=0; p<t; p++) {
				System.out.println(input[t-p-1]);
			}
			break;
		}

		sc.close();
	}
}