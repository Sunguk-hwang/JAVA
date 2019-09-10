package sec02.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(100);
		stack.push(50);
		stack.push(500);
		
		System.out.println(stack.size());
		/*
		int coin = stack.pop();
		System.out.println(coin);
		System.out.println(stack.size());
		coin = stack.pop();
		System.out.println(coin);
		System.out.println(stack.size());
		 */
		
		while(!stack.empty()) {
			int coin = stack.pop();
			System.out.println(coin);
		}
	}
}
