// 코드파이 3번 문제
// 문자열이 입력되면, 규칙에 따라 바뀐 문자열을 출력하는 소스 코드를 작성하시오.
// 규칙:
// 1) 입력되는 문자열은 영어 대문자로만 이루어진다.
// 2) A -> (BCD)E, ... , V -> (WXY)Z, W -> (XYZ)A, X -> (YZA)B, ... , Z -> (ABC)D
package practice.july25th;

import java.util.Scanner;

public class ChangeChar2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine(); // input에 입력받은 String 저장
		char[] charArr = input.toCharArray(); // input을 String 메소드를 활용해서 char array로 바꿔서 charArr에 저장
		String result = ""; // 결과 저장을 위해 빈 String result 생성

		for (int i = 0; i < input.length(); i++) {
			if (charArr[i] >= 119 && charArr[i] <= 122) {
				charArr[i] -= 22;
			} // W>A, X>B, Y>C, Z>D로 바뀌도록 먼저 조건문
			else if (charArr[i] >= 87 && charArr[i] <= 90) {
				charArr[i] -= 22;
			} // 위의 경우가 아닌 것 중에 w>a, x>b, y>c, z>로 바뀌도록 조건문
			else {
				charArr[i] += 4;
			} // 그 외의 경우는 문제 없으므로 아스키코드 4칸씩 시프트
			result += charArr[i]; // 바뀐 char array를 차례대로 한 요소씩 String result에 저장
		}
		System.out.println(result); // 위에 의해서 바뀐 String result를 출력
	}
}
