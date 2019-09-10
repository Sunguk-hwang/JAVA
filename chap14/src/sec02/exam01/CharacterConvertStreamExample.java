package sec02.exam01;

import java.io.*;

public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("D:/JavaProgramming/Stream/CharacterConvertStreamExample.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os, "EUC-KR");

		String data = "홍길동";
		osw.write(data);

		osw.flush();
		osw.close();
		
		
		InputStream is = new FileInputStream("D:/JavaProgramming/Stream/CharacterConvertStreamExample.txt");
		InputStreamReader isr = new InputStreamReader(is, "EUC-KR");
		while(true) {
			int num = isr.read();
			if(num == -1) {
				break;
			}
			System.out.print((char)num);
		}

	}

}
