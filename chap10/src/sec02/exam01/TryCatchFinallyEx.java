package sec02.exam01;

// java sec02.exam01.TryCatchFinallyEx 10 20

public class TryCatchFinallyEx {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("실행 매개값 두 개 필요");
			System.exit(0);
		}
		
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int result = x + y;
			System.out.println("결과: " + result);
		} catch(Exception e) {
			System.out.println("실행 매개값 숫자 두 개 필요");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
