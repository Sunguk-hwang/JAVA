package sec01.exam04;

public class SuperSonic extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	/*
	@Override // 부모 클래스에 메소드 이름과 일치하는지(오버라이드가 잘 되었는지) 확인해주고, 다르면(오버라이드가 안 되면) 에러!
	public void flying() {
		if(flymode == SUPERSONIC) {
			System.out.println("초음속 비행 중 입니다.");
		}
		else {
			super.flying();
		}
	}
	*/
	@Override // 메소드 선언 자리에 Ctrl+Space >> 오버라이드 할 메소드명 치고 엔터 누르면
	public void flying() {
		if(flymode == SUPERSONIC) {
			System.out.println("초음속 비행 중 입니다.");
		}
		else {
			super.flying();
		}
	}
}
