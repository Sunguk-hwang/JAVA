package sec02.exam03;

public class _5_Ex {

	public static void main(String[] args) {
		/*
		Tire t1 = new Tire();
		Tire t2 = new Tire_Kumho();
		Tire t3 = new Tire_Hankook();
		
		t1.roll();
		t2.roll();
		t3.roll();
		*/
		
		_4_PraticeCar myCar = new _4_PraticeCar();
	
		// 부품 조립/재조립
		myCar.t1 = new _2_Tire_Hankook();
		myCar.t2 = new _2_Tire_Hankook();
		myCar.t3 = new _3_Tire_Kumho();
		myCar.t4 = new _3_Tire_Kumho();
		
		// 주행 방법
		myCar.run();
		System.out.println();
		//*****************필드의 다형성*****************//
		
		_4_PraticeCar car = new _4_PraticeCar();
		car.run(new _1_Tire_default());
		car.run(new _3_Tire_Kumho());
		car.run(new _2_Tire_Hankook()); //Tire가 매개변수로 선언되어있고, 자식 > 부모 타입 변환이 일어나면서, 오버라이드한 메서드가 실행됨.
		//*****************매개변수의 다형성*****************//
		
	}

}
