package sec01.exam02;

import java.util.HashMap;
import java.util.Map;

public class KeyEx {

	public static void main(String[] args) {
		
		Map<Key, String> map = new HashMap<>();
		map.put(new Key(1), "홍길동");
		map.put(new Key(2), "홍길남");
		map.put(new Key(2), "홍길동");
		System.out.println(map.size());

	}

}
