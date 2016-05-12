package pattern01_strategy_duck_quack;

/* problem definition
 * 1) adding new fly behavior into Duck super class results in RubberDucks flying
 *    a) solution 1: overriding flying behavior in each child class leads to maintenance nightmare
 *    b) solution 2: implementing Flyable interface completely destroys code reuse
 *    
 * Looking from a different angle: A lot of duck behaviors are the same, but quacking and flying are not
 * ***** Encapsulate the behavior that is different into separate set of classes****************
 * ***** Delegate performing the different behavior to specialized behavior classes*************
 */
public abstract class Duck {

	protected QuackBehavior mQuack;
	protected FlyBehavior mFly;
	
	@Deprecated
	// different ducks quack in different way
	public void quack ()
	{
		// implement quack
	}
	
	@Deprecated
	// rubber ducks don't fly
	public void fly ()
	{
		// implements standard flying
	}
	
	public void performQuack()
	{
		if (mQuack!= null)
			mQuack.quack();
	}
	
	public void performFly()
	{
		if (mFly!= null)
			mFly.fly();
	}
	
	// this method is universal for all Ducks
	public void swim()
	{
		System.out.println("All ducks can swim!");
	}
	
	public void display()
	{
		
	}

	public void setQuackBehavior(QuackBehavior quack)
	{
		mQuack = quack;
	}

	public void setFlyBehavior(FlyBehavior fly)
	{
		mFly = fly;
	}
	
	
}
