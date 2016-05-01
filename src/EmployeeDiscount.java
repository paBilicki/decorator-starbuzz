
public class EmployeeDiscount extends DiscountsDecorator{
	Beverage beverage;
	
	public EmployeeDiscount(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", with 40% discount";
	}

	@Override
	public double cost() {
		double cost = beverage.cost()*.6;
		return Math.round(cost * 100.0) / 100.0;
	}
	

}
