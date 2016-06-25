package pattern04b_factory_pattern;

public class GreekPizza extends Pizza
{
   PizzaIngredientFactory mFactory;	
   public GreekPizza(PizzaIngredientFactory factory)
   {
	   mFactory = factory;
	   mPizzaName = "Greek Pizza";
	   mToppings.add("fat wedding");
   }
   
   
	public void prepare()
	{
		mFactory.createDough();
		mFactory.createSauce();
		mFactory.createCheese();
	}
}
