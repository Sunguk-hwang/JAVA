import java.util.Scanner;
import java.util.Stack;

public class _1935 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String str = sc.next();
		int[] num = new int[t];
		for(int p=0; p<t; p++) {
			num[p] = sc.nextInt();
		}
		sc.close();
		
		Stack<String> stack = new Stack<>();
		for(int p=0; p<str.length(); p++) {
			if(str.charAt(p) == '*') {
				double a = Double.parseDouble(stack.pop());
				double b = Double.parseDouble(stack.pop());
				stack.push(""+(a*b));
			} else if(str.charAt(p) == '/') {
				double a = Double.parseDouble(stack.pop());
				double b = Double.parseDouble(stack.pop());
				stack.push(""+(b/a));
			} else if(str.charAt(p) == '+') {
				double a = Double.parseDouble(stack.pop());
				double b = Double.parseDouble(stack.pop());
				stack.push(""+(a+b));
			} else if(str.charAt(p) == '-') {
				double a = Double.parseDouble(stack.pop());
				double b = Double.parseDouble(stack.pop());
				stack.push(""+(b-a));
			} else {
				stack.push(""+num[str.charAt(p)-65]);
			}
		}
		System.out.printf("%.2f",Double.parseDouble(stack.pop()));
	}
}
