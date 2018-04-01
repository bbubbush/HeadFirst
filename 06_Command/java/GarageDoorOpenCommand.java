package com.bbubbush.github.command;

public class GarageDoorOpenCommand implements Command{
	GarageDoor garageDoor;
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		// TODO Auto-generated constructor stub
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.up();
	}
}
