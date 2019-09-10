package practice.August12;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "ABCDE";
		String str2 = " A B C D";
		
		for(int i=0; i<str1.length(); i++) {
			System.out.println("String " + str1.substring(i, i+1));
		}
		
		for(int i=0; i<str1.length(); i++) {
			System.out.println("char " + str1.charAt(i));
		}
		
		System.out.println(str2);
		System.out.println(str2.length());
		for(int i=0; i<str2.length(); i++) {
			System.out.println(" / " + str2.charAt(i));
		}
		System.out.println(Arrays.toString(str2.split(" ")));
		System.out.println(Arrays.toString(str1.split("")));

	}

}
