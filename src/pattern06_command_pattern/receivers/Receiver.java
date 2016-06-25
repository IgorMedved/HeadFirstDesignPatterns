package pattern06_command_pattern.receivers;

public class Receiver
{
	private String mDescription;
	
	public Receiver (String extra, String description)
	{
		mDescription = description;
		if (extra != null && extra.length()!=0)
			mDescription = extra + " " + mDescription;
			
	}
	
	public String getDescription()
	{
		return mDescription;
	}
}
