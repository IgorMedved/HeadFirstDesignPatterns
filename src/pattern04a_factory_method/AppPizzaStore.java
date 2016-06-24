package pattern04a_factory_method;

public class AppPizzaStore {

	public static void main(String[] args) {
		
		
		PizzaStore nyStore = new NYStylePizzaStore();
		nyStore.orderPizza("greek");

	}

}
