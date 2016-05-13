package pattern03a_decorator_starbuzz;

public class Decaf extends Beverage {

	public Decaf()
	{
		mDescription = "Decaf is not coffee!";
	}
	
	@Override
	public double cost() 
	{
		double decafPrice =1.5;
		return decafPrice;
	}

}
