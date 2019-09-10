package test;

public class RecursiveCallExample {

	static int count = 1;

	public static void main(String[] args) {
		//method();
	
		System.out.println("result: " + factorial(5));

	}

	static void method() {
		System.out.println("method() 재귀 호출" + count);
		count++;

		method(); // 재귀 호출
	}

	// 5*4*3*2*1 
	
	static int factorial(int i) {
		if (i == 1) {
			return i;
		}
		return i * factorial(i-1);
	}
	
	/*
	static int num = 5;

	static int i = 1;
	static int sum = 1;

	static void factorial() {
		if (i > 5) {
			return;
		} else {
			sum *= i;
			i++;
		}
		factorial();
		System.out.println(sum);
	}
	*/
}
