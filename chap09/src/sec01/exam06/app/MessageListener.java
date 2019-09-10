package sec01.exam06.app;

import sec01.exam06.android.Button;

public class MessageListener implements Button.OnClickListener {

	@Override
	public void click() {
		System.out.println("메세지를 보냅니다.");
	}
	
	
	

}
