package sec03.exam02;

public class Ex {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		Animal animal =  cat;
		animal.sound();
		animal = dog;
		animal.sound();
		
		
	}

	public static void method(Animal animal) {
		animal.sound();
	}
}
