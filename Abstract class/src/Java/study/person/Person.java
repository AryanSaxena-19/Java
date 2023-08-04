package Java.study.person;

public abstract class Person implements IsAlive,LiveLife {
	
	public void speak() {
		System.out.println("Share his/her thoughts.");
	}
	
	public abstract void eat();

}
