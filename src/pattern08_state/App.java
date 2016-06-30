package pattern08_state;

public class App
{
	public static void main(String[] args)
	{

		GumballMachine machine = new GumballMachine(10);
		for (int i = 0; i < 11; i++)
		{
			machine.insertCoin();
			machine.turnCrank();

		}
	}
}
