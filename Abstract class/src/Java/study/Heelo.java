package Java.study;

import Java.study.person.NonVegan;
import Java.study.person.Person;
import Java.study.person.Vegan;

public class Heelo {

	public static void main(String[] args) {
		Person john = new Vegan();
		john.speak();
		john.eat();
		System.out.println("****************");
		Person mia = new NonVegan();
		mia.speak();
		mia.eat();

	}

}
