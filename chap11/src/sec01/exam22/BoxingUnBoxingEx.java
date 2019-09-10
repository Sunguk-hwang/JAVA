package sec01.exam22;

import java.util.HashMap;
import java.util.Map;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		
		Integer obj1 = 10;
		int value1 = obj1;
		System.out.println(value1);
		
		Double obj2 = 10.5;
		double value2 = obj2;
		System.out.println(value2);
		
		Map<Integer, String> map = new HashMap<>(); // 객체만 넣을 수 있으므로 Wrapper클래스를 활용하면 된다.
		map.put(new Integer(1), "홍길동");
		map.put(1, "홍길서");
		System.out.println(map.size());

	}

}
