package pattern01_strategy_duck_quack;

public class FlyBehaviorEmpty implements FlyBehavior {

	// rubber ducks can't fly 
	public void fly()
	{
		System.out.println("Rubber ducks can't fly ");
	}
}
