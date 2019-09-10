package practice.August13;

import java.util.Scanner;

public class BFS2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		for (int p = 0; p < t; p++) {
			int m = sc.nextInt();
			sc.nextLine();
			char[] change = new char[m];
			change[0] = 'a';
			String changeStr = "a";
			for (int q = 0; q < m - 1; q++) {
				String input = sc.nextLine();
				int a = Integer.parseInt(input.split(" ")[0]);
				int b = Integer.parseInt(input.split(" ")[1]);
				change[b - 1] = (char) (change[a - 1] + 1);
				changeStr += change[b - 1];
			}
			
			String input[] = sc.nextLine().split(" ");
			String changeInput = "";
			for(int q=0; q<m; q++) {
				changeInput += change[Integer.parseInt(input[q])-1];
			}
			
			if(changeStr.equals(changeInput)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
		sc.close();
		
	}

}
