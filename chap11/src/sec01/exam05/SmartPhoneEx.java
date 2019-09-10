package sec01.exam05;

public class SmartPhoneEx {

	public static void main(String[] args) {
		
		SmartPhone smartphone = new SmartPhone("SAMSUNG", "ANDROID 9");
		System.out.println(smartphone.toString());
		System.out.println(smartphone); // println(객체) : 객체가 그대로 들어오면 자동으로 객체.toString()를 출력한다.
		System.out.println(smartphone + ", 798,000원"); // .toString() 결과를 먼저 받은 후에 뒤의 String과 결합하여 출력한다.
		//SAMSUNG, ANDROID 9

	}

}
