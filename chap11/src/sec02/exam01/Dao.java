package sec02.exam01;

import java.util.Date;

public class Dao {
	
	
	void insert(String title, String content, String writer, Date writeDate) {
		// 데이터베이스에 매개값을 저장하는 코드
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
		System.out.println(writeDate);
	}
	
	void insert(Board board) {
		// 데이터베이스에 매개값을 저장하는 코드
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
		System.out.println(board.getWriter());
		System.out.println(board.getWriteDate());
	}
	
	Board select() {
		// 데이터베이스에서 게시물 정보를 가져오는 코드
		Board board = new Board();
		board.setTitle("제목1");
		board.setContent("내용1");
		board.setWritter("홍길동");
		board.setWriteDate(new Date());
		return board;
	}

}
