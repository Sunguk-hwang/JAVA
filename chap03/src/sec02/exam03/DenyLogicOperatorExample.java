package sec02.exam03;

public class DenyLogicOperatorExample {
	
	public static void main(String[] args) {
		
		boolean stop1 = false;
		
		if(!stop1) {
			System.out.println("움직임?");
		}
		else
			System.out.println("안 움직임");
		
		boolean stop2 = true;
		
		if(!stop2) {
			System.out.println("움직임?");
		}
		else
			System.out.println("안 움직임");
	}
	
}
