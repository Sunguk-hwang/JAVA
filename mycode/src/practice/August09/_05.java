package practice.August09;

import java.util.Arrays;
import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		String[] result = new String[t];

		for (int p = 0; p < t; p++) {
			String str = scanner.nextLine();
			int[] arr = new int[str.length()];
			for (int q = 0; q < str.length(); q++) {
				arr[q] = str.charAt(q) - 48;
			}
			System.out.println(arr.length);
			Arrays.sort(arr);
			String a = "";
			String b = "";
			for (int q = 0; q < arr.length; q++) {
				a += arr[q];
				b += arr[(arr.length - 1) - q];
			}
			
			result[p] = String.valueOf((Integer.parseInt(a) + Integer.parseInt(b)));
		}
		scanner.close();

		for (int p = 0; p < t; p++) {
			System.out.println("Case #" + (p + 1));
			System.out.println(result[p]);
		}
	}
}
