package pattern08_state;

public class WinnerState implements State
{
	private GumballMachine mMachine;
	
	public WinnerState(GumballMachine machine)
	
	{
		mMachine = machine;
	}
	
	
	@Override
	public void insertCoin()
	{
		System.out.println("wait for the gumball");		
	}

	@Override
	public void ejectCoin()
	{
		System.out.println("coin is used up.");
		
	}

	@Override
	public void turnCrank()
	{
		System.out.println("Wait for gumball");
		
	}

	@Override
	public void dispense()
	{
		System.out.println("You are a winner! You get two gumballs for your quarter!");
		mMachine.release();
		if (mMachine.getCount()==0)
		{
			mMachine.setState(mMachine.getSoldOutState());
		}
		else
		{
			mMachine.release();
			if (mMachine.getCount()>0)
				mMachine.setState(mMachine.getNoCoinState());
			else
			{
				System.out.println("Oops! out of gumballs");
				mMachine.setState(mMachine.getSoldOutState());
			}
			
		}
		
		
	}

}
