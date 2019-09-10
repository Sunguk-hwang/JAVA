package sec05.exam04;

public class Calendar {
	private static Calendar singleton = new Calendar(); // 3. 그리고 그 객체는 딱 하나여야 된다, 4. 다른 클래스에서 어떤 접근도 하게 안한다.

	private Calendar(){} // 1. 다른 클래스에서 객체 생성 못한다.
	
	public static Calendar getInstance() { // 2. 대신 여기서 만든 객체를 넘겨는 준다.
		return singleton;
	}
}
