package sec02.exam02;

public class Child extends Parent{
	
	@Override
	public void parentMethod02() {
		System.out.println("Child Method02"+" ("+"Override Parent Method02"+")");
	}
	
	public void parentMethod03() {
		System.out.println("Child Method03");
	}

}
