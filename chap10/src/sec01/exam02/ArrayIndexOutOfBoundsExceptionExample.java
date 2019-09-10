package sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		int[] scores = {90, 80, 70};
		
		int sum = 0;
		for(int i=0; i<=3; i++) {
			sum += scores[i];
		}

	}

}
