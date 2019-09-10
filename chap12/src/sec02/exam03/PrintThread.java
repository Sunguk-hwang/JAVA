package sec02.exam03;

public class PrintThread extends Thread {
	/*
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("실행중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			// e.printStackTrace();
		}

		System.out.println("마무리");
	}
	*/

	@Override
	public void run() {
		while (true) {
			System.out.println("실행중");
			if(isInterrupted()) {
				break;
			}
		}

		System.out.println("마무리");
	}
}
