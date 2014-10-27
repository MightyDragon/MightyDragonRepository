package src.model;


public class Ability {
	
	public static Ability ADAPTABILITY = new Ability("Adaptability"); // done
	
	public static Ability ANALYTIC = new Ability("Analytic");
	
	// TODO: does not work if pokemon behind a substitute
	public static Ability ANGER_POINT = new Ability("Anger Point"); // done
	
	// TODO: check order/timing of damage (eg. what if two Darkrai are asleep with < 1/8th HP?)
	public static Ability BAD_DREAMS = new Ability("Bad Dreams"); // done
	
	public static Ability BATTLE_ARMOR = new Ability("Battle Armor"); // done
	
	// TODO: prevent reduction from non-moves (eg. abilities) (also applies to other stat change blockers)
	public static Ability BIG_PECKS = new Ability("Big Pecks"); // done
	
	public static Ability BLAZE = new Ability("Blaze"); // done
	
	public static Ability CLEAR_BODY = new Ability("Clear Body"); // done
	
	public static Ability COLOR_CHANGE = new Ability("Color Change");
	
	public static Ability COMPOUND_EYES = new Ability("Compound Eyes"); // done
	
	public static Ability CONTRARY = new Ability("Contrary");
	
	// TODO: possible roundoff discrepancy in implementation -- check
	public static Ability DEFEATIST = new Ability("Defeatist"); // done
	
	public static Ability DEFIANT = new Ability("Defiant");
	
	public static Ability DOWNLOAD = new Ability("Download"); // done
	
	public static Ability DRIZZLE = new Ability("Drizzle");
	
	public static Ability DROUGHT = new Ability("Drought");
	
	// TODO: test behaviour with status Water-type moves
	// TODO: weather effect on health
	public static Ability DRY_SKIN = new Ability("Dry Skin"); // done
	
	public static Ability EARLY_BIRD = new Ability("Early Bird"); // done
	
	public static Ability EFFECT_SPORE = new Ability("Effect Spore");
	
	public static Ability FILTER = new Ability("Filter"); // done
	
	public static Ability FLAME_BODY = new Ability("Flame Body");
	
	public static Ability FLARE_BOOST = new Ability("Flare Boost"); // done
	
	// TODO: text for power up
	public static Ability FLASH_FIRE = new Ability("Flash Fire"); // done
	
	public static Ability GUTS = new Ability("Guts"); // done
	
	public static Ability HEATPROOF = new Ability("Heatproof"); // done
	
	public static Ability HUGE_POWER = new Ability("Huge Power"); // done
	
	public static Ability HUSTLE = new Ability("Hustle"); // done
	
	public static Ability HYPER_CUTTER = new Ability("Hyper Cutter"); // done
	
	public static Ability IMMUNITY = new Ability("Immunity"); // done
	
	public static Ability INNER_FOCUS = new Ability("Inner Focus"); // done
	
	// TODO: makes Rest fail
	public static Ability INSOMNIA = new Ability("Insomnia"); // done
	
	public static Ability INTIMIDATE = new Ability("Intimidate"); // done
	
	public static Ability IRON_FIST = new Ability("Iron Fist"); // done
	
	public static Ability JUSTIFIED = new Ability("Justified"); // done
	
	public static Ability KEEN_EYE = new Ability("Keen Eye"); // done
	
	public static Ability LEVITATE = new Ability("Levitate"); // done
	
	public static Ability LIMBER = new Ability("Limber"); // done
	
	public static Ability MAGIC_BOUNCE = new Ability("Magic Bounce");
	
	public static Ability MAGIC_GUARD = new Ability("Magic Guard");
	
	public static Ability MAGMA_ARMOR = new Ability("Magma Armor"); // done
	
	public static Ability MARVEL_SCALE = new Ability("Marvel Scale"); // done
	
	public static Ability MOLD_BREAKER = new Ability("Mold Breaker");
	
	public static Ability MOODY = new Ability("Moody");
	
	// TODO: tweak timing for absorbing status moves (currently does not check hit)
	public static Ability MOTOR_DRIVE = new Ability("Motor Drive"); // done
	
	public static Ability MOXIE = new Ability("Moxie");
	
	public static Ability MULTISCALE = new Ability("Multiscale"); // done
	
	public static Ability MUMMY = new Ability("Mummy");
	
	// TODO: hits during semi-invulnerable stages (eg. Fly, Dig, etc)
	public static Ability NO_GUARD = new Ability("No Guard"); // done
	
	public static Ability NORMALIZE = new Ability("Normalize");
	
