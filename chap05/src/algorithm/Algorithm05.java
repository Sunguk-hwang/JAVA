package algorithm;

import java.util.Arrays;

public class Algorithm05 {

	public static void main(String[] args) {
		// 다음 배열의 요소를 오름차순으로 정렬하시오. 
		int[] arr = {5, 4, 9, 7, 6, 3};
		
		for(int i=0; i<arr.length-1; i++) {
			
			int temp = arr[i];
			int min = arr[i+1];
			int index = i+1;
				
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[j]<min) {
					min = arr[j];
					index = j;
				}
				/*
				System.out.println("i: " + i + " j: " + j);
				System.out.println("index: " + index + " min: " + min);*/
				
				if(j==arr.length-1 && min<arr[i]) {
					arr[i] = arr[index];
					arr[index] = temp;
				}
				/*
				System.out.println("arr[" + i + "]: " + arr[i]);
				System.out.println(Arrays.toString(arr));
				System.out.println();*/
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}