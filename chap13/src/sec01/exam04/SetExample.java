package sec01.exam04;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		set.add("홍길동");
		set.add("홍길서");
		set.add("홍길남");
		set.add("홍길북");
		set.add("홍길동");
		System.out.println(set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
			// iterator.remove(); // iterator로 set에서 가져온 객체를 set에서 제거한다.
		}
		System.out.println(set.size());
		
		for(String str : set) {
			System.out.println(str);
			// set.remove(str); ConcurrnetModificationException 발생
		}
		
		set.clear();
		if(set.isEmpty()){
			System.out.println("Set이 완전 비었습니다.");
		}

	}

}
