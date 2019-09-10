package sec02.exam09;

public class BreakOutterExample {

	public static void main(String[] args) {
	
		outter:
		for(int m=0; m<=2; m++) {
			
			for(int n=1; n<=5; n++) {
				
				System.out.print("" + n + m + "\t");
				if (n == 3)
					break outter;
			}
			
			System.out.println();
		}
			
	}

}
