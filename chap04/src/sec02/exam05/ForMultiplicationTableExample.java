package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		
		for(int m=1;m<=9;m++) {
			
			//System.out.print("\n");
			
			for(int n=2;n<=9;n++) {
				
				int result = n * m;
				
				System.out.print(n + "X" + m + "=" + result + "\t");
			}
			
			System.out.println();
		}
		System.out.println("**************************************************************");
		
		for(int m=1;m<=9;m++) {
			for(int n=9;n>=2;n--) {
				
				int result = n * m;
				
				System.out.print(n + "X" + m + "=" + result + "\t");
			}
			
			System.out.println();
		}

	}

}
