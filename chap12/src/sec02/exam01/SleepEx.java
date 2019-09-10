package sec02.exam01;

import java.util.Calendar;

public class SleepEx {

	public static void main(String[] args) {

		// 작업2
		Thread thread = new Thread() {
			@Override
			public void run() {
				while (true) {
					System.out.println("시간을 체크해서 어떤 기능을 수행합니다.");
					try {
						Thread.sleep(1000 * 3);
					} catch (Exception e) {
					}
				}
			}
		};
		thread.start();

		// 작업1
		while (true) {
			Calendar now = Calendar.getInstance();
			int hour = now.get(Calendar.HOUR_OF_DAY);
			int minute = now.get(Calendar.MINUTE);
			String second = (now.get(Calendar.SECOND) < 10) ? "0" + now.get(Calendar.SECOND)
					: "" + now.get(Calendar.SECOND);

			System.out.println(hour + ":" + minute + ":" + second);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		


	}

}
