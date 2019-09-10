package sec02.exam10;

public class AdvencedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {90, 80, 70, 86};
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
			//System.out.println(score);
		}
		
		System.out.println(sum);
		System.out.println();
		
		String[] langs = {"java", "c", "python", "c#"};
		for(String lang : langs) {
			System.out.println(lang);
		}
	}

}
