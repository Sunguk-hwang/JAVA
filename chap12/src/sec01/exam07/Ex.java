package sec01.exam07;

public class Ex {

	public static void main(String[] args) {

		Calc shareCalc = new Calc(); // 공유 객체

		User1 user1 = new User1(); // User1(Thread) 생성

		user1.setCalc(shareCalc);
		user1.start();

		User2 user2 = new User2(); // User1(Thread) 생성

		user2.setCalc(shareCalc);
		user2.start();

	}

}
