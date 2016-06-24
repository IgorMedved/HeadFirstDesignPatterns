package pattern04b_factory_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza
{
	protected String mPizzaName;
	protected String mPizzaDough;
	protected String mSauce;
	protected List<String> mToppings = new ArrayList<>();
	
	
	
	public abstract void prepare(PizzaIngredientFactory mFactory);
	
	public void bake()
	{
		System.out.println("Baking pizza for 25 min at 300F");
	}
	public  void cut()
	{
		System.out.println("Cutting pizza in slices");
	}
	public void box()
	{
		System.out.println("Putting pizza in a box");
	}
	
	public String getName()
	{
		return mPizzaName;
	}
	
	

}
