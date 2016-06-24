package pattern04a_factory_method;



public class NYStylePizzaStore extends PizzaStore
{

	@Override
	protected Pizza createPizza(String type)
	{
		Pizza pizza = null;
		
		if (type.equalsIgnoreCase("cheese"))
			return new NYCheesePizza();
		else if (type.equalsIgnoreCase("hawaian"))
			return new NYHawaianPizza();
		else if (type.equalsIgnoreCase("greek"))
			return new NYGreekPizza();
		else if (type.equalsIgnoreCase("pepperoni"))
			return new NYPepperoniPizza();
		
		return pizza;
	}

}
