package algorithm;

public class Algorithm04 {

	public static void main(String[] args) {
		
		int[] arr = {3, 5, 9, 7, 6, 4};
		int total = 0;
		double avg = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			
			total += arr[i];
		}
		
		avg = total / (double) arr.length;
		double avg1 = (int) (avg * 100) / 100.0;
		avg = (int) (avg * 1000) / 1000.0;
		
		if(avg1 < avg) {
			
			avg = (int) ((avg * 100) + 1 )/ 100.0;
		}

		System.out.println(avg);

		//printf 사용
		System.out.printf("%.2f\n",avg);
		
		//math 매소드 사용
		long intAvg = Math.round(avg*100);
		System.out.println(intAvg/100.0);
	}
}
