package pattern04b_factory_pattern;

public class CheesePizza extends Pizza
{
	PizzaIngredientFactory mPizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory)
	{
		mPizzaIngredientFactory = pizzaIngredientFactory;
		setName("Chicago style Cheese Pizza");
	}

	@Override
	public void prepare()
	{
		System.out.println("Preparing " + mPizzaName);
		System.out.println("Tossing dough ...");
		System.out.println("Adding Sauce ....");
		System.out.println("Adding Toppings: ");
		mPizzaIngredientFactory.createDough();
		mPizzaIngredientFactory.createSauce();
		mPizzaIngredientFactory.createCheese();
		
		
	}
	
	
}
