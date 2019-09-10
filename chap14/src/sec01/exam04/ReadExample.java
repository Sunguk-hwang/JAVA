package sec01.exam04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		InputStream is = null;
		try {
			is = new FileInputStream("D:/JavaProgramming/test1.db"); // test1.db가 없을 때 FileNotFoundException
																					// 발생
			/*
			 * int i1 = is.read();
			 * System.out.println("i1 = " + i1);
			 * int i2 = is.read();
			 * System.out.println("i2 = " + i2);
			 * int i3 = is.read();
			 * System.out.println("i3 = " + i3);
			 * int i4 = is.read();
			 * System.out.println("i4 = " + i4); // 읽을 데이터가 없으면 -1 나온다.
			 */
			/*
			while(true) {
				int data = is.read();
				if (data == -1) {
					break;
				}
				System.out.println(data);
			}
			*/
			int data;
			while((data = is.read()) != -1) {
				System.out.println(data);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없거나, 파일의 경로가 올바르지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch(IOException e) {
				}
			}
		}

	}

}
