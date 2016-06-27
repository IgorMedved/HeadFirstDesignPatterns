package pattern07a_enumeration_adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Enumeration
{
	private Iterator mIterator;
	
	public EnumerationAdapter (ArrayList list)
	{
		mIterator=list.iterator();
	}

	@Override
	public boolean hasMoreElements()
	{
		return mIterator.hasNext();
	}

	@Override
	public Object nextElement()
	{
		return mIterator.next();
	}

}
