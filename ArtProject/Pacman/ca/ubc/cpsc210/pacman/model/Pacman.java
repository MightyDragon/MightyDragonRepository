package ca.ubc.cpsc210.pacman.model;

import java.awt.Color;

public class Pacman extends Sprite {
	
	protected char direction = 'L';

	// Requires: b is a valid board
	// Modifies: this
	// Effects:  remembers b
	public Pacman(Board b) {
		board = b;
	}

	// Requires: nothing
	// Modifies: nothing
	// Effects: returns the colour of pacman
	@Override
	public Color getColor() {
		return Color.YELLOW;
	}

	@Override
	public void makeMove() {
		moveInCurrentDirection();
	}

}
