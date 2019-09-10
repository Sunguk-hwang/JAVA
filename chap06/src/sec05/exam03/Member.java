package sec05.exam03;

public class Member {
	
	static String nation = "대한민국";
	
	String m_id;
	
	String m_pw;
	
	boolean login(String m_id, String m_pw) {
		if(this.m_id.equals(m_id)) {
			if(this.m_pw.equals(m_pw)){
				return true;
				
			}
		}
		return false;
	}
	//정적 멤버로 내용이 채워진 메소드는 정적 메소드로 선언하자.
	static String getNation() {
		return nation;
	}
	//매개변수 만으로 실행이 되는 메소드는 정적 메소드로 선언하자.
	static int add(int x, int y) {
		return x + y;
	}
}
