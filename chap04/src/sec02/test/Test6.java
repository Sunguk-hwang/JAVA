package sec02.test;

public class Test6 {

	public static void main(String[] args) {
		
		for(int m = 1; m <= 4; m++) {
			int n;
			for(n = 1; n <= 4-m; n++) {
				
				System.out.print(" ");
			}
			for(int k = n; k<=4; k++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
