import java.util.*;

public class _9012 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int p = 0; p < t; p++) {
			String s = sc.nextLine();
			int count = 0;
			for (int q = 0; q < s.length(); q++) {
				if (s.charAt(q) == '(') {
					count++;
				} else {
					count--;
				}
				if (count < 0) {
					break;
				}
			}
			if (count == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		sc.close();
	}
}