package sec01.exam04;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonExample {

	public static void main(String[] args) {
		
		Set<Person> set = new TreeSet<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				/*
				if (o1.age < o2.age) {
					return -1;
				} else if(o1.age == 02.age) {
					return 0;
				} else {
					return 1;
				}
				*/
				return Integer.compare(o1.age, o2.age);
			}
		});
		
		set.add(new Person("홍길동", 25, 170.5));
		set.add(new Person("홍길서", 20, 170.5));
		set.add(new Person("홍길남", 27, 170.5));
		set.add(new Person("홍길북", 23, 170.5));
		
		for (Person p : set) {
			System.out.println(p);
		}

	}

}
