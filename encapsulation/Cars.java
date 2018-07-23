package encapsulation;

public class Cars {
	private String name;
	private double topSpeed;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTopSpeedMPH() {
		return topSpeed;
	}
	
	public double getTopSpeedKMH() {
		return topSpeed * 1.609344;
	}
	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}
	
}
