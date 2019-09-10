package practice.August20;

import java.util.LinkedList;
import java.util.Scanner;

public class _1406 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<>();
		String input = sc.nextLine();
		
		for(int p=0; p<input.length(); p++) {
			list.add(String.valueOf(input.charAt(p)));
		}
		int point = list.size();
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int p=0; p<t; p++) {
			String edit = sc.nextLine();
			if(edit.equals("L")) {
				if(point > 0) {
					point--;
				}
			} else if(edit.equals("D")) {
				if(point < list.size()) {
					point++;
				}
			} else if(edit.equals("B")) {
				if(point > 0) {
					list.remove(point-1);
					point--;
				}
			} else if(edit.split(" ")[0].equals("P")) {
				list.add(point, edit.split(" ")[1]);
				point++;
			}
		}
		sc.close();		
		
		String result = "";
		for(int p=0; p<list.size(); p++) {
			result+=list.get(p);
		}
		
		System.out.println(result);
	}
}