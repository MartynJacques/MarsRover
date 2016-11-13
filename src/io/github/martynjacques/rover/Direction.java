package io.github.martynjacques.rover;

/*
 * Depending on the Direction we are facing a move command will involve a translation
 * along the x or y axis in a positive or negative direction. The translations
 * for each direction are:
 * If facing north, a move will result in the location x, y+1
 * If facing south, a move will result in the location x, y-1
 * If facing east, a move will result in the location x+1, y
 * If facing west, a move will result in the location x-1, y
 */

public enum Direction {
    NORTH(0,1) {
        @Override
        public Direction left() { return WEST; }

        @Override
        public Direction right() { return EAST; }
    },
    EAST(1,0) {
        @Override
        public Direction right() { return SOUTH; }

        @Override
        public Direction left() { return NORTH; }
    },
    SOUTH(0,-1) {
        @Override
        public Direction right() { return WEST; }

        @Override
        public Direction left() { return EAST; }
    },
    WEST(-1,0) {
        @Override
        public Direction right() { return NORTH; }

        @Override
        public Direction left() { return SOUTH; }
    };

    private final int xDelta;
    private final int yDelta;

    Direction(int xDelta, int yDelta) {
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // Abstract methods overwritten by each different direction
    public abstract Direction right();
    public abstract Direction left();

    public int getXDelta() {
        return xDelta;
    }

    public int getYDelta() {
        return yDelta;
    }
    
    @Override
    public String toString() {
    	return String.valueOf(name().charAt(0));
    }
}
