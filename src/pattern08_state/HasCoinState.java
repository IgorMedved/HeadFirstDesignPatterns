package pattern08_state;

import java.util.Random;

public class HasCoinState implements State
{
	private GumballMachine mMachine;
	private Random randomWinner = new Random(System.currentTimeMillis());
	
	public HasCoinState(GumballMachine machine)
	
	{
		mMachine = machine;
	}

	@Override
	public void insertCoin()
	{
		System.out.println("You can't insert another quarter");
		
	}

	@Override
	public void ejectCoin()
	{
		System.out.println("Coin ejected");
		mMachine.setState(mMachine.getHasCoinState());
		
	}

	@Override
	public void turnCrank()
	{
		System.out.println("You turned...");
		int winner = randomWinner.nextInt(10);
		if ( winner== 0 && mMachine.getCount()>1)
			mMachine.setState(mMachine.getWinnerState());
		else
			mMachine.setState(mMachine.getSoldState());
		
	}

	@Override
	public void dispense()
	{
		System.out.println("No gumball dispensed");
		
	}

}
