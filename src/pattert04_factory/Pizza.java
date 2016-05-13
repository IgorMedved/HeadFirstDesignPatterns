package pattert04_factory;

public class Pizza {
	
	protected String mType;
	private SimplePizzaFactory mFactory;
	
	public Pizza(SimplePizzaFactory factory)
	{
		mFactory = factory;
	}
	
	public Pizza orderPizza (String type)
	{
		Pizza pizza;
		
		pizza = mFactory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		
		
		return pizza;
	}
	
	public void prepare()
	{
		System.out.println("Preparing " + mType + " pizza" );
	}
	
	public void bake()
	{
		System.out.println("Baking " + mType + " pizza");
	}
	
	public void cut()
	{
		System.out.println("Cutting " + mType + " pizza");
	}

	public void box()
	{
		System.out.println("Boxing " +mType + " pizza");
	}
	
	
}
