
import java.util.Scanner;

public class _3101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		String input = sc.next();

		sc.close();
		int result = 1;
		int[][] arr = new int[n][n];
		arr[0][0] = 1;
		int i = 2;
		for (int p = 2; p <= n; p++) {
			if (p % 2 == 0) {
				for (int q = 0; q < p; q++) {
					arr[q][p - 1 - q] = i;
					i++;
				}
			} else {
				for (int q = 0; q < p; q++) {
					arr[p - 1 - q][q] = i;
					i++;
				}
			}
		}
		for (int p = n; p <= n + n - 3; p++) {
			if (p % 2 == 0) {
				for (int q = n - 1; q > p - n; q--) {
					arr[q][p - q] = i;
					i++;
				}
			} else {
				for (int q = n - 1; q > p - n; q--) {
					arr[p - q][q] = i;
					i++;
				}
			}
		}
		arr[n - 1][n - 1] = i;
		/*
		for (int p = 0; p < n; p++) {
			for (int q = 0; q < n; q++) {
				System.out.print(arr[p][q]);
			}
			System.out.println();
		}
		*/
		int a = 0;
		int b = 0;
		for (int p = 0; p < k; p++) {
			switch (input.charAt(p)) {
			case 'D':
				a += 1;
				result += arr[a][b];
				break;
			case 'U':
				a -= 1;
				result += arr[a][b];
				break;
			case 'L':
				b -= 1;
				result += arr[a][b];
				break;
			case 'R':
				b += 1;
				result += arr[a][b];
				break;
			}
		}
		System.out.println(result);
	}

}