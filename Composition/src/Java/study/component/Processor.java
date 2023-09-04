package Java.study.component;

public class Processor {
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String MiniFrequency;
	private String Maxfrequency;
	
	
	public Processor() {
		this.brand ="intel" ;
		this.series ="i5 7200u" ;
		this.generation = 7;
		this.cores = 2;
		this.threads = 4;
		this.cacheMemory ="3MB" ;
		this.frequency = "2.5Ghz ";
		this.MiniFrequency = "2.5Ghz" ;
		this.Maxfrequency = "3.1Ghz";
		
	}
	
	

	public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
			String frequency, String miniFrequency, String maxfrequency) {
		
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		MiniFrequency = miniFrequency;
		Maxfrequency = maxfrequency;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", MiniFrequency=" + MiniFrequency + ", Maxfrequency=" + Maxfrequency + "]";
	}



	public String getBrand() {
		return brand;
	}



	public String getSeries() {
		return series;
	}



	public int getGeneration() {
		return generation;
	}



	public int getCores() {
		return cores;
	}



	public int getThreads() {
		return threads;
	}



	public String getCacheMemory() {
		return cacheMemory;
	}



	public String getFrequency() {
		return frequency;
	}



	public String getMiniFrequency() {
		return MiniFrequency;
	}



	public String getMaxfrequency() {
		return Maxfrequency;
	}



	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	

}
