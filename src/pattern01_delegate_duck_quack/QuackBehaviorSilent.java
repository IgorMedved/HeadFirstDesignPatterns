package pattern01_delegate_duck_quack;

public class QuackBehaviorSilent implements QuackBehavior {
	
	public void quack()
	{
		System.out.println("<< Silence >>");
	}

}
