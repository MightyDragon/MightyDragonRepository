package org.arpit.java2blog;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;


import ca.ubc.cpsc210.pacman.model.Board;
import ca.ubc.cpsc210.pacman.model.GridLocation;
import ca.ubc.cpsc210.pacman.model.Pacman;
import ca.ubc.cpsc210.pacman.model.RandomMonster;
import ca.ubc.cpsc210.pacman.model.Sprite;
import ca.ubc.cpsc210.pacman.model.TrackerMonster;
import ca.ubc.cpsc210.pacman.ui.BoardPanel;
import ca.ubc.cpsc210.pacman.ui.Game;
import ca.ubc.cpsc210.pacman.ui.GridLocationPanel;


public class PacmanClassCollector {

	ArrayList<Class> classes = new ArrayList<Class>();
	
	public PacmanClassCollector(){
		this.makeClasses();
		StringWriter sw = new StringWriter();
		new Throwable().printStackTrace(new PrintWriter(sw));
		System.out.println("Current stack trace is:\n\t" + sw.toString());
	
	}
	
	public void makeClasses(){
		classes.add(Board.class);
		classes.add(GridLocation.class);
		classes.add(Pacman.class);
		classes.add(RandomMonster.class);
		classes.add(Sprite.class);
		classes.add(TrackerMonster.class);
		classes.add(BoardPanel.class);
		classes.add(Game.class);
		classes.add(GridLocationPanel.class);
		
		
	}
	
	public ArrayList<Class> getClasses(){
		return classes;
	}
	
	public void Links(){
		
	}
}
