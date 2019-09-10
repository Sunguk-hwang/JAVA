package sec02.exam01;

public class Car { // 클래스 = 설계도 = 객체를 만들 놈 !=객체
	
	//field
	String company = "Hyundai Motors";
	String model = "Genesis G70";
	String color = "Black";
	int maxSpeed = 260;
	int speed;
	boolean enginstart;
	String owner;
	
	//constructor
	
	//method : 객체가 가지게 될 메소드를 클래스에서 선언만 한거다 클래스 꺼 아니다 메소드는 객체가 있어야 실행되니까
	void info() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);
		System.out.println(speed);
		System.out.println(owner);
		System.out.println(enginstart);
		System.out.println();
	}

}
