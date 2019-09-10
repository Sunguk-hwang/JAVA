package sec01.exam06;

public class Member implements Comparable<Member> {
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return id;
	}

	@Override
	public int compareTo(Member o) {
		return id.compareTo(o.id);
	}

}
