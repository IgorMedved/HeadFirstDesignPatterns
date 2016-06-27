package pattern07_adapter;

public class DuckAdapterTurkey implements Duck
{
	Turkey mTurkey;
	public DuckAdapterTurkey (Turkey turkey)
	{
		mTurkey = turkey;
	}
	@Override
	public void fly()
	{
		for (int i = 0; i< 5; i ++)
			mTurkey.fly(); // to compensate for the fact that Turkey is flying short distnace
	}
	@Override
	public void quack()
	{
		mTurkey.gobble();
		
	}
	
	

}
