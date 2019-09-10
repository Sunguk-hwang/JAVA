package sec01.exam01;

public class Member {
	//field
	private String id;
	
	//constructor
	public Member(String id) {
		this.id = id;
	}
	
	//method
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
			else {
				return false;
			}
		} else {
			return false;
		}
	}

}
