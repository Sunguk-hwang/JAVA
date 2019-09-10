package sec01.exam06.app;

import sec01.exam06.android.Button;

public class Main {

	public static void main(String[] args) {
		
		Button bt1 = new Button();
		bt1.setListener(new CallListener());
		
		Button bt2 = new Button();
		bt2.setListener(new MessageListener());
		
		bt1.touch();
		bt2.touch();
		
		
		

	}

}
