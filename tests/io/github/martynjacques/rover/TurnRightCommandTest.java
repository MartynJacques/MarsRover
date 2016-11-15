package io.github.martynjacques.rover;

import static org.junit.Assert.*;

import org.junit.Test;

public class TurnRightCommandTest {

	@Test
	public void canRotateRoverRight() {
		Rover marsRover = new Rover(
			new Plateau(new Coordinates(10, 10)),
			new Coordinates(3, 3),
			Direction.NORTH
		);
		
		TurnRightCommand turnRightCommand = new TurnRightCommand();
		turnRightCommand.execute(marsRover);
		
		assertEquals("3 3 E", marsRover.toString());
	}

}
