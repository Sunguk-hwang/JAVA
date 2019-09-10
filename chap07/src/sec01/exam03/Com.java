package sec01.exam03;

public class Com extends Calc {
	
	public double areaCircle(double r) {
		System.out.println("Com 객체의 areaCircle()이 실행됨");
		return Math.PI * r * r;
	}
	
	public void setting() {
		
		System.out.println("자식 객체의 내부를 어떤 상태로 세팅");
		
		super.setting(); // super(): 부모 객체 생성자 , super: 부모 객체 호출
	}
}
