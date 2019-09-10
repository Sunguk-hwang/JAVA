package sec01.exam25;

public class ValueCompareEx {

	public static void main(String[] args) {
		
		int num = 1000000; // 기본타입과의 비교는 상관 무
		Integer obj1 = num;
		if(obj1 == num) {
			System.out.println("값이 " + num + "으로 같다.");
		} else {
			System.out.println("값이 " + num + "과 다르다.");
		}
		
		Integer obj2 = 127; // p.503 자동 박싱언박싱 유효값에 따라 같은 객체 or 다른 객체 결과가 다르다.
		Integer obj3 = 127;
		if(obj2 == obj3) {
			System.out.println("같은 객체를 참조한다.");
			System.out.println(obj2 + " " + obj3);
		} else {
			System.out.println("다른 객체를 참조한다.");
			System.out.println(obj2 + " " + obj3);
		}

	}

}
