package io.github.martynjacques.rover;

public class MoveCommand implements Command {
	
	public void runOn(Rover rover) {
		rover.move();
	}
	
}
