package com.bbubbush.github.command;

public interface Command {
	public void execute();
	public void undo();
}
