
public class StarbuzzCoffee {

	public static void main(String args[]) {
		System.out.println("\nOrder 1");
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		System.out.println("\nOrder 2");
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		System.out.println("\nOrder 3");
		Beverage beverage21 = new DarkRoast();
		beverage21 = new Mocha(beverage21);
		beverage21 = new Mocha(beverage21);
		beverage21 = new Whip(beverage21);
		beverage21 = new StudentDiscount(beverage21);
		System.out.println(beverage21.getDescription() + " $" + beverage21.cost());
		
		System.out.println("\nOrder 4");
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
		System.out.println("\n\nOrder 5");
		Beverage beverage31 = new HouseBlend();
		beverage31.setSize(Beverage.LARGE);
		beverage31 = new Soy(beverage31);
		beverage31 = new Mocha(beverage31);
		beverage31 = new Whip(beverage31);
//		beverage31 = new EmployeeDiscount(beverage31);
		System.out.println(beverage31.getDescription() + " $" + beverage31.cost());
		
		System.out.println("\n\nOrder 6");
		Beverage beverage4 = new Espresso();
		beverage4.setSize(Beverage.SMALL);
		beverage4 = new Soy(beverage4);
		System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
		
		System.out.println("\n\nOrder 7");
		Beverage beverage41 = new Espresso();
		beverage41.setSize(Beverage.MEDIUM);
		beverage41 = new Soy(beverage41);
		System.out.println(beverage41.getDescription() + " $" + beverage41.cost());
		
		System.out.println("\n\nOrder 8");
		Beverage beverage42 = new Espresso();
		beverage42.setSize(Beverage.LARGE);
		beverage42 = new Soy(beverage42);
		System.out.println(beverage42.getDescription() + " $" + beverage42.cost());
		
		int a = 2;
		double b = .3;
		System.out.println(a*b);
		
	}
}
