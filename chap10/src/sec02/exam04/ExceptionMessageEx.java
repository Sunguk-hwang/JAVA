package sec02.exam04;

public class ExceptionMessageEx {

	public static void main(String[] args) {
		
		try {
			String str = null;
			int result = str.length() + 4; // NullPointerException은 보통 .에서 발생한다.
		} catch(Exception e) {
			System.out.println(e.getMessage()); // 예외 처리는 아니고 예외 내용만 알아보는 코드
			System.out.println(e.toString()); // 예외 처리는 아니고 예외 내용만 알아보는 코드
		
			e.printStackTrace(); // 예외 발생 추적 , 예외 처리는 아니고 예외 내용만 알아보는 코드
		}

	}

}
