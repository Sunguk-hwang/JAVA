package sec01.exam06;

public class Car { // class에 final이 붙으면 상속이 불가(부모 객체가 될 수 없다.)
	// field // field에 final이 붙으면 필드값을 변경할 수 없다.
	public int speed;
	
	//constructor
	
	// method // method에 final이 붙으면 자식 클래스에서 메소드 오버라이드 불가
	public void speedUP() {
		speed++;
	}
	
	public final void stop() {
		System.out.println("멈춥니다.");
		speed = 0;
	}

}
