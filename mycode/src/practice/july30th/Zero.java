package practice.july30th;

import java.util.Scanner;

public class Zero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		scanner.nextLine();
		int[] arr = new int[k];
		int pointer = 0;
		int sum = 0;
		
		for(int p=0; p<k; p++) {
			arr[pointer] = scanner.nextInt();
			System.out.print("p: " + p + "\t");
			System.out.print("first pointer: " + pointer + "\t");
			System.out.print("arr["+pointer+"]: " + arr[pointer] + "\t");
			if(p == 0 && arr[pointer] == 0) {
				pointer = 0;
			} else if(arr[pointer] == 0) {
				pointer--;
				arr[pointer] = 0;
			} else if(arr[pointer] != 0) {
				pointer++;
			}
			System.out.println("last pointer: " + pointer);
			
		}
		scanner.close();
		
		for(int q=0; q<k; q++) {
			System.out.print(arr[q]+" ");
			sum += arr[q];
		}
		System.out.println();
		System.out.println(sum);
		
		/*
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		scanner.nextLine();
		int[] arr = new int[k];
		int pointer = 0;
		int sum = 0;
				
		for(int p=0; p<k; p++) {
			arr[pointer] = scanner.nextInt();
			if(p == 0 && arr[pointer] == 0) {
				pointer = 0;
			} else if(arr[pointer] == 0) {
				pointer--;
				arr[pointer] = 0;
			} else if(arr[pointer] != 0) {
				pointer++;
			}
		}
		scanner.close();
		        
		for(int q=0; q<k; q++) {
			sum += arr[q];
		}
		        
		System.out.println(sum);
		*/
	}

}
