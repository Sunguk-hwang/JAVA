package sec01.exam02;

public class HashCodeEx {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		System.out.println(obj1.hashCode());
		
		Object obj2 = new Object();
		System.out.println(obj2.hashCode());
		
		Object obj3 = obj1;
		System.out.println(obj3.hashCode());

	}

}
