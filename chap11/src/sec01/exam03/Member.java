package sec01.exam03;

public class Member {
	// field
	private String id;

	// constructor
	public Member(String id) {
		this.id = id;
	}

	// method
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;

	}

}
