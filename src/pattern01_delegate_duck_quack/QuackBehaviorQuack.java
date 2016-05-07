package pattern01_delegate_duck_quack;

public class QuackBehaviorQuack implements QuackBehavior {

	public void quack()
	{
		// if it quacks like a duck...
		System.out.println("Quack!");
	}
}
