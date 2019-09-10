package sec01.exam03;

import java.util.HashMap;
import java.util.Map;

public class MemberEx {

	public static void main(String[] args) {
		
		Map<Member, String> map = new HashMap<>();
		map.put(new Member("user1"), "홍길동");
		map.put(new Member("user2"), "홍길남");
		map.put(new Member("user2"), "홍길동");
		System.out.println(map.size());

	}

}
