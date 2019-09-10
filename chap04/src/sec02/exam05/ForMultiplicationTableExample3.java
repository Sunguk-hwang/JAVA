package sec02.exam05;

public class ForMultiplicationTableExample3 {

	public static void main(String[] args) {
	
		//System.out.println((char)65);
		
		for(int m=65; m<=67; m++) {
			
			for(int n=65; n<=69; n++) {
				
				System.out.print("" + (char)m + (char)n + "\t");
				
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(char first = 'A'; first <= 'C'; first++) {
			for(char second = 'A';second <= 'E'; second++) {
				System.out.print(first + (second + "\t"));
			}
			System.out.println();
		}
			
			
	}

}
