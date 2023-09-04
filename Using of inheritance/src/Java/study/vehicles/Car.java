package Java.study.vehicles;

import Java.study.parent.Vehicle;

public class Car extends Vehicle{
	
	
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String fridge;
	private String entertainmentSystem;
	
	
	public String getSteering() {
		return steering;
	}


	public String getMusicSystem() {
		return musicSystem;
	}


	public String getAirConditioner() {
		return airConditioner;
	}


	public String getFridge() {
		return fridge;
	}


	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}

	public Car() {
		super();
		this.airConditioner = "ON";
		this.entertainmentSystem = "OFF";
		this.fridge = "Working";
		this.musicSystem = "ON";
		this.steering = "Electric";
		}

	public Car(String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem,String engine, int wheels, int seats, int fuelTank, String lights) {
		super(engine,wheels,seats,fuelTank,lights);
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
	}


	@Override
	public String toString() {
		return "Car [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getFridge()=" + getFridge()
				+ ", getEntertainmentSystem()=" + getEntertainmentSystem() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ ", getLights()=" + getLights();
	}


	
}
