package sec01.exam02;

public class BeepThread extends Thread { // Thread 자식클래스로, 이 자체가 Thread역할을 한다
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + " : 소리를 낸다.");
			try{Thread.sleep(1000);} catch(InterruptedException e) {}
		}

	}
}
