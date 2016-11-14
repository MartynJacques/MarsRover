package io.github.martynjacques.rover;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class RoverTest {
    
	/*
	 * The first test case provided by ThoughtWorks
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
        ArrayList<RoverCommand> commandList = new CommandParser("LMLMLMLMM").toRoverCommands();
        RoverController roverController = new RoverController();
        roverController.setCommandList(commandList);
        
        // Execute the commands
        roverController.runCommandsOn(marsRover);
        
        // Check the result
        Assert.assertEquals("1 3 N", marsRover.toString());
    }
    
	/*
	 * The second test case provided by ThoughtWorks
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
        ArrayList<RoverCommand> commandList = new CommandParser("MMRMMRMRRM").toRoverCommands();
        RoverController roverController = new RoverController();
        roverController.setCommandList(commandList);
        
        // Execute the commands
        roverController.runCommandsOn(marsRover);
        
        // Check the result
        Assert.assertEquals("5 1 E", marsRover.toString());
    }

}
