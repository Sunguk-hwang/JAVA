import java.util.Arrays;
import java.util.Scanner;

public class _1516 {

	static int[] spend;
	static String[] pre;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		spend = new int[t + 1];
		pre = new String[t + 1];
		pre[0] = "0";
		for (int p = 1; p <= t; p++) {
			String input = sc.nextLine();
			spend[p] = Integer.parseInt(input.split(" ")[0]);
			if (input.indexOf(" ") == input.lastIndexOf(" ")) {
				pre[p] = "0";
			} else {
				pre[p] = input.substring(input.indexOf(" ") + 1, input.lastIndexOf(" "));
			}
		}
		int a = sum(1);
		a = sum(2);
		a = sum(3);
		a = sum(4);
		a = sum(5);
		System.out.println(Arrays.toString(spend));

	}

	static int sum(int i) {
		if (pre[i].equals("0")) {
			return 0;
		} else if (!pre[i].contains(" ")) {
			spend[i] += spend[Integer.parseInt(pre[i])];
			return 0;
		} else {
			for (int p = 0; p < pre[i].length(); p++) {
				String s = pre[i].substring(p, p + 1);
				if (!s.equals(" ")) {
					spend[i] += sum(Integer.parseInt(s));
					for (int q = 0; q < pre[i].length(); q++) {
						String t = pre[i].substring(q, q + 1);
						if (!t.equals(" ") && !s.equals(t) && !pre[Integer.parseInt(s)].equals(t)) {
							spend[i] += sum(Integer.parseInt(t));
						}
					}
				}
			}
			return 0;
		}
	}
}
