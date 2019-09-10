package practice.july30th;

import java.util.HashMap;
import java.util.Map;

public class StudentEx {

	public static void main(String[] args) {
		
		Map<Student, String> map = new HashMap<>(); // 인터페이스 Map의 구현객체 HashMap, 앞 < >안의 내용과 뒤 < >안의 내용이 같으면 뒤의 < > 내용 생략 가능
		
		map.put(new Student("1"), "95");
		map.put(new Student("1"), "90");
		
		String score = map.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);
		

	}

}
