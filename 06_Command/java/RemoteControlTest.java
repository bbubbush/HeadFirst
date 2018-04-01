package com.bbubbush.github.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		// ���� ��Ʈ�� ��ü ����
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		// ������ �����ϴ� LightOnCommand�� ������ Light
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		// ���� ���� ���� GarageDoorOpenCommand�� ���� ���� GarageDoor
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		
		// ���� ��Ʈ�� ��ü���� ����
		remote.setCommand(lightOn);
		remote.buttonWasPressed();		// execute() �޼��带 ȣ����.  ���� �޼��� ���� ���ϼ��� ���ߴ°� �ٽ�
		
		remote.setCommand(garageDoorOpen);
		remote.buttonWasPressed();
	}
}
