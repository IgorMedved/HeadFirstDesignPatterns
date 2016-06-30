package pattern08_state;

public class SoldState implements State
{
	private GumballMachine mMachine;
	
	public SoldState(GumballMachine machine)
	
	{
		mMachine = machine;
	}
	@Override
	public void insertCoin()
	{
		System.out.println("The gumball is being dispenced. Wait...");
		
	}

	@Override
	public void ejectCoin()
	{
		System.out.println("The coin was already used up. Dispensing gumball");
		
	}

	@Override
	public void turnCrank()
	{
		System.out.println("The gumball on the way. No need to turn crank");
		
	}

	@Override
	public void dispense()
	{
		mMachine.release();
		if (mMachine.getCount() > 0)
			mMachine.setState(mMachine.getNoCoinState());
		else
			mMachine.setState(mMachine.getSoldOutState());
		
	}

}
