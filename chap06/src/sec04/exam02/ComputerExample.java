package sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {

		Computer com = new Computer();
		
		int result = com.sum1(new int[] {5, 3, 7});
		
		System.out.println(result);
		
		result = com.sum2(1, 2, 3, 4, 5, 6);
		
		System.out.println(result);
		

	}

}
