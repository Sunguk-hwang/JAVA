package sec02.exam03;

public class Car {
	
	Tire fL;
	Tire fR;
	Tire bL;
	Tire bR;
	
	int run() {
		System.out.println("주행 중");
		if(fL.roll() == false)
		{
			stop();
			return 1;
		}
		if(fR.roll() == false)
		{
			stop();
			return 2;
		}
		if(bL.roll() == false)
		{
			stop();
			return 3;
		}
		if(bR.roll() == false)
		{
			stop();
			return 4;
		}
		return 5;
		
	}
	
	void stop() {
		System.out.println("주행 종료");
	}

}
