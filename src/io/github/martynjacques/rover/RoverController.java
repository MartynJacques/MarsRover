package io.github.martynjacques.rover;

import java.util.ArrayList;

/*
 * The invoker as per the command design pattern. Stores the commands to be 
 * execute by the rover and invokes the execution of these
 */
public class RoverController {
	private ArrayList<RoverCommand> commandList; 
	
	public void setCommandList(ArrayList<RoverCommand> commandList) {
		this.commandList = commandList;
	}
	
	/*
	 * Invokes the execution of each command in the commandList on 
	 * a specified rover.
	 */
	public void runCommandsOn(Rover rover) {
		for (RoverCommand cmd : commandList) {
			cmd.execute(rover);
		}
	}
	
}
