package sec03.exam04;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("company: " + car1.company);
		System.out.println("model name: " + car1.model);
		System.out.println("color: " + car1.color);
		System.out.println("maxSpeed: " + car1.maxSpeed);
		System.out.println();
		
		Car car2 = new Car("Genesis G70");
		System.out.println("company: " + car2.company);
		System.out.println("model name: " + car2.model);
		System.out.println("color: " + car2.color);
		System.out.println("maxSpeed: " + car2.maxSpeed);
		System.out.println();
		
		Car car3 = new Car("Sonata", "Matt Black");
		System.out.println("company: " + car3.company);
		System.out.println("model name: " + car3.model);
		System.out.println("color: " + car3.color);
		System.out.println("maxSpeed: " + car3.maxSpeed);
		System.out.println();
		
		Car car4 = new Car("Grandeur", "White", 280);
		System.out.println("company: " + car4.company);
		System.out.println("model name: " + car4.model);
		System.out.println("color: " + car4.color);
		System.out.println("maxSpeed: " + car4.maxSpeed);
		System.out.println();

	}

}
