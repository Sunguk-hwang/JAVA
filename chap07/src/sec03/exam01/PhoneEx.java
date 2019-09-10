package sec03.exam01;

public class PhoneEx {

	public static void main(String[] args) {
		
		//Phone phone = new Phone();
		SmartPhone p1 = new SmartPhone();
		OldPhone p2 = new OldPhone();
		
		Phone p3 = new SmartPhone(); // 객체는 못 만들지만 type으로 쓸 수는 있다.
		Phone p4 = new OldPhone();
		
		
	}

}
