package sec01.exam01;

public class BeepTask implements Runnable { // 이 작업(BeepTask)을 쓰레드가 실행 가능하도록 한다.
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + " : 소리를 낸다.");
			try{Thread.sleep(1000);} catch(InterruptedException e) {}
		}

	}
}
