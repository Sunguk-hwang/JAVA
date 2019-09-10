package verify.q090203;

public class CheckBoxEx {

	public static void main(String[] args) {

		CheckBox checkBox1 = new CheckBox();
		CheckBox checkBox2 = new CheckBox();
		CheckBox.OnSelectListener listener = new CheckBox.OnSelectListener() {

			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다.");

			}
		};
		
		checkBox1.setOnSelectListener(listener);
		checkBox2.setOnSelectListener(new CheckBox.OnSelectListener() {

			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다.");
			}
		});
		checkBox1.select();
		checkBox2.select();

	}

}
