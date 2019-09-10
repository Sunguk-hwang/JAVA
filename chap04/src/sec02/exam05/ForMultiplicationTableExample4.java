package sec02.exam05;

public class ForMultiplicationTableExample4 {

	public static void main(String[] args) {
	
		for(int m=0; m<=2; m++) {
			
			for(int n=0; n<=2; n++) {
				
				System.out.print(m + n + ((n != 2) ? ",":"")); //삼항연산 활용!
				
				/*if(n == 2) {
					continue;
				}
				
				System.out.print(",");*/
			}
			
			System.out.println();
		}
	}
			
}


