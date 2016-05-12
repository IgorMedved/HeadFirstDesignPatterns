package pattern01_strategy_duck_quack;

public class FlyBehaviorWithWings implements FlyBehavior {
	
	// I am a real duck! I can fly!
	public void fly()
	{
		System.out.println("I am a real duck! I can fly!");
	}

}
