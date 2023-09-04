package Java.study.Demo;

public class Outer {
	
	public static void testOuterMethod() {
		System.out.println("Value of inner class variable: "+Inner.x);
		Inner.tetingInnerMethod();
	}
	public static class Inner{
		public static int x = 0;
		public static void tetingInnerMethod() {
			System.out.println("Testing inner class method");
			
		}
	}

}
