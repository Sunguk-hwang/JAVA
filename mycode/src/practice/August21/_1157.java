package practice.August21;

import java.util.LinkedList;
import java.util.Scanner;

public class _1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toUpperCase();
		
		LinkedList<Character> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		
		for(int p=0; p<input.length(); p++) {
			if(!list1.contains(input.charAt(p))) {
				list1.add(input.charAt(p));
				list2.add(1);
			} else {
				int i = list2.get(list1.indexOf(input.charAt(p)));
				list2.remove(list1.indexOf(input.charAt(p)));
				list2.add(list1.indexOf(input.charAt(p)), i+1);
			}
		}
		
		int maxIndex = 0;
		for(int p=0; p<list2.size(); p++) {
			if(list2.get(maxIndex) < list2.get(p)) {
				maxIndex = p;
			}
		}
		
		if(list2.indexOf(list2.get(maxIndex)) == list2.lastIndexOf(list2.get(maxIndex))) {
			System.out.println(list1.get(maxIndex));
		} else {
			System.out.println("?");
		}

		sc.close();
	}
}
