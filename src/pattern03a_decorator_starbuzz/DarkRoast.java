package pattern03a_decorator_starbuzz;

public class DarkRoast extends Beverage {

	public DarkRoast()
	{
		mDescription = "Excellent Dark Roast";
		
	}
	
	@Override
	public double cost() {
		double darkRoastCost = 2.00;
		return darkRoastCost;
	}

}
