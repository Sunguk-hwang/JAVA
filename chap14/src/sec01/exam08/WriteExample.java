package sec01.exam08;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {

		Writer writer = null;
		try {
			writer = new FileWriter("D:/JavaProgramming/test7.txt"); // 파일 저장하는 폴더가 있으면 괜찮고, 폴더가 없으면
																		// FileNotFoundException 발생
			char a = 'A';
			char b = 'B';
			byte c = 'C';
			
			writer.write(a);
			writer.write(b);
			writer.write(c);

			writer.flush();
		} catch (FileNotFoundException e) {
			System.out.println("저장할 폴더가 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일을 저장할 수 없습니다.");
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
				}
			}
		}

	}

}
