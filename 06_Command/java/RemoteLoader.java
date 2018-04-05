package com.bbubbush.github.command;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		
		CeilingFan ceilingFan = new CeilingFan("My Room");
		CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		
		Light light = new Light("Living Room");
		Stereo stereo = new Stereo("Living Room");
		
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		Command[] partyOn = {lightOn, stereoOn};
		Command[] partyOff = {lightOff, stereoOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		
		
		remote.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remote.setCommand(1, ceilingFanLow, ceilingFanOff);
		remote.setCommand(2, partyOnMacro, partyOffMacro);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		System.out.println(remote);
		remote.undoButtonWasPushed();
		remote.onButtonWasPushed(1);
		System.out.println(remote);
		remote.undoButtonWasPushed();
		System.out.println(remote);
		remote.onButtonWasPushed(2);
		remote.offButtonWasPushed(2);
		remote.undoButtonWasPushed();
//		
		
		
		
	}
}
