package beverages_decorator;

public abstract class BeverageDecorator extends Beverage {
	protected final Beverage beverage;

	protected BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
}


