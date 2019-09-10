package verify.q110104;

public class Member {
	private String id;
	private String name;
	
	public Member(String str1, String str2) {
		id = str1;
		name = str2;
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}

}
