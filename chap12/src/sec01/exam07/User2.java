package sec01.exam07;

public class User2 extends Thread {

	// field
	private Calc calc;

	// constructor
	public User2() {
		setName("User2");
	}
	// method
	public void setCalc(Calc calc) {
		this.calc = calc;
	}
	
	@Override
	public void run() {
		calc.setMemory(50);
	}
}
