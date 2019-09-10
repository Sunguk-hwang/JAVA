package sec02.exam02;

public class IncreaseDecreaseOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		x++;
		++x;
		System.out.println("x = "+ x);
		
		int result1 = ++x + 10;
		System.out.printf("result1 = %d, x = %d\n", result1, x);
		
		int result2 = x++ + 10;
		System.out.printf("result2 = %d, x = %d\n", result2, x);

	}

}
