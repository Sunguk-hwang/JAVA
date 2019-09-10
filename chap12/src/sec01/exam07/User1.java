package sec01.exam07;

public class User1 extends Thread {

	// field
	private Calc calc;

	// constructor
	public User1() {
		setName("User1");
	}
	// method
	public void setCalc(Calc calc) {
		this.calc = calc;
	}
	
	@Override
	public void run() {
		calc.setMemory(100);
	}
}
