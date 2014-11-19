package src.model;

public class Nature {
	
	public static int counter = 0;
	
	public static Nature HARDY = new Nature("Hardy", "A", "A");
	public static Nature LONELY = new Nature("Lonely", "A", "D");
	public static Nature BRAVE = new Nature("Brave", "A", "SP");
	public static Nature ADAMANT = new Nature("Adamant", "A", "SA");
	public static Nature NAUGHTY = new Nature("Naughty", "A", "SD");
	public static Nature BOLD = new Nature("Bold", "D", "A");
	public static Nature DOCILE = new Nature("Docile", "D", "D");
	public static Nature RELAXED = new Nature("Relaxed", "D", "SP");
	public static Nature IMPISH = new Nature("Impish", "D", "SA");
	public static Nature LAX = new Nature("Lax", "D", "SD");
	public static Nature TIMID = new Nature("Timid", "SP", "A");
	public static Nature HASTY = new Nature("Hasty", "SP", "D");
	public static Nature SERIOUS = new Nature("Serious", "SP", "SP");
	public static Nature JOLLY = new Nature("Jolly", "SP", "SA");
	public static Nature NAIVE = new Nature("Naive", "SP", "SD");
	public static Nature MODEST = new Nature("Modest", "SA", "A");
	public static Nature MILD = new Nature("Mild", "SA", "D");
	public static Nature QUIET = new Nature("Quiet", "SA", "SP");
	public static Nature BASHFUL = new Nature("Bashful", "SA", "SA");
	public static Nature RASH = new Nature("Rash", "SA", "SD");
	public static Nature CALM = new Nature("Calm", "SD", "A");
	public static Nature GENTLE = new Nature("Gentle", "SD", "D");
	public static Nature SASSY = new Nature("Sassy", "SD", "SP");
	public static Nature CAREFUL = new Nature("Careful", "SD", "SA");
	public static Nature QUIRKY = new Nature("Quirky", "SD", "SD");
	
	public String name;
	
	String inc; // A, D, SA, SD, SP
	String dec;
	
	private double attackMod = 1;
	private double defenceMod = 1;
	private double spAttackMod = 1;
	private double spDefenceMod = 1;
	private double speedMod = 1;
	
	public Nature(String name, String inc, String dec) {
		this.name = name;
		this.inc = inc;
		this.dec = dec;

		if (inc != dec) {

			switch (inc) {
			case "A":
				attackMod = 1.1;
				break;
			case "D":
				defenceMod = 1.1;
				break;
			case "SA":
				spAttackMod = 1.1;
				break;
			case "SD":
				spDefenceMod = 1.1;
				break;
			case "SP":
				speedMod = 1.1;
				break;
			}

			switch (dec) {
			case "A":
				attackMod = 0.9;
				break;
			case "D":
				defenceMod = 0.9;
				break;
			case "SA":
				spAttackMod = 0.9;
				break;
			case "SD":
				spDefenceMod = 0.9;
				break;
			case "SP":
				speedMod = 0.9;
				break;
			}
		}
		counter++;
	}

	public String getInc() {
		return inc;
	}

	public String getDec() {
		return dec;
	}

	public double getAttackMod() {
		return attackMod;
	}

	public double getDefenceMod() {
		return defenceMod;
	}

	public double getSpAttackMod() {
		return spAttackMod;
	}

	public double getSpDefenceMod() {
		return spDefenceMod;
	}

	public double getSpeedMod() {
		return speedMod;
	}
	
	public static int getCounterNature() {
	    return counter;
	}

}
