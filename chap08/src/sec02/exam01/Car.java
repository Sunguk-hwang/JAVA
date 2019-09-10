package sec02.exam01;

public class Car {
	
	// field
	public Tire t1 = new HankookTire();
	public Tire t2 = new HankookTire();
	public Tire t3;
	public Tire t4;

	// constructor
	public Car() {
		t3 = new HankookTire();
		t4 = new HankookTire();
	}
	
	// method
	public void run() {
		t1.roll();
		t2.roll();
		t3.roll();
		t4.roll();
	}

}
