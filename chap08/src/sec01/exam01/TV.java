package sec01.exam01;

public class TV implements RemoteControl {
	 // TV에서는 RemoteControl을 통해서 다음 메소드들이 실행되야한다.
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV off");
	}

	@Override
	public void setVolumne(int volume) {
		if(RemoteControl.MAX_VOLUME < volume) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(RemoteControl.MIN_VOLUME > volume) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("TV 볼륨 설정: "+ this.volume);
	}
	

}
