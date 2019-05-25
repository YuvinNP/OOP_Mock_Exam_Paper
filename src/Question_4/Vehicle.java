package Question_4;

public abstract class Vehicle {
	
	protected double speed;
	
	protected double regulatPrice;
	
	protected String colour;

	public Vehicle() {
		
		speed = 0;
		regulatPrice = 0;
		colour = null;
	}

	public Vehicle(double speed, String colour) {
		
		this.speed = speed;
		this.colour = colour;
	}
	
	public double getRegularPrice() {
		
		return regulatPrice;
	}
	
	
	

}
