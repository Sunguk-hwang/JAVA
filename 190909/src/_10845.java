import java.util.LinkedList;
import java.util.Scanner;

public class _10845 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		LinkedList<Integer> queue = new LinkedList<>();
		for(int p=0; p<t; p++) {
			String input = sc.nextLine();
			if(input.split(" ")[0].equals("push")) {
				queue.offer(Integer.parseInt(input.split(" ")[1]));
			} else if(input.equals("pop")) {
				if(!queue.isEmpty()) {
					System.out.println(queue.poll());
				} else {
					System.out.println(-1);
				}
			} else if(input.equals("size")) {
				System.out.println(queue.size());
			} else if(input.equals("empty")) {
				if(!queue.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(1);
				}
			} else if(input.equals("front")) {
				if(!queue.isEmpty()) {
					System.out.println(queue.getFirst());
				} else {
					System.out.println(-1);
				}
			} else if(input.equals("back")) {
				if(!queue.isEmpty()) {
					System.out.println(queue.getLast());
				} else {
					System.out.println(-1);
				}
			}
		}
		sc.close();
	}
}