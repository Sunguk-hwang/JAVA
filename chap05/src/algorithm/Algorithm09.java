package algorithm;

import java.util.Arrays;

public class Algorithm09 {

	public static void main(String[] args) {
		// 주어진 배열의 요소를 사전 순으로 정렬하세요.
		String[] arr = {"student", "java", "javascript", "ant", "company", "ball"};
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i].compareTo(arr[j]) >= 0) {
					
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			//System.out.println(Arrays.toString(arr));
		}
	
		System.out.println(Arrays.toString(arr));
	}
}
