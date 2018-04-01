package com.bbubbush.github.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		// 매인 컨트롤 객체 생성
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		// 전등을 제어하는 LightOnCommand와 전등인 Light
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		// 차고 문을 여는 GarageDoorOpenCommand와 차고 문인 GarageDoor
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		
		// 메인 컨트롤 객체에서 제어
		remote.setCommand(lightOn);
		remote.buttonWasPressed();		// execute() 메서드를 호출함.  실행 메서드 명이 통일성을 갖추는게 핵심
		
		remote.setCommand(garageDoorOpen);
		remote.buttonWasPressed();
	}
}
