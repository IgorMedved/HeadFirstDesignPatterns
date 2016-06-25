package pattern06_command_pattern.commands;

public class NoCommand implements Command
{

	@Override
	public void execute()
	{
		System.out.println("do nothing");
	}
	
	public void undo()
	{
		System.out.println("undo nothing");
	}

}
