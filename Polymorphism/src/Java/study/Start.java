package Java.study;

import Java.study.Phone.Nokia;
import Java.study.Phone.Phone;
import Java.study.Phone.Samsung;

public class Start {

	public static void main(String[] args) {
		
		Phone nokia3310 = new Start().phone(1); 
		System.out.println(nokia3310.getModel());
		nokia3310.features();
		
		
		Phone note8 = new Start().phone(2);
		System.out.println(note8.getModel());
		note8.features();
		
	}
 
	    public Phone phone(int dailyDriver) {
		switch(dailyDriver) {
		case 1: return new Nokia("3310");
		case 2: return new Samsung("Note 10");
		}
		return null;
	}
}
