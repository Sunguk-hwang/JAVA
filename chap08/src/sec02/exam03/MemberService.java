package sec02.exam03;

public class MemberService {
	//field
	public MemberDao memberDao;
	
	//constructor
	
	//method
	public void join() {
		memberDao.insert();
	}
	
	public void exit() {
		memberDao.delete();
	}
	
	public void info() {
		memberDao.select();
	}
	
	public void modi() {
		memberDao.update();
	}
}
