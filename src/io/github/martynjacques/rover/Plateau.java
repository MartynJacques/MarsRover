package io.github.martynjacques.rover;

public class Plateau {
    private final Coordinates topRightCoord;
    private final Coordinates bottomLeftCoord;

    public Plateau(Coordinates topRightCoord) {
        this.topRightCoord = topRightCoord;
        // lower-left coordinates of a plateau are assumed to be 0, 0
        this.bottomLeftCoord = new Coordinates(0, 0);
    }

    public boolean coordinateIsInBounds(Coordinates coordinates) {
        return bottomLeftCoord.hasOutside(coordinates)
                && topRightCoord.hasInside(coordinates);
    }

}

