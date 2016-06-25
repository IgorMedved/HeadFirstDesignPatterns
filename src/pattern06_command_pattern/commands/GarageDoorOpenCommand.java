package pattern06_command_pattern.commands;

import pattern06_command_pattern.receivers.GarageDoor;

public class GarageDoorOpenCommand implements Command
{
	GarageDoor mDoor;

	public GarageDoorOpenCommand(GarageDoor door)
	{
		mDoor = door;
	}
	
	@Override
	public void execute()
	{
		mDoor.up();
		
	}
	
	public void undo()
	{
		mDoor.down();
	}

}
