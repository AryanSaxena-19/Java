package Java.study;

public class App {

	public static void main(String[] args) {
		int x;
		
		try {
			x = 10/0;
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Inside exception block");
			
		}
	}
		
}

 