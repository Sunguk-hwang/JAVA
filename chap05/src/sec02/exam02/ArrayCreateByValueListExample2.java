package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		
		/*int[] scores = null;
		scores = new int[] {83, 90, 87, 75, 93, 100, 77, 85, 88, 94}; // scores = { ... }; 에러!
		
		for(int i=0;i<scores.length;i++) {
			System.out.println("scores[" + i +"]: " + scores[i]);
		}
		
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		
		double avg = (double)sum / scores.length;
		
		System.out.printf("평균 : %5.2f\n",avg);*/
		
		String[] names;
		names = new String[] {"길동", "길서", "길남"};
		
		double[] talls;
		talls = new double[] {170.5, 173.3, 180.2};
		
		
		byte[] bytes;
		bytes = new byte[] {65, 66, 67};
		String str = new String(new byte[] {65, 66, 67}); //new String({65, 66, 67}) 에러 난다
		System.out.println(str);
		
		int sum2 = add(new int[] {10, 20, 30});
		System.out.println(sum2);
	}//main

	public static int add(int[] scores) {
		
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		return sum;
	}//add
	
}//class
