package verify.q110103;

import java.util.HashMap;
import java.util.Map;

public class StudentEx {

	public static void main(String[] args) {
		
		Map<Student, String> map = new HashMap<>();
		
		map.put(new Student("1"), "95");
		map.put(new Student("1"), "90");
		
		String score = map.get(new Student("1"));
		System.out.println("1번 학생 점수: " + score);

	}

}
