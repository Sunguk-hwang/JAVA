package sec03.exam07;

public class CarExample {

	public static void main(String[] args) {
		
		// 부품 생성
		Engine engine = new Engine("엔진 제조사", "연료", 0000);
		/*
		System.out.println(engine.company);
		System.out.println(engine.fuelType);
		System.out.println(engine.cc);
		*/
		Tire[] tires = {new Tire("타이어 제조사", 00), new Tire("타이어 제조사", 00), new Tire("타이어 제조사", 00), new Tire("타이어 제조사", 00)};
		
		//조립
		Car car1 = new Car("차량 제조사", "차량 모델", 000, engine, tires);
		
		System.out.println("차량 제조사: "+car1.company);
		System.out.println("차량 모델: "+car1.model);
		System.out.println("차량 속도: "+car1.speed);
		System.out.println("차량 엔진.제조사: "+car1.engine.company);
		System.out.println("차량 엔진.연료: "+car1.engine.fuelType);
		System.out.println("차량 엔진.배기량: "+car1.engine.cc);
		System.out.println("차량 타이어1.제조사: "+car1.tires[0].company);
		System.out.println("차량 타이어1.크기: "+car1.tires[0].size);
		System.out.println("차량 타이어2.제조사: "+car1.tires[1].company);
		System.out.println("차량 타이어2.크기: "+car1.tires[1].size);
		System.out.println("차량 타이어3.제조사: "+car1.tires[2].company);
		System.out.println("차량 타이어3.크기: "+car1.tires[2].size);
		System.out.println("차량 타이어4.제조사: "+car1.tires[3].company);
		System.out.println("차량 타이어4.크기: "+car1.tires[3].size);
		System.out.println("**************************");
		
		Car car2 = new Car();
		car2.company = "차량 제조사";
		car2.model = "차량모델";
		car2.speed = 00;
		car2.engine = new Engine("엔진 제조사", "연료", 0000);
		car2.tires = new Tire[] {new Tire("타이어 제조사", 00), new Tire("타이어 제조사", 00), new Tire("타이어 제조사", 00), new Tire("타이어 제조사", 00)};
		
		System.out.println("차량 제조사: "+car2.company);
		System.out.println("차량 모델: "+car2.model);
		System.out.println("차량 속도: "+car2.speed);
		System.out.println("차량 엔진.제조사: "+car2.engine.company);
		System.out.println("차량 엔진.연료: "+car2.engine.fuelType);
		System.out.println("차량 엔진.배기량: "+car2.engine.cc);
		System.out.println("차량 타이어1.제조사: "+car2.tires[0].company);
		System.out.println("차량 타이어1.크기: "+car2.tires[0].size);
		System.out.println("차량 타이어2.제조사: "+car2.tires[1].company);
		System.out.println("차량 타이어2.크기: "+car2.tires[1].size);
		System.out.println("차량 타이어3.제조사: "+car2.tires[2].company);
		System.out.println("차량 타이어3.크기: "+car2.tires[2].size);
		System.out.println("차량 타이어4.제조사: "+car2.tires[3].company);
		System.out.println("차량 타이어4.크기: "+car2.tires[3].size);
		System.out.println("**************************");
		
		
	}

}
