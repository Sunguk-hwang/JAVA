package sec01.exam01;

public class MemberExample {

	public static void main(String[] args) {
		
		Member m1 = new Member("user1");
		Member m2 = new Member("user1");
		
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2)); // 재정의 안했으므로 object의 equals
		
	}

}
