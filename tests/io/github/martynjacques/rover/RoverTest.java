package io.github.martynjacques.rover;

import org.junit.Test;
import org.junit.Assert;

public class RoverTest {

	@Test
	public void canGiveLocationAndDirectionAsString() {
		Rover marsRover = new Rover(
			new Plateau(new Coordinates(10, 10)),
			new Coordinates(3, 3),
			Direction.NORTH
		);
		
		Assert.assertEquals("3 3 N", marsRover.toString());
	}
	
	@Test
	public void canMove() {
		Rover marsRover = new Rover(
			new Plateau(new Coordinates(10, 10)),
			new Coordinates(3, 3),
			Direction.NORTH
		);
		
		marsRover.move();
		
		Assert.assertEquals("3 4 N", marsRover.toString());
	}
	
	@Test
	public void canTurnLeft() {
		Rover marsRover = new Rover(
			new Plateau(new Coordinates(10, 10)),
			new Coordinates(3, 3),
			Direction.NORTH
		);
		
		marsRover.turnLeft();
		
		Assert.assertEquals("3 3 W", marsRover.toString());
	}
	
	@Test
	public void canTurnRight() {
		Rover marsRover = new Rover(
			new Plateau(new Coordinates(10, 10)),
			new Coordinates(3, 3),
			Direction.NORTH
		);
		
		marsRover.turnRight();
		
		Assert.assertEquals("3 3 E", marsRover.toString());
	}
	
	@Test
	public void canNotGoOffPlateau() {
		Rover marsRover = new Rover(
			new Plateau(new Coordinates(10, 10)),
			new Coordinates(3, 3),
			Direction.NORTH
		);
		
		// move forward 15 times then turn right, then move forward 15 times again
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 15; j++) {
				marsRover.move();
			}
			marsRover.turnRight();
		}
		
		Assert.assertEquals("10 10 S", marsRover.toString());
	}

}
