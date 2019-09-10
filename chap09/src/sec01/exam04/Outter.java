package sec01.exam04;

public class Outter {
	
	// field
	
	// constructor
	
	// method
	void method1(int v1) { // java 7에서는 final 특성으로는 안된다 무조건 final 붙여라.
		
		int v2 = 1;
		
		// v1 = 10; // 2. 값은 변경하면 final의 특성을 깬다.
		// v2 = 10;
		
		class Inner{
			// int v1 = v1; 위의 v1을 필드값으로 저장해서 쓴다. >> v1, v2가 final이어야 한다.
			// int v2 = v2;
			
			void method2() {
				int result = v1 + v2; // 1. 로컬 클래스에서 사용되는 변수 v1, v2는 final이어야된다.
			}
		}
		
		System.out.println(v1);
		System.out.println(v2);
		
		Inner obj = new Inner(); // 메소드1이 끝나도 Inner 객체는 사라지지 않는다....?
		obj.method2();
	}

}
