package pattern03a_decorator_starbuzz;

public class Mocha extends CondimentDecorator {

	private Beverage mBeverage;
	
	Mocha (Beverage beverage)
	{
		mBeverage = beverage;
	}
	@Override
	public String getDescription() {
		return mBeverage != null? mBeverage.getDescription() + ", Mocha": "Mocha";
	}

	@Override
	public double cost() {
		double mochaCost = .50;
		double totalCost = mBeverage!=null? mBeverage.cost()+ mochaCost: mochaCost;
		
		return totalCost;
	}

}
