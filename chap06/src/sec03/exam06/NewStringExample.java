package sec03.exam06;

public class NewStringExample {

	public static void main(String[] args) {
		
		NewString str1 = new NewString("AB");
		NewString str2 = new NewString(new byte[] {65, 66, 67, 68});
		NewString str3 = new NewString(new char[] {'A', 'B'});
		NewString str4 = new NewString("A,B,C,D", ",");
		System.out.println(str1.data);
		System.out.println(str2.data);
		System.out.println(str3.data);
		System.out.println(str4.data);
	}

}



