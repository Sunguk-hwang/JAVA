package sec02.exam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/JavaProgramming/Stream/object.db"));
		
		Board board = new Board(1, "제목1", "내용1");
		oos.writeObject(board);
		oos.flush();
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/JavaProgramming/Stream/object.db"));
		Board board2 = (Board) ois.readObject();
		System.out.println(board2.getB_no());
		System.out.println(board2.getTitle());
		System.out.println(board2.getContent());
	}

}
