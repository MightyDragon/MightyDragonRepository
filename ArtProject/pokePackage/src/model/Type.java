package src.model;

import java.util.ArrayList;
import java.util.List;

public class Type {
	
	static Type NORMAL = new Type("Normal", false);
	static Type FIGHTING = new Type("Fighting", false);
	static Type FLYING = new Type("Flying", false);
	static Type POISON = new Type("Poison", false);
	static Type GROUND = new Type("Ground", false);
	static Type ROCK = new Type("Rock", false);
	static Type BUG = new Type("Bug", false);
	static Type GHOST = new Type("Ghost", false);
	static Type STEEL = new Type("Steel", false);
	static Type FIRE = new Type("Fire", true);
	static Type WATER = new Type("Water", true);
	static Type GRASS = new Type("Grass", true);
	static Type ELECTRIC = new Type("Electric", true);
	static Type PSYCHIC = new Type("Psychic", true);
	static Type ICE = new Type("Ice", true);
	static Type DRAGON = new Type("Dragon", true);
	static Type DARK = new Type("Dark", true);
	static Type UNKNOWN = new Type("???", false);
	static Type TYPELESS = new Type("Typeless", false); // for Struggle, confusion damage
	
	static {
		NORMAL.addAttackIneffective(ROCK);
		NORMAL.addAttackIneffective(STEEL);
		NORMAL.addAttackImmune(GHOST);
		NORMAL.addDefendEffective(FIGHTING);
		NORMAL.addDefendImmune(GHOST);
		
		FIGHTING.addAttackEffective(NORMAL);
		FIGHTING.addAttackEffective(ROCK);
		FIGHTING.addAttackEffective(STEEL);
		FIGHTING.addAttackEffective(ICE);
		FIGHTING.addAttackEffective(DARK);
		FIGHTING.addAttackIneffective(POISON);
		FIGHTING.addAttackIneffective(FLYING);
		FIGHTING.addAttackIneffective(BUG);
		FIGHTING.addAttackIneffective(PSYCHIC);
		FIGHTING.addAttackImmune(GHOST);
		FIGHTING.addDefendIneffective(BUG);
		FIGHTING.addDefendIneffective(DARK);
		FIGHTING.addDefendIneffective(ROCK);
		FIGHTING.addDefendEffective(FLYING);
		FIGHTING.addDefendEffective(PSYCHIC);
		
		FLYING.addAttackEffective(BUG);
		FLYING.addAttackEffective(FIGHTING);
		FLYING.addAttackEffective(GRASS);
		FLYING.addAttackIneffective(ELECTRIC);
		FLYING.addAttackIneffective(ROCK);
		FLYING.addAttackIneffective(STEEL);
		FLYING.addDefendIneffective(BUG);
		FLYING.addDefendIneffective(FIGHTING);
		FLYING.addDefendIneffective(GRASS);
		FLYING.addDefendEffective(ELECTRIC);
		FLYING.addDefendEffective(ICE);
		FLYING.addDefendEffective(ROCK);
		FLYING.addDefendImmune(GROUND);
		FLYING.grounded = false;
		
		POISON.addAttackEffective(GRASS);
		POISON.addAttackIneffective(GHOST);
		POISON.addAttackIneffective(GROUND);
		POISON.addAttackIneffective(POISON);
		POISON.addAttackIneffective(ROCK);
		POISON.addAttackImmune(STEEL);
		POISON.addDefendIneffective(BUG);
		POISON.addDefendIneffective(FIGHTING);
		POISON.addDefendIneffective(POISON);
		POISON.addDefendIneffective(GRASS);
		POISON.addDefendEffective(GROUND);
		POISON.addDefendEffective(PSYCHIC);
		POISON.statusImmunities.add(Status.POISON);
		POISON.statusImmunities.add(Status.BAD_POISON);
		
		GROUND.addAttackEffective(ELECTRIC);
		GROUND.addAttackEffective(FIRE);
		GROUND.addAttackEffective(POISON);
		GROUND.addAttackEffective(ROCK);
		GROUND.addAttackEffective(STEEL);
		GROUND.addAttackIneffective(BUG);
		GROUND.addAttackIneffective(GRASS);
		GROUND.addAttackImmune(FLYING);
		GROUND.addDefendIneffective(POISON);
		GROUND.addDefendIneffective(ROCK);
		GROUND.addDefendEffective(ICE);
		GROUND.addDefendEffective(GRASS);
		GROUND.addDefendEffective(WATER);
		GROUND.addDefendImmune(ELECTRIC);
		
		ROCK.addAttackEffective(BUG);
		ROCK.addAttackEffective(FIRE);
		ROCK.addAttackEffective(FLYING);
		ROCK.addAttackEffective(ICE);
		ROCK.addAttackIneffective(FIGHTING);
		ROCK.addAttackIneffective(GROUND);
		ROCK.addAttackIneffective(STEEL);
		ROCK.addDefendIneffective(FIRE);
		ROCK.addDefendIneffective(FLYING);
		ROCK.addDefendIneffective(NORMAL);
		ROCK.addDefendIneffective(POISON);
		ROCK.addDefendEffective(FIGHTING);
		ROCK.addDefendEffective(GRASS);
		ROCK.addDefendEffective(GROUND);
		ROCK.addDefendEffective(STEEL);
		ROCK.addDefendEffective(WATER);
		ROCK.weatherImmunities.add(Weather.SANDSTORM);
		
		BUG.addAttackEffective(DARK);
		BUG.addAttackEffective(GRASS);
		BUG.addAttackEffective(PSYCHIC);
		BUG.addAttackIneffective(FIGHTING);
		BUG.addAttackIneffective(FIRE);
		BUG.addAttackIneffective(FLYING);
		BUG.addAttackIneffective(GHOST);
		BUG.addAttackIneffective(POISON);
		BUG.addAttackIneffective(STEEL);
		BUG.addDefendIneffective(FIGHTING);
		BUG.addDefendIneffective(GRASS);
		BUG.addDefendIneffective(GROUND);
		BUG.addDefendEffective(FIRE);
		BUG.addDefendEffective(FLYING);
		BUG.addDefendEffective(ROCK);
		
		GHOST.addAttackEffective(GHOST);
		GHOST.addAttackEffective(PSYCHIC);
		GHOST.addAttackIneffective(DARK);
		GHOST.addAttackIneffective(STEEL);
		GHOST.addAttackImmune(NORMAL);
		GHOST.addDefendIneffective(BUG);
		GHOST.addDefendIneffective(POISON);
		GHOST.addDefendEffective(DARK);
		GHOST.addDefendEffective(GHOST);
		GHOST.addDefendImmune(FIGHTING);
		GHOST.addDefendImmune(NORMAL);
		
		STEEL.addAttackEffective(ICE);
		STEEL.addAttackEffective(ROCK);
		STEEL.addAttackIneffective(ELECTRIC);
		STEEL.addAttackIneffective(FIRE);
		STEEL.addAttackIneffective(STEEL);
		STEEL.addAttackIneffective(WATER);
		STEEL.addDefendIneffective(BUG);
		STEEL.addDefendIneffective(DARK);
		STEEL.addDefendIneffective(DRAGON);
		STEEL.addDefendIneffective(FLYING);
		STEEL.addDefendIneffective(GHOST);
		STEEL.addDefendIneffective(GRASS);
		STEEL.addDefendIneffective(ICE);
		STEEL.addDefendIneffective(NORMAL);
		STEEL.addDefendIneffective(PSYCHIC);
		STEEL.addDefendIneffective(ROCK);
		STEEL.addDefendIneffective(STEEL);
		STEEL.addDefendEffective(FIGHTING);
		STEEL.addDefendEffective(FIRE);
		STEEL.addDefendEffective(GROUND);
		STEEL.addDefendImmune(POISON);
		STEEL.statusImmunities.add(Status.POISON);
		STEEL.statusImmunities.add(Status.BAD_POISON);
		
		FIRE.addAttackEffective(BUG);
		FIRE.addAttackEffective(GRASS);
		FIRE.addAttackEffective(ICE);
		FIRE.addAttackEffective(STEEL);
		FIRE.addAttackIneffective(DRAGON);
		FIRE.addAttackIneffective(FIRE);
		FIRE.addAttackIneffective(ROCK);
		FIRE.addAttackIneffective(WATER);
		FIRE.addDefendIneffective(BUG);
		FIRE.addDefendIneffective(FIRE);
		FIRE.addDefendIneffective(GRASS);
		FIRE.addDefendIneffective(ICE);
		FIRE.addDefendIneffective(STEEL);
		FIRE.addDefendEffective(GROUND);
		FIRE.addDefendEffective(ROCK);
		FIRE.addDefendEffective(WATER);
		FIRE.statusImmunities.add(Status.BURN);
		
		WATER.addAttackEffective(FIRE);
		WATER.addAttackEffective(GROUND);
		WATER.addAttackEffective(ROCK);
		WATER.addAttackIneffective(DRAGON);
		WATER.addAttackIneffective(GRASS);
		WATER.addAttackIneffective(WATER);
		WATER.addDefendIneffective(FIRE);
		WATER.addDefendIneffective(ICE);
		WATER.addDefendIneffective(STEEL);
		WATER.addDefendIneffective(WATER);
		WATER.addDefendEffective(ELECTRIC);
		WATER.addDefendEffective(GRASS);
		
		GRASS.addAttackEffective(GROUND);
		GRASS.addAttackEffective(ROCK);
		GRASS.addAttackEffective(WATER);
		GRASS.addAttackIneffective(BUG);
		GRASS.addAttackIneffective(DRAGON);
		GRASS.addAttackIneffective(FIRE);
		GRASS.addAttackIneffective(FLYING);
		GRASS.addAttackIneffective(GRASS);
		GRASS.addAttackIneffective(POISON);
		GRASS.addAttackIneffective(STEEL);
		GRASS.addDefendIneffective(ELECTRIC);
		GRASS.addDefendIneffective(GRASS);
		GRASS.addDefendIneffective(GROUND);
		GRASS.addDefendIneffective(WATER);
		GRASS.addDefendEffective(BUG);
		GRASS.addDefendEffective(FIRE);
		GRASS.addDefendEffective(FLYING);
		GRASS.addDefendEffective(ICE);
		GRASS.addDefendEffective(POISON);
		
		ELECTRIC.addAttackEffective(FLYING);
		ELECTRIC.addAttackEffective(WATER);
		ELECTRIC.addAttackIneffective(DRAGON);
		ELECTRIC.addAttackIneffective(ELECTRIC);
		ELECTRIC.addAttackIneffective(GRASS);
		ELECTRIC.addAttackImmune(GROUND);
		ELECTRIC.addDefendIneffective(ELECTRIC);
		ELECTRIC.addDefendIneffective(FLYING);
		ELECTRIC.addDefendIneffective(STEEL);
		ELECTRIC.addDefendEffective(GROUND);
		
		PSYCHIC.addAttackEffective(FIGHTING);
		PSYCHIC.addAttackEffective(POISON);
		PSYCHIC.addAttackIneffective(PSYCHIC);
		PSYCHIC.addAttackIneffective(STEEL);
		PSYCHIC.addAttackImmune(DARK);
		PSYCHIC.addDefendIneffective(FIGHTING);
		PSYCHIC.addDefendIneffective(PSYCHIC);
		PSYCHIC.addDefendEffective(BUG);
		PSYCHIC.addDefendEffective(DARK);
		PSYCHIC.addDefendEffective(GHOST);
		
		ICE.addAttackEffective(DRAGON);
		ICE.addAttackEffective(FLYING);
		ICE.addAttackEffective(GRASS);
		ICE.addAttackEffective(GROUND);
		ICE.addAttackIneffective(FIRE);
		ICE.addAttackIneffective(ICE);
		ICE.addAttackIneffective(STEEL);
		ICE.addAttackIneffective(WATER);
		ICE.addDefendIneffective(ICE);
		ICE.addDefendEffective(FIGHTING);
		ICE.addDefendEffective(FIRE);
		ICE.addDefendEffective(ROCK);
		ICE.addDefendEffective(STEEL);
		ICE.weatherImmunities.add(Weather.HAIL);
		
		DRAGON.addAttackEffective(DRAGON);
		DRAGON.addAttackIneffective(STEEL);
		DRAGON.addDefendIneffective(ELECTRIC);
		DRAGON.addDefendIneffective(FIRE);
		DRAGON.addDefendIneffective(GRASS);
		DRAGON.addDefendIneffective(WATER);
		DRAGON.addDefendEffective(DRAGON);
		DRAGON.addDefendEffective(ICE);
		
		DARK.addAttackEffective(GHOST);
		DARK.addAttackEffective(PSYCHIC);
		DARK.addAttackIneffective(DARK);
		DARK.addAttackIneffective(FIGHTING);
		DARK.addAttackIneffective(STEEL);
		DARK.addDefendIneffective(DARK);
		DARK.addDefendIneffective(GHOST);
		DARK.addDefendEffective(BUG);
		DARK.addDefendEffective(FIGHTING);
		DARK.addDefendImmune(PSYCHIC);
	}
	
	
	@Override
	public String toString() {
		return name;
	}

