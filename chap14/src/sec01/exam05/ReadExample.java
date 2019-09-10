package sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:/JavaProgramming/test2.db");
		/*
		byte[] buffer = new byte[100];
		int readByteNum = is.read(buffer);
		for(int i=0; i<readByteNum; i++) {
			System.out.println(buffer[i]);
		}
		*/
		
		byte[] buffer = new byte[100];
		/*
		while(true) {
			int readByteNum = is.read(buffer);
			
			if(readByteNum == -1) {
				break;
			}
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		*/
		
		int readByteNum;
		while((readByteNum = is.read(buffer)) != -1) {
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
	}

}
