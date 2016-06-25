package pattern06_command_pattern.receivers;

public class CeilingFan extends Receiver
{
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	
	
	private int mSpeed;
	public CeilingFan(String extra)
	{
		super(extra, "Ceiling fan");
		mSpeed = OFF;
	}
	
	
	public void high()
	{
		mSpeed = HIGH;
		System.out.println(getDescription() + " is on high speed");
	}
	
	public void medium()
	{
		mSpeed = MEDIUM;
		System.out.println(getDescription() + " is on medium speed" );
	}
	
	public void low()
	{
		mSpeed = LOW;
		System.out.println(getDescription() + " is on low speed");
	}
	
	
	public void off()
	{
		mSpeed = OFF;
		System.out.println(getDescription() + " is off");
	}
	
	public int getSpeed()
	{
		return mSpeed;
	}
	
	
}
