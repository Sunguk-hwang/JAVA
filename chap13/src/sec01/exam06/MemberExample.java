package sec01.exam06;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MemberExample {

	public static void main(String[] args) {
		
		Map<Member, String> map = new HashMap<>(); // HashMap, HashTable, TreeMap 올 수 있다.
		
		map.put(new Member("user1"), "홍길동");
		map.put(new Member("user2"), "홍길서");
		map.put(new Member("user1"), "홍길남");
		
		System.out.println(map.size());
		
	}

}
