package algorithm;

import java.util.Arrays;

public class Algorithm08 {

	public static void main(String[] args) {
		// 주어진 배열의 요소를 사전 순으로 정렬하세요.
		char[] arr = {'c', 'f', 'a', 'm', 'b'};
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				char temp = arr[i];
				
				if(arr[i] > arr[j]) {
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
