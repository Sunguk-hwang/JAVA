package sec01.exam08;

public class ClassEx {

	public static void main(String[] args) throws Exception {
		
		Class clazz1 = Class.forName("sec01.exam08.ClassEx");
		Class clazz2 = ClassEx.class;
		
		ClassEx obj = new ClassEx();
		Class clazz3 = obj.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());

	}

}
