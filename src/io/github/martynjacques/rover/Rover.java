package io.github.martynjacques.rover;

public class Rover {

    private Coordinates coordinate;
    private Direction direction;
    private Plateau plateau;

    public Rover(Coordinates coordinate, Direction direction, Plateau plateau) {
        this.coordinate = coordinate;
        this.direction = direction;
        this.plateau = plateau;
    }

    @Override
    public String toString() {
        return coordinate +  " " + direction;
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
                    System.err.println("Unknown instruction, exiting now.");
                    System.exit(2);
            }
        }
    }

    /*
        Moves the rover forward in the direction that its facing. Ignores
        the command if the rover will be sent off the plateau.
    */
    private void move() {
    	Coordinates coordAfterMove = coordinate.newCoordWithTranslation(
            direction.getXDelta(),
            direction.getYDelta()
        );

        if (plateau.coordinateIsInBounds(coordAfterMove))
            coordinate = coordAfterMove;
    }
}

