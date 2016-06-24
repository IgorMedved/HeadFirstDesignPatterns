package pattern04_simple_factory;

public class AppPizzaStore {

	public static void main(String[] args) {
		
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		store.orderPizza("cheese");

	}

}
