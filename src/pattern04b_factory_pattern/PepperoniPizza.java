package pattern04b_factory_pattern;

public class PepperoniPizza extends Pizza
{
	PizzaIngredientFactory mFactory;
	
	public PepperoniPizza (PizzaIngredientFactory factory)
	{
		mFactory = factory;
		mPizzaName= "Pepperoni Pizza";
	}
	
	@Override
	public void prepare()
	{
		mFactory.createDough();
		mFactory.createSauce();
		mFactory.createCheese();
		
		
	}
}
