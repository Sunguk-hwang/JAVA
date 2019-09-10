package practice.August28;

import java.util.Scanner;

public class _1361 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		
		String s1_1 = "";
		String s1_2 = "";
		String s2_1 = "";
		String s2_2 = "";
		
		if(input1.charAt(0) != '*') {
			if(input1.charAt(input1.length()-1) != '*') {
				s1_1 = input1.split("*")[0];
				s1_2 = input1.split("*")[1];
			} else {
				for(int p=0; p<input1.length()-1; p++) {
					s1_1 += input1.charAt(p);
				}
			}
		} else {
			for(int p=1; p<input1.length(); p++) {
				s1_2 += input1.charAt(p);
			}
		}
		if(input2.charAt(0) != '*') {
			if(input2.charAt(input2.length()-1) != '*') {
				s2_1 = input2.split("*")[0];
				s2_2 = input2.split("*")[1];
			} else {
				for(int p=0; p<input2.length()-1; p++) {
					s2_1 += input2.charAt(p);
				}
			}
		} else {
			for(int p=1; p<input1.length(); p++) {
				s2_2 += input2.charAt(p);
			}
		}
		System.out.println(s1_1 + "," + s1_2 + "," + s2_1 + "," + s2_2);
		String result = "";
		//System.out.println(s1_1.contains(s2_1) == true || s2_1.contains(s1_1) == true);
		//System.out.println(s1_2.contains(s2_2) == true || s2_2.contains(s1_2) == true);
		if(s1_1.contains(s2_1) == true || s2_1.contains(s1_1) == true) {
			if(s1_2.contains(s2_2) == true || s2_2.contains(s1_2) == true) {
				if(s1_1.contains(s2_1) == true) {
					for(int p=0; p<s1_1.length(); p++) {
						result += s1_1.charAt(p);
					}
					System.out.println(result);
				} else if(s2_1.contains(s1_1) == true) {
					for(int p=0; p<s2_1.length(); p++) {
						result += s2_1.charAt(p);
					}
					System.out.println(result);
				} else if(s1_2.contains(s2_2) == true) {
					for(int p=0; p<s1_2.length(); p++) {
						result += s1_2.charAt(p);
					}
					System.out.println(result);
				} else if(s2_2.contains(s1_2) == true) {
					for(int p=0; p<s2_2.length(); p++) {
						result += s2_2.charAt(p);
					}
					System.out.println(result);
				}
			System.out.println(result);
			
			}else {
				System.out.println(-1);
			}
		} else {
			System.out.println(-1);
		}
		
		sc.close();
	}
}
