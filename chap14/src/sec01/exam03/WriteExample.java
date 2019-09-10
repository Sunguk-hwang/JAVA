package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("D:/JavaProgramming/test3.db"); // 바이너리 파일이라고 한다.
		
		byte[] arr = {10, 20, 30, 40, 50};
		
		os.write(arr, 1, 3);
		os.flush();
		
		os.close();

	}

}
