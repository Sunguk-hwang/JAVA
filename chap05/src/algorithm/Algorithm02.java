package algorithm;

public class Algorithm02 {

	public static void main(String[] args) {
		
		int[] arr = {10, 5, 9, 2, 6, 4};
		int max = arr[0];
		int second = arr[1];
		
		for(int i=0; i<arr.length; i++) {
			
			if (arr[i] >= max) {
				max = arr[i];
			}
			else if (arr[i] >= second) {
				second = arr[i];
			}
			//System.out.println(i + " " + arr[i] + " " + max + " " + second);
		}
			
		System.out.println("첫 째: " + max);
		System.out.println("둘 째: " +second);
	}
}
