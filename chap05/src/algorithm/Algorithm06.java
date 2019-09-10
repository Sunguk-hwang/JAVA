package algorithm;

import java.util.Arrays;

public class Algorithm06 {

	public static void main(String[] args) {
		// 다음 배열 요소 중에서 0이 아닌 요소로 구성된 새로운 배열을 생성하시오.
		
		int[] arr1 = {0, 5, 0, 7, 0, 6};
		int[] arr3 = new int[arr1.length];
		int num = 0;

		for(int i=0; i<arr1.length; i++) {
			if (arr1[i] != 0) {
				arr3[num] = i;
				num += 1;
			}
		}
		
		int[] arr2 = new int[num];
		
		for(int j=0; j<num; j++) {
			arr2[j] = arr1[arr3[j]];
		}
		
		System.out.println(Arrays.toString(arr2));
	}

}
