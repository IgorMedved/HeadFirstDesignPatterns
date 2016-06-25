package pattern06_command_pattern.commands;

import pattern06_command_pattern.receivers.Light;

public class LightOffCommand implements Command
{
	private Light mLight;
	
	public LightOffCommand (Light light)
	{
		mLight = light;
	}

	@Override
	public void execute()
	{
		mLight.off();
		
	}
	
	public void undo()
	{
		mLight.on();
	}

}
