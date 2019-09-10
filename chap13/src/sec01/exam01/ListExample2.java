package sec01.exam01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // <String> 붙이면 list에 요소는 String만 오도록 제한 걸었다. 제네릭 타입..포괄적인..
		
		// list에 저장
		list.add("홍길동");
		list.add("홍길동"); // hash 안 붙으면 요소 중복 저장 가능 , 즉 list[0] = "홍길동", list[1] = "홍길동"
		list.add("홍길서");
		
		System.out.println(list.size());
		
		// list에서 불러오기
		String name1 = list.get(0); // 강제 타입 변환 필요 없다. <String> 때문에 애초에 String이다.
		String name2 = list.get(1);
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
		// 제거하기
		list.remove(1);
		list.remove("홍길동");
		list.clear();
	}

}
