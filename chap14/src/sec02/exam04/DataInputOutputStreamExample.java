package sec02.exam04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws IOException{
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:/JavaProgramming/Stream/data.db"));
		dos.writeInt(500);
		dos.writeDouble(25.5);
		dos.writeBoolean(true);
		dos.writeUTF("홍길동");
		dos.flush();
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("D:/JavaProgramming/Stream/data.db"));
		int var1 = dis.readInt();
		double var2 = dis.readDouble();
		boolean var3 = dis.readBoolean();
		String var4 = dis.readUTF();
		dis.close();
	}

}
