package com.bbubbush.github.command;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		// TODO Auto-generated constructor stub
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ceilingFan.medium();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ceilingFan.off();
	}
}