	public static Ability OVERGROW = new Ability("Overgrow"); // done
	
	public static Ability POISON_HEAL = new Ability("Poison Heal"); // done
	
	public static Ability POISON_POINT = new Ability("Poison Point");
	
	public static Ability POISON_TOUCH = new Ability("Poison Touch");
	
	public static Ability PRANKSTER = new Ability("Prankster");
	
	public static Ability PRESSURE = new Ability("Pressure");
	
	public static Ability PURE_POWER = new Ability("Pure Power"); // done
	
	public static Ability QUICK_FEET = new Ability("Quick Feet"); // done
	
	public static Ability RATTLED = new Ability("Rattled"); // done
	
	public static Ability RECKLESS = new Ability("Reckless");
	
	public static Ability RIVALRY = new Ability("Rivalry");
	
	public static Ability ROUGH_SKIN = new Ability("Rough Skin");
	
	public static Ability SAND_STREAM = new Ability("Sand Stream");
	
	public static Ability SAP_SIPPER = new Ability("Sap Sipper"); // done
	
	public static Ability SCRAPPY = new Ability("Scrappy"); // done
	
	// TODO: double effect of King's Rock and Razor Fang (items)
	public static Ability SERENE_GRACE = new Ability("Serene Grace"); // done
	
	public static Ability SHED_SKIN = new Ability("Shed Skin"); // done
	
	public static Ability SHEER_FORCE = new Ability("Sheer Force");
	
	public static Ability SHELL_ARMOR = new Ability("Shell Armor"); // done
	
	public static Ability SHIELD_DUST = new Ability("Shield Dust"); // done
	
	public static Ability SIMPLE = new Ability("Simple"); // done
	
	public static Ability SKILL_LINK = new Ability("Skill Link");
	
	public static Ability SLOW_START = new Ability("Slow Start");
	
	public static Ability SNIPER = new Ability("Sniper"); // done
	
	public static Ability SNOW_WARNING = new Ability("Snow Warning");
	
	public static Ability SOLID_ROCK = new Ability("Solid Rock"); // done
	
	public static Ability SOUNDPROOF = new Ability("Soundproof");
	
	public static Ability SPEED_BOOST = new Ability("Speed Boost"); // done
	
	public static Ability STALL = new Ability("Stall");
	
	public static Ability STATIC = new Ability("Static");
	
	// TODO: check/confirm timing of speed boost compared to flinch
	public static Ability STEADFAST = new Ability("Steadfast"); // done
	
	// TODO: draws in Water moves/attacks in doubles/triples
	public static Ability STORM_DRAIN = new Ability("Storm Drain"); // done
	
	// TODO: negate OHKO moves
	// TODO: does not activate for indirect damage (eg. recoil, weather, status damage, etc)
	public static Ability STURDY = new Ability("Sturdy"); // done
	
	public static Ability SUPER_LUCK = new Ability("Super Luck");
	
	public static Ability SWARM = new Ability("Swarm"); // done
	
	public static Ability SYNCHRONIZE = new Ability("Synchronize");
	
	public static Ability TANGLED_FEET = new Ability("Tangled Feet");
	
	public static Ability TECHNICIAN = new Ability("Technician"); // done
	
	public static Ability TERAVOLT = new Ability("Teravolt");
	
	public static Ability THICK_FAT = new Ability("Thick Fat"); // done
	
	public static Ability TINTED_LENS = new Ability("Tinted Lens"); // done
	
	public static Ability TORRENT = new Ability("Torrent"); // done
	
	public static Ability TOXIC_BOOST = new Ability("Toxic Boost"); // done
	
	public static Ability TURBOBLAZE = new Ability("Turboblaze");
	
	public static Ability UNAWARE = new Ability("Unaware");
	
	// TODO: see Insomnia
	public static Ability VITAL_SPIRIT = new Ability("Vital Spirit"); // done
	
	public static Ability VOLT_ABSORB = new Ability("Volt Absorb"); // done
	
	public static Ability WATER_ABSORB = new Ability("Water Absorb"); // done
	
	// TODO: removes Burn automatically if ability changed to Water Veil, but Burn returns if ability removed
	public static Ability WATER_VEIL = new Ability("Water Veil"); // done
	
	public static Ability WEAK_ARMOR = new Ability("Weak Armor"); // done
	
	public static Ability WHITE_SMOKE = new Ability("White Smoke"); // done
	
	public static Ability WONDER_GUARD = new Ability("Wonder Guard"); // done
	
	public static Ability WONDER_SKIN = new Ability("Wonder Skin"); // done
	
	String name;
	
	public Ability(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
