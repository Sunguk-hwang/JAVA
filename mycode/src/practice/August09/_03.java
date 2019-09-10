package practice.August09;

import java.util.Scanner;

public class _03 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		String[] result = new String[t];
		
		for(int p=0; p<t; p++) {
			int input = scanner.nextInt();
			scanner.nextLine();
			String s = "";
			String str = scanner.nextLine();
			for(int q=0; q<input; q++) {
				if(str.charAt(q) >= 'w') {
					s += (char)(str.charAt(q)-26+4);
				} else {
					s += (char)(str.charAt(q)+4);
				}
				
			}
			result[p] = s;
		}
		scanner.close();
		
		for(int p=0; p<t; p++) {
			System.out.println("Case #"+(p+1));
			System.out.println(result[p]);
		}
	}
}
