package sec02.exam03.app;

import sec01.exam06.android.Button;

public class Main {

	public static void main(String[] args) {
		
		Button bt1 = new Button();
		bt1.setListener(new Button.OnClickListener() {
			
			@Override
			public void click() {
				System.out.println("전화를 겁니다.");
			}
		});
		
		Button bt2 = new Button();
		bt2.setListener(new Button.OnClickListener() {
			
			@Override
			public void click() {
				System.out.println("메세지 전송");
			}
		});
		
		bt1.touch();
		bt2.touch();
		
		
		

	}

}
