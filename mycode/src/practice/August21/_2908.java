package practice.August21;

import java.util.Scanner;

public class _2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		String m = "";
		String n = "";
		for(int p=0; p<3; p++) {
			m += input[0].charAt(2-p);
			n += input[1].charAt(2-p);
		}
		
		if(m.compareTo(n)>0) {
			System.out.println(m);
		} else if(m.compareTo(n)<0) {
			System.out.println(n);
		}
		sc.close();
	}

}