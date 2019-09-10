package sec01.exam04;

import java.util.Date;

public class ToStringEx {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		System.out.println(obj1.toString()); // Object타입 + @ + hashcode16진수
		
		String obj2 = "ABC";
		System.out.println(obj2.toString());
		
		Date obj3 = new Date();
		System.out.println(obj3.toString());

	}

}
