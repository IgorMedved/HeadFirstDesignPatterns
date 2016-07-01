package pattern09_iterator;

public class DinnerMenuIterator implements Iterator
{
	private MenuItem[] mItems;
	private int position = 0;
	
	
	public DinnerMenuIterator(MenuItem[] items)
	{
		mItems = items;
		
	}
	
	public Object next()
	{
		MenuItem menuItem = mItems[position];
		position ++;
		return menuItem;
	}
	
	
	@Override
	public boolean hasNext()
	{
		return (position < mItems.length && mItems[position] != null);
		
	}

	

}
