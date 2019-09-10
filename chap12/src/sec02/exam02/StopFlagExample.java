package sec02.exam02;

import java.util.Calendar;

public class StopFlagExample {
	
	private static boolean stop; //Flag필드
	
	
	public static void main(String[] args) { // main쓰레드는 clock.start(); 밑에 }를 만나면 끝, 남아있는 쓰레드는 clock이다. main아니여도 쓰레드 하나라도 남으면 그 프로그램은 계속 실행된다.

		Thread clock = new Thread() {
			@Override
			public void run() {
				while (!stop) {
					Calendar now = Calendar.getInstance();
					String hour = (now.get(Calendar.HOUR_OF_DAY) < 10) ? "0" + now.get(Calendar.HOUR_OF_DAY) : "" + now.get(Calendar.HOUR_OF_DAY);
					String minute = (now.get(Calendar.MINUTE) < 10) ? "0" + now.get(Calendar.MINUTE) : "" + now.get(Calendar.MINUTE);
					String second = (now.get(Calendar.SECOND) < 10) ? "0" + now.get(Calendar.SECOND) : "" + now.get(Calendar.SECOND);

					System.out.println(hour + ":" + minute + ":" + second);

					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
				System.out.println("10초 끝");
			}
		};
		clock.start(); //clock쓰레드 실행대기 상태
		
		try {
			Thread.sleep(1000*10);
		} catch (Exception e) {
		}
		
		stop = true; 
		
		
		/*
		clock.stop(); 이거 말고 Thread의 Run메소드를 빨리 끝내라
		 */
	}

}
