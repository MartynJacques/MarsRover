package io.github.martynjacques.rover;

/*
 * A pair of integers (x, y) representing an location in 2D coordinate space
 */
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
     * Return a new point which is this point translated by xDelta in the x 
     * direction and yDelta in the y direction
     */
    public Coordinates newCoordWithTranslation(int xDelta, int yDelta) {
        return new Coordinates(x + xDelta, y + yDelta);
    }

    /*
     * Returns true iff the passed x coordinate >= this x coordinate 
     * and the passed y coordinate >= this y coordinate i.e. the coordinates
     * lie outside 
     */
    public boolean hasOutside(Coordinates coordinate) {
        return coordinate.getX() >= x && coordinate.getY() >= y;
    }

    /*
     * Returns true iff the passed x coordinate <= this x coordinate 
     * and the passed y coordinate <= this y coordinate i.e. the coordinates
     * lie inside 
     */
    public boolean hasInside(Coordinates coordinate) {
        return coordinate.getX() <= x && coordinate.getY() <= y;
    }
 
}

