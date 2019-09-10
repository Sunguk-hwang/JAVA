package practice.August09;

import java.util.ArrayList;
import java.util.Scanner;

public class _08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		int[] result = new int[t];
		
		for(int p=0; p<t; p++) {
			int input = scanner.nextInt();
			scanner.nextLine();
			int sum = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			while(input != 0) {
				for(int q=2; q<=100; q++) {
					if(fibo(q) > input) {
						input -= fibo(q-1);
						list.add(fibo(q-2));
						break;
					}
				}
			}
			for(int q : list) {
				sum += q;
			}
			result[p] = sum;
		}
		scanner.close();
		
		for(int p=0; p<t; p++) {
			System.out.println("Case #"+(p+1));
			System.out.println(result[p]);
		}
	}
	
	static int fibo(int x) {
		if(x == 0) {
			return 0;
		} else if(x == 1) {
			return 1;
		} else if(x == 2) {
			return 1;
		} else {
			return fibo(x-2) + fibo(x-1);
		}
	}
}
