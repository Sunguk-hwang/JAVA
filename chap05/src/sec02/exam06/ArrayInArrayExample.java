package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] mathScores1 = new int[2][3];
		int[][] mathScores2 = {{0,0,0},{0,0,0}};
		
		int[][] mathScores3 = {{90, 80, 70}, {50, 60, 70}};
		
		for(int m=0; m<mathScores3.length; m++) {
			for (int n=0; n<mathScores3[m].length; n++) {
				System.out.print(mathScores3[m][n] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		int[][] englishScores1 = new int[2][];
		englishScores1[0] = new int[2];
		englishScores1[1] = new int[3];
		
		int[][] englishScores2 = {{0, 0}, {0, 0, 0}};
		
		for(int m=0; m<englishScores1.length; m++) {
			for (int n=0; n<englishScores1[m].length; n++) {
				System.out.print(englishScores1[m][n] + "\t");
			}
			
			System.out.println();
		}
	}
}
