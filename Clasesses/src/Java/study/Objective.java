package Java.study;

public class Objective {

	public static void main(String[] args) {
		Car car = new Car("Closed","On","Seated",120);
		
		/*car.setDoors("Not Closed");
		car.setDriver("Seated");
		car.setEngine("On");
		car.setsSpeed(120);
		*/
		System.out.println(car.run());

	}

}
 