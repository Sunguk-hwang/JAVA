import java.util.Scanner;

public class _2998 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		sc.close();

		String result = "";

		while (input.length() % 3 != 0) {
			input = "0" + input;
		}

		for (int p = 0; p < (input.length() / 3); p++) {
			String check = input.substring((input.length() - 3) - (p * 3), (input.length() - 3) - (p * 3) + 3);
			switch(check) {
			case "000":
				result = "0" + result;
				break;
			case "001":
				result = "1" + result;
				break;
			case "010":
				result = "2" + result;
				break;
			case "011":
				result = "3" + result;
				break;
			case "100":
				result = "4" + result;
				break;
			case "101":
				result = "5" + result;
				break;
			case "110":
				result = "6" + result;
				break;
			case "111":
				result = "7" + result;
				break;
			}
		}
		System.out.println(result);
	}
}
