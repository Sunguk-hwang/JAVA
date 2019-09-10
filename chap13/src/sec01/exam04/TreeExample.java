package sec01.exam04;

import java.util.Set;
import java.util.TreeSet;

public class TreeExample {

	public static void main(String[] args) {
		Set<Member> set = new TreeSet<>(); // 대소 비교 가능한 객체만 저장
		set.add(new Member("user1"));
		set.add(new Member("user2"));
		set.add(new Member("user3"));
		set.add(new Member("user4"));
		set.add(new Member("user5"));
		System.out.println(set.size());
		
		for(Member member : set) {
			System.out.println(member);
		}
	}

}
