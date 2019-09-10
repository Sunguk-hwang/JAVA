package sec03.exam04;

public class Car {
	
	String company = "Hyundai Motors";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	
	Car(String model){
		this(model, "White", 260);
	}
	
	Car(String model, String color){
		this(model, color, 260);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
