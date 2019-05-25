package Question_4;

public class Truck extends Vehicle {

	private double weight;

	public Truck(double speed, String colour, double weight) {
		
		super(speed, colour);
		this.weight = weight;
	}
	
	public double getSalePrice() {
		
		if(weight > 2000) {
			
			return super.getRegularPrice() * 0.9;
		}
		
		else {
			
			return super.getRegularPrice() * 0.8;
		}
	}
	
}
