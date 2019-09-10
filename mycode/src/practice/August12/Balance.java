package practice.August12;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Balance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			String input = sc.nextLine();
			if (input.equals(".")) {
				System.exit(0);
			}
			Stack<Character> stack = new Stack<>();
			try {
				for (int i = 0; i < input.length(); i++) {
					if(input.charAt(i) == '(') {
						stack.push('(');
					} else if(input.charAt(i) == '[') {
						stack.push('[');
					} else if(input.charAt(i) == ')') {
						if(stack.peek() == '(') {
							stack.pop();
						} else {
							stack.push(')');
						}
					} else if(input.charAt(i) == ']') {
						if(stack.peek() == '[') {
							stack.pop();
						} else {
							stack.push(']');
						}
					}
				}
				if(stack.isEmpty()) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}

			} catch (EmptyStackException e) {
				System.out.println("no");
			}
		}
	}
}