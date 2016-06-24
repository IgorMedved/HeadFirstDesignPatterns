package pattern04b_factory_pattern;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{

	@Override
	public Dough createDough()
	{
		
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce()
	{
		
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese()
	{
		return new ReggianoCheese();
	}

	@Override
	public Vegies createVegies()
	{
		
		return null;
	}

	@Override
	public Pepperoni createPepperoni()
	{
		return null;
	}

	@Override
	public Clams createClam()
	{
		return new FreshClams();
	}

	
}
