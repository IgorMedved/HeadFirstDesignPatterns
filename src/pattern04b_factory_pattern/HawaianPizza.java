package pattern04b_factory_pattern;

public class HawaianPizza extends Pizza
{
	PizzaIngredientFactory mFactory;
	
	public HawaianPizza(PizzaIngredientFactory factory)
	{
		mFactory = factory;
		mPizzaName ="Hawaian Pizza";
	}
	
	@Override
	public void prepare()
	{
		mFactory.createDough();
		mFactory.createSauce();
		mFactory.createCheese();
		
		
	}
}
