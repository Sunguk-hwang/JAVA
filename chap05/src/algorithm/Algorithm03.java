package algorithm;

public class Algorithm03 {

	public static void main(String[] args) {
		//printf 쓰지 않고 소수점 이하 출력
		
		int[] arr = {3, 5, 9, 2, 6, 4};
		int total = 0;
		double avg = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		avg = total / (double) arr.length; //avg = 4.833333333333333
		avg = (int) (avg * 100) / 100.0; //4.83
		
		
		System.out.println(total);
		System.out.println(avg);
		
	}
}