	String name;
	
	List<Type> attackEffective;
	List<Type> attackIneffective;
	List<Type> attackImmune;
	
	List<Type> defendEffective;
	List<Type> defendIneffective;
	List<Type> defendImmune;
	
	boolean special;
	
	boolean grounded;
	
	List<Status> statusImmunities;
	List<Weather> weatherImmunities;
	
	public Type(String name, boolean special) {
		this.name = name;
		this.special = special;
		grounded = true;
		attackEffective = new ArrayList<Type>();
		attackIneffective = new ArrayList<Type>();
		attackImmune = new ArrayList<Type>();
		defendEffective = new ArrayList<Type>();
		defendIneffective = new ArrayList<Type>();
		defendImmune = new ArrayList<Type>();
		statusImmunities = new ArrayList<Status>();
		weatherImmunities = new ArrayList<Weather>();
	}
	
	public String getName() {
		return name;
	}

	public List<Type> getAttackEffective() {
		return attackEffective;
	}

	public List<Type> getAttackIneffective() {
		return attackIneffective;
	}

	public List<Type> getAttackImmune() {
		return attackImmune;
	}

	public List<Type> getDefendEffective() {
		return defendEffective;
	}

	public List<Type> getDefendIneffective() {
		return defendIneffective;
	}

	public List<Type> getDefendImmune() {
		return defendImmune;
	}

	public boolean isSpecial() {
		return special;
	}

	public boolean isGrounded() {
		return grounded;
	}

	public List<Status> getStatusImmunities() {
		return statusImmunities;
	}

	public List<Weather> getWeatherImmunities() {
		return weatherImmunities;
	}

	public void addAttackEffective(Type t) {
		attackEffective.add(t);
	}
	
	public void addAttackIneffective(Type t) {
		attackIneffective.add(t);
	}
	
	public void addAttackImmune(Type t) {
		attackImmune.add(t);
	}
	
	public void addDefendEffective(Type t) {
		defendEffective.add(t);
	}
	
	public void addDefendIneffective(Type t) {
		defendIneffective.add(t);
	}
	
	public void addDefendImmune(Type t) {
		defendImmune.add(t);
	}

}
