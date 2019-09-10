import java.util.Scanner;
import java.util.Stack;

public class _1918 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		Stack<Character> stack = new Stack<>();
		for (int p = 0; p < input.length(); p++) {
			char c = input.charAt(p);
			if (c == '(') {
				stack.push(c);
			} else if(c==')') {
				while(stack.peek() != '(') {
					System.out.print(stack.pop());
				}
				stack.pop();
			} else if(c=='+'||c=='-') {
				if(stack.contains('(')) {
					while(stack.peek() != '(') {
						System.out.print(stack.pop());
					}
				} else {
					while(!stack.isEmpty()) {
						System.out.print(stack.pop());
					}
				}
				stack.push(c);
			} else if(c=='*'||c=='/') {
				if(stack.isEmpty()) {
					stack.push(c);
				} else {
					if(stack.peek() == '(') {
						stack.push(c);
					} else {
						System.out.print(stack.pop());
						if(!stack.isEmpty()&&(stack.peek() == '*' || stack.peek() =='/')) {
							System.out.print(stack.pop());
						}
						stack.push(c);
					}
				}
			} else {
				stack.push(c);
			}
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}

}
