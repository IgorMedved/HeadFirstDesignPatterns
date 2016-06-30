package pattern08_state;

public class NoCoinState implements State
{
	GumballMachine mMachine;
	
	public NoCoinState(GumballMachine machine)
	
	{
		mMachine = machine;
	}

	@Override
	public void insertCoin()
	{
		System.out.println("Coin inserted");
		mMachine.setState(mMachine.getHasCoinState());
		
	}

	@Override
	public void ejectCoin()
	{
		System.out.println("You haven't insert a quarter");
		
	}

	@Override
	public void turnCrank()
	{
		System.out.println("Crank turned, but no coin inserted");
		
	}

	@Override
	public void dispense()
	{
		System.out.println("You need to pay first");
		
	}

}
