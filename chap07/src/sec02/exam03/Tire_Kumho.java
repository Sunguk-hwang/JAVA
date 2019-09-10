package sec02.exam03;

public class Tire_Kumho extends Tire {
	
	public Tire_Kumho(String str, int num) {
		super(str, num);
	}
	
	@Override
	public boolean roll() {
		accRotation += 1;
		if (accRotation < maxRotation) {
			System.out.println(location + "타이어 " + "남은 회전수: " + (maxRotation - accRotation));
			return true;
		}
		else {
			System.out.println(location + "타이어 펑크! 최대 회전수 도달");
			return false;
		}
	}

}
