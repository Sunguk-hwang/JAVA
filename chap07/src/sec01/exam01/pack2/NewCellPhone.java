package sec01.exam01.pack2;

import sec01.exam01.pack1.CellPhone;

public class NewCellPhone extends CellPhone {
	
	//field
	public String channel;
	//constructor
	public NewCellPhone() {
		super(); // 자식 생성자 첫 줄이 둬야한다.
		System.out.println("자식 객체 생성");
	}
	
	//method
	public void infoModel(String str) {
		System.out.println(model = str);
	}
	
	public void turnOnYoutube() {
		System.out.println("채널" + channel + " 실시간 방송 보기");
	}
	
	public void turnOffYoutube() {
		System.out.println("방송 그만 보기");
	}
	
	public void changeChannelYoutube(String newChannel) {
		channel = newChannel;
		System.out.println("채널을 " + channel + "로 바꿉니다.");
	}

}
