package pattern06_command_pattern.commands;

import pattern06_command_pattern.receivers.Light;

public class LightOnCommand implements Command
{
	private Light mLight;
	
	public LightOnCommand (Light light)
	{
		mLight = light;
	}
	
	
	
	
	@Override
	public void execute()
	{
		mLight.on();
	}
	
	public void undo()
	{
		mLight.off();
	}

}
