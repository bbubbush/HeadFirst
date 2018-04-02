package com.bbubbush.github.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		// ���� ��Ʈ�� ��ü ����
		RemoteControl remoteControl = new RemoteControl();
		
		// ������ �����ϴ� LightOnCommand�� ������ Light
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
		
		// ���� ���� ���� GarageDoorOpenCommand�� ���� ���� GarageDoor
//		GarageDoor garageDoor = new GarageDoor();
//		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
//		
//		// ���� ��Ʈ�� ��ü���� ����
//		remote.setCommand(lightOn);
//		remote.buttonWasPressed();		// execute() �޼��带 ȣ����.  ���� �޼��� ���� ���ϼ��� ���ߴ°� �ٽ�
//		
//		remote.setCommand(garageDoorOpen);
//		remote.buttonWasPressed();
	}
}
