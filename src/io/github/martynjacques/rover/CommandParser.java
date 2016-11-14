package io.github.martynjacques.rover;

import java.util.ArrayList;

/*
 * Takes a string of commands as input (e.g. "MMLRLMM") and exposes behaviour 
 * to convert these into a list of implemented RoverCommands which can be executed
 * by the invoker.
 */
public class CommandParser {
	
	private String commands;
	
	public CommandParser(String commands) {
		this.commands = commands;
	}
	
	public ArrayList<RoverCommand> toRoverCommands() {
		ArrayList<RoverCommand> commandList = new ArrayList<RoverCommand>();
		for (char commandChar : commands.toCharArray()) {
			switch (commandChar) {
				case 'M':
					commandList.add(new MoveCommand());
					break;
				case 'L':
					commandList.add(new TurnLeftCommand());
					break;
				case 'R':
					commandList.add(new TurnRightCommand());
			}
		}
		
		return commandList;
	}
	
}
