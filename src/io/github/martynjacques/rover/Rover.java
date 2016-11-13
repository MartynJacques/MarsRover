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

    public void executeInstructions(String instructions) {
        for(char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'M':
                    move();
                    break;
                case 'L':
                    direction = direction.left();
                    break;
                case 'R':
                    direction = direction.right();
                    break;
                default:
                	// Ignore any unknown commands 
                    System.err.println("Unknown instruction, " + instruction + ", ignoring.");
            }
        }
    }

    /*
        Moves the rover forward in the direction that its facing. Ignores
        the command if the rover will be sent off the plateau.
    */
    private void move() {
    	Coordinates coordAfterMove = coordinates.newCoordWithTranslation(
            direction.getXDelta(),
            direction.getYDelta()
        );

        if (plateau.coordinateIsInBounds(coordAfterMove))
            coordinates = coordAfterMove;
    }
}

