package io.github.martynjacques.rover;

public class MoveCommand implements RoverCommand {
	
	/*
	 * Ask the rover to move
	 */
	public void execute(Rover rover) {
		rover.move();
	}
	
}
