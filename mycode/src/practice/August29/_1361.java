package practice.August29;

import java.util.ArrayList;
import java.util.Scanner;

public class _1361 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();

		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();
		list1 = getList(s1);
		list2 = getList(s2);

		int t = list1.size() > list2.size() ? list2.size() : list1.size();
		int pointFirst = 0;
		int pointLast_1 = list1.size() - 1;
		int pointLast_2 = list2.size() - 1;

		String s10 = "";
		String s20 = "";
		String s11 = "";
		String s21 = "";

		for (int p = 0; p < t; p++) {
			if (list1.get(pointFirst) != '*' && list2.get(pointFirst) != '*') {
				s10 += list1.get(p);
				s20 += list2.get(p);
				list1.remove(p);
				list2.remove(p);
			} else {
				break;
			}
		}

		for (int p = 0; p < t; p++) {
			if (list1.get(pointLast_1 - p) != '*' && list2.get(pointLast_2 - p) != '*') {
				s11 += list1.get(pointLast_1 - p);
				s21 += list2.get(pointLast_2 - p);
				list1.remove(pointLast_1 - p);
				list2.remove(pointLast_2 - p);
			} else {
				break;
			}
		}

		boolean check = true;

		if (!s10.contains(s20) || !s20.contains(s10)) {
			check = false;
		}
		if (!s11.contains(s21) || !s21.contains(s11)) {
			check = false;
		}
		
		

	}

	static ArrayList<Character> getList(String str) {
		ArrayList<Character> list = new ArrayList<>();
		for (int p = 0; p < str.length(); p++) {
			list.add(str.charAt(p));
		}
		return list;
	}

	static String merge(String str1, String str2) {
		String result = str1;
		int first = 1;
		while (first != str1.length()) {
			String check1 = "";
			String check2 = "";
			for (int p = first; p < str1.length(); p++) {
				check1 += str1.charAt(p);
				check2 += str2.charAt(p - first);
			}
			if (check1.equals(check2)) {
				break;
			}
			first++;
		}
		for (int p = str1.length() - first; p < str2.length(); p++) {
			result += str2.charAt(p);
		}
		return result;
	}

}
