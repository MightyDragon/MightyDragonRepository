package src.model;

public class Pkmn {
	
	public static int counter = 0;
	
	Species species;
	
	// For lindo-friendly output
	public String code;
	
//	int experience;
	
	// TODO: getter and setter; setter can only set if the input is in the list of Abilities for the species
	// TODO: volatile ability
	Ability ability;
	
	private Move move1;
	private Move move2;
	private Move move3;
	private Move move4;
	
	private int pp1;
	private int pp2;
	private int pp3;
	private int pp4;
	
	// TODO: IVs, EVs, nature
	
	// TODO: set nature on creation
	private Nature nature = Nature.HARDY; // default is neutral
	
	// IVs [0,31]
	// all at 31 by default
	private int IVHP = 31;
	private int IVA = 31;
	private int IVD = 31;
	private int IVS = 31;
	private int IVSA = 31;
	private int IVSD = 31;
	
	// EVs
	// all at 0 by default
	// TODO: check out of bounds??
	private int EVHP = 0;
	private int EVA = 0;
	private int EVD = 0;
	private int EVS = 0;
	private int EVSA = 0;
	private int EVSD = 0;
	
	int currHP;
	Status statusCondition;
	int sleepCounter = 0;
	int badPsnCounter = 0;
	
	boolean flinch = false;
	
	boolean flashFire = false; // TODO: check this behaves properly
	
	public int getCurrHP() {
		return currHP;
	}

	public Species getSpecies() {
		return species;
	}

	public int getLevel() {
		return level;
	}

	public int getSleepCounter() {
		return sleepCounter;
	}

	public void setSleepCounter(int sleepCounter) {
		this.sleepCounter = sleepCounter;
	}

	public int getBadPsnCounter() {
		return badPsnCounter;
	}

	public void setBadPsnCounter(int badPsnCounter) {
		this.badPsnCounter = badPsnCounter;
	}

	public boolean isFlinch() {
		return flinch;
	}

	// will not set flinch = true if ability is Inner Focus
	public void setFlinch(boolean flinch) {
		if (flinch && ability == Ability.INNER_FOCUS) {
			return;
		}
		this.flinch = flinch;
	}
	
	/**
	 * Text display version of normal setFlinch
	 * @param flinch
	 * @param showText
	 */
	public void setFlinch(boolean flinch, boolean showText) {
		if (flinch && ability == Ability.INNER_FOCUS) {
			if (showText) {
				System.out.println(getName() + " won't flinch because of its Inner Focus!");
			}
			return;
		}
		this.flinch = flinch;
	}

	int level;
	
	int totalHP;
	int attack;
	int defence;
	int speed;
	int spAttack;
	int spDefence;
	
	int attackMod = 0;
	int defenceMod = 0;
	int spAttackMod = 0;
	int spDefenceMod = 0;
	int speedMod = 0;
	
	int accuracyMod = 0;
	int evasionMod = 0;
	
	/**
	 * Creates a new Pkmn object with max IVs and 0 EVs.  Nature is Hardy by default (a neutral nature) but a constructor 
	 * exists to set a different nature (Pkmn(Species, int, Nature)).  Sets ability to first ability in species list (if one exists).
	 */
	public Pkmn(Species s, int level) {
		species = s;
		this.level = level;
		initialiseStats();
		currHP = totalHP;
		statusCondition = Status.OKAY;
		if (!s.abilities.isEmpty()) {
			ability = s.abilities.get(0);
		}
		counter++;
	}
	
	/**
	 * Creates a new Pkmn object with max IVs and 0 EVs.
	 */
	public Pkmn(Species s, int level, Nature nat) {
		nature = nat;
		species = s;
		this.level = level;
		initialiseStats();
		currHP = totalHP;
		statusCondition = Status.OKAY;
		if (!s.abilities.isEmpty()) {
			ability = s.abilities.get(0);
		}
	}
	
