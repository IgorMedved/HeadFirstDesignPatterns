package pattern01_strategy_duck_quack;

public class DuckTestingApp {

	public static void main( String[] args)
	{
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.swim();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyBehaviorRocket());
		model.performFly();
	}
}
