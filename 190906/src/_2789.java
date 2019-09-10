import java.util.Scanner;

public class _2789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		input = input.replaceAll("[CAMBRIDGE]", "");
		System.out.println(input);
	}

}
