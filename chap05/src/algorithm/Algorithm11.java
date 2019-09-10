package algorithm;

public class Algorithm11 {
	public static void main(String[] args) {
		
		int[][] matrix_1 = {{1, 2, 3}, {3, 4, 5}, {5, 6, 7}}; // 3x3
		int[][] matrix_2 = {{10, 20}, {30, 40}, {50, 60}}; // 3x2
		int[][] matrix_3 = new int[matrix_1.length][matrix_2[0].length]; // 3x2
		
		for(int m=0; m<matrix_1.length; m++) {
			
			for(int n=0; n<matrix_2[0].length; n++) {
				
				for(int k=0; k<matrix_1[0].length; k++) {
					
					matrix_3[m][n] += matrix_1[m][k] * matrix_2[k][n];
				}
				
				System.out.print(matrix_3[m][n] + "\t");
			}
			
			System.out.println();
		}
	}
}
