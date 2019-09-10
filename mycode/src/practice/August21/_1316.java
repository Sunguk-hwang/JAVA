package practice.August21;

import java.util.Scanner;

public class _1316 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int count = 0;

		for (int p = 0; p < n; p++) {
			String str = scanner.nextLine();
			int q = 0;
			point: for (q = 0; q < str.length(); q++) {
				if (q == str.lastIndexOf(str.charAt(q))) {
					continue;
				} else {
					for (int r = q+1; r < str.lastIndexOf(str.charAt(q)); r++) {
						if (str.charAt(r) != str.charAt(q)) {
							break point;
						}
					}
				}
			}
			if (q == str.length()) {
				count++;
			}
		}
        scanner.close();
		System.out.println(count);
	}
}