package pattern08_state;

public class SoldOutState implements State
{
	private GumballMachine mMachine;
	
	public SoldOutState(GumballMachine machine)
	
	{
		mMachine = machine;
	}

	
	@Override
	public void insertCoin()
	{
		System.out.println("No Gumballs left. Can't insert a coin");
		
	}

	@Override
	public void ejectCoin()
	{
		System.out.println("No coin inserted");
		
	}

	@Override
	public void turnCrank()
	{
		System.out.println("Crank turned, but machine is out of gumballs");
		
	}

	@Override
	public void dispense()
	{
		System.out.println("No gumballs left. Cant dispence a gumball");
		
	}

}
