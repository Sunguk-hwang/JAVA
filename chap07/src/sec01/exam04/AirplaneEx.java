package sec01.exam04;

public class AirplaneEx {
	public static void main(String[] args) {
		SuperSonic sonic = new SuperSonic();
		sonic.departing();
		sonic.flying();
		sonic.flymode = SuperSonic.SUPERSONIC;
		sonic.flying();
		sonic.flymode = SuperSonic.NORMAL;
		sonic.flying();
		sonic.landing();
		
	}

}
