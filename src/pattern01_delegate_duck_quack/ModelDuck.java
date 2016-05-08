package pattern01_delegate_duck_quack;

public class ModelDuck extends Duck
{
	public ModelDuck ()
	{
		mFly = new FlyBehaviorEmpty();
		mQuack = new QuackBehaviorQuack();
	}
	
	public void display()
	{
		System.out.println("I am a model duck!");
	}

}
