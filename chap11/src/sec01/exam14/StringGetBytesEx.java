package sec01.exam14;

import java.io.UnsupportedEncodingException;

public class StringGetBytesEx {

	public static void main(String[] args) {
		
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1);
		System.out.println(bytes1.length);
		String str1 = new String(bytes1);
		System.out.println(str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2);
			System.out.println(bytes2.length);
			String str2 = new String(bytes2);
			System.out.println(str2);
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
