package verify.q090203;

public class CheckBox {
	
	//nested interface
	static interface OnSelectListener{
		void onSelect();
	}
	//field
	OnSelectListener listener;
	//constructor
	
	//method
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	

}
