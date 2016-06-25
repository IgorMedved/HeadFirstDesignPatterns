package pattern06_command_pattern;

import pattern06_command_pattern.commands.Command;

public class SimpleRemoteControl
{
	Command slot1;
	
	public void setSlot1Command (Command command )
	{
		slot1 = command;
	}
	
	public void onButtonPressed()
	{
		slot1.execute();
	}

}
