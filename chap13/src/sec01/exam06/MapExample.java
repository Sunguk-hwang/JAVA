package sec01.exam06;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>(); // HashMap, HashTable, TreeMap 올 수 있다.

		map.put(40, "홍길동");
		map.put(15, "홍길서");
		map.put(10, "홍길남");
		map.put(30, "홍길북");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		/*
		 * for(int key : map.keySet()) { String value = map.get(key);
		 * System.out.println(key + " : " + value); }
		 * 
		 * for(String value : map.values()) { System.out.println(value); }
		 * 
		 * map.remove(12); System.out.println(map.size());
		 * 
		 * map.clear(); System.out.println(map.size());
		 */
	}

}
