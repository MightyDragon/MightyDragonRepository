package ca.ubc.cpsc210.pacman.model;

import java.util.LinkedList;
import java.util.List;

public class GridLocation {
	
	private List<Monster> monsterSprites = new LinkedList<Monster>();
	private Pacman pacman = null;
	//private Sprite sprite = null;
	private boolean hasFood = false;
	private boolean isWall = false;
	
	// Requires: type is a valid grid location type (W, D, or E)
	// Modifies: this
	// Effects: sets up this as the proper type, a Wall, Food Location, or Empty
	public GridLocation(char type) {
		switch (type) {
		case 'W':
			isWall = true; break;
		case 'D':
			addFood(); break;
		case 'E': 
			break;
		default:
			throw new Error("Unknown grid location type.");
		}
	}
	
	// Requires: a valid grid type type, and a Sprite s
	// Modifies: this
	// Effects:  remembers s, and sets up this location given by the type type
	public GridLocation(char type, Sprite s) {
		this(type);
		addSprite(s);
	}
	
	/*
	// Requires: a valid grid type type, and a Pacman s
	// Modifies: this
	// Effects:  remembers s, and sets up this location given by the type type
	public GridLocation(char type, Pacman s) {
		this(type);
		addSprite(s);
	}
	
	// Requires: a valid grid type type, and a TrackerMonster s
	// Modifies: this
	// Effects:  remembers s, and sets up this location given by the type type
	public GridLocation(char type, TrackerMonster s) {
		this(type);
		addSprite(s);
	}
	
	// Requires: a valid grid type type, and a RandomMonster s
	// Modifies: this
	// Effects:  remembers s, and sets up this location given by the type type
	public GridLocation(char type, RandomMonster s) {
		this(type);
		addSprite(s);
	}
	*/

	// Requires: nothing
	// Modifies: nothing
	// Effects:  returns false if this location is a wall
	public boolean isPassable() {
		return !isWall;
	}
	
	// Requires: nothing
	// Modifies: nothing
	// Effects:  returns true if this location has food
	public boolean hasFood() {
		return hasFood;
	}
	
	// Requires: nothing
	// Modifies: nothing
	// Effects:  returns true if this location has a TrackerMonster, RandomMonster or Pacman in it
	public boolean hasSprite() {
		return !monsterSprites.isEmpty() || pacman != null;
	}
	
	/*
	// Requires: nothing
	// Modifies: this
	// Effects:  removes s as a RandomMonster of this location if it was here in the first place
	public void removeSprite(RandomMonster s) {
		randomMonsterSprites.remove(s);	
	}
	
	// Requires: s is a valid RandomMonster on the board
	// Modifies: this
	// Effects:  adds s to this location
	public void addSprite(RandomMonster s) {
		randomMonsterSprites.add(s);
	}
	
	// Requires: nothing
	// Modifies: this
	// Effects:  removes s from this location
	public void removeSprite(Sprite s) {
		monsterSprites.remove(s);
}
	
	// Requires: s is a valid sprite on the board
	// Modifies: this
	// Effects:  adds s to this location
	public void addSprite(TrackerMonster s) {
		monsterSprites.add(s);
	}
	*/
	
	// Requires: nothing
	// Modifies: this
	// Effects:  removes s from this location
	public void removeSprite(Sprite s) {
		if (s instanceof Monster) {
			monsterSprites.remove(s);
		} else {
			pacman = null;
		}
	}
	
	// Requires: s is a valid sprite on the board
	// Modifies: this
	// Effects:  adds s to this location and consumes the food if s is Pacman
	public void addSprite(Sprite s) {
		if (s instanceof Monster) {
			monsterSprites.add((Monster) s);
		} else {
			pacman = (Pacman) s;
			
			// Sprite eats the food
			consumeFood();
		}
	}

	/*
	// Requires: nothing 
	// Modifies: nothing
	// Effects:  returns Pacman (if any) at this grid location (null if none)
	public Pacman getPacman() {
		return pacman;
	}
	*/
	
	/*
	// Requires: nothing 
	// Modifies: nothing
	// Effects:  returns the top sprite of RandomMonsters (if any) at this grid location (null if none)
	public RandomMonster getRandomMonster() {
		return randomMonsterSprites.isEmpty() ? null : randomMonsterSprites.get(0);
	}
	*/

	/*
	// Requires: nothing 
	// Modifies: nothing
	// Effects:  returns the top sprite of Monsters (if any) at this grid location (null if none)
	public Monster getMonster() {
		return monsterSprites.isEmpty() ? null : monsterSprites.get(0);
	}
	*/
	
	// Requires: nothing 
	// Modifies: nothing
	// Effects:  returns Sprite (if any) at this grid location (null if none)
	public Sprite getSprite() {
		if (monsterSprites.isEmpty()) {
			return pacman;
		} else {
			return monsterSprites.isEmpty() ? null : monsterSprites.get(0);
		}
	}


	public void consumeFood() {
		hasFood = false;
	}

	public void addFood() {
		hasFood = true;		
	}
}
