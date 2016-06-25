package pattern06_command_pattern.commands;

import pattern06_command_pattern.receivers.Stereo;

public class StereoOffCommand implements Command
{
	private Stereo mStereo;
	
	
	public StereoOffCommand(Stereo stereo)
	{
		
		mStereo = stereo;
	}


	@Override
	public void execute()
	{
		mStereo.off();
		
	}


	@Override
	public void undo()
	{
		// TODO Auto-generated method stub
		
	}
	
	

}
