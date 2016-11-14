package io.github.martynjacques.rover;

/*
 * Represents a rover which is deployed onto a plateau with initial coordinates and direction.
 * Exposes functionality that represent actions it can do. This is the reciever as per the 
 * command design pattern. 
 */
public class Rover {

    private Coordinates coordinates;
    private Direction direction;
    private final Plateau plateau;

    public Rover(Plateau plateau, Coordinates initialCoordinates, Direction initialDirection) {
        coordinates = initialCoordinates;
        direction = initialDirection;
        this.plateau = plateau;
    }

    @Override
    public String toString() {
        return coordinates +  " " + direction;
    }

    /*
     * Moves the rover forward in the direction that it's facing. Doesn't carry out the move
     * if the rover will be sent off the plateau.
     */
    public void move() {
    	Coordinates coordAfterMove = coordinates.newCoordWithTranslation(
            direction.getXDelta(),
            direction.getYDelta()
        );

        if (plateau.coordinateIsInBounds(coordAfterMove))
            coordinates = coordAfterMove;
    }
    
    /*
     * Rotates the rover left by 90degrees.
     */
    public void turnLeft() {
    	direction = direction.left();
    }
    
    /*
     * Rotates the rover right by 90degrees.
     */
    public void turnRight() {
    	direction = direction.right();
    }
    
}

