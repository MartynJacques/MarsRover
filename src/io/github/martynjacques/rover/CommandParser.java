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
					commandList.add(new TurnLeftCommand());
					break;
				case 'R':
					commandList.add(new TurnRightCommand());
					break;
			}
		}
		
		return commandList;
	}
	
}
