package io.github.martynjacques.rover;

import static org.junit.Assert.*;
import org.junit.Test;

public class CoordinatesTest {

	@Test
	public void canPrintAsStringInCorrectFormat() {
		Coordinates coordinates = new Coordinates(10, 10);
		assertEquals("10 10", coordinates.toString());
	}
	
	@Test
	public void canGetYCoordinate() {
		Coordinates coordinates = new Coordinates(10, 15);
		assertEquals(15, coordinates.getY());
	}
	
	@Test
	public void canGetXCoordinate() {
		Coordinates coordinates = new Coordinates(10, 15);
		assertEquals(10, coordinates.getX());
	}
	
	@Test
	public void canGetNewCoordinateWithTranlationApplied() {
		Coordinates coordinates = new Coordinates(10, 15);
		Coordinates translatedCoordinates = coordinates.newCoordWithTranslation(5, 3);
		assertEquals(translatedCoordinates.getX(), 15);
		assertEquals(translatedCoordinates.getY(), 18);
	}
	
	@Test
	public void canCheckForOutsideCoordinates() {
		Coordinates coordinates = new Coordinates(10, 15);
		Coordinates outsideCoordinates = new Coordinates(11, 16);
		assertTrue(coordinates.hasOutside(outsideCoordinates));
	}
	
	@Test
	public void canCheckForInsideCoordinates() {
		Coordinates coordinates = new Coordinates(10, 15);
		Coordinates outsideCoordinates = new Coordinates(10, 15);
		assertTrue(coordinates.hasInside(outsideCoordinates));
	}

}
