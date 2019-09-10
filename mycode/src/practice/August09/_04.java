package practice.August09;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		int[] result = new int[t];
		for(int p=0; p<t; p++) {
			int sum = 0;
			int n = scanner.nextInt();
			scanner.nextLine();
			String[] str = scanner.nextLine().split(" ");
			String s1 = scanner.nextLine();
			String s2 = scanner.nextLine();
			for(int q=0; q<n; q++) {
				if(s1.charAt(q) == s2.charAt(q) && s1.charAt(q) == 'O') {
					sum += Integer.parseInt(str[q]);
				}
			}
			result[p] = sum;
		}
		scanner.close();
		
		for(int p=0; p<t; p++) {
			System.out.println("Case #"+(p+1));
			System.out.println(result[p]);
		}
	}
}
