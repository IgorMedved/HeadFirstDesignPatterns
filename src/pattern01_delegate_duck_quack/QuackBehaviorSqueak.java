package pattern01_delegate_duck_quack;

public class QuackBehaviorSqueak implements QuackBehavior {

	// a rubber duck can quack
	public void quack()
	{
		System.out.println("Squeak!");
	}
}
