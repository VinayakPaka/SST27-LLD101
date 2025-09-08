package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		Beverage base = new Cappuccino();
		System.out.println(base.cost());
		Beverage withSugar = new SugarDecorator(base);
		System.out.println(withSugar.cost());
		Beverage withChoco = new ChocolateDecorator(withSugar);
		System.out.println(withChoco.cost());
	}

}