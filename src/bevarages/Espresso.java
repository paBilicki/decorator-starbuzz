package bevarages;

public class Espresso extends Beverage {

	public Espresso() {
		description = "bevarages.Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
