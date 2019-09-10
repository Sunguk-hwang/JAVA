package sec01.exam01;

public class A {

	// field

	// constructor
	A() {
		class D{ }
		D d = new D();
	}
	// method
	void method() {
		class E{}
		E e = new E();
	}

	// nested class
	class B {

		// field
		int field1;
		// static int field2;

		// constructor
		

		// method
		void method1() {
		}
		// static void method2() {}
	}

	static class C {
		// field
		int field1;
		static int field2;
		
		// constructor

		// method
		void method1() {} // 최소한 C의 객체는 필요하다
		static void method2() {}

	}

}
