package sec02.exam03.android;

public class Button {
	
	//field
	private OnClickListener listener; // 인터페이스 타입 필드 선언
	
	//constructor
	
	//method
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	public void touch() {
		listener.click();
	}
	
	//nested Interface
	public static interface OnClickListener {
		void click();
	}

}
