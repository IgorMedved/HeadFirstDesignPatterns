package pattern03a_decorator_starbuzz;

public class Milk extends CondimentDecorator {

	private Beverage mBeverage;
	
	Milk(Beverage beverage) {
		
		mBeverage = beverage;
		
		
	}
	
	

	@Override
	public double cost() {
		double milkCost = .15;
		double totalCost = mBeverage != null? mBeverage.cost() + milkCost: milkCost;
		return totalCost;
	}



	@Override
	public String getDescription() {
		return mBeverage != null? mBeverage.getDescription() + ", Milk": "Milk";
	}

}
