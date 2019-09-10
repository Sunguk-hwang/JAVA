import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1260 {

	static int nodeSize;
	static int edgeSize;
	static int[][] adjustMatrix;
	static boolean[] visitInfo_dfs;
	static boolean[] visitInfo_bfs;
	static ArrayList<Integer> dfs = new ArrayList<>();
	static ArrayList<Integer> bfs = new ArrayList<>();

	public static void dfs(int i) {
		visitInfo_dfs[i - 1] = true;
		dfs.add(i);
		for (int j = 0; j < nodeSize; j++) {
			if (adjustMatrix[i - 1][j] == 1 && visitInfo_dfs[j] == false) {
				dfs(j + 1);
			}
		}
	}

	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(i);
		visitInfo_bfs[i - 1] = true;
		while (!q.isEmpty()) {
			int temp = q.poll();
			bfs.add(temp);
			for (int j = 0; j < nodeSize; j++) {
				if (adjustMatrix[temp-1][j] == 1 && visitInfo_bfs[j] == false) {
					q.offer(j+1);
					visitInfo_bfs[j] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nodeSize = sc.nextInt();
		edgeSize = sc.nextInt();
		int startNode = sc.nextInt();
		adjustMatrix = new int[nodeSize][nodeSize];
		visitInfo_dfs = new boolean[nodeSize];
		visitInfo_bfs = new boolean[nodeSize];

		for (int i = 0; i < edgeSize; i++) {
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			adjustMatrix[t1 - 1][t2 - 1] = 1;
			adjustMatrix[t2 - 1][t1 - 1] = 1;
		}
		dfs(startNode);
		for(int p=0; p<dfs.size(); p++) {
			System.out.print(dfs.get(p));
			if(p != dfs.size()-1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		bfs(startNode);
		for(int p=0; p<bfs.size(); p++) {
			System.out.print(bfs.get(p));
			if(p != bfs.size()-1) {
				System.out.print(" ");
			}
		}
		sc.close();
	}
}