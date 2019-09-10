package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		calc.powerOn();
		
		int plusResult = calc.plus(3, 5);
		
		double divideResult = calc.divide(3, 5);
		
		
		System.out.println("plusResult = " + plusResult);
		System.out.println("divideResult = " + divideResult);
		
		calc.powerOff();

	}

}
