package Java.study;

import Java.study.phone.Iphone8;
import Java.study.phone.OnePlus5;
import Java.study.phone.Phone;

public class Hello {

	public static void main(String[] args) {
		Phone phone = new Iphone8();
		System.out.println("Processor: "+phone.processor());
		System.out.println("Space in GB: "+phone.spaceInGB());		
	}

}
