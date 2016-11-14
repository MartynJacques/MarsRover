package io.github.martynjacques.rover;

/*
 * Defines a rectangle represented as a pair of coordinates (bottom left and 
 * bottom right) in 2D space. 
 * 		 _____ (x, y)
 * 		|     |
 * 		|	  |
 * 		|_____|
 * (x, y)
 */
public class Plateau {
    private final Coordinates topRightCoord;
    private final Coordinates bottomLeftCoord;

    public Plateau(Coordinates topRightCoord) {
        this.topRightCoord = topRightCoord;
        // lower-left coordinates of a plateau are assumed to be 0, 0
        this.bottomLeftCoord = new Coordinates(0, 0);
    }

    /*
     * Check if coordinates fall inside this rectangle.
     */
    public boolean coordinateIsInBounds(Coordinates coordinates) {
        return bottomLeftCoord.hasOutside(coordinates)
                && topRightCoord.hasInside(coordinates);
    }

}

