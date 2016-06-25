package pattern06_command_pattern.commands;

import pattern06_command_pattern.receivers.Stereo;

public class StereoOnWithCdCommand implements Command
{
   private Stereo mStereo;
   
   public StereoOnWithCdCommand(Stereo stereo)
   {
	   mStereo = stereo;
   }

   @Override
   public void execute()
   {
	  mStereo.on();
	  mStereo.setCD();
   }

@Override
public void undo()
{
	// TODO Auto-generated method stub
	
}
   
  
   
   
}
