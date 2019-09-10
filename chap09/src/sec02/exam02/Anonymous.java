package sec02.exam02;

public class Anonymous {

	// field
	RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("전원 켜짐");
		}

		@Override
		public void turnOff() {
			System.out.println("전원 꺼짐");
		}

	}; // 인터페이스형 필드

	// constructor

	// method
	void method1() {
		rc.turnOn();
		rc.turnOff();
		
		int volume = 3;

		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("local 전원 켜짐" + volume);
			}

			@Override
			public void turnOff() {
				System.out.println("local 전원 켜짐");
			}
		};
		
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
