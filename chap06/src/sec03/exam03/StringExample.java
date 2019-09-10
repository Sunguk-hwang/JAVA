package sec03.exam03;

public class StringExample {

	public static void main(String[] args) {
		
		String str1 = "AB";
		
		String str2 = new String("AB");
		
		byte[] arr1 = {65, 66};
		String str3 = new String(arr1);
		
		char[] arr2 = {'A', 'B'};
		String str4 = new String(arr2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
