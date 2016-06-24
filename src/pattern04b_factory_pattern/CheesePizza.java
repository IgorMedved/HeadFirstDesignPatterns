package pattern04b_factory_pattern;

public class CheesePizza extends Pizza
{
	PizzaIngredientFactory mPizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory)
	{
		mPizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare()
	{
		// TODO Auto-generated method stub
		
	}
	
	
}
