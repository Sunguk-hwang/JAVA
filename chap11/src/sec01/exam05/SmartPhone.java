package sec01.exam05;

public class SmartPhone {
	
	//field
	private String company;
	private String os;
	
	//constructor
	public SmartPhone(String company, String os){
		this.company = company;
		this.os = os;
	}
	
	//method
	@Override
	public String toString() {
		return company + ", " + os;
	}
	

}
