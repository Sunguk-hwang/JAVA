package sec02.exam04;

public class WordExample {

	public static void main(String[] args) {
		Thread autoSave = new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000 * 3);
					} catch (Exception e) {
					}
					System.out.println("현재 작업을 저장합니다.");
				}
			}
		};
		autoSave.setDaemon(true);
		autoSave.start();

		while (true) {
			for (int i = 0; i < 6; i++) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
				System.out.println("워드 작업을 합니다.");
			}
			break;

		}
	}

}
