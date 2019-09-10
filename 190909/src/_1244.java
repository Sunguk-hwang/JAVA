import java.util.Scanner;

public class _1244 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] input = new int[t];
		for (int p = 0; p < t; p++) {
			input[p] = sc.nextInt();
		}
		int s = sc.nextInt();
		int[] arr1 = new int[s];
		int[] arr2 = new int[s];
		for (int p = 0; p < s; p++) {
			arr1[p] = sc.nextInt();
			arr2[p] = sc.nextInt();
		}
		sc.close();

		for (int p = 0; p < s; p++) {
			if (arr1[p] == 1) {
				int add = arr2[p];
				while (arr2[p] <= t) {
					input[arr2[p] - 1] = input[arr2[p] - 1] == 1 ? 0 : 1;
					arr2[p] += add;
				}
			} else if (arr1[p] == 2) {
				int centerIndex = arr2[p] - 1;
				input[centerIndex] = input[centerIndex] == 1 ? 0 : 1;
				int d = 1;
				while (true) {
					if (centerIndex - d >= 0 && centerIndex + d <= t - 1) {
						if (input[centerIndex - d] != input[centerIndex + d]) {
							break;
						} else {
							input[centerIndex - d] = input[centerIndex - d] == 1 ? 0 : 1;
							input[centerIndex + d] = input[centerIndex + d] == 1 ? 0 : 1;
							d++;
						}
					} else {
						break;
					}
				}
			}
		}
		for (int p = 0; p < t; p++) {
			System.out.print(input[p]);
			if (p != t - 1 && (p + 1) % 20 != 0) {
				System.out.print(" ");
			}
			if (p != 0 && (p + 1) % 20 == 0) {
				System.out.println();
			}
		}
	}
}