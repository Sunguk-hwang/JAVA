//     *     4 1 4
//    ***    3 3 3
//   *****   2 5 2
//  *******  1 7 1
// ********* 0 9 0
//  *******  1 7 1
//   *****   2 5 2
//    ***    3 3 3
//     *     4 1 4
// 위의 모양을 출력하는 코드를 작성하시오.
package practice.july25th;

public class Star {

	public static void main(String[] args) {
		
		for(int p=1; p<=9; p++) { // 큰 for문: 마름모 모양의 행 위치
			if(p<=5) { // 마름모 모양이 줄어들기 직전까지
				for(int q=0; q<(9-(2*p - 1))/2;q++) { // * 왼쪽 빈 칸 
					System.out.print(" ");
				}
				for(int r=0; r<(2*p)-1; r++) { // 가운데 *
					System.out.print("*");
				}
				/*for(int q=0; q<(9-(2*p - 1))/2;q++) { // * 오른쪽 빈 칸
					System.out.print(" ");
				}*/
			}
			else { // 마름모 모양이 줄어들 때
				for(int q=0; q<p-5; q++) { // * 왼쪽 빈 칸
					System.out.print(" ");
				}
				for(int r=0; r<9-2*(p-5); r++) { // 가운데 *
					System.out.print("*");
				}
				/*for(int q=0; q<p-5; q++) { // * 오른쪽 빈 칸
					System.out.print(" ");
				}*/
			}
			System.out.println(); // 행 바꿈
		}
	}
}
