package sec02.exam05;

public class ParentEx {
	public static void main(String[] args) {
		
		Parent parent = new Child();
		parent.field1 = 10;
		parent.method1(); //new Child()지만 parent가 Parent형으로 자동변환 되므로 field1, method1만 쓸 수 있다.
		
		Child child = (Child) parent;
		child.field2 = 10;
		child.method2();
		
		method3(new Child());
	}
	
	public static void method3(Parent parent) { // 1. 매개변수에 Child2가 들어오면 
		parent.field1 = 10;
		parent.method1();
		if(parent instanceof Child) { // 3. instanceof 연산자를 활용한 조건을 건다.
			Child child = (Child) parent; // 2. ClassCastException 발생할 수 있으므로
			child.field2 = 10;
			child.method2();
		}
	}

}
