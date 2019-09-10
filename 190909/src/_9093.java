import java.util.Scanner;
import java.util.Stack;

public class _9093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int p = 0; p < t; p++) {
			String input = sc.nextLine();
			Stack<Character> stack = new Stack<>();
			for (int q = 0; q < input.length(); q++) {
				if (String.valueOf(input.charAt(q)).equals(" ")) {
					while (!stack.isEmpty()) {
						System.out.print(stack.pop());
					}
					System.out.print(" ");
				} else {
					stack.push(input.charAt(q));
				}
			}
			while (!stack.isEmpty()) {
				System.out.print(stack.pop());
			}
			System.out.println();
		}
		sc.close();
	}
}