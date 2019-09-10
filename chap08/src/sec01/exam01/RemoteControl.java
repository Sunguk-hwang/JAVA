package sec01.exam01;

public interface RemoteControl {
	
	// 상수 field : static final을 생략해도 상수로 선언 된다.
	public /*static final (생략)*/ String COMPANY = "한화";
	public /*static final (생략)*/ int MAX_VOLUME = 50;
	public static final int MIN_VOLUME = 0;
	
	// method 사용 방법 (설명)
	public void turnOn(); // 설명: { } 실행내용 없다. 매개값 없다. 리턴값 없다.
	public void turnOff();
	public void setVolumne(int volume);

}
