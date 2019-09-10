package sec02.exam05;

public class ForMultiplicationTableExample5 {

	public static void main(String[] args) {
		
		System.out.println("for문 1개 사용");
		String str1 = "";
		for(int i=1; i<=5;i++) {
			str1 = str1 + i;
			System.out.println(str1);
		}
		
		System.out.println("\nfor문 2개 사용");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		
	}

}
