package pattern07_adapter;

public class TurkeyAdapter implements Turkey
{
	private Duck mDuck;
	public TurkeyAdapter (Duck duck)
	{
		mDuck = duck;
	}
	@Override
	public void fly()
	{
		mDuck.fly();
	}
	@Override
	public void gobble()
	{
		mDuck.quack();
		
	}
	
	
}
