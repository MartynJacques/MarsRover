package io.github.martynjacques.rover;

import org.junit.Test;
import org.junit.Assert;

public class RoverTest {
    
    @Test
    public void testFirstProvidedTestCase() {
    	Coordinates plateauBounds = new Coordinates(5, 5);
        Plateau plateau = new Plateau(plateauBounds);
        Coordinates startingPosition = new Coordinates(1, 2);
        Rover marsRover = new Rover(startingPosition, Direction.NORTH, plateau);

        marsRover.executeInstructions("LMLMLMLMM");

        Assert.assertEquals("1 3 N", marsRover.toString());
    }
    
    @Test
    public void testSecondProvidedTestCase() {
    	Coordinates plateauBounds = new Coordinates(5, 5);
        Plateau plateau = new Plateau(plateauBounds);
        Coordinates startingPosition = new Coordinates(3, 3);
        Rover marsRover = new Rover(startingPosition, Direction.EAST, plateau);

        marsRover.executeInstructions("MMRMMRMRRM");

        Assert.assertEquals("5 1 E", marsRover.toString());
    }

}
