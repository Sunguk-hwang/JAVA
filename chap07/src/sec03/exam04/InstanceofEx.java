package sec03.exam04;

public class InstanceofEx {
	public static void main(String[] args) {
		
		//System.out.println(xx instanceof oo); : xx는 oo의 타입(자동타입변환까지 고려)이냐?
		
		A a1 = new A();
		System.out.println(a1 instanceof B);
		A a2 = new B();
		System.out.println(a2 instanceof B);
		A a3 = new D();
		System.out.println(a3 instanceof D);
		System.out.println(a3 instanceof B);
		System.out.println(a3 instanceof A);
		System.out.println(a3 instanceof F); // root class가 같으면 instanceof 사용 가능 : false
		
	
	}
	
}

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends B {}

class F extends C {}
class G extends C {}