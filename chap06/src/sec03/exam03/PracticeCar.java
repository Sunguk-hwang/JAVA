package sec03.exam03;

public class PracticeCar {
	
	String model;
	
	PracticeCar(String model){
		this.model = model;
	}
	
	PracticeCar(byte[] model){
		this.model = new String(model);
	}

	PracticeCar(char[] model){
		this.model = new String(model);
	}
}
