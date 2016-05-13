package pattern03a_decorator_starbuzz;

public abstract class Beverage {
	
	protected String mDescription;
	
	abstract public double cost();
	public String getDescription()
	{
		return mDescription;
	}
	
	

}
