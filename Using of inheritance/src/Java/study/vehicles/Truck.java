package Java.study.vehicles;

import Java.study.parent.Vehicle;

public class Truck extends Vehicle{
	
	private String steering;
	private String musicSystem;
	private String airconditioner;
	private int container;
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirconditioner() {
		return airconditioner;
	}
	public int getContainer() {
		return container;
	}

	public Truck() {
		super();
		this.airconditioner = "ON";
		this.musicSystem = "ON";
		this.steering = "Electric";
		}
	public Truck(String steering, String musicSystem, String airconditioner, int container,String engine, int wheels, int seats, int fuelTank, String lights) {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airconditioner = airconditioner;
		this.container = container;
	}
	@Override
	public String toString() {
		return "Truck [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirconditioner()=" + getAirconditioner() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights();
	}
	

}
