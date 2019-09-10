package practice.August20;

import java.util.Scanner;

public class _10769 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int happy = 0;
		int sad = 0;
		
		for(int p=0; p<input.length()-2; p++) {
			if(input.charAt(p) == ':') {
				if(input.charAt(p+1) == '-') {
					if(input.charAt(p+2) == ')') {
						happy++;
					} else if(input.charAt(p+2) == '(') {
						sad++;
					}
				}
			}
		}
		if(happy == 0 && sad == 0) {
			System.out.println("none");
		} else if(happy == sad && happy !=0) {
			System.out.println("unsure");
		} else if(happy > sad) {
			System.out.println("happy");
		} else if(happy < sad) {
			System.out.println("sad");
		}
		sc.close();
	}
}