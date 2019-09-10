package sec02.exam03;

public class MySQLMemberDao implements MemberDao {

	@Override
	public void insert() {
		System.out.println("MySQL에 회원 정보 저장");
	}

	@Override
	public void select() {
		System.out.println("MySQL에서 회원 정보 가져옴");
	}

	@Override
	public void update() {
		System.out.println("MySQL에서 회원 정보 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySQL에서 회원 정보 삭제");
	}

}
