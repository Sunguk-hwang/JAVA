package practice.August19;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class _10828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		Stack<Integer> stack = new Stack<>();
		for(int p=0; p<t; p++) {
			String str = sc.nextLine();
			if(str.contains(" ")) {
				stack.push(Integer.parseInt(str.split(" ")[1]));
			} else if(str.equals("pop")) {
				try {
					System.out.println(stack.pop());
				}catch(EmptyStackException e) {
					System.out.println("-1");
				}
			} else if(str.equals("size")) {
				System.out.println(stack.size());
			} else if(str.equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if(str.equals("top")) {
				try {
					System.out.println(stack.peek());
				}catch(EmptyStackException e) {
					System.out.println("-1");
				}
			}
		}
		sc.close();
	}
}