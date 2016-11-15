package io.github.martynjacques.rover;

import static org.junit.Assert.*;

import org.junit.Test;

public class TurnLeftCommandTest {

	@Test
	public void canRotateRoverLeft() {
		Rover marsRover = new Rover(
			new Plateau(new Coordinates(10, 10)),
			new Coordinates(3, 3),
			Direction.NORTH
		);
		
		TurnLeftCommand turnLeftCommand = new TurnLeftCommand();
		turnLeftCommand.execute(marsRover);
		
		assertEquals("3 3 W", marsRover.toString());
	}

}
