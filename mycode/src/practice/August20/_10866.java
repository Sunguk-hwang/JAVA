package practice.August20;

import java.util.LinkedList;
import java.util.Scanner;

public class _10866 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		LinkedList<Integer> deque = new LinkedList<>();
		for(int p=0; p<t; p++) {
			String input = sc.nextLine();
			if(input.split("_")[0].equals("push")) {
				if(input.split("_")[1].split(" ")[0].equals("front")) {
					deque.offerFirst(Integer.parseInt(input.split("_")[1].split(" ")[1]));
				} else if(input.split("_")[1].split(" ")[0].equals("back")) {
					deque.offerLast(Integer.parseInt(input.split("_")[1].split(" ")[1]));
				}
			} else if(input.split("_")[0].equals("pop")) {
				if(input.split("_")[1].equals("front")) {
					if(!deque.isEmpty()) {
						System.out.println(deque.pollFirst());
					} else {
						System.out.println(-1);
					}
				} else if(input.split("_")[1].equals("back")) {
					if(!deque.isEmpty()) {
						System.out.println(deque.pollLast());
					} else {
						System.out.println(-1);
					}
				}
			} else if(input.equals("size")) {
				System.out.println(deque.size());
			} else if(input.equals("empty")) {
				if(!deque.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(1);
				}
			} else if(input.equals("front")) {
				if(!deque.isEmpty()) {
					System.out.println(deque.getFirst());
				} else {
					System.out.println(-1);
				}
			} else if(input.equals("back")) {
				if(!deque.isEmpty()) {
					System.out.println(deque.getLast());
				} else {
					System.out.println(-1);
				}
			}
		}
		sc.close();
	}
}