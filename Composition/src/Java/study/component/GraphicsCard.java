package Java.study.component;

public class GraphicsCard {
	private String brand;
	private int series;
	private String memory;
	public GraphicsCard() {

		this.brand = "NVIDIA";
		this.series = 5500;
		this.memory = "1 TB";
	}
	public GraphicsCard(String brand, int series, String memory) {
	 
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "GraphicsCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}
	

}
