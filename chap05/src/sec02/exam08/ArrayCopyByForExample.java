package sec02.exam08;

import java.util.Arrays;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		/* 배열의 특징
		 1) 생성하고 나면 길이를 변경할 수 없다.
		 2) 배열의 요소는 모두 같은 타입니다.
		 */
		
		// 배열 확장 해보자
		
		int[] oldArray = {1, 2, 3};
		
		// 1번: 변경할 길이만큼 새로운 배열 생성
		int[] newArray = new int[oldArray.length + 2];
		
		// 2번: 기존 배열의 요소 복사
		for(int i=0; i<oldArray.length; i++) {
			
			newArray[i] = oldArray[i];
		}
		
		System.out.println(Arrays.toString(newArray));
	}
}
