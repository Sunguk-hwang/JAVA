package sec01.exam07;

public class Calc {
	
	//field
	private int memory;

	
	//constructor
	
	
	//method
	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try{Thread.sleep(2000);} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + memory + " -> " + this.memory);
	}
	
}
