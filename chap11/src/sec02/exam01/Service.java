package sec02.exam01;

import java.util.Date;

public class Service {
	Dao dao = new Dao();
	
	void writeBoard(String title, String content, String writer, Date writeDate) {
		dao.insert(title, content, writer, writeDate);
	}
	
	void writeBoard(Board board) {
		dao.insert(board); // Service --> Dao
	}
	
	Board getBoard() {
		Board board = dao.select(); // Service <-- Dao
		return board;
	}
}
