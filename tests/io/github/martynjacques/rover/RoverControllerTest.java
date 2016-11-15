package io.github.martynjacques.rover;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RoverControllerTest {

	@Test
	public void canRunSpecifiedCommandsOnRover() {
    	Rover marsRover = new Rover(
    		new Plateau(new Coordinates(5, 5)),
        	new Coordinates(1, 2), 
        	Direction.NORTH
        );
        ArrayList<RoverCommand> commandList = new CommandParser("MLR").toRoverCommands();
        RoverController roverController = new RoverController();
        roverController.setCommandList(commandList);
        
        roverController.runCommandsOn(marsRover);
        
        assertEquals("1 3 N", marsRover.toString());
	}

}
