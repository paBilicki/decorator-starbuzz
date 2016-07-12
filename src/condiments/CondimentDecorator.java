package condiments;

import bevarages.Beverage;

public abstract class CondimentDecorator extends Beverage {
	@Override
	public abstract String getDescription();
}
