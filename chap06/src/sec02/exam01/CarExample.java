package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car(); // stack : myCar(Car 객체 참조, 5번지 저장) | heap : Car 객체(예:5번지)
		
		//필드값 읽기
		/*
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		System.out.println(myCar.owner);
		System.out.println(myCar.enginstart);
		System.out.println();
		*/ //객체 외부에서 참조 변수를 사용해서 객체로 접근해서 출력
		
		myCar.info(); // 객체 내부에서 메소드를 사용
		
		//필드값 변경
		/*
		myCar.speed = 110;
		myCar.owner = "Hwang";
		myCar.enginstart = true;
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		System.out.println(myCar.owner);
		System.out.println(myCar.enginstart);
		*/
		
		Car anotherCar = new Car();
		anotherCar.model = "Sonata";
		anotherCar.color = "White";
		anotherCar.speed = 80;
		anotherCar.owner = "Hwang";
		anotherCar.enginstart = true;
		anotherCar.info();
		

	}

}
