package discounts;

import bevarages.Beverage;

public abstract class DiscountsDecorator extends Beverage {
	@Override
	public abstract String getDescription();
}
