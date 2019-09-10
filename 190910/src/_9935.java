import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9935 {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		String str = "";
		try {
			String str1 = bf.readLine();
			str = str1;
			String str2 = bf.readLine();
			for(int p=0; p<str1.length(); p++) {
				stack.push(str1.charAt(p));
				int q=0;
				for(q=0; q<str2.length(); q++) {
					if(stack.get(stack.size()-1-q)!=str2.charAt(str2.length()-1-q)) {
						break;
					}
				}
				if(q==str2.length()) {
					for(int r=0; r<str2.length(); r++) {
						stack.pop();
					}
				}
			}
			if(stack.size()==0) {
				System.out.println("FRULA");
			} else {
				for(int p=0; p<stack.size(); p++) {
					System.out.print(stack.get(p));
				}
			}
		
		} catch (IOException e) {
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(str);
		}

	}

}
