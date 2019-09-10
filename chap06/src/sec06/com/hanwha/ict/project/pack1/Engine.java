package sec06.com.hanwha.ict.project.pack1;

public class Engine { // public을 붙이면 어디서든(다른 패키지에서도) 이 클래스를 사용할 수 있다.
	
	public String company; // private String company; : Engine클래스 내부에서만 쓸 수 있다. >> pack1에서 company 사용 불가!
	
	public Engine() {}

	public void run() {}

}
