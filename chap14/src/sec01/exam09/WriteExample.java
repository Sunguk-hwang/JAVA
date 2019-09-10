package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/JavaProgramming/test9.txt");
		
		String str = "ABCDE";
		writer.write(str, 1 ,3);
		writer.flush();
		writer.close();
		
	}

}
