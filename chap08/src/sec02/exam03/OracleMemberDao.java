package sec02.exam03;

public class OracleMemberDao implements MemberDao {

	@Override
	public void insert() {
		System.out.println("오라클에 회원 정보 저장");
	}

	@Override
	public void select() {
		System.out.println("오라클에서 회원 정보 가져옴");
	}

	@Override
	public void update() {
		System.out.println("오라클에서 회원 정보 수정");
	}

	@Override
	public void delete() {
		System.out.println("오라클에서 회원 정보 삭제");
	}

}
