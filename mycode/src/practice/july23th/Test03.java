package practice.july23th;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String strTest = scanner.nextLine();
		int numTest = Integer.parseInt(strTest);
		int[] result = new int[numTest];
		
		for(int p=0; p<numTest; p++) {
			
			String strTarget = scanner.nextLine();
			String inputScores = scanner.nextLine();
			int numTarget = Integer.parseInt(strTarget);
			
			String[] strScores = inputScores.split(" ");
			int[] scores = new int[numTarget];
			
			for(int q=0; q<numTarget; q++) {
				scores[q] = Integer.parseInt(strScores[q]);
			}
			
			String strHit1 = scanner.nextLine();
			String strHit2 = scanner.nextLine();
			char[] arrHit1 = strHit1.toCharArray();
			char[] arrHit2 = strHit2.toCharArray();
			
			for(int q=0; q<numTarget; q++) {
				if(arrHit1[q] == 'O' && arrHit2[q] == 'O') {
					result[p] += scores[q];
				}
			}
			
		}
		
		for(int r=0; r<numTest; r++) {
			System.out.print("Testcase #" + (r+1) + ": " + result[r] + "\n");
		}
		
	}

}
