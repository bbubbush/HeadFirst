package com.bbubbush.github.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		// 매인 컨트롤 객체 생성
		RemoteControl remoteControl = new RemoteControl();
		
		// 전등을 제어하는 LightOnCommand와 전등인 Light
		Light livingRoomLight = new Light("Living Room");
		Light kitchenRoomLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
		
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
		LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		StereoOnWithCDCommand stereoOnWithCd = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, garageDoorOpen, garageDoorDown);
		remoteControl.setCommand(4, stereoOnWithCd, stereoOff);
		
		System.out.println(remoteControl);
		System.out.println();
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(2);
		
		remoteControl.offButtonWasPushed(2);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		
		remoteControl.undoButtonWasPushed();
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		
		// 차고 문을 여는 GarageDoorOpenCommand와 차고 문인 GarageDoor
//		GarageDoor garageDoor = new GarageDoor();
//		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
//		
//		// 메인 컨트롤 객체에서 제어
//		remote.setCommand(lightOn);
//		remote.buttonWasPressed();		// execute() 메서드를 호출함.  실행 메서드 명이 통일성을 갖추는게 핵심
//		
//		remote.setCommand(garageDoorOpen);
//		remote.buttonWasPressed();
	}
}
