package verify.q090105;

public class CheckBoxEx {

	public static void main(String[] args) {
		
		CheckBox checkBox = new CheckBox();
		
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		
		checkBox.select();

	}

}
