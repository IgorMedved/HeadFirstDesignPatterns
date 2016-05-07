package pattern01_delegate_duck_quack;

public class DuckTestingApp {

	public static void main( String[] args)
	{
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}
}
