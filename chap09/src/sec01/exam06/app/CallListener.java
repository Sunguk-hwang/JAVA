package sec01.exam06.app;

import sec01.exam06.android.Button;

public class CallListener implements Button.OnClickListener {

	@Override
	public void click() {
		System.out.println("전화를 겁니다.");
	}
	
	
	

}
