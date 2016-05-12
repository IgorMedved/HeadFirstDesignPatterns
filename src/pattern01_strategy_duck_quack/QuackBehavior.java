package pattern01_strategy_duck_quack;

public interface QuackBehavior {

	// the quacking is delegated to Quack behavior
	public void quack();
	
}
