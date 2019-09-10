package sec01.exam11;

public class KeyBoardToStringEx {

	public static void main(String[] args) throws Exception {
		
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		
		System.out.println(readByteNo);
		
		System.out.println(bytes[0]);
		System.out.println(bytes[1]);
		System.out.println(bytes[2]);
		System.out.println(bytes[3]);
		System.out.println(bytes[4]);
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
		char[] arr = str.toCharArray();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

	}

}
