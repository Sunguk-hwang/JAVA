package sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex {

	public static void main(String[] args) {
		
		Service service = new Service();
		
		Board board = new Board();
		board.setTitle("제목2");
		board.setContent("내용2");
		board.setWritter("홍길서");
		board.setWriteDate(new Date());
		
		// Ex -> Service -> Dao (매개값으로 전달)
		service.writeBoard(board);

		System.out.println();
		// Ex <- Service <- Dao (리턴값으로 받음)
		Board board2 = service.getBoard();
		
		System.out.println(board2.getTitle());
		System.out.println(board2.getContent());
		System.out.println(board2.getWriter());
		//System.out.println(board2.getWriteDate()/*.toString()*/);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분 ss초");
		String strDate = sdf.format(board2.getWriteDate());
		System.out.println(strDate);
		
		
	}

}
