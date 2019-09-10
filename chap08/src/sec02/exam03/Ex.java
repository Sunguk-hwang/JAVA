package sec02.exam03;

public class Ex {

	public static void main(String[] args) {
		
		MemberService memberservice = new MemberService();
		// memberservice.join(); : nullPointerException 발생
		
		memberservice.memberDao = new OracleMemberDao();
		memberservice.join();
		memberservice.info();
		memberservice.modi();
		memberservice.exit();
		
		System.out.println();
		
		memberservice.memberDao = new MySQLMemberDao();
		memberservice.join();
		memberservice.info();
		memberservice.modi();
		memberservice.exit();
		
		System.out.println();
		
		print(new OracleMemberDao());

	}
	
	public static void print(MemberDao memberDao) {
		memberDao.insert();
		memberDao.delete();
		memberDao.select();
		memberDao.update();
	}

}