	private void initialiseStats() {
		totalHP = (int) ((IVHP + (2 * species.getHP()) + EVHP/4 + 100) * level / 100 + 10);
		attack = (int) (((int) ((IVA + (2 * species.getAttack()) + EVA/4) * level / 100 + 5)) * nature.getAttackMod());
		defence = (int) (((int) ((IVD + (2 * species.getDefence()) + EVD/4) * level / 100 + 5)) * nature.getDefenceMod());
		speed = (int) (((int) ((IVS + (2 * species.getSpeed()) + EVS/4) * level / 100 + 5)) * nature.getSpeedMod());
		spAttack = (int) (((int) ((IVSA + (2 * species.getSpAttack()) + EVSA/4) * level / 100 + 5)) * nature.getSpAttackMod());
		spDefence = (int) (((int) ((IVSD + (2 * species.getSpDefence()) + EVSD/4) * level / 100 + 5)) * nature.getSpDefenceMod());
	}
	
	/**
	 * Sets the Pkmn's ability to <code>a</code> if the Pkmn's species has <code>a</code> in its abilities list.
	 * Otherwise, nothing happens (prints notification to console).
	 * @param a the ability to set this Pkmn to have (does not need to be valid for the species, but will not apply ability if invalid)
	 */
	public void setAbility(Ability a) {
		if (species.abilities.contains(a)) {
			ability = a;
			return;
		}
		System.out.println(a.name + " is not a valid ability for " + species.name + ".");
		if (ability != null) {
			System.out.println("The current ability is " + ability.name + ".");
			return;
		}
		System.out.println("There is currently no assigned ability.");
	}
	
	public Ability getAbility() {
		return ability;
	}
	
	// TODO: (for all "setMove"s) check for moves already set, decide action (overwrite/delete?)
	public void setMoveset4(Move m1, Move m2, Move m3, Move m4) {
		setMove4(m4);
		setMoveset3(m1, m2, m3);
	}

	public void setMoveset3(Move m1, Move m2, Move m3) {
		setMove3(m3);
		setMoveset2(m1, m2);
	}

	public void setMoveset2(Move m1, Move m2) {
		setMove2(m2);
		setMoveset1(m1);
	}

	public void setMoveset1(Move m1) {
//		System.out.println(Thread.currentThread().toString());
		setMove1(m1);
	}
	
	private void setMove1(Move m1) {
		move1 = m1;
		pp1 = m1.pp;
	}
	
	private void setMove2(Move m2) {
		move2 = m2;
		pp2 = m2.pp;
	}
	
	private void setMove3(Move m3) {
		move3 = m3;
		pp3 = m3.pp;
	}
	
	private void setMove4(Move m4) {
		move4 = m4;
		pp4 = m4.pp;
	}
	
	public int getTotalHP() {
		return totalHP;
	}
	
	public Status getStatus() {
		return statusCondition;
	}
	
	// TODO: guards, checks?
	public void setStatus(Status s) {
		statusCondition = s;
	}
	
	public int getIVHP() {
		return IVHP;
	}

	public void setIVHP(int iVHP) {
		IVHP = iVHP;
	}

	public int getIVA() {
		return IVA;
	}

	public void setIVA(int iVA) {
		IVA = iVA;
	}

	public int getIVD() {
		return IVD;
	}

	public void setIVD(int iVD) {
		IVD = iVD;
	}

	public int getIVS() {
		return IVS;
	}

	public void setIVS(int iVS) {
		IVS = iVS;
	}

	public int getIVSA() {
		return IVSA;
	}

	public void setIVSA(int iVSA) {
		IVSA = iVSA;
	}

	public int getIVSD() {
		return IVSD;
	}

	public void setIVSD(int iVSD) {
		IVSD = iVSD;
	}

	public void setAllEVs(int hp, int att, int def, int spAtt, int spDef, int spd) {
		setEVHP(hp);
		setEVA(att);
		setEVD(def);
		setEVSA(spAtt);
		setEVSD(spDef);
		setEVS(spd);
		// TODO: responses to out of bounds/invalid inputs
	}
	
	public int getEVHP() {
		return EVHP;
	}

	public void setEVHP(int eVHP) {
		EVHP = eVHP;
	}

	public int getEVA() {
		return EVA;
	}

	public void setEVA(int eVA) {
		EVA = eVA;
	}

	public int getEVD() {
		return EVD;
	}

	public void setEVD(int eVD) {
		EVD = eVD;
	}

	public int getEVS() {
		return EVS;
	}

	public void setEVS(int eVS) {
		EVS = eVS;
	}

