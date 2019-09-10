package sec02.exam05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception {

		PrintStream ps = new PrintStream(new FileOutputStream("D:/JavaProgramming/Stream/printContent.db"));

		ps.print("Hello");
		ps.println("Java");
		ps.println("Hanwha");
		ps.flush();
		ps.close();
		// 행 단위로 읽기 1
		Scanner scanner = new Scanner(new FileInputStream("D:/JavaProgramming/Stream/printContent.db"));
		while (true) {
			if (scanner.hasNext()) {
				String str = scanner.nextLine();
				System.out.println(str);

			} else {
				break;
			}
		}
		scanner.close();
		// 행 단위로 읽기 2
		BufferedReader br = new BufferedReader(new FileReader("D:/JavaProgramming/Stream/printContent.db"));
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		
		
	}

}
