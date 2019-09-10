package sec02.exam03;

public class Tire {
	
	public int maxRotation;
	public int accRotation;
	public String location;
	
	public Tire(String str, int num){
		location = str;
		maxRotation = num;
	}
	
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
