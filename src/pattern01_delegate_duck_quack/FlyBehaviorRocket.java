package pattern01_delegate_duck_quack;

public class FlyBehaviorRocket implements FlyBehavior
{

	@Override
	public void fly()
	{
		System.out.println("I am flying with a rocket");
		
	}

}
