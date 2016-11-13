package io.github.martynjacques.rover;

public class Plateau {
    private final Coordinates topRightCoord;
    private final Coordinates bottomLeftCoord;

    public Plateau(Coordinates topRightCoord) {
        this.topRightCoord = topRightCoord;
        this.bottomLeftCoord = new Coordinates(0, 0);
    }

    public boolean coordinateIsInBounds(Coordinates coordinates) {
        return bottomLeftCoord.hasOutside(coordinates)
                && topRightCoord.hasInside(coordinates);
    }

}

