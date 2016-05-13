package pattern03_starbuzz_preventingclassexplosion;

public class DarkRoast extends Beverage {

	public DarkRoast()
	{
		mDescription = "Most Excellent Dark Roast";
	}
	
	public double cost ()
	{
		double darkRoastPrice = 2.5;
		
		return super.cost()+ darkRoastPrice;
	}
	
}
