package sec01.exam01;

public class Audio implements RemoteControl {
	 // Audio에서는 RemoteControl을 통해서 다음 메소드들이 실행되야한다.
	
	@Override
	public void turnOn() {
		System.out.println("Audio on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio off");
	}

	@Override
	public void setVolumne(int volume) {
		System.out.println("Audio 볼륨 설정: "+volume);
	}
	

}
