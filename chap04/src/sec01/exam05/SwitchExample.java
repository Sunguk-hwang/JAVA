package sec01.exam05;

public class SwitchExample {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 6) + 1;
		System.out.print(num + " : ");
		
		switch(num) {
		
			case 1:
				System.out.println("홀수 나왔다.");
				break;
			case 2:
				System.out.println("짝수 나왔다.");
				break;
			case 3:
				System.out.println("홀수 나왔다.");
				break;
			case 4:
				System.out.println("짝수 나왔다.");
				break;
			case 5:
				System.out.println("홀수 나왔다.");
				break;
			default:
				System.out.println("짝수 나왔다.");
				
		}

	}

}
