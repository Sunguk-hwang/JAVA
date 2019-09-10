package sec01.exam04;

import java.util.HashSet;
import java.util.Set;

public class MemberExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("user1"));
		set.add(new Member("user1"));
		System.out.println(set.size());
		System.out.println(new Member("user2"));
	}

}
