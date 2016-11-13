package io.github.martynjacques.rover;

public class LeftCommand implements Command {
	
	public void runOn(Rover rover) {
		rover.turnLeft();
	}
	
}
