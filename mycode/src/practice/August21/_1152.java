package practice.August21;

import java.util.Scanner;

public class _1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.equals(" ")) {
			System.out.println(0);
		} else {
			String[] strArr = input.trim().split(" ");
			System.out.println(strArr.length);
		}
		sc.close();
	}
}