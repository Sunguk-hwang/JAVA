package algorithm;

public class Algorithm01 {

	public static void main(String[] args) {
		// 다음 배열의 최대값을 출력하시오.
		
		int[] arr = {3, 5, 9, 2, 4, 6};
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if (arr[i] >= max) {
				max = arr[i];
			}
			
			//System.out.println("현재 최댓값: " + max);
		}

		for(int i=1; i<arr.length; i++) {
			
			if (arr[i] < min) {
				min = arr[i];
			}
			
			//System.out.println("현재 최솟값: " + min);
		}
		
		//System.out.println();
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}
}