	public int getEVSA() {
		return EVSA;
	}

	public void setEVSA(int eVSA) {
		EVSA = eVSA;
	}

	public int getEVSD() {
		return EVSD;
	}

	public void setEVSD(int eVSD) {
		EVSD = eVSD;
	}

	public int getAttackMod() {
		return attackMod;
	}

	public int getDefenceMod() {
		return defenceMod;
	}

	public int getSpAttackMod() {
		return spAttackMod;
	}

	public int getSpDefenceMod() {
		return spDefenceMod;
	}

	public int getSpeedMod() {
		return speedMod;
	}

	public int getAccuracyMod() {
		return accuracyMod;
	}

	public int getEvasionMod() {
		return evasionMod;
	}
	
	// TODO: possibly text?
	public boolean incAttackMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (attackMod < 6);
		attackMod = Math.min(attackMod + i, 6);
		return ret;
	}
	
	public boolean decAttackMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (attackMod > -6);
		attackMod = Math.max(attackMod - i, -6);
		return ret;
	}
	
	public boolean incDefenceMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (defenceMod < 6);
		defenceMod = Math.min(defenceMod + i, 6);
		return ret;
	}
	
	public boolean decDefenceMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (defenceMod > -6);
		defenceMod = Math.max(defenceMod - i, -6);
		return ret;
	}
	
	public boolean incSpAttackMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (spAttackMod < 6);
		spAttackMod = Math.min(spAttackMod + i, 6);
		return ret;
	}
	
	public boolean decSpAttackMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (spAttackMod > -6);
		spAttackMod = Math.max(spAttackMod - i, -6);
		return ret;
	}
	
	public boolean incSpDefenceMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (spDefenceMod < 6);
		spDefenceMod = Math.min(spDefenceMod + i, 6);
		return ret;
	}
	
	public boolean decSpDefenceMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (spDefenceMod > -6);
		spDefenceMod = Math.max(spDefenceMod - i, -6);
		return ret;
	}
	
	public boolean incSpeedMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (speedMod < 6);
		speedMod = Math.min(speedMod + i, 6);
		return ret;
	}
	
	public boolean decSpeedMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (speedMod > -6);
		speedMod = Math.max(speedMod - i, -6);
		return ret;
	}
	
	public boolean incAccuracyMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (accuracyMod < 6);
		accuracyMod = Math.min(accuracyMod + i, 6);
		return ret;
	}
	
	public boolean decAccuracyMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (accuracyMod > -6);
		accuracyMod = Math.max(accuracyMod - i, -6);
		return ret;
	}
	
	public boolean incEvasionMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (evasionMod < 6);
		evasionMod = Math.min(evasionMod + i, 6);
		return ret;
	}
	
	public boolean decEvasionMod() {
		int i = 1;
		if (ability == Ability.SIMPLE) { i++; }
		boolean ret = (evasionMod > -6);
		evasionMod = Math.max(evasionMod - i, -6);
		return ret;
	}


	/**
	 * Used to calculate the multiplying factor of a stat modifier at level i. Assumes a valid stat mod (|i| < 7) but will work for any int.
	 * Note: evasion and accuracy have a different formula; use calculateModFactorAcc for these.
	 * @param i the stage of the modifier
	 * @return the multiplying factor a mod of the given stage has on its associated stat
	 */
	private double calculateModFactor(int i) {
		double factor = Math.pow((2+Math.abs(i))/2, Math.signum(i));
		
		return factor;
	}
	
	private double calculateModFactorAcc(int i) {
		double factor = Math.pow((3+Math.abs(i))/3, Math.signum(i));
		
		return factor;
	}
	
	public int getModifiedAttack() {
		double abilityBoost = 1;
		if (ability == Ability.HUGE_POWER || ability == Ability.PURE_POWER) { abilityBoost = 2; }
		if (ability == Ability.HUSTLE) { abilityBoost = 1.5; }
		if (ability == Ability.GUTS) {
			switch (statusCondition.code) {
			case "BRN":
			case "PAR":
			case "PSN":
			case "BADPSN":
			case "SLP":
				abilityBoost = 1.5;
				break;
			}
		}
		if (ability == Ability.TOXIC_BOOST && (statusCondition == Status.BAD_POISON || statusCondition == Status.POISON)) { abilityBoost = 1.5; }
		if (ability == Ability.DEFEATIST && currHP <= totalHP/2) { abilityBoost = 0.5; }
		return (int) (attack * calculateModFactor(attackMod) * abilityBoost);
	}
	
	public int getModifiedDefence() {
		double abilityBoost = 1;
		if (ability == Ability.MARVEL_SCALE && statusCondition != Status.OKAY) { abilityBoost = 1.5; }
		return (int) (defence * calculateModFactor(defenceMod) * abilityBoost);
	}
	
	public int getModifiedSpAttack() {
		double abilityBoost = 1;
		if (ability == Ability.DEFEATIST && currHP <= totalHP/2) { abilityBoost = 0.5; }
		if (ability == Ability.FLARE_BOOST && statusCondition == Status.BURN) { abilityBoost = 1.5; }
		return (int) (spAttack * calculateModFactor(spAttackMod) * abilityBoost);
	}
	
	public int getModifiedSpDefence() {
		return (int) (spDefence * calculateModFactor(spDefenceMod));
	}
	
	public int getModifiedSpeed() {
		double abilityBoost = 1;
		if (statusCondition.equals(Status.PARALYSIS) && ability != Ability.QUICK_FEET) { abilityBoost = abilityBoost/4; }
		if (ability == Ability.QUICK_FEET && statusCondition != Status.OKAY) { abilityBoost = abilityBoost * 1.5; }
		return (int) (speed * calculateModFactor(speedMod) * abilityBoost);
	}
	
	public int getModifiedAccuracy() {
		return (int) (calculateModFactorAcc(accuracyMod));
	}
	
	public int getModifiedEvasion() {
		return (int) (calculateModFactorAcc(evasionMod));
	}
	
	public String getName() {
		return species.name;
	}
	
	public void resetMods() {
		attackMod = 0;
		defenceMod = 0;
		spAttackMod = 0;
		spDefenceMod = 0;
		speedMod = 0;
		
		accuracyMod = 0;
		evasionMod = 0;
	}
	
	// Requires: 1 <= i <= 4 (defaults to 1 otherwise)
	public Move getMove(int i) {
		switch (i) {
			case 4: return move4;
			case 3: return move3;
			case 2: return move2;
			default: return move1;
		}
	}
	
	// Requires: 1 <= i <= 4 (returns false otherwise)
	public boolean hasMove(int i) {
		boolean ret = false;
		switch (i) {
		case 1: ret = (move1 != null); break;
		case 2: ret = (move2 != null); break;
		case 3: ret = (move3 != null); break;
		case 4: ret = (move4 != null); break;
		default: System.out.println("Invalid move selection for hasMove(" + i + ")");
	}
	return ret;
	}
	
	// Requires: 1 <= i <= 4 (returns 0 otherwise and prints message to console)
	// Returns 0 if movei is null
	public int getPP(int i) {
		int ret = 0;
		switch (i) {
			case 1: ret = pp1; break;
			case 2: ret = pp2; break;
			case 3: ret = pp3; break;
			case 4: ret = pp4; break;
			default: System.out.println("Invalid move selection for getPP(" + i + ")");
		}
		return ret;
	}
	
	// Returns: usedMove - true if move used in a way that counts as a turn; false otherwise
	// If i == 0, use Struggle
	public boolean useMoveIndex(int i, Pkmn target, boolean showText) {
		boolean usedMove = false;
		switch (i) {
		// TODO: check for things that block moves (disable, taunt, etc)
			case 1:
				if (pp1 < 1) {
					System.out.println("Out of PP!");
				} else {
					pp1--;
					usedMove = useMoveFromPkmn(move1, target, showText);
				}
				break;
			case 2:
				if (pp2 < 1) {
					System.out.println("Out of PP!");
				} else {
					pp2--;
					usedMove = useMoveFromPkmn(move2, target, showText);
				}
				break;
			case 3:
				if (pp3 < 1) {
					System.out.println("Out of PP!");
				} else {
					pp3--;
					usedMove = useMoveFromPkmn(move3, target, showText);
				}
				break;
			case 4:
				if (pp4 < 1) {
					System.out.println("Out of PP!");
				} else {
					pp4--;
					usedMove = useMoveFromPkmn(move4, target, showText);
				}
				break;
			case 0:
				usedMove = true;
				Move.STRUGGLE.useMove(this, target, showText);
				break;
			default:
				System.out.println("Invalid selection");
				break;
		}
		return usedMove;
	}

	private boolean useMoveFromPkmn(Move m, Pkmn target, boolean showText) {
		boolean usedMove = true;
		// TODO: target selection!
		m.useMove(this, target, showText);
		return usedMove;
	}

	public void damage(int damage, boolean showText) {
		int newHP = currHP - damage;
		if (ability == Ability.STURDY && currHP == totalHP) {
			if (showText && newHP <=0) {
				System.out.println(getName() + " held on with Sturdy!"); // TODO: does not take effect for recoil, status, weather, etc...
			}
			newHP = Math.max(newHP, 1);
		}
		if (newHP <= 0) {
			faint(showText); 
		} else {
			currHP = newHP;
			if (showText) {
				System.out.println(species.name + " HP: " + currHP + "/" + totalHP); // TODO: work on this
			}
		}
	}

	public void faint(boolean showText) {
		currHP = 0;
		statusCondition = Status.FAINT;
		if (showText) {
			System.out.println(species.name + " fainted!");
		}
	}
	
	public void heal(int amount, boolean showText) {
		if (statusCondition != Status.FAINT && amount > 0) {
			currHP = Math.min(currHP + amount, totalHP);
			if (showText) {
				System.out.println(species.name + " recovered HP!");
				System.out.println(species.name + " HP: " + currHP + "/" + totalHP); // TODO: work on this
			}
		}
	}
	
	public void reset() {
		currHP = totalHP;
		statusCondition = Status.OKAY;
		if (move1 != null) { pp1 = move1.pp; }
		if (move2 != null) { pp2 = move2.pp; }
		if (move3 != null) { pp3 = move3.pp; }
		if (move4 != null) { pp4 = move4.pp; }
		resetMods();
		sleepCounter = 0;
		badPsnCounter = 0;
		flinch = false;
		flashFire = false;
	}

	@Override
	public String toString() {
		return species.name + " - level " + level;
	}
	
	public void printObj() {
		System.out.println(species.name);
		String types = species.type1.toString();
		if (species.type2 != null) {
			types = types.concat(" / " + species.type2.toString());
		}
		System.out.println(types);
		System.out.println("level " + level);
		System.out.println("HP: " + currHP + "/" + totalHP);
		System.out.println("Status: " + statusCondition.name + " (" + statusCondition.code + ")");
	}
	
	public void printObjStats() {
		printObj();
		System.out.println("Attack: " + attack);
		System.out.println("Defence: " + defence);
		System.out.println("SpAttack: " + spAttack);
		System.out.println("SpDefence: " + spDefence);
		System.out.println("Speed: " + speed);
	}
	
	public void printObjMoves() {
		printObj();
		if (move1 != null) {
			System.out.println("Move 1: " + move1.name + " (" + move1.type.toString().toUpperCase() + ")");
			System.out.println("PP: " + pp1 + "/" + move1.pp);
		} else {
			System.out.println("Move 1: --");
			System.out.println();
		}
		if (move2 != null) {
			System.out.println("Move 2: " + move2.name + " (" + move2.type.toString().toUpperCase() + ")");
			System.out.println("PP: " + pp2 + "/" + move2.pp);
		} else {
			System.out.println("Move 2: --");
			System.out.println();
		}
		if (move3 != null) {
			System.out.println("Move 3: " + move3.name + " (" + move3.type.toString().toUpperCase() + ")");
			System.out.println("PP: " + pp3 + "/" + move3.pp);
		} else {
			System.out.println("Move 3: --");
			System.out.println();
		}
		if (move4 != null) {
			System.out.println("Move 4: " + move4.name + " (" + move4.type.toString().toUpperCase() + ")");
			System.out.println("PP: " + pp4 + "/" + move4.pp);
		} else {
			System.out.println("Move 4: --");
			System.out.println();
		}
	}
	
	public static int getCounterPkmn() {
	    return counter;
	}

}
