package sec04.exam04;

public class Calc {
	
	int plus(int x, int y) {
		return x + y;
	}
	
	double avg(int x, int y) {
		return plus(x, y) / 2.0;
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행 결과: " + result);
	}

}
