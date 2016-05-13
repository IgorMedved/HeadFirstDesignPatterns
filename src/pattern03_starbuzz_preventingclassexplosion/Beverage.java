package pattern03_starbuzz_preventingclassexplosion;

public class Beverage {
	protected String mDescription;
	private boolean hasMilk;
	private boolean hasSoy;
	private boolean hasMocha;
	private boolean hasWhip;
	private double mMilkCost =.15;
	private double mSoyCost =.10;
	private double mMochaCost =.25;
	private double mWhipCost = .50;
	
	//
	public double cost()
	{
		double sum = 0;
		
		if (hasMilk)
		{
			sum+=mMilkCost;
		}
		if (hasSoy)
		{
			sum+=mSoyCost;
		}
		if (hasMocha)
		{
			sum+=mMochaCost;
		}
		if (hasWhip)
		{
			sum += mWhipCost;
		
		}
		
		return sum;
	}

	public boolean isHasSoy() {
		return hasSoy;
	}

	public void setHasSoy(boolean pHasSoy) {
		hasSoy = pHasSoy;
	}

	public boolean isHasMocha() {
		return hasMocha;
	}

	public void setHasMocha(boolean pHasMocha) {
		hasMocha = pHasMocha;
	}

	public boolean isHasWhip() {
		return hasWhip;
	}

	public void setHasWhip(boolean pHasWhip) {
		hasWhip = pHasWhip;
	}

	public String getDescription() {
		return mDescription;
	}
	
	
	
}
