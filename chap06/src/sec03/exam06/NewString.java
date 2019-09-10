package sec03.exam06;

public class NewString {
	
	String data;
	
	NewString(String str){
		data = str;
	}
	
	NewString(byte[] arr){
		data = new String(arr);
	}
	
	NewString(char[] arr){
		data = new String(arr);
	}
	
	NewString(String str1, String str2){
		data = "";
		for(int i=0; i<str1.split(str2).length; i++) {
			data += str1.split(str2)[i];
		}
	}

}
