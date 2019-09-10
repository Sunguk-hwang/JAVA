package sec04.exam00;

public class MethodCallExample {

	public static void main(String[] args) {
		
		String data = "abc";
		
		char charData1 = data.charAt(0);
		boolean boolData1 = data.contains("ab");
		byte[] arrData1 = data.getBytes();
		
		System.out.println(charData1);
		System.out.println(boolData1);
		System.out.println(arrData1);

	}

}
