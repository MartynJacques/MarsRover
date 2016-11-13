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
        Plateau plateau = new Plateau(new Coordinates(5, 5));
        Rover marsRover = new Rover(new Coordinates(1, 2), Direction.NORTH, plateau);
        CommandParser cmdParser = new CommandParser("LMLMLMLMM");
        ArrayList<Command> commandList = cmdParser.toRoverCommands();
        for (Command cmd : commandList) {
        	cmd.runOn(marsRover);
        }

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
		Plateau plateau = new Plateau(new Coordinates(5, 5));
		Rover marsRover = new Rover(new Coordinates(3, 3), Direction.EAST, plateau);
		CommandParser cmdParser = new CommandParser("MMRMMRMRRM");
		ArrayList<Command> commandList = cmdParser.toRoverCommands();
		for (Command cmd : commandList) {
			cmd.runOn(marsRover);
		}
		
		Assert.assertEquals("5 1 E", marsRover.toString());
    }

}
