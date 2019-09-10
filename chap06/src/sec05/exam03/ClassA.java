package sec05.exam03;

public class ClassA {
	
	//field
	int f1;
	static int f2;
	//constructor
	
	//method
	void m1() {
		
	}
	static void m2() {
		
	}
	
	static void m3() {
		// f1 = 10;
		f2 = 10;
		
		// m1();
		m2();
	}
	
	static void m4() {
		ClassA cla = new ClassA();
		cla.f1 = 10;
		cla.m1();
	}
	
	public static void main(String[] args) {
		// f1 = 10;
		// m1();
		
		f2 = 10;
		m2();
		
		ClassA cla = new ClassA();
		cla.f1 = 10;
		cla.m1();
	}

}
