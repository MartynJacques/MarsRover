package io.github.martynjacques.rover;

import java.util.ArrayList;


public class RoverController {
	private ArrayList<Command> commandList; 
	
	public void setCommandList(ArrayList<Command> commandList) {
		this.commandList = commandList;
	}
	
	public void runCommandsOn(Rover rover) {
		for (Command cmd : commandList) {
			cmd.execute(rover);
		}
	}
	
}
