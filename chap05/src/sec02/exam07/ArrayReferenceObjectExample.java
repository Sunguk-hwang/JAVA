package sec02.exam07;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// 배열은 배열인데 객체를 참조한다!
		
		String[] strArray1 = new String[3];
		//String[] strArray1 = {null, null, null};
		
		String[] strArray2 = {"Java", "Java", new String("Java")};
		/*String[] strArray2 = new String[3];
		strArray2[0] = "Java";
		strArray2[1] = "Java";
		strArray2[2] = new String("Java");*/
		
		//System.out.println(strArray2==strArray2[0]);
		System.out.println(strArray2[0]==strArray2[1]);
		System.out.println(strArray2[0]==strArray2[2]);
		

	}

}
