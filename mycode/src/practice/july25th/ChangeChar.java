package practice.july25th;

import java.util.Scanner; 

public class ChangeChar {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String numStr = scanner.nextLine();
		int num = Integer.parseInt(numStr);
		String[] result = new String[] {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
		for(int p=0; p<num; p++) {
			String input = scanner.nextLine();
			char[] charArr = input.toCharArray();
			for(int i=0; i<input.length(); i++) {
				if(charArr[i]>=119 && charArr[i]<=122) {
					charArr[i] -= 22;
				}
				else if(charArr[i]>=87 && charArr[i]<=90) {
					charArr[i] -= 22;
				}
				else {
					charArr[i] += 4;
				}
				result[p] += charArr[i];
			}
		}
		
		for(int q=0; q<num; q++) {
			System.out.println("Testcase #"+(q+1));
			System.out.println(result[q]);
		}
	}

}
