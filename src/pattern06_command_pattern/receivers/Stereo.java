package pattern06_command_pattern.receivers;

public class Stereo extends Receiver
{

	public Stereo(String extra)
	{
		super(extra, "Stereo");
	}
	
	public void on()
	{
		
		System.out.println(getDescription() + " is on");
	}
	
	public void off()
	{
		
		System.out.println(getDescription() + " is off");
	}
	
	public void setCD()
	{
		System.out.println(getDescription() + " CD mode");
	}
	
	public void setDVD()
	{
		System.out.println(getDescription() + " DVD mode");
	}
	
	public void setRadio()
	{
		System.out.println(getDescription() + " Radio mode");
	}
	
	public void setVolume()
	{
		System.out.println(getDescription() + " volume set");
	}
	
		

}
