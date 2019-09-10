package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {

		OutputStream os = null;
		try {
			os = new FileOutputStream("D:/JavaProgramming/test1.db"); // 파일 저장하는 폴더가 있으면 괜찮고, 폴더가 없으면
																		// FileNotFoundException 발생
			byte a = 10;
			byte b = 20;
			byte c = 30;

			os.write(a);
			os.write(b);
			os.write(c);
			os.flush();

		} catch (FileNotFoundException e) {
			System.out.println("저장할 폴더가 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일을 저장할 수 없습니다.");
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
				}
			}
		}

	}

}
