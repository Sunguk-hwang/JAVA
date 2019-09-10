package sec02.exam03;

import java.io.IOException;

public class ThrowsEx {

	public static void main(String[] args) throws IOException { // 예외를 JVM으로(호출한 곳으로) 짬처리 시킨다.

		// try {
		System.out.print("input: ");
		int keyCode = System.in.read();
		System.out.print("keyCode: ");
		System.out.println(keyCode);
		/*
		 * } catch(IOException e) { System.out.println("입출력 오류 처리"); }
		 */
		try {
			method1();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없습니다.");
		}

	}

	public static void method1() throws ClassNotFoundException {
		// try {
		Class.forName("sec02.exam03.ThrowsEx"); // Class의 번지를 return한다.
		System.out.println("클래스가 존재합니다.");
		/*
		 * } catch (ClassNotFoundException e) { System.out.println("클래스가 없습니다."); }
		 */
	}

}
