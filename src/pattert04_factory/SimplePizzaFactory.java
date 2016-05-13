package pattert04_factory;

public class SimplePizzaFactory {
	
	SimplePizzaFactory()
	{
		
	}
	
	public Pizza createPizza(String type)
	{
		if (type.equals("Greek"))
		{
			return new GreekPizza();
		}
		else if (type.equals("Hawaian"))
		{
			return new HawaianPizza();
		}
		else if (type.equals("Pepperoni"))
		{
			return new PeperoniPizza();
		}
		
		
	}

}
