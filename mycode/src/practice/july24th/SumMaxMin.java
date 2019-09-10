package practice.july24th;

public class SumMaxMin {

	public static void main(String[] args) {

		int[] result = new int[5];
		// System.out.println(result[0]);
		for (int i = 0; i < 5; i++) {
			result[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (result[j] == result[i]) {
					i--;
					break;
				}
			}
			
		}
		
	}

}
