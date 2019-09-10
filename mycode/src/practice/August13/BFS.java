package practice.August13;

import java.util.Scanner;

public class BFS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int p=0; p<t; p++) {
			int m = sc.nextInt();
			sc.nextLine();
			for(int q=0; q<m-1; q++) {
				String[] input = sc.nextLine().split(" ");
				
			}
			
			
		}

	}
	
	static char check(String s) {
		int x = Integer.parseInt(s.split(" ")[0]);
		int y = Integer.parseInt(s.split(" ")[1]);
		while(true) {
			if(x == 1) {
				return 'a';
				
			}
		}
	}
	
}

