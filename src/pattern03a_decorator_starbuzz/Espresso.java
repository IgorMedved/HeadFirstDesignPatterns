package pattern03a_decorator_starbuzz;

public class Espresso extends Beverage {

	public Espresso()
	{
		mDescription = "Hot tasty Espresso";
	}
	
	@Override
	public double cost() 
	{
		double espressoPrice = 4.00;
		return espressoPrice;
	}

}
