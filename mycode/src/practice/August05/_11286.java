package practice.August05;

import java.util.LinkedList;
import java.util.Scanner;

public class _11286 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.nextLine();

		LinkedList<Integer> list = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		for (int p = 0; p < num; p++) {
			int input = scanner.nextInt();
			if (input != 0) {
				if (list.isEmpty()) {
					list.add(input);
				} else {
					if (Math.abs(list.peekLast()) < Math.abs(input)) {
						for (int q = 0; q < list.size(); q++) {
							if (Math.abs(list.get(q)) < Math.abs(input)) {
								list.add(q, input);
								break;
							}
						}
					} else {
						list.add(input);
					}
				}
			} else {
				if (list.isEmpty()) {
					list2.add(0);
				} else {
					list2.add(list.pollLast());
				}
			}
		}
		scanner.close();

		for (int q : list2) {
			System.out.println(q);
		}
	}
}
