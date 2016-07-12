package condiments;

import bevarages.Beverage;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", condiments.Whip";
	}

	@Override
	public double cost() {
		double d = .10 + beverage.cost();
		return Math.round(d*100)/100.0d;
	}
}
