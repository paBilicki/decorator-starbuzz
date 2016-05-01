
public class Soy extends CondimentDecorator {
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return super.getSize();
	}

	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
		size = beverage.getSize();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
				if (getSize() == beverage.SMALL){
					cost += .1;
				} else if (getSize() == beverage.MEDIUM){
					cost += .15;
				}else if (getSize() == beverage.LARGE){
					cost += .2;
				}
		return cost;
	}
}
