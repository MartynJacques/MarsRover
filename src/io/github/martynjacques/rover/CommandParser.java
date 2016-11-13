package io.github.martynjacques.rover;

import java.util.ArrayList;

public class CommandParser {
	
	private String commands;
	
	public CommandParser(String commands) {
		this.commands = commands;
	}
	
	public ArrayList<Command> toRoverCommands() {
		ArrayList<Command> commandList = new ArrayList<Command>();
		for (char commandChar : commands.toCharArray()) {
			switch (commandChar) {
				case 'M':
					commandList.add(new MoveCommand());
					break;
				case 'L':
					commandList.add(new LeftCommand());
					break;
				case 'R':
					commandList.add(new RightCommand());
					break;
				default:
					System.err.println("Unknown command," + commandChar + ", ignoring.");
			}
		}
		
		return commandList;
	}
	
}
