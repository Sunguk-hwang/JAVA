package coding.baekjoon;

import java.util.Scanner;

public class _11022 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String numStr = scanner.nextLine();
		int index = Integer.parseInt(numStr);
		
		int[] total = new int[index];
        int[] numArr1 = new int[index];
        int[] numArr2 = new int[index];
		
		for(int i=1; i<=index; i++) {
			String str = scanner.nextLine();
			String[] arr = str.split(" ");
			int num1 = Integer.parseInt(arr[0]);
			int num2 = Integer.parseInt(arr[1]);
			total[i-1] = num1 + num2;
            numArr1[i-1] = num1;
            numArr2[i-1] = num2;
		}
		
		for(int n=0; n<=index - 1; n++) {
			System.out.println("Case #"+(n+1)+": "+numArr1[n]+" + "+numArr2[n]+" = "+total[n]);
		}
	}	
}
