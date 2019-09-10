package practice.August09;

import java.util.Scanner;
import java.util.Stack;

public class _07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int t = scanner.nextInt();
		scanner.nextLine();
		int[] result = new int[t];
		
		for(int p=0; p<t; p++) {
			stack.clear();
			int sum = 0;
			String str = scanner.nextLine();
			int r=0;
			int add=1;
			for(int q=0; q<str.length(); q++) {
				System.out.print(r + " ");
				if(str.charAt(q) == '(') {
					r += add;
					stack.push(r);
					sum += r;
				} else if(str.charAt(q) == ')') {
					r -= add;
					sum += stack.peek();
					stack.pop();
				} else if(str.charAt(q) == '#') {
					if(q == str.lastIndexOf(str.charAt(q))){
						r /= 2 ;
						add /= 2 ;
					} else {
						r *= 2 ;
						add *= 2 ;
					}
				}
				System.out.println("q: " + q + " stack " + str.charAt(q));
			}
			result[p] = sum;
		}
		scanner.close();
		
		for (int p = 0; p < t; p++) {
			System.out.println("Case #" + (p + 1));
			System.out.println(result[p]);
		}

	}

}
