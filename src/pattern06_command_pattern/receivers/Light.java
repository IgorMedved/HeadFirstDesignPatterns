package pattern06_command_pattern.receivers;

public class Light extends Receiver
{
	public Light(String extra)
	{
		super (extra, "Light");
	}
	
	public void on()
	{
		System.out.println("Turn " + getDescription()+ " on");
	}
	
	public void off()
	{
		System.out.println("Turn " + getDescription() +" off");
	}
}
