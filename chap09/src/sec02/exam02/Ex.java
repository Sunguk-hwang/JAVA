package sec02.exam02;

public class Ex {

	public static void main(String[] args) {
		
		Anonymous obj = new Anonymous();
		obj.method1();
		System.out.println();
		
		obj.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("전원 ON");
			}

			@Override
			public void turnOff() {
				System.out.println("전원 OFF");
			}
			
		});
		
		obj.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("POWER ON");
			}

			@Override
			public void turnOff() {
				System.out.println("POWER OFF");
			}
			
		});

	}

}
