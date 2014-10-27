package ca.ubc.cpsc210.pacman.model;

import java.awt.Color;

public abstract class Monster extends Sprite {
	
	protected char direction = 'R';

	
	public Monster() {
		super();
	}

	@Override
	public abstract void makeMove();

	@Override
	public abstract Color getColor();

}