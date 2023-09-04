package Java.study;

public class Demo {
	
	
	
	public static void main(String[]args) {
		
		
		Learning learn = Learning.COREJAVA;
		switch(learn) {
		case COLLECTION:
			System.out.println("Step 2: Learning Collection Framework");
			break;
		case COREJAVA:
			System.out.println("Step 1: Learning Core Java");
			break;
		case GENERIC:
			System.out.println("Step 3: Learning Generics");
	 		break;
		case JSPANDASERVLETS:
			System.out.println("Step 4: Learning JSP and Servlets");
			break;
		case MULTITHREADING:
			System.out.println("Step 5: Learning Multithreading");
			break;
		default:
			System.out.println("Element not in the enumarated list");
			break;
		
		
		}
	}
}