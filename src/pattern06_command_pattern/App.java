package pattern06_command_pattern;

import pattern06_command_pattern.commands.CeilingFanHighCommand;
import pattern06_command_pattern.commands.CeilingFanMediumCommand;
import pattern06_command_pattern.commands.CeilingFanOffCommand;
import pattern06_command_pattern.commands.GarageDoorDownCommand;
import pattern06_command_pattern.commands.GarageDoorOpenCommand;
import pattern06_command_pattern.commands.LightOffCommand;
import pattern06_command_pattern.commands.LightOnCommand;
import pattern06_command_pattern.commands.StereoOffCommand;
import pattern06_command_pattern.commands.StereoOnWithCdCommand;
import pattern06_command_pattern.receivers.CeilingFan;
import pattern06_command_pattern.receivers.GarageDoor;
import pattern06_command_pattern.receivers.Light;
import pattern06_command_pattern.receivers.Stereo;

public class App
{
	public static void main (String[] args)
	{
		/****************************  test 1 ******************************
		 
		Light livingRoomLight = new Light("Living room");
		 
		Light kitchenLight = new Light ("Kitchen");
		CeilingFan fan = new CeilingFan("Living room");
		GarageDoor door = new GarageDoor("");
		Stereo stereo = new Stereo ("");
		
		RemoteControl remote = new RemoteControl();
		
		
		LightOnCommand livingLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);
		GarageDoorDownCommand doorClosed = new GarageDoorDownCommand(door);
		
		CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);
		CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(fan);
		
		StereoOnWithCdCommand stereoOn = new StereoOnWithCdCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		remote.setCommand(0, livingLightOn, livingLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, fanHigh, fanOff);
		remote.setCommand(3, doorOpen, doorClosed);
		remote.setCommand(4, stereoOn, stereoOff);
		
		System.out.println(remote);
		
		for (int i = 0; i < 7; i++)
		{
			remote.onButtonPressed(i);
			remote.offButtonPressed(i);
		} */
		
		
		/***************** test 2 *******************
		Light light = new Light("");
		
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		RemoteControl remote = new RemoteControl();
		remote.setCommand(0, lightOn, lightOff);
		remote.onButtonPressed(0);
		remote.undoButtonPressed();
		remote.offButtonPressed(0);*/
		
		
		/***************** test 3 *******************/
		 
		CeilingFan fan = new CeilingFan("Living Room");
		
		CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(fan);
		CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);
		CeilingFanMediumCommand fanMedium = new CeilingFanMediumCommand(fan);
		
		RemoteControl remote = new RemoteControl();
		remote.setCommand(1, fanHigh, fanOff);
		remote.setCommand(0, fanMedium, fanOff);
		
		remote.onButtonPressed(0);
		
		remote.offButtonPressed(0);
		remote.undoButtonPressed();
		
		remote.onButtonPressed(1);
		remote.undoButtonPressed();
		remote.undoButtonPressed();
		remote.undoButtonPressed();
		
		
		
	}
	
	
	

}
