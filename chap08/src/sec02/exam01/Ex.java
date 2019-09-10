package sec02.exam01;

public class Ex {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		System.out.println();
		
		car.t1 = new KumhoTire();
		
		car.run();

	}

}
