package pattern09_iterator;

import java.util.ArrayList;

public class PancakeHouseMenu
{
	private ArrayList mMenuItems;
	
	
	public PancakeHouseMenu()
	{
		mMenuItems = new ArrayList();
		
		addItem("K&B's Pancake Breakfast", "Pancakes with scrabled eggs and toast", 2.99, true);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", 2.99, false);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", 3.49, true);
		addItem("Waffles", "Waffles with your choice of blueberries or strawberries", 3.59, true);
		
	}
	
	public void addItem(String name, String description, double price, boolean isVegetarian)
	{
		MenuItem menuItem = new MenuItem (name, description, price, isVegetarian);
		mMenuItems.add(menuItem);
	}
	
	public ArrayList getMenuItems()
	{
		return mMenuItems;
	}
	
}
