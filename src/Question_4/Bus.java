package Question_4;

public class Bus extends Vehicle {

	private int year;
	
	private double manufacturerDiscount;

	public Bus(double speed, String colour, int year, double manufacturerDiscount) {
		super(speed, colour);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	public double getSalesPrice() {
		
		return super.getRegularPrice() * manufacturerDiscount;
	}
	
}
