package pattern08_state;

public class GumballMachine
{
	private int counter;
	private final State noCoin;
	private final State hasCoin;
	private final State soldOut;
	private final State sold;
	private final State winner;
	private State mState;
	
	
	public GumballMachine(int numGumballs)
	{
		counter = numGumballs;
		noCoin = new NoCoinState(this);
		hasCoin = new  HasCoinState(this);
		soldOut = new SoldOutState(this);
		sold = new SoldState(this);
		winner = new WinnerState(this);
		if (counter > 0)
			mState = noCoin;
		else
		{
			mState = soldOut;
			counter = 0;
		}
		
	}
	
	public void insertCoin()
	{
		mState.insertCoin();
	}
	
	public void ejectCoin()
	{
		mState.ejectCoin();
	}
	
	public void turnCrank()
	{
		mState.turnCrank();
		mState.dispense();
	}
	
	public void release()
	{
		System.out.println("A gumball comes rolling out of the slot");
		if (counter >0)
			counter--;
	}
	
	public void setState (State state)
	{
		mState = state;
	}

	public State getNoCoinState()
	{
		return noCoin;
	}

	public State getHasCoinState()
	{
		return hasCoin;
	}

	public State getSoldOutState()
	{
		return soldOut;
	}

	public State getSoldState()
	{
		return sold;
	}
	
	public State getWinnerState()
	{
		return winner;
	}
	
	public int getCount()
	{
		return counter;
	}
	
	public void refill (int numGumballs)
	{
		counter = numGumballs;
		mState = noCoin;
	}
	
	
	


}
