package aug30;

import java.util.Scanner;

public class Mask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int index1 = s1.indexOf("*");
		int index2 = s2.indexOf("*");
		String result = "";
		if (index1 >= index2) {
			result = merge(s1, s2);
		} else if (index2 > index1) {
			result = merge(s2, s1);
		}
		System.out.println(result);
		sc.close();
	}

	public static String merge(String s1, String s2) {
		String result = "";
		int len1 = s1.length();
		int len2 = s2.length();
		int len = len1 - len2;
		int index1 = s1.indexOf("*");
		int index2 = s2.indexOf("*");
		String now1 = s1.substring(0, index2);
		String now2 = s2.substring(0, index2);
		if (!now1.equals(now2)) {
			return "-1";
		} else {
			result += now1;
			String add = "*";
			for (int i = 0; i < Math.abs(len); i++) {
				add += "*";
			}
			if (len > 0) {
				s2 = s2.replace("*", add);
			} else if (len < 0) {
				s1 = s1.replace("*", add);
			}
			now1 = s1.substring(index1 + 1);
			int nlen1 = now1.length();
			len2 = s2.length();
			now2 = s2.substring(len2 - nlen1);
			String fin = add(now1, now2);

			if (fin.length() != nlen1) {
				return "-1";
			} else {
				String mid1 = s1.substring(index2, index1 + 1);
				String mid2 = s2.substring(index2, len2 - nlen1);
				String mid = add(mid1, mid2);
				result += mid;
				result += fin;
				return result;
			}
		}
	}


	public static String add(String mid1, String mid2) {
		String mid = "";
		for (int i = 0; i < mid1.length(); i++) {
			if (mid1.charAt(i) == '*' && mid2.charAt(i) == '*') {
				mid += "";
			} else if (mid1.charAt(i) == '*') {
				mid += "" + mid2.charAt(i);
			} else if (mid2.charAt(i) == '*') {
				mid += "" + mid1.charAt(i);
			} else {
				if (mid1.charAt(i) == mid2.charAt(i)) {
					mid += "" + mid1.charAt(i);
				} else {
					mid += "" + mid1.charAt(i) + "" + mid2.charAt(i);
				}
			}
		}
		return mid;
	}

}