package sec03.exam01;

public class Car {
	
	String company;
	String model;
	
	Car(String company, String model){
		this.company = company; // 필드와 매개변수 이름이 같을 때 필드와 구분하기 위해서 this.를 쓴다
		this.model = model;
	}

}
