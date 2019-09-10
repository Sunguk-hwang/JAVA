package sec01.exam05;

public class Outter {
	
	//field
	String field = "Outter-field";
	
	//constructor
	
	//method
	void method() {
		System.out.println("Outter-method");
	}
	
	//nested class
	class Nested{
		//field
		String field = "Nested-field";
		
		//constructor
		
		//method
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(field);
			System.out.println(this.field);
			System.out.println(Outter.this.field);
			System.out.println();
			
			method();
			this.method();
			Outter.this.method();
		}
	}

}
