package sec03.exam03;

public class PracticeCarExample {

	public static void main(String[] args) {
		
		PracticeCar car1 = new PracticeCar("G70");
		
		byte[] bA = {83, 79, 78, 65, 84, 65};
		PracticeCar car2 = new PracticeCar(bA);
		
		char[] cA = {'S', 'M', '5'};
		PracticeCar car3 = new PracticeCar(cA);
		
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
		
		
	}

}
