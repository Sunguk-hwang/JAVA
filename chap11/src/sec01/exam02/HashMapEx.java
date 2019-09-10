package sec01.exam02;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("도시", "서울");
		map.put(new String("도시"), "부산"); // 같은 키가 두 번 저장되었다. 그래서 도시 키의 키 값으로 "부산"이 "서울"을 덮어쓴다.
		System.out.println(map.size());
		System.out.println(map.get("이름"));
		System.out.println(map.get("도시"));
		System.out.println();
		
		System.out.println("도시" == new String("도시")); // 번지 비교: false
		System.out.println();
		
		System.out.println("도시".hashCode());
		System.out.println(new String("도시").hashCode()); // 해쉬 코드는 같다.
		System.out.println("도시".equals(new String("도시"))); // 내부 문자열이 같으니까 true

	}

}
