package coding.test01;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		int num1 = Integer.parseInt(str1);
		
		int[] arr1 = new int[num1];
		
		for(int n=0; n<=num1 - 1; n++) {
			String str2 = scanner.nextLine();
			arr1[n] = Integer.parseInt(str2);
		}
		
		for(int n=0; n<=num1 - 1; n++) {
			System.out.println("Test #" + (n+1));
			
			for(int m=1; m<=arr1[n]; m++) {
				System.out.println("Hello!");
			}
			
			System.out.println();
		}
	}
}
