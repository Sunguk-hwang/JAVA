package sec02.exam07;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		
		boolean stop = false;
		
		int x = 10;
		
		float v1 = 0.1f; //애초에 double로 지정하면 문제가 없다.
		
		System.out.println(v1 == 0.1);
		System.out.println(v1 == 0.1f);
		System.out.println((double)v1 == 0.1);
		System.out.println(v1);
		System.out.println((double)v1);
		

	}

}
