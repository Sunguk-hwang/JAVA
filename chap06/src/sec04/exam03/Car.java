package sec04.exam03;

public class Car {
	
	//field
	int fuel;
	
	//constructor
	Car(){
		
	}
	
	Car(int fuel){
		this.fuel = fuel;
	}
	
	//method
	void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	boolean leftFuel() {
		if(fuel == 0) {
			System.out.println("연료 부족");
			return false;
		}
		System.out.println("연료 있음");
		return true;
	}
	
	void run() {
		while(true) {
			if(fuel>0) {
				System.out.println("주행 중.. 남은 연료: " + fuel);
				fuel--;
				//leftFuel();
			}
			else {
				System.out.println("주행 중단! 남은 연료: " + fuel);
				//leftFuel();
				break;
			}
		}
	}
}

