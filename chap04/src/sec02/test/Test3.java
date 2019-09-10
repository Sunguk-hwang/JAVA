package sec02.test;

public class Test3 {
	
	public static void main(String[] args) {
		
		while(true) {
			
			int a = (int)(Math.random()*6 + 1);
			int b = (int)(Math.random()*6 + 1);
			
			System.out.println("(" + a + ", " + b + ")");
			
			if(a + b == 5) {
				System.out.println("두 주사위 눈의 합이 5이므로 종료합니다.");
				break;
			}
		}
		
	}

}
