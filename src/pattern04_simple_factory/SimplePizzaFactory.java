package pattern04_simple_factory;

public class SimplePizzaFactory
{
	public Pizza createPizza(String type)
	{
		Pizza pizza = null;
		
		if (type.equalsIgnoreCase("cheese"))
			return new CheesePizza();
		else if (type.equalsIgnoreCase("hawaian"))
			return new HawaianPizza();
		else if (type.equalsIgnoreCase("greek"))
			return new PepperoniPizza();
		else if (type.equalsIgnoreCase("pepperoni"))
			return new PepperoniPizza();
		
		return pizza;
	}
	
}
