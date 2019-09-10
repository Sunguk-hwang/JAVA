package sec01.exam01;

import java.io.FileInputStream;

public class ExceptionExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:/Temp/test.data");
		} catch(Exception e) {
			System.out.println("파일 경로가 잘못되었습니다.");
		}
		
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			System.out.println("예외");
		}
		
		// 실행 예외가 발생할 수 있는 코드
		try {
			String str = "1O";
			int value = Integer.parseInt(str);
		} catch(Exception e) {
			System.out.println("숫자만 입력하세요.");
		}
		
		try {
			String str = args[0]; 
		} catch(Exception e) {
			System.out.println("실행 매개값을 주시오.");
		}
		
		try {
			String str = null;
			System.out.println(str.split(" "));
		} catch(Exception e) {
			System.out.println("객체 없음");
		}
	}

}
