package practice.August05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9359 {

	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] result = new int[n];

		for (int p = 0; p < n; p++) {
			String[] str = bf.readLine().split(" ");
			long m1 = Long.parseLong(str[0]);
			long m2 = Long.parseLong(str[1]);
			long r = Long.parseLong(str[2]);
			int count = 0;
			for (long q = m1; q <= m2; q++) {
				if (q < r) {
					long a = r;
					long b = q;
					while (b != 0) {
						long c = a % b;
						a = b;
						b = c;
					}
					if (a == 1) {
						count++;
					}
				} else if (q > r) {
					long a = q;
					long b = r;
					while (b != 0) {
						long c = a % b;
						a = b;
						b = c;
					}
					if (a == 1) {
						count++;
					}
				} else {
					continue;
				}
			}
			result[p] = count;
		}
		bf.close();

		for (int p = 0; p < n; p++) {
			System.out.println("Case #" + (p + 1) + ": " + result[p]);
		}

	}

}
