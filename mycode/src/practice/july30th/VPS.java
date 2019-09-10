package practice.july30th;

import java.util.Scanner;

public class VPS {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int t = Integer.parseInt(str);
		String[] input = new String[t];
		System.out.println(input[0]);

		for (int i = 0; i < t; i++) {
			input[i] = scanner.nextLine();
			System.out.println(input[i]);

			char[] charArr = input[i].toCharArray();
			int m = 0;
			int n = 0;
			for (int j = 0; j < charArr.length; j++) {
				if (charArr[j] == '(') {
					m++;
				} else if (charArr[j] == ')') {
					n++;
				}
			}
			if (m == n) {
				input[i] = "YES";
			} else {
				input[i] = "NO";
			}

		}

		for (int i = 0; i < t; i++) {
			System.out.println(input[i]);
		}
	}

}
