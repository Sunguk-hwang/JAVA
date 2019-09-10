import java.util.Scanner;

public class _5218 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] s1 = new String[t];
		String[] s2 = new String[t];
		
		for(int p=0; p<t; p++) {
			System.out.print("Distances:");
			
			s1[p] = sc.next();
			s2[p] = sc.next();
			
			for(int q=0; q<s1[p].length(); q++) {
				if(s2[p].charAt(q)-s1[p].charAt(q)>=0) {
					System.out.print(" " + (s2[p].charAt(q)-s1[p].charAt(q)));
				} else {
					System.out.print(" " + (26+s2[p].charAt(q)-s1[p].charAt(q)));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}