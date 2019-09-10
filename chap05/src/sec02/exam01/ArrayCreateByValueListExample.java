package sec02.exam01;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		
		int[] scores = {83, 90, 87, 75, 93, 100, 77, 85, 88, 94};
		
		for(int i=0;i<scores.length;i++) {
			System.out.println("scores[" + i +"]: " + scores[i]);
		}
		
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		
		System.out.println("���� : " + sum);
		
		double avg = (double)sum / scores.length;
		
		System.out.printf("��� : %5.2f\n",avg);
	}

}
