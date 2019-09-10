package sec02.exam05;

public class ForMultiplicationTableExample6 {

	public static void main(String[] args) {
	
		for(int m=1; m<=5; m++) {
			
			for(int n=1; n<=6-m; n++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
