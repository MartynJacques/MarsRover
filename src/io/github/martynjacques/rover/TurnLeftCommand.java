package io.github.martynjacques.rover;

public class TurnLeftCommand implements RoverCommand {
	
	/*
	 * Ask the rover to turn left
	 */
	public void execute(Rover rover) {
		rover.turnLeft();
	}
	
}
