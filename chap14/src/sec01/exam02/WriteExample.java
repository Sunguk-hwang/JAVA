package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("D:/JavaProgramming/test2.db"); // 바이너리 파일이라고 한다.
		
		byte[] arr = {10, 20, 30};
		
		os.write(arr);
		os.flush();
		
		os.close();

	}

}
