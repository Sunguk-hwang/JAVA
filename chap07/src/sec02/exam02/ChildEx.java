package sec02.exam02;

public class ChildEx {

	public static void main(String[] args) {
		
		Child child = new Child();
		Parent parent = child;
		
		System.out.println("\"child = parent\" : " + (child == parent));
		parent.parentMethod01();
		parent.parentMethod02();
		

	}

}
