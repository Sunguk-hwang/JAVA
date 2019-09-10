import java.util.Scanner;

public class _1212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		System.out.print(Integer.toBinaryString(input.charAt(0)-48));
		for(int p=1; p<input.length(); p++) {
			System.out.print(getBin(input.charAt(p)));
		}
	}
	static String getBin(char c) {
		String bin="";
		Integer.toBinaryString(c-48);
		if(Integer.toBinaryString(c-48).length() == 1) {
			bin = "00" + Integer.toBinaryString(c-48);
		} else if(Integer.toBinaryString(c-48).length() == 2) {
			bin = "0" + Integer.toBinaryString(c-48);
		} else {
			bin = Integer.toBinaryString(c-48);
		}
		return bin;
	}
}
