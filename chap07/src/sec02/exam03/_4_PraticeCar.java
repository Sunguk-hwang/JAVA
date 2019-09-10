package sec02.exam03;

public class _4_PraticeCar {
	//field
	_1_Tire_default t1 = new _1_Tire_default();
	_1_Tire_default t2 = new _1_Tire_default();
	_1_Tire_default t3 = new _1_Tire_default();
	_1_Tire_default t4 = new _1_Tire_default();
	//constructor
		
	//method
	public void run() {
		System.out.println("주행 중 입니다.");
		t1.roll();
		t2.roll();
		t3.roll();
		t4.roll();
	}
	
	public void run(_1_Tire_default tire) {
		tire.roll();
	}
	
}
