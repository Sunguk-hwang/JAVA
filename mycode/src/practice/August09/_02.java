package practice.August09;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		int[] result = new int[t];
		for(int p=0; p<t; p++) {
			String[] input = scanner.nextLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			result[p] = a+b;
		}
		scanner.close();
		
		for(int p=0; p<t; p++) {
			System.out.println("Case #"+(p+1));
			System.out.println(result[p]);
		}

	}

}
