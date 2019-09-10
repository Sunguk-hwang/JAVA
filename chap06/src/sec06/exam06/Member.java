package sec06.exam06;

public class Member {
	private String mid;
	private String nation = "대한민국";
	
	public void setMid(String mid) { // field의 값을 바꾸는 메소드 : setter
		if(mid.length() >= 8) {
			this.mid = mid;
			//System.out.println(this.mid);
		}
		else {
			System.out.println("!! 8자리 미만 입력 !!");
		}
	}
	
	public String getMid() {
		String subMid = mid.substring(0, 5);
		for(int i=5; i<mid.length(); i++) {
			subMid += "*";
		}
		return subMid;
	}
	
	public String getNation() {
		return nation;
	}
}
