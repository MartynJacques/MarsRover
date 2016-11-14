package io.github.martynjacques.rover;

/*
 * Command interface as per the command design pattern. 
 * Implemented by any commands to be run on the rover
 */
public interface RoverCommand {
	
	// Ask the receiver (rover) to carry out the required operation
	public void execute(Rover rover);
	
}
