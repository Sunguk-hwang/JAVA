import java.util.Scanner;

public class _1436 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt()-1;
		sc.close();
		int i = 0;
		String result = "";
		while (true) {
			result = check(i);
			if (!result.equals("false") && t == 0) {
				break;
			} else {
				if (!result.equals("false")) {
					t--;
				}
			}
			i++;
		}
		System.out.println(result);

	}

	static String check(int i) {
		if (("" + i).contains("666")) {
			return "" + i;
		} else {
			return "false";
		}
	}

}
