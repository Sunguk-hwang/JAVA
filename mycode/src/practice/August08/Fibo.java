package practice.August08;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.nextLine();
		int result = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(input != 0) {
			for(int p=2; p<=50; p++) {
				if(fibo(p) > input) {
					input -= fibo(p-1);
					list.add(fibo(p-2));
					System.out.println("p-1: " + (p-1));
					System.out.println("fibo("+(p-1)+"): " + fibo(p-1));
					System.out.println("input: " + input);
					System.out.println("chicken" + fibo(p-2));
					break;
				}
			}
		}
		for(int q : list) {
			result += q;
		}
		System.out.println(result);
		
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
