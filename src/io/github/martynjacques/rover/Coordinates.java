package io.github.martynjacques.rover;

public class Coordinates{

    private final int x;
    private final int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /*
        Returns a new coordinate which is this coordinate with the passed
        translation applied
    */
    public Coordinates newCoordWithTranslation(int xDelta, int yDelta) {
        return new Coordinates(x + xDelta, y + yDelta);
    }

    /*
        Returns true if the coordinate passed in is 'outside' of this coordinate
        i.e. iff the passed x coordinate is greater than or equal to this x
        coordinate and the passed y coordinate is greater than or equal to this
        y coordinate
    */
    public boolean hasOutside(Coordinates coordinate) {
        return coordinate.getX() >= x && coordinate.getY() >= y;
    }

    /*
        Returns true if the coordinate passed in is 'inside' of this coordinate
        i.e. iff the passed x coordinate is greater than or equal to this x
        coordinate and the passed y coordinate is greater than or equal to this
        y coordinate
    */
    public boolean hasInside(Coordinates coordinate) {
        return coordinate.getX() <= x && coordinate.getY() <= y;
    }
}

