package io.github.martynjacques.rover;

import org.junit.Assert;

import java.util.ArrayList;

import org.junit.Test;

public class CommandParserTest {

	@Test
	public void canReturnAnArrayListContainingEachCommand() {
		CommandParser cp = new CommandParser("MLR");
		ArrayList<RoverCommand> commandAsCommandObjects = cp.toRoverCommands();
		
		Assert.assertTrue(commandAsCommandObjects.get(0) instanceof MoveCommand);
		Assert.assertTrue(commandAsCommandObjects.get(1) instanceof TurnLeftCommand);
		Assert.assertTrue(commandAsCommandObjects.get(2) instanceof TurnRightCommand);
	}
	
	@Test
	public void canIgnoreUnknownCommand() {
		CommandParser cp = new CommandParser("MLXR");
		ArrayList<RoverCommand> commandAsCommandObjects = cp.toRoverCommands();
		
		// Should only have 3 elements which are M L and R commands
		Assert.assertEquals(commandAsCommandObjects.size(), 3);
		Assert.assertTrue(commandAsCommandObjects.get(0) instanceof MoveCommand);
		Assert.assertTrue(commandAsCommandObjects.get(1) instanceof TurnLeftCommand);
		Assert.assertTrue(commandAsCommandObjects.get(2) instanceof TurnRightCommand);
	}

}
