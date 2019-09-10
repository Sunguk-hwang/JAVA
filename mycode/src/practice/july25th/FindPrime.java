// 띄어쓰기로 구분된 두 수를 입력받으면 그 사이에 있는 소수를 찾는 문제
package practice.july25th;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] numArr = input.split(" ");
		int num1 = Integer.parseInt(numArr[0]); // 첫 번째 수
		int num2 = Integer.parseInt(numArr[1]); // 두 번째 수
		for(int i=num1; i<=num2; i++) { // 두 수 사이에서 소수 탐색을 위한 큰 for문
			int j; // 마지막에 i를 하나만 출력하기 위한 키
			for(j=2; j<i; j++) { // 2부터 i-1까지 약수가 하나도 없으면 그 i가 소수 이므로 나머지 판별을 위한 for문
				if(i%j == 0) { // 약수가 발생하면 바로 다음 i를 판별하도록 조건문
					break;
				}
			}
			if(j == i) { // j==i 이면 2부터 i-1까지 약수가 없었다는 뜻이므로 소수! 출력
				System.out.println(i);
			}
		}
	}
}
