package pattern06_command_pattern.receivers;

public class GarageDoor extends Receiver
{
	
	
	public GarageDoor (String extra)
	{
		super(extra, "Garage door");
			
	}
	
	public void up()
	{
		System.out.println(getDescription() + " is open");
	}
	
	public void down()
	{
		System.out.println(getDescription() + " is closed");
	}
	
	public void stop()
	{
		System.out.println(getDescription() + " stopped");
	}
	
	public void lightOn()
	{
		System.out.println(getDescription() + " light turned on");
	}
	
	public void lightOff()
	{
		System.out.println(getDescription() + " light turned off");
	}
	
	
}
