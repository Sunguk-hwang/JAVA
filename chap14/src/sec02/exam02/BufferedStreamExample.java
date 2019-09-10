package sec02.exam02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamExample {

	public static void main(String[] args) throws Exception{
		BufferedInputStream is = new BufferedInputStream(new FileInputStream("D:\\JavaProgramming\\Stream\\timetable.jpg"));
		BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("D:\\JavaProgramming\\Stream\\timetable3.jpg"));
		
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
