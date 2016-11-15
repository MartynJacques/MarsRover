package io.github.martynjacques.rover;

import static org.junit.Assert.*;

import org.junit.Test;

public class DirectionTest {
	
	@Test
	public void canSetCorrectXDeltaForNorth() {
		assertEquals(Direction.NORTH.getXDelta(), 0);
	}
	
	@Test
	public void canSetCorrectYDeltaForNorth() {
		assertEquals(Direction.NORTH.getYDelta(), 1);
	}
	
	@Test
	public void canSetCorrectXDeltaForEast() {
		assertEquals(Direction.EAST.getXDelta(), 1);
	}
	
	@Test
	public void canSetCorrectYDeltaForEast() {
		assertEquals(Direction.EAST.getYDelta(), 0);
	}
	
	@Test
	public void canSetCorrectXDeltaForSouth() {
		assertEquals(Direction.SOUTH.getXDelta(), 0);
	}
	
	@Test
	public void canSetCorrectYDeltaForSouth() {
		assertEquals(Direction.SOUTH.getYDelta(), -1);
	}
	
	@Test
	public void canSetCorrectXDeltaForWest() {
		assertEquals(Direction.WEST.getXDelta(), -1);
	}
	
	@Test
	public void canSetCorrectYDeltaForWest() {
		assertEquals(Direction.WEST.getYDelta(), 0);
	}
	
	@Test
	public void canTurnLeftWhenNorth() {
		assertEquals(Direction.NORTH.left(), Direction.WEST);
	}
	
	@Test
	public void canTurnRightWhenNorth() {
		assertEquals(Direction.NORTH.right(), Direction.EAST);
	}
	
	@Test
	public void canTurnLeftWhenEast() {
		assertEquals(Direction.EAST.left(), Direction.NORTH);
	}
	
	@Test
	public void canTurnRightWhenEast() {
		assertEquals(Direction.EAST.right(), Direction.SOUTH);
	}
	
	@Test
	public void canTurnLeftWhenSouth() {
		assertEquals(Direction.SOUTH.left(), Direction.EAST);
	}
	
	@Test
	public void canTurnRightWhenSouth() {
		assertEquals(Direction.SOUTH.right(), Direction.WEST);
	}
	
	@Test
	public void canTurnLeftWhenWest() {
		assertEquals(Direction.WEST.left(), Direction.SOUTH);
	}
	
	@Test
	public void canTurnRightWhenWest() {
		assertEquals(Direction.WEST.right(), Direction.NORTH);
	}
	
	

}
