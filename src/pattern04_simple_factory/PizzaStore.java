package pattern04_simple_factory;

public class PizzaStore
{
	private SimplePizzaFactory mFactory;
	
	public PizzaStore (SimplePizzaFactory factory )
	{
		mFactory = factory;
	
	}
	
	public Pizza orderPizza(String type)
	{
		Pizza pizza = mFactory.createPizza(type); // encapsulating pizza creation into separate object SimplePizzaFactory
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
