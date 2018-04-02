package com.bbubbush.github.command;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;
	public GarageDoorDownCommand(GarageDoor garageDoor) {
		// TODO Auto-generated constructor stub
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.down();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garageDoor.up();
	}
}
