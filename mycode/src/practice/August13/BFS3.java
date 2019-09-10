package practice.August13;

import java.util.*;

public class BFS3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		for (int p = 0; p < t; p++) {
			int m = sc.nextInt();
			sc.nextLine();
			
			int[] index = new int[m - 1];
			String[] context = new String[m - 1];
			
			for (int q = 0; q < m - 1; q++) {
				String str = sc.nextLine();
				index[q] = Integer.parseInt(str.split(" ")[0]);
				context[q] = str.split(" ")[1];
			}
			
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			list1.add(1);
			list2.add(1);
			
			String input[] = sc.nextLine().split(" ");
			
			for(int q=1; q<m; q++) {
				for(int r=0; r<m-1; r++) {
					if(input[q].equals(context[r])) {
						list1.add(index[r]);
						break;
					}
				}
			}
			
			for(int q=0; q<m; q++) {
				for(int r=0; r<m-1; r++) {
					if(Integer.parseInt(input[q]) == index[r]) {
						list2.add(index[r]);
					}
				}
			}

			String inputStr = list1.toString();
			String bfsStr = list2.toString();
			System.out.println(inputStr);
			System.out.println(bfsStr);
			if(inputStr.equals(bfsStr)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
		sc.close();
	}
}