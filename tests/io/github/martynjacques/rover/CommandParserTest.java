package io.github.martynjacques.rover;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CommandParserTest {

	@Test
	public void canReturnAnArrayListContainingEachCommand() {
		CommandParser cp = new CommandParser("MLR");
		ArrayList<RoverCommand> commandAsCommandObjects = cp.toRoverCommands();
		
		assertTrue(commandAsCommandObjects.get(0) instanceof MoveCommand);
		assertTrue(commandAsCommandObjects.get(1) instanceof TurnLeftCommand);
		assertTrue(commandAsCommandObjects.get(2) instanceof TurnRightCommand);
	}
	
	@Test
	public void canIgnoreUnknownCommand() {
		CommandParser cp = new CommandParser("MLXR");
		ArrayList<RoverCommand> commandAsCommandObjects = cp.toRoverCommands();
		
		// Should only have 3 elements which are M L and R commands
		assertEquals(commandAsCommandObjects.size(), 3);
		assertTrue(commandAsCommandObjects.get(0) instanceof MoveCommand);
		assertTrue(commandAsCommandObjects.get(1) instanceof TurnLeftCommand);
		assertTrue(commandAsCommandObjects.get(2) instanceof TurnRightCommand);
	}

}
