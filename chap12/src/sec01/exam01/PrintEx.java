package sec01.exam01;

public class PrintEx {

	public static void main(String[] args){
		/*
		Thread currentThread = Thread.currentThread(); // 현재 쓰레드 얻고
		String threadName = currentThread.getName(); // 그 쓰레드의 이름 얻어서
		System.out.println(threadName); // 출력
		*/
		
		Thread thread1 = new Thread(new BeepTask()); // 2. BeepTask 객체의 의 run 메소드를 실행한다.
		thread1.start(); // 1. 쓰레드가 코드를 실행하도록 해준다. ----> 새로운 실행 흐름이 생긴다.
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println(Thread.currentThread().getName() + " : 채팅 한다.");
					try{Thread.sleep(1000);} catch(InterruptedException e) {}
				}
			}
		}); // Runnable 구현 익명 객체
		thread2.start();
		
		for(int i=0; i<5; i++) { // 이건 메인이 계속 실행, BeepTask.run()은 새로운 실행 흐름에서 실행된다.
			System.out.println(Thread.currentThread().getName() + " : 드로잉 한다.");
			try{Thread.sleep(1000);} catch(InterruptedException e) {}
		}

	}

}
