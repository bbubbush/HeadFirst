package com.bbubbush.github.command;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		
		CeilingFan ceilingFan = new CeilingFan("My Room");
		CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		remote.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remote.setCommand(1, ceilingFanLow, ceilingFanOff);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		System.out.println(remote);
		remote.undoButtonWasPushed();
		remote.onButtonWasPushed(1);
		System.out.println(remote);
		remote.undoButtonWasPushed();
//		
		
		
		
	}
}
