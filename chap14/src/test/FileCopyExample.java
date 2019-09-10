package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyExample {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("D:/JavaProgramming/timetable.jpg");
			os = new FileOutputStream("C:/Users/sundooedu/Downloads/timetable.jpg");
			/*
			byte[] arr = new byte[1000];
			int readByteNum = is.read(arr);
			os.write(arr);

			os.flush();
			 */
			byte[] buffer = new byte[1024];
			while(true) {
				int readByteNum = is.read(buffer);
				if(readByteNum == -1) {
					break;
				}
				os.write(buffer, 0, readByteNum);
			}
			os.flush();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (os != null) {
					os.close();
				}
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
