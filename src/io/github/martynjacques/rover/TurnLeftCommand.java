package io.github.martynjacques.rover;

public class TurnLeftCommand implements Command {
	
	public void execute(Rover rover) {
		rover.turnLeft();
	}
	
}
