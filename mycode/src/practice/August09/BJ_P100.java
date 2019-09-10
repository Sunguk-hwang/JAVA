package practice.August09;

import java.util.Scanner;

public class BJ_P100 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = Integer.parseInt(scanner.nextLine());
		if(x <1 || x>50) System.exit(0);
		for(int i = 0; i<x; i++) { // 케이스 횟수
			int num = Integer.parseInt(scanner.nextLine()); // 사과 갯수
			if(num < 1 || num >100000) System.exit(0);
			String arr[] = new String[num]; //점수
			String srr1[] = new String[num]; // 장애물
			String srr2[] = new String[num]; // 장애물
			String a = scanner.nextLine();
			String b = scanner.nextLine();
			String c = scanner.nextLine();
			arr = a.split(" ");
			for(int l = 0; l<num; l++) {
				if(Integer.parseInt(arr[l]) < 1 || Integer.parseInt(arr[l]) >100 ) {
					System.exit(0);
				}
			}
			srr1=b.split("");
			srr2=c.split("");
			int sum = 0;
			for(int q = 0; q<arr.length; q++) {
				if(srr1[q].equals(srr2[q]) && srr1[q].equals("O")) {
					sum += Integer.parseInt(arr[q]);
				}
			}
			System.out.println("Case #"+(i+1));
			System.out.println(sum);
		}
	}
}