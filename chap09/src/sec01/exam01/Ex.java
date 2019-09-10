package sec01.exam01;

//import sec01.exam01.A.B;

public class Ex {

	public static void main(String[] args) {
		
		A a = new A();
		
		A.B b = a.new B(); // a 객체 안에 있는 B 객체를 만든다
		b.field1 = 10;
		b.method1();
		
		A.C c = new A.C(); // 클래스 A에 있는 C 객체를 만든다
		c.field1 = 10;
		c.method1();
		A.C.field2 = 10;
		A.C.method2();
	}

}
