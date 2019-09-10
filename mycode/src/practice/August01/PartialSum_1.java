// 문제 : 10,000 이하의 자연수로 이루어진 길이 N짜리 수열이 주어진다. 이 수열에서 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이를 구하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 N (10 ≤ N < 100,000)과 S (0 < S ≤ 100,000,000)가 주어진다. 둘째 줄에는 수열이 주어진다. 수열의 각 원소는 공백으로 구분되어져 있으며, 10,000이하의 자연수이다.
// 출력 : 첫째 줄에 구하고자 하는 최소의 길이를 출력한다. 만일 그러한 합을 만드는 것이 불가능하다면 0을 출력하면 된다.

package practice.August01;

import java.util.Scanner;

public class PartialSum_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		int n = scanner.nextInt(); // 수열의 개수 입력
		int s = scanner.nextInt(); // 연속된 수들의 부분합과 비교할 수 입력
		scanner.nextLine();
		int[] arr1 = new int[n]; // 수열 입력받을 빈 배열
		int[] arr2 = new int[n]; // 입력된 수열의 연속된 부분합이 조건에 맞으면 그 개수를 세서 차례로 저장
		int check = 0;
		for (int p = 0; p < n; p++) { // 수열 입력
			arr1[p] = scanner.nextInt();
		}
		scanner.nextLine();

		for (int q = 0; q < n; q++) { // 부분합 비교를 위한 for문
			int sum = 0; // 부분합, q가 바뀔 때마다 초기화
			int count = 0; // 조건을 만족하는 연속된 수열의 개수, 조건을 만족하지 않으면 그대로 0, q가 바뀔 때마다 초기화
			for (int r = q; r < n; r++) {
				sum += arr1[r]; // q부터 차례대로 한개씩 합하고
				if (sum >= s) { // 그 합이 비교값 이상이 되면
					count = r - q + 1; // 그 때 연속된 수열의 개수를 저장하고
					break; // 중첩 for문을 종료하고 다음 q에 대해서 같은 작업 진행
				}
			}
			arr2[q] = count; // 개수를 따로 저장
		}
		for (int l = 0; l < n - 1; l++) { // 그 개수들을 내림차순으로 정렬
			for (int m = l; m < n; m++) {
				int temp = arr2[l];
				if (arr2[l] > arr2[m]) {
					arr2[l] = arr2[m];
					arr2[m] = temp;
				}
			}
		}
		for (int k : arr2) { // 다 0인지 아닌지 check로 확인
			check += k;
		}
		if(check == 0) { // check가 0이면 모든 연속한 부분합이 조건을 만족하지 않았다는 것이므로 0을 출력
			System.out.println(0);
		} else { // 그렇지 않다면 개수를 저장해둔, 내림차순으로 정렬한 배열에서 0이 아닌 값 중 가장 작은 값을 출력하고 for문 탈출 
			for(int k : arr2) {
				if(k != 0) {
					System.out.println(k);
					break;
				}
			}
		}

	}

}
