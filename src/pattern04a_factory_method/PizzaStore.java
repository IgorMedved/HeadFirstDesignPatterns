package pattern04a_factory_method;

public abstract class PizzaStore
{
	
	public Pizza orderPizza(String type)
	{
		Pizza pizza = createPizza(type); // encapsulating pizza creation into concrete subclasses
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}
