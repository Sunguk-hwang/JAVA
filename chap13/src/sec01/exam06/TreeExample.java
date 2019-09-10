package sec01.exam06;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>(); // HashMap, HashTable, TreeMap 올 수 있다.
		
		map.put("a", "홍길동");
		map.put("d", "홍길서");
		map.put("b", "홍길남");
		map.put("c", "홍길북");
			
		for(Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		Map<Member, String> map2 = new TreeMap<>();
		map2.put(new Member("user2"), "홍길동");
		map2.put(new Member("user3"), "홍길서");
		map2.put(new Member("user1"), "홍길남");
		
		for(Entry<Member, String> entry : map2.entrySet()) {
			Member key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		Map<Person, Integer> map3 = new TreeMap<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return -1*Double.compare(o1.tall, o2.tall);
			}
			
		});
		map3.put(new Person("홍길동", 25, 165), 80);
		map3.put(new Person("홍길동", 27, 170), 90);
		map3.put(new Person("홍길동", 23, 175), 70);
		
		for(Entry<Person, Integer> entry : map3.entrySet()) {
			Person key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
	}

}
