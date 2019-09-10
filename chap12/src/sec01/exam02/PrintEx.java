package sec01.exam02;

public class PrintEx {

	public static void main(String[] args){
		
		Thread thread1 = new BeepThread();
		thread1.start();
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println(Thread.currentThread().getName() + " : 채팅 한다.");
					try{Thread.sleep(1000);} catch(InterruptedException e) {}
				}
			}
		}; // Thread 자식 익명 객체
		thread2.start();
		
		for(int i=0; i<5; i++) { // 이건 메인이 계속 실행, BeepTask.run()은 새로운 실행 흐름에서 실행된다.
			System.out.println(Thread.currentThread().getName() + " : 드로잉 한다.");
			try{Thread.sleep(1000);} catch(InterruptedException e) {}
		}

	}

}
