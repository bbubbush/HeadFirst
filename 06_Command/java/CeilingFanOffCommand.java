package com.bbubbush.github.command;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		// TODO Auto-generated constructor stub
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ceilingFan.off();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ceilingFan.medium();
	}
}
