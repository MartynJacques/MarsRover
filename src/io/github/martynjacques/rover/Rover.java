package io.github.martynjacques.rover;

public class Rover {

    private Coordinates coordinates;
    private Direction direction;
    private final Plateau plateau;

    public Rover(Coordinates initialCoordinates, Direction initialDirection, Plateau plateau) {
        coordinates = initialCoordinates;
        direction = initialDirection;
        this.plateau = plateau;
    }

    @Override
    public String toString() {
        return coordinates +  " " + direction;
    }

    /*
        Moves the rover forward in the direction that its facing. Ignores
        the command if the rover will be sent off the plateau.
    */
    public void move() {
    	Coordinates coordAfterMove = coordinates.newCoordWithTranslation(
            direction.getXDelta(),
            direction.getYDelta()
        );

        if (plateau.coordinateIsInBounds(coordAfterMove))
            coordinates = coordAfterMove;
    }
    
    public void turnLeft() {
    	direction = direction.left();
    }
    
    public void turnRight() {
    	direction = direction.right();
    }
    
}

