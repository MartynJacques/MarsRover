package io.github.martynjacques.rover;

public class TurnRightCommand implements RoverCommand {
	
	/*
	 * Ask the rover to turn right
	 */
	public void execute(Rover rover) {
		rover.turnRight();
	}
	
}
