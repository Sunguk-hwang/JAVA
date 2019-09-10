package sec01.exam01;

import sec01.exam01.pack2.NewCellPhone;

public class PhoneExample {

	public static void main(String[] args) {
		/*
		CellPhone phone = new CellPhone();
		phone.model = "Galaxy Note Fan Edition";
		phone.color = "Black";
		phone.powerOn();
		phone.bell();
		phone.sendMessage("\"여보세요, 누구세요?\"");
		phone.receiveMessage("\"뚱인데요?\"");
		phone.hangUp();
		phone.powerOff();
		
		System.out.println();
		*/
		NewCellPhone newPhone = new NewCellPhone();
		//newPhone.model = "Galaxy Note 9";
		newPhone.infoModel("Galaxy Note 9");
		newPhone.color = "Gold";
		newPhone.powerOn();
		newPhone.bell();
		newPhone.sendMessage("\"여보세요, 누구세요?\"");
		newPhone.receiveMessage("\"뚱인데요?\"");
		newPhone.hangUp();
		newPhone.turnOnYoutube();
		newPhone.changeChannelYoutube("두치와뿌꾸");
		newPhone.turnOffYoutube();
		newPhone.powerOff();
	
	}

}
