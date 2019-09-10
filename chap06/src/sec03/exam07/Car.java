package sec03.exam07;

public class Car {
	// field
	String company;
	String model;
	int speed;
	
	Engine engine;
	Tire[] tires = new Tire[4];
	
	// constructor
	Car() {
		
	}
	
	Car(String company, String model, int speed, Engine engine, Tire[] tires){
		this.company = company;
		this.model = model;
		this.speed = speed;
		this.engine = engine;
		this.tires = tires;
	}

}
