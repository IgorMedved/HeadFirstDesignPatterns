package pattern04b_factory_pattern;

public class PizzaClient
{
	public static void main (String[] args)
	{
		PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
		PizzaStore store = new PizzaStore(factory);
	}
}
