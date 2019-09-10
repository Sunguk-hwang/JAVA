package algorithm;

import java.util.Arrays;

public class Algorithm07 {

	public static void main(String[] args) {
		// 다음 배열의 요소 중에서 문자열로만 구성된 새로운 배열을 생성하시오.
		
		String[] arr = new String[6];
		arr[1] = "a";
		arr[3] = "z";
		arr[5] = "java";
		
		int[] arr1 = new int[arr.length];
		int num = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) {
				arr1[num] = i;
				num++;
			}
		}
		
		String[] arr2 = new String[num];
		
		for(int j=0; j<num; j++) {
			arr2[j] = arr[arr1[j]];
		}
		
		System.out.println(Arrays.toString(arr2));

	}

}
