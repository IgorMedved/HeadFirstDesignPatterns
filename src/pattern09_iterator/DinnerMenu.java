package pattern09_iterator;

public class DinnerMenu
{
	private final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	
	private MenuItem[] menuItems;
	
	
	public DinnerMenu()
	{
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT", "(Fakin' Bacon with lettuce & tomato on whole wheat", 2.99, true);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", 2.99, false);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", 3.29, false);
		addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with chease", 3.05, false);
	}
	
	public void addItem(String name, String description, double price, boolean isVegetarian)
	{
		if (numberOfItems >= MAX_ITEMS)
			System.err.println("Sorry the menu is full. Can't add anymore items to the menu.");
		else
		{
			MenuItem menuItem = new MenuItem (name, description, price, isVegetarian);
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}
	
	public MenuItem[] getMenuItems()
	{
		return menuItems;
	}
	
	public Iterator createIterator()
	{
		return new DinnerMenuIterator(menuItems);
	}
}
