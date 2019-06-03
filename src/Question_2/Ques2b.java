package Question_2;

abstract class AbstractFactory {

	public abstract TV getTVModel(String model);

	public abstract MobilePhone getPhoneModel(String model);

}

class TVFactory extends AbstractFactory {

	@Override
	public MobilePhone getPhoneModel(String model) {
		return null;
	}

	@Override
	public TV getTVModel(String model) {

		if (model.equals("Alpha 40")) {

			return new Alpha40();
		} else if (model.equals("Theta 65")) {

			return new Theta65();
		} else {

			return new Gamma50();
		}

	}

}

class MobileFactory extends AbstractFactory {

	@Override
	public TV getTVModel(String model) {

		return null;
	}

	@Override
	public MobilePhone getPhoneModel(String model) {

		if (model.equals("X25")) {

			return new X25();
		} else if (model.equals("A10")) {

			return new A10();
		} else {

			return new TPlus();
		}
	}

}

abstract class TV {

	public String model;

	public double size;

	abstract void display();
}

abstract class MobilePhone {

	protected String phoneModel;

	protected double price;

	abstract void display();
}

class A10 extends MobilePhone {

	public A10() {

		super.phoneModel = phoneModel;
		super.price = price;

	}

	@Override
	void display() {

		System.out.println("Model: " + super.phoneModel);
		System.out.println("Price: " + super.price);
	}

}

class X25 extends MobilePhone {

	public X25() {
		
		super.phoneModel = phoneModel;
		super.price = price;
		
	}

	@Override
	void display() {

		System.out.println("Model: " + super.phoneModel);
		System.out.println("Price: " + super.price);
	}

}

class TPlus extends MobilePhone {

	public TPlus() {
		
		super.phoneModel = phoneModel;
		super.price = price;
		
	}
	
	@Override
	void display() {

		System.out.println("Model: " + super.phoneModel);
		System.out.println("Price: " + super.price);
	}

}

class Alpha40 extends TV {

	public Alpha40() {
		
		super.model = model;
		super.size = size;
		
	}
	@Override
	public void display() {

		System.out.println("Model: " + super.model);
		System.out.println("Size: " + super.size);
	}

}

class Theta65 extends TV {

	public Theta65() {
		
		super.model = model;
		super.size = size;
		
	}
	@Override
	public void display() {

		System.out.println("Model: " + super.model);
		System.out.println("Size: " + super.size);
	}

}

class Gamma50 extends TV {

	public Gamma50() {
		
		super.model = model;
		super.size = size;
		
	}
	@Override
	public void display() {

		System.out.println("Model: " + super.model);
		System.out.println("Size: " + super.size);
	}

}

public class Ques2b {

	public static void main(String[] args) {
		
		

	}

}
