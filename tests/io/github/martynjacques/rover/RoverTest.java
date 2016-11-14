package io.github.martynjacques.rover;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;


public class RoverTest {
    
	/*
	 * The first test case provided with the challenge:
	 * INPUT:
	 * 5 5
	 * 1 2 N
	 * LMLMLMLMM
	 * EXPECTED OUTPUT:
	 * 1 3 N
	 */
    @Test
    public void testFirstProvidedTestCase() {
        // Initialise rover
    	Rover marsRover = new Rover(
    		new Plateau(new Coordinates(5, 5)),
        	new Coordinates(1, 2), 
        	Direction.NORTH
        );
        // Parse commands and send to controller
        ArrayList<Command> commandList = new CommandParser("LMLMLMLMM").toRoverCommands();
        RoverController rc = new RoverController();
        rc.setCommandList(commandList);
        
        // Execute the commands
        rc.runCommandsOn(marsRover);
        
        // Check the result
        Assert.assertEquals("1 3 N", marsRover.toString());
    }
    
	/*
	 * The second test case provided with the challenge:
	 * INPUT:
	 * 5 5
	 * 3 3 E
	 * MMRMMRMRRM
	 * EXPECTED OUTPUT:
	 * 5 1 E
	 */
    @Test
    public void testSecondProvidedTestCase() {
        // Initialise rover
    	Rover marsRover = new Rover(
    		new Plateau(new Coordinates(5, 5)),
        	new Coordinates(3, 3), 
        	Direction.EAST
        );
        // Parse commands and send to controller
        ArrayList<Command> commandList = new CommandParser("MMRMMRMRRM").toRoverCommands();
        RoverController rc = new RoverController();
        rc.setCommandList(commandList);
        
        // Execute the commands
        rc.runCommandsOn(marsRover);
        
        // Check the result
        Assert.assertEquals("5 1 E", marsRover.toString());
    }

}
