package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setFuel(5);
		
		boolean fuelState = car.leftFuel();
		
		if(fuelState) {
			System.out.println("주행 시작");
			car.run();
		}
		//System.out.println(fuelState);
		//System.out.println(car.leftFuel());
		if(car.leftFuel()) {
			System.out.println("연료 충분");
		}
		else {
			System.out.println("연료 주입 필요");
		}

	}

}
