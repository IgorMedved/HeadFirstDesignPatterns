package pattern04b_factory_pattern;

public class PizzaClient
{
	public static void main (String[] args)
	{
		
		PizzaStore store = new ChicagoPizzaStore();
		store.orderPizza("cheese");
	}
}
