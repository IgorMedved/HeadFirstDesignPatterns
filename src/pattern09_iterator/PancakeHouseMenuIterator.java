package pattern09_iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator
{
	private ArrayList<MenuItem> mMenuItems;
	private int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems)
	{
		mMenuItems = new ArrayList<>(menuItems);
	}
	
	
	@Override
	public boolean hasNext()
	{
		return position < mMenuItems.size();
	}

	@Override
	public Object next()
	{
		MenuItem menuItem = mMenuItems.get(position);
		position ++;
		return menuItem;
	}

}
