package io.github.martynjacques.rover;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlateauTest {

	@Test
	public void canDetectCoordinateInsidePlateau() {
		Plateau plateau = new Plateau(new Coordinates(5, 10));
		
		assertTrue(plateau.coordinateIsInBounds(new Coordinates(3, 7)));
	}
	
	@Test
	public void canDetectCoordinateOutsidePlateau() {
		Plateau plateau = new Plateau(new Coordinates(5, 10));
		
		assertFalse(plateau.coordinateIsInBounds(new Coordinates(6, 11)));
	}

}
