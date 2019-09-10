package sec02.exam03;

public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.fL = new Tire("front&Left", 6);
		car.fR = new Tire("front&Right", 2);
		car.bL = new Tire("back&Left", 3);
		car.bR = new Tire("back&Right", 4);
		
		for(int i=1; i<=6; i++) {
			int problem = car.run();
			
			switch(problem) {
				case 1:
					System.out.println("운전석 바퀴 펑크, Hankook타이어로 교체");
					car.fL = new Tire_Hankook("front&left", 15);
					break;
				case 2:
					System.out.println("보조석 바퀴 펑크, Hankook타이어로 교체");
					car.fR = new Tire_Hankook("front&right", 13);
					break;
				case 3:
					System.out.println("운전석 뒷자리 바퀴 펑크, Kumho타이어로 교체");
					car.bL = new Tire_Kumho("back&left", 14);
					break;
				case 4:
					System.out.println("보조석 뒷자리 바퀴 펑크, Kumho타이어로 교체");
					car.bR = new Tire_Kumho("back&right", 17);
					break;

			}
			System.out.println("--------"+"전체 타이어" + i + "회 회전 중"+"--------");
		}
	}

}
