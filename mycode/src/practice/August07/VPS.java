/*괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다.
 * 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다.
 * 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다.
 * 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다.
 * 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 
 * 여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다. 
 * 
 * 입력
 * 입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다.
 * 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다.
 * 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다.
 * 하나의 괄호 문자열의 길이는 2 이상 50 이하이다. 
 * 
 * 출력
 * 출력은 표준 출력을 사용한다.
 * 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다. 
 * 
 * 입력 예제
 * 6
 * (())())
 * (((()())()
 * (()())((()))
 * ((()()(()))(((())))()
 * ()()()()(()()())()
 * (()((())()(
 * 
 * 출력 예제
 * NO
 * NO
 * YES
 * NO
 * YES
 * NO
*/
package practice.August07;

import java.util.*;

public class VPS {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // testcase 개수 입력
		sc.nextLine();
		for (int p = 0; p < t; p++) { // testcase만큼 반복 
			String s = sc.nextLine(); // 괄호 문자열 입력
			int n = s.length();
			int count = 0; // VPS인지 판별하기 위한 count
			for (int q = 0; q < n; q++) { // 입력받은 문자열을 처음부터 끝까지 체크
				if (s.charAt(q) == '(') { // 만약 '('이면 카운트 +1 
					count++;
				} else { // ')'이면 카운트 -1
					count--;
				}
				if (count < 0) { // 위의 두 경우에 의한 count가 음수가 되면 더 판단할 것 없이 VPS가 아니므로 break 
					break;
				}
			}
			if (count == 0) { // 위의 반복문에 의해서 VPS라면 count가 0이므로
				System.out.println("YES"); // YES 출력
			} else { // 0이 아니면(-1일 수도 있고, 양의 정수일 수도 있다.)
				System.out.println("NO"); // NO 출력
			}
		}
	}
}