package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class CharEncodingExample {

	public static void main(String[] args) throws Exception{
		
		String data1 = "홍길동";
		
		byte[] arr1 = data1.getBytes();
		//System.out.println(arr1.length);
		byte[] arr2 = data1.getBytes("EUC-KR"); // .getBytes(문자셋 이름)
		//System.out.println(arr2.length);
		byte[] arr3 = data1.getBytes("UTF-8");
		//System.out.println(arr3.length);
		
		OutputStream os = new FileOutputStream("D:/JavaProgramming/Stream/charencoding.txt");
		os.write(arr2);
		os.flush();
		os.close();
		
		InputStream is = new FileInputStream("D:/JavaProgramming/Stream/charencoding.txt");
		byte[] buffer = new byte[100];
		int readByteNum = is.read(buffer);
		System.out.println(readByteNum);
		is.close();
		String data2 = new String(buffer, 0, readByteNum, "EUC-KR");
		System.out.println(data2);
		
		Writer writer = new FileWriter("D:/JavaProgramming/Stream/charencoding.txt");
		writer.write("홍길동");
		writer.flush();
		writer.close();
	}

}