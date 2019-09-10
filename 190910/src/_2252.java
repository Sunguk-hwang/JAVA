import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2252 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		ArrayList<Integer> result = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int nodeSize = sc.nextInt();
		int edgeSize = sc.nextInt();
		LinkedList<Integer>[] list = new LinkedList[nodeSize];
		for(int p=0; p<nodeSize; p++) {
			list[p] = new LinkedList<Integer>();
		}
		int[] check = new int[nodeSize];
		for (int p = 0; p < edgeSize; p++) {
			int small = sc.nextInt();
			int tall = sc.nextInt();
			list[small-1].add(tall);
			check[tall-1]++;
		}
		for(int p=0; p<nodeSize; p++) {
			if(check[p] == 0) {
				q.offer(p+1);
			}
		}
		while(!q.isEmpty()) {
			int x = q.poll();
			result.add(x);
			Iterator<Integer> iter = list[x-1].iterator();
			while(iter.hasNext()) {
				int y = iter.next();
				check[y-1]--;
				if(check[y-1] == 0) {
					q.offer(y);
				}
			}
		}
		for(int p=0; p<result.size(); p++) {
			System.out.print(result.get(p));
			if(p != result.size()-1) {
				System.out.print(" ");
			}
		}
	}
}
