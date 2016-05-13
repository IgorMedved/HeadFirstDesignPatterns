package pattern03a_decorator_starbuzz;

public class HouseBlend extends Beverage {

	public HouseBlend()
	{
		mDescription = "Yummi House Blend";
	}
	@Override
	public double cost() 
	{
		double houseBlendPrice = 3.00;
		return houseBlendPrice;
	}

}
