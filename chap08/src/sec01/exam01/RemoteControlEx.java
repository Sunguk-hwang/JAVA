package sec01.exam01;

public class RemoteControlEx {

	public static void main(String[] args) {
		TV tv = new TV();
		RemoteControl rc = new TV(); // TV 객체를 인터페이스 타입으로 사용하겠다.
		/*
		rc.turnOn();
		rc.turnOff();
		rc.setVolumne(7);
		*/
		
		Audio audio = new Audio();
		rc = audio;
		/*
		rc.turnOn();
		rc.turnOff();
		rc.setVolumne(6);
		*/
		
		use(tv, 100);
		use(audio, 7);
	}

	public static void use(RemoteControl rc, int i) {
		rc.turnOn();
		rc.setVolumne(i);
		rc.turnOff();
	}

}
