package sec01.exam01.pack1;

public class CellPhone {
	
	protected String model; // 자식을 위한 제한자, 자식이 어디에 있든(다른 패키지여도) 자식은 부모의 모든 필드, 메소드를 사용할 수 있다.
	public String color;
	
	public CellPhone() {
		System.out.println("부모생성자");
	}
	
	public void powerOn() {
		System.out.println("전원이 켜집니다.");
	}
	
	public void powerOff() {
		System.out.println("전원이 꺼집니다.");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendMessage(String message) {
		System.out.println("나의 메세지: " + message);
	}
	
	public void receiveMessage(String message) {
		System.out.println("상대방의 메세지: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
