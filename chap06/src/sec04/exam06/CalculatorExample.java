package sec04.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		double result1 = calc.areaRectangle(10);
		double result2 = calc.areaRectangle(5, 20);
		
		System.out.println((int)result1);
		System.out.println((int)result2);

	}

}
