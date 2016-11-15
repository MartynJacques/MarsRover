package io.github.martynjacques.rover;

import static org.junit.Assert.*;
import org.junit.Test;

public class MoveCommandTest {

	@Test
	public void canMoveRover() {
		Rover marsRover = new Rover(
			new Plateau(new Coordinates(10, 10)),
			new Coordinates(3, 3),
			Direction.NORTH
		);
		
		MoveCommand moveCommand = new MoveCommand();
		moveCommand.execute(marsRover);
		
		assertEquals("3 4 N", marsRover.toString());
	}
	
}
