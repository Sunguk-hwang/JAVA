package sec01.exam05;

public class Ex {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	
	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		} else {
			System.out.println("변환 불가");
		}
		
		try {
			Dog dog = (Dog) animal;
		} catch(Exception e){
			System.out.println("변환 불가");
		}
		
	}

}
