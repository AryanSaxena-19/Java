package Java.study;

import Java.study.component.GraphicsCard;
import Java.study.component.Processor;
import Java.study.laptop.Laptop;

public class Hello {
	
	public static void main(String[] args) {
		//Laptop lappy = new Laptop();
		//System.out.println(lappy.getProcessor().getBrand());
		
		//Processor processor = new Processor("intel", "7200U", 7,4, 4, "6Mb"
		//		+"", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		//GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 1050, "4GB");
		
		Laptop gamingLaptop = new Laptop(17, new Processor("intel", "7200U", 7,4, 4, "6Mb"
				+"", "2.5Ghz", "2.5Ghz", "3.1Ghz"), "DDR4", "2TB",
				new GraphicsCard("Nvidia", 1050, "4GB" ),null,"Backlit");
		System.out.println(gamingLaptop);
		gamingLaptop.gaminMode();
		System.out.println("Gaming Mode On");
		System.out.println("Current Frequency " + gamingLaptop.getProcessor().getFrequency());
		
	}


}