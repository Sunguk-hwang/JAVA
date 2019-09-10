package sec01.exam06;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("D:/JavaProgramming/Stream/test3.db");
		byte[] buffer = new byte[5];
		int readByteNum = is.read(buffer, 1, 3);
		if(readByteNum != -1) {
			System.out.println(readByteNum);
		}
		for(int i=0; i<buffer.length; i++) {
			System.out.println(buffer[i]);
		}
		
	}

}
