package sec02.exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NoBufferedStreamExample {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("D:\\JavaProgramming\\Stream\\timetable.jpg");
		OutputStream os = new FileOutputStream("D:\\JavaProgramming\\Stream\\timetable2.jpg");
		
		long startTime = System.nanoTime();
		while(true) {
			int data = is.read();
			if(data == -1) {
				break;
			}
			os.write(data);
		}
		os.flush();
		
		long endTime = System.nanoTime();
		
		os.close();
		is.close();
		
		long time = endTime - startTime;
		System.out.println("걸린 시간: " + time + "ns");
	}

}
