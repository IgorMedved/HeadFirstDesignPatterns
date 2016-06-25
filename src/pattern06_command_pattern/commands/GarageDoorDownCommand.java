package pattern06_command_pattern.commands;

import pattern06_command_pattern.receivers.GarageDoor;

public class GarageDoorDownCommand implements Command
{
	private GarageDoor mDoor;
	
	public GarageDoorDownCommand(GarageDoor door)
	{
		mDoor = door;
	}

	@Override
	public void execute()
	{
		mDoor.down();
		
	}
	
	public void undo()
	{
		mDoor.up();
	}
	
	

}
