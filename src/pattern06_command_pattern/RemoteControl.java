package pattern06_command_pattern;

import pattern06_command_pattern.commands.Command;
import pattern06_command_pattern.commands.NoCommand;

public class RemoteControl
{
	private Command[] mOnCommands;
	private Command[] mOffCommands;
	private Command mUndoCommand;
	
	
	public RemoteControl()
	{
		Command noCommand = new NoCommand();
		mOnCommands = new Command[7];
		mOffCommands = new Command[7];
		mUndoCommand = noCommand;
		for (int i = 0; i < 7; i++)
		{
			mOnCommands[i] = noCommand;
			mOffCommands[i] = noCommand;
		}
	}
	
	public void setCommand (int slot, Command onCommand, Command offCommand)
	{
		if (slot >=0 && slot < 7)
		{
			mOnCommands[slot] = onCommand;
			mOffCommands[slot] = offCommand;
		}
	}
	
	public void onButtonPressed(int slot)
	{
		if (slot >=0 && slot < 7)
		{
			mOnCommands[slot].execute();
			mUndoCommand = mOnCommands[slot];
		}
	}
	
	public void offButtonPressed(int slot)
	{
		if (slot >=0 && slot < 7)
		{
			mOffCommands[slot].execute();
			mUndoCommand = mOffCommands[slot];
		}
	}
	
	public void undoButtonPressed()
	{
		mUndoCommand.undo();
		
	}
	
	
	@Override
	public String toString()
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n----Remote Control----\n");
		for (int i = 0; i < mOnCommands.length; i++)
		{
			buffer.append("[slot " + i + "] " +mOnCommands[i].getClass().getSimpleName() + "\t" + mOffCommands[i].getClass().getSimpleName() +"\n");
		}
		return buffer.toString();
	}

}
