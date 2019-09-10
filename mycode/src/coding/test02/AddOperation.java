package coding.test02;

import java.util.Scanner; //scanner 사용을 위해 추가

public class AddOperation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String numStr = scanner.nextLine();
		int index = Integer.parseInt(numStr); // index는 총 테스트 갯수 및 테스트 케이드 출력에 활용
		
		int[] total = new int[index]; // total은 입력과 출력을 따로 하기 위해 값을 저장하는 공간
		
		for(int i=1; i<=index; i++) {
			String str = scanner.nextLine();
			String[] arr = str.split(" "); // .split(" ")를 통해서 띄어쓰기를 기준으로 두 문자열을 각각 저장
			int num1 = Integer.parseInt(arr[0]); // 첫 번째 숫자 저장
			int num2 = Integer.parseInt(arr[1]); // 두 번째 숫자 저장
			total[i-1] = num1 + num2; // 두 수의 합을 total에 각각 저장
		}
		
		for(int n=0; n<=index - 1; n++) {
			System.out.println("Test #" + (n+1)); // 테스트 케이드 넘버링
			System.out.println(total[n]); // total에서 테스트 케이드에 따른 결과값 차례로 출력 
		}
	}	
}
