package sec02.exam01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		queue.offer("메일1");
		queue.offer("메일3");
		queue.offer("메일2");
		queue.offer("메일4");
		
		while(!queue.isEmpty()) {
			String str = queue.poll();
			System.out.println(str);
		}
	}

}
