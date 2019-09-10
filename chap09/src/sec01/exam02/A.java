package sec01.exam02;

public class A {
	
	B b1 = new B();
	//static B b2 = new B();
	C c1 = new C();
	static C c2 = new C();
	
	A() {
		B b1 = new B();
		C c1 = new C();
	}
	
	void method1() {
		B b1 = new B();
		C c1 = new C();
	}
	static void method2() {
		//B b1 = new B();
		C c1 = new C();
	}
	
	class B {
		
	}
	static class C {
		
	}

}
