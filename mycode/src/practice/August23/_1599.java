package practice.August23;

import java.util.Arrays;
import java.util.Scanner;

public class _1599 {

	public static void main(String[] args) {
		//System.out.println("abacada".compareTo("aco"));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		String[] input = new String[t];
		for(int p=0; p<t; p++) {
			input[p] = sc.nextLine().replace("k", "c").replace("ng", "1");
		}
		for(int p=0; p<t-1; p++) {
			for(int q=p+1; q<t; q++) {
				System.out.println(input[p].compareTo(input[q]));
				if(input[p].compareTo(input[q])>=0 && input[p].compareTo(input[q]) != 50) {
					//System.out.println(input[p].compareTo(input[q]));
					String temp = input[p];
					input[p] = input[q];
					input[q] = temp;
				}
			}
			System.out.println(Arrays.toString(input));
		}
		//System.out.println(Arrays.toString(input));
	
		
		
		
		sc.close();
	}

}
