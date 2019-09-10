package sec02.exam02;

public class CatchOrderEx {

	public static void main(String[] args) {
		
		try {
			args = new String[] {"a", "100"};
			
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int result = x + y;
			System.out.println("결과: " + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외 처리 내용");
		} catch(NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		} catch(Exception e) {
			System.out.println("예외 처리 내용");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
