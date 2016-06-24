package pattern04b_factory_pattern;

public interface PizzaIngredientFactory
{
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Vegies createVegies();
	public Pepperoni createPepperoni();
	public Clams createClam();

}
