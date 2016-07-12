package discounts;

import bevarages.Beverage;

public class StudentDiscount extends DiscountsDecorator {
	Beverage beverage;
	
	public StudentDiscount(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", with 20% discount";
	}

	@Override
	public double cost() {
		double cost = beverage.cost()*.8;
		return Math.round(cost * 100.0) / 100.0;
	}

}
