package sec01.exam01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		// list에 저장
		list.add("홍길동");
		list.add("홍길동"); // hash 안 붙으면 요소 중복 저장 가능 , 즉 list[0] = "홍길동", list[1] = "홍길동"
		list.add(10); // 자동 박싱 int>>Integer
		list.add(new Date());
		System.out.println(list.size());
		
		// list에서 불러오기
		String name = (String) list.get(0); // list.get(index)로 Object 객체를 리턴하므로 강제 타입변환을 해서 원하는 타입으로 저장
		int age = (Integer) list.get(1); // 자동 언박싱 Integer>>int
		Date date = (Date) list.get(2);
		
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			if(obj instanceof String) {
				String name2 = (String) list.get(i);
			} else if(obj instanceof Integer) {
				Integer age2 = (Integer) list.get(i);
			} else if(obj instanceof Date) {
				Date date2 = (Date) list.get(i);
			}
		}
	}

}
