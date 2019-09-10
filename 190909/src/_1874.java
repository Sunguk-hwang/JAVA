import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class _1874 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] input = new int[t];
		for (int p = 0; p < t; p++) {
			input[p] = sc.nextInt();
		}
		sc.close();
		ArrayList<String> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		int start = 1;
		while (true) {
			stack.push(start);
			start++;
			list.add("+");
			if (stack.peek() == input[0]) {
				break;
			}
		}
		stack.pop();
		list.add("-");

		for (int p = 1; p < t; p++) {
			if (stack.isEmpty()) {
				while (true) {
					stack.push(start);
					start++;
					list.add("+");
					if (stack.peek() == input[p]) {
						break;
					}
				}
			}
			if (stack.peek() >= input[p]) {
				//System.out.println("p: " + p + "_1");
				int k = stack.peek();
				for (int q = 0; q <= input[p] - k; q++) {
					stack.pop();
					list.add("-");
				}
			} else {
				//System.out.println("p: " + p + "_2");
				while (stack.peek() != input[p]) {
					stack.push(start);
					start++;
					list.add("+");
				}
				stack.pop();
				list.add("-");
			}
		}
		if (!stack.isEmpty()) {
			System.out.println("NO");
		} else {
			for (int p = 0; p < list.size(); p++) {
				System.out.println(list.get(p));
			}
		}
	}
}