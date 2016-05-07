package pattern01_delegate_duck_quack;

public class MallardDuck extends Duck {
	MallardDuck ()
	{
		// not an ideal object construction, but it still can be changed at runtime
		mQuack = new QuackBehaviorQuack();
		mFly = new FlyBehaviorWithWings();
	}

}
