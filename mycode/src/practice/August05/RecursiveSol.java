package practice.August05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveSol {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] result = new int[n];

		for (int p = 0; p < n; p++) {
			int count = 0;
			String[] input = br.readLine().split(" ");
			long a = Long.parseLong(input[0]);
			long b = Long.parseLong(input[1]);
			long value = Integer.parseInt(input[2]);

			for (long q = a; q <= b; q++) {
				if (q < value) {
					if (GCD(value, q) == 1) {
						count++;
					}
				} else {
					if (GCD(q, value) == 1) {
						count++;
					}
				}
			}
			result[p] = count;
		}

		for (int p = 0; p < n; p++) {
			System.out.println("Case #" + (p + 1) + ": " + result[p]);
		}
	}

	static long GCD(long x, long y) {
		if (y == 0) {
			return x;
		} else {
			return GCD(y, (long) x % y);
		}
	}
}