package io.github.martynjacques.rover;

public class RightCommand implements Command {
	
	public void runOn(Rover rover) {
		rover.turnRight();
	}
	
}
