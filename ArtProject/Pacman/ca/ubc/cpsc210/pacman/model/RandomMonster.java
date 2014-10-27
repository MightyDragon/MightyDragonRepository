package ca.ubc.cpsc210.pacman.model;

import java.awt.Color;

public class RandomMonster extends Monster {

	
	// Requires: b is a valid board
	// Modifies: this
	// Effects:  remembers b
	public RandomMonster(Board b) {
		board = b;
	}

	// Requires: b is a valid board and the position (x,y) is not a wall on b
	// Modifies: this
	// Effects:  remembers b, x and y
	public RandomMonster(Board b, int x, int y) {
		this(b);
		x_location = x;
		y_location = y;
	}

	// Requires: nothing
	// Modifies: nothing
	// Effects:  returns the CYAN colour for a random moving monster
	@Override
	public Color getColor() {
		return Color.CYAN;
	}

	
	
	// Requires: nothing
	// Modifies: this, board
	// Effects:  moves this sprite in a random direction on the board
	@Override
	public void makeMove() {
		
		do {
			double random = Math.random();
			if (random < 0.25) setDirection('L');
			else if (random < 0.5) setDirection('U');
			else if (random < 0.75) setDirection('R');
			else setDirection('D');
		} while (!canMakeMove());
		
		moveInCurrentDirection();
	}

	
}
