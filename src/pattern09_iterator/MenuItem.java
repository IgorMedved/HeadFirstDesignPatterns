package pattern09_iterator;

public class MenuItem
{
	private String mName;
	private String mDescription;
	private double mPrice;
	private boolean isVegetarian;
	
	
	public MenuItem(String pName, String pDescription, double pPrice, boolean pIsVegetarian)
	{
		super();
		mName = pName;
		mDescription = pDescription;
		mPrice = pPrice;
		isVegetarian = pIsVegetarian;
	}


	public String getName()
	{
		return mName;
	}


	public String getDescription()
	{
		return mDescription;
	}


	public double getPrice()
	{
		return mPrice;
	}


	public boolean isVegetarian()
	{
		return isVegetarian;
	}
	
	
	

}
