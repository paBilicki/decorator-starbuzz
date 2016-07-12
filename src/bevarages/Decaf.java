package bevarages;

public class Decaf extends Beverage {
	public Decaf() {
		description = "bevarages.Decaf Coffee";
	}

	@Override
	public double cost() {
		return 1.05;
	}
}
