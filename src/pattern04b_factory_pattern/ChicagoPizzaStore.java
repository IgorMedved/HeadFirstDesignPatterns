package pattern04b_factory_pattern;


public class ChicagoPizzaStore extends PizzaStore
{
	PizzaIngredientFactory mChicagoFactory = new ChicagoPizzaIngredientFactory();
	
	
	
	@Override
	protected Pizza createPizza(String type)
	{
		Pizza pizza = null;
		
		if (type.equalsIgnoreCase("cheese"))
			return new CheesePizza(mChicagoFactory);
		else if (type.equalsIgnoreCase("hawaian"))
			return new HawaianPizza(mChicagoFactory);
		else if (type.equalsIgnoreCase("greek"))
			return new PepperoniPizza(mChicagoFactory);
		else if (type.equalsIgnoreCase("pepperoni"))
			return new PepperoniPizza(mChicagoFactory);
		
		return pizza;
	}

}
