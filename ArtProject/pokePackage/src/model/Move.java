package src.model;

import java.util.ArrayList;
import java.util.List;

public class Move {

	public static Move STRUGGLE = new Move("Struggle", Type.TYPELESS, 0, 1);
	static {
		STRUGGLE.power = 50;
		STRUGGLE.accuracy = 100;
		// TODO: recoil
	}


	public static Move HIDDEN_POWER_BUG = new Move("Hidden Power Bug", Type.BUG, 1, 24);
	static {
		HIDDEN_POWER_BUG.power = 70;
		HIDDEN_POWER_BUG.accuracy = 100;
	}

	public static Move HIDDEN_POWER_DARK = new Move("Hidden Power Dark", Type.DARK, 1, 24);
	static {
		HIDDEN_POWER_DARK.power = 70;
		HIDDEN_POWER_DARK.accuracy = 100;
	}

	public static Move HIDDEN_POWER_DRAGON = new Move("Hidden Power Dragon", Type.DRAGON, 1, 24);
	static {
		HIDDEN_POWER_DRAGON.power = 70;
		HIDDEN_POWER_DRAGON.accuracy = 100;
	}

	public static Move HIDDEN_POWER_ELECTRIC = new Move("Hidden Power Electric", Type.ELECTRIC, 1, 24);
	static {
		HIDDEN_POWER_ELECTRIC.power = 70;
		HIDDEN_POWER_ELECTRIC.accuracy = 100;
	}

	public static Move HIDDEN_POWER_FIGHTING = new Move("Hidden Power Fighting", Type.FIGHTING, 1, 24);
	static {
		HIDDEN_POWER_FIGHTING.power = 70;
		HIDDEN_POWER_FIGHTING.accuracy = 100;
	}

	public static Move HIDDEN_POWER_FIRE = new Move("Hidden Power Fire", Type.FIRE, 1, 24);
	static {
		HIDDEN_POWER_FIRE.power = 70;
		HIDDEN_POWER_FIRE.accuracy = 100;
	}

	public static Move HIDDEN_POWER_FLYING = new Move("Hidden Power Flying", Type.FLYING, 1, 24);
	static {
		HIDDEN_POWER_FLYING.power = 70;
		HIDDEN_POWER_FLYING.accuracy = 100;
	}

	public static Move HIDDEN_POWER_GHOST = new Move("Hidden Power Ghost", Type.GHOST, 1, 24);
	static {
		HIDDEN_POWER_GHOST.power = 70;
		HIDDEN_POWER_GHOST.accuracy = 100;
	}

	public static Move HIDDEN_POWER_GRASS = new Move("Hidden Power Grass", Type.GRASS, 1, 24);
	static {
		HIDDEN_POWER_GRASS.power = 70;
		HIDDEN_POWER_GRASS.accuracy = 100;
	}

	public static Move HIDDEN_POWER_GROUND = new Move("Hidden Power Ground", Type.GROUND, 1, 24);
	static {
		HIDDEN_POWER_GROUND.power = 70;
		HIDDEN_POWER_GROUND.accuracy = 100;
	}

	public static Move HIDDEN_POWER_ICE = new Move("Hidden Power Ice", Type.ICE, 1, 24);
	static {
		HIDDEN_POWER_ICE.power = 70;
		HIDDEN_POWER_ICE.accuracy = 100;
	}

	public static Move HIDDEN_POWER_POISON = new Move("Hidden Power Poison", Type.POISON, 1, 24);
	static {
		HIDDEN_POWER_POISON.power = 70;
		HIDDEN_POWER_POISON.accuracy = 100;
	}

	public static Move HIDDEN_POWER_PSYCHIC = new Move("Hidden Power Psychic", Type.PSYCHIC, 1, 24);
	static {
		HIDDEN_POWER_PSYCHIC.power = 70;
		HIDDEN_POWER_PSYCHIC.accuracy = 100;
	}

	public static Move HIDDEN_POWER_ROCK = new Move("Hidden Power Rock", Type.ROCK, 1, 24);
	static {
		HIDDEN_POWER_ROCK.power = 70;
		HIDDEN_POWER_ROCK.accuracy = 100;
	}

	public static Move HIDDEN_POWER_STEEL = new Move("Hidden Power Steel", Type.STEEL, 1, 24);
	static {
		HIDDEN_POWER_STEEL.power = 70;
		HIDDEN_POWER_STEEL.accuracy = 100;
	}

	public static Move HIDDEN_POWER_WATER = new Move("Hidden Power Water", Type.WATER, 1, 24);
	static {
		HIDDEN_POWER_WATER.power = 70;
		HIDDEN_POWER_WATER.accuracy = 100;
	}







	public static Move ACID_ARMOR = new Move("Acid Armor", Type.POISON, 2, 40);
	static {
		ACID_ARMOR.accuracy = 0;
		ACID_ARMOR.statAccuracy = 0;
		ACID_ARMOR.statUpsSelf.add("D");
		ACID_ARMOR.statUpsSelf.add("D");
	}

	public static Move ACID_SPRAY = new Move("Acid Spray", Type.POISON, 1, 20);
	static {
		ACID_SPRAY.power = 40;
		ACID_SPRAY.accuracy = 100;
		ACID_SPRAY.statDownsFoe.add("SD");
		ACID_SPRAY.statDownsFoe.add("SD");
		ACID_SPRAY.statAccuracy = 100;
	}

	public static Move ACROBATICS = new Move("Acrobatics", Type.FLYING, 0, 15);
	static {
		ACROBATICS.power = 55;
		ACROBATICS.accuracy = 100;
	}

	public static Move ACUPRESSURE = new Move("Acupressure", Type.NORMAL, 2, 30);
	static {
		ACUPRESSURE.accuracy = 0;
		// TODO: boost random stat by 2 (doesn't consider maxed out stats - only fails if all maxed out)
	}

	public static Move AERIAL_ACE = new Move("Aerial Ace", Type.FLYING, 0, 20);
	static {
		AERIAL_ACE.power = 60;
		AERIAL_ACE.accuracy = 0;
	}

	public static Move AGILITY = new Move("Agility", Type.PSYCHIC, 2, 30);
	static {
		AGILITY.accuracy = 0;
		AGILITY.statUpsSelf.add("SP");
		AGILITY.statUpsSelf.add("SP");
		AGILITY.statAccuracy = 0;
	}

	public static Move AIR_SLASH = new Move("Air Slash", Type.FLYING, 1, 20);
	static {
		AIR_SLASH.power = 75;
		AIR_SLASH.accuracy = 95;
	}

	public static Move ANCIENTPOWER = new Move("AncientPower", Type.ROCK, 1, 5);
	static {
		ANCIENTPOWER.power = 60;
		ANCIENTPOWER.accuracy = 100;
		ANCIENTPOWER.statAccuracy = 10;
		ANCIENTPOWER.statUpsSelf.add("A");
		ANCIENTPOWER.statUpsSelf.add("D");
		ANCIENTPOWER.statUpsSelf.add("SA");
		ANCIENTPOWER.statUpsSelf.add("SD");
		ANCIENTPOWER.statUpsSelf.add("SP");
		ANCIENTPOWER.statUpsSelf.add("ACC");
		ANCIENTPOWER.statUpsSelf.add("E");
	}

	public static Move AQUA_JET = new Move("Aqua Jet", Type.WATER, 0, 20);
	static {
		AQUA_JET.power = 40;
		AQUA_JET.accuracy = 100;
		AQUA_JET.priority = 1;
	}

	public static Move AQUA_TAIL = new Move("Aqua Tail", Type.WATER, 0, 10);
	static {
		AQUA_TAIL.power = 90;
		AQUA_TAIL.accuracy = 90;
	}

	public static Move AUTOTOMIZE = new Move("Autotomize", Type.STEEL, 2, 15);
	static {
		AUTOTOMIZE.accuracy = 0;
		AUTOTOMIZE.statUpsSelf.add("SP");
		AUTOTOMIZE.statUpsSelf.add("SP");
		AUTOTOMIZE.statAccuracy = 0;
		// TODO: reduces weight (by 100 kg)
	}

	public static Move BELLY_DRUM = new Move("Belly Drum", Type.NORMAL, 2, 10);
	static {
		BELLY_DRUM.accuracy = 0;
		BELLY_DRUM.statUpsSelf.add("A");
		BELLY_DRUM.statUpsSelf.add("A");
		BELLY_DRUM.statUpsSelf.add("A");
		BELLY_DRUM.statUpsSelf.add("A");
		BELLY_DRUM.statUpsSelf.add("A");
		BELLY_DRUM.statUpsSelf.add("A");
		BELLY_DRUM.statUpsSelf.add("A");
		BELLY_DRUM.statUpsSelf.add("A");
		BELLY_DRUM.statUpsSelf.add("A");
		BELLY_DRUM.statUpsSelf.add("A");
		BELLY_DRUM.statUpsSelf.add("A");
		BELLY_DRUM.statUpsSelf.add("A");
		BELLY_DRUM.statAccuracy = 0;
		// TODO: recoil of 50% max HP; fail if not enough health or attack already maxed out
	}

	public static Move BITE = new Move("Bite", Type.DARK, 0, 25);
	static {
		BITE.power = 60;
		BITE.accuracy = 100;
	}

	public static Move BLIZZARD = new Move("Blizzard", Type.ICE, 1, 5);
	static {
		BLIZZARD.power = 120;
		BLIZZARD.accuracy = 70;
		BLIZZARD.effect = Status.FREEZE;
		BLIZZARD.effectAccuracy = 10;
	}

	public static Move BOUNCE = new Move("Bounce", Type.FLYING, 0, 5);
	static {
		BOUNCE.power = 85;
		BOUNCE.accuracy = 85;
		BOUNCE.effect = Status.PARALYSIS;
		BOUNCE.effectAccuracy = 30;
		// TODO: other effects
	}

	public static Move BRAVE_BIRD = new Move("Brave Bird", Type.FLYING, 0, 15);
	static {
		BRAVE_BIRD.power = 120;
		BRAVE_BIRD.accuracy = 100;
		// TODO: recoil
	}

	public static Move BRICK_BREAK = new Move("Brick Break", Type.FIGHTING, 0, 15);
	static {
		BRICK_BREAK.power = 75;
		BRICK_BREAK.accuracy = 100;
		// TODO: breaks light screen, reflect
	}

	public static Move BUG_BITE = new Move("Bug Bite", Type.BUG, 0, 20);
	static {
		BUG_BITE.power = 60;
		BUG_BITE.accuracy = 100;
		// TODO: consumes berry
	}

	public static Move BUG_BUZZ = new Move("Bug Buzz", Type.BUG, 1, 10);
	static {
		BUG_BUZZ.power = 90;
		BUG_BUZZ.accuracy = 100;
	}

	public static Move BULK_UP = new Move("Bulk Up", Type.FIGHTING, 2, 20);
	static {
		BULK_UP.accuracy = 0;
		BULK_UP.statAccuracy = 0;
		BULK_UP.statUpsSelf.add("A");
		BULK_UP.statUpsSelf.add("D");
	}

	public static Move BULLET_PUNCH = new Move("Bullet Punch", Type.STEEL, 0, 30);
	static {
		BULLET_PUNCH.power = 40;
		BULLET_PUNCH.accuracy = 100;
		BULLET_PUNCH.priority = 1;
		BULLET_PUNCH.isPunch = true;
	}

	public static Move BULLET_SEED = new Move("Bullet Seed", Type.GRASS, 0, 30);
	static {
		BULLET_SEED.power = 25;
		BULLET_SEED.accuracy = 100;
	}

	public static Move CALM_MIND = new Move("Calm Mind", Type.PSYCHIC, 2, 20);
	static {
		CALM_MIND.accuracy = 0;
		CALM_MIND.statAccuracy = 0;
		CALM_MIND.statUpsSelf.add("SA");
		CALM_MIND.statUpsSelf.add("SP");
	}

	public static Move CHARGE_BEAM = new Move("Charge Beam", Type.ELECTRIC, 1, 10);
	static {
		CHARGE_BEAM.power = 50;
		CHARGE_BEAM.accuracy = 90;
		CHARGE_BEAM.statUpsSelf.add("SA");
		CHARGE_BEAM.statAccuracy = 70;
		// TODO: check that stat changes don't happen when move misses or has no effect on opponent
	}

	public static Move CIRCLE_THROW = new Move("Circle Throw", Type.FIGHTING, 0, 10);
	static {
		CIRCLE_THROW.power = 60;
		CIRCLE_THROW.accuracy = 90;
		CIRCLE_THROW.priority = -6;
	}

	public static Move CLEAR_SMOG = new Move("Clear Smog", Type.POISON, 1, 15);
	static {
		CLEAR_SMOG.power = 50;
		CLEAR_SMOG.accuracy = 0;
		// TODO: reset all stats
	}

	public static Move CLOSE_COMBAT = new Move("Close Combat", Type.FIGHTING, 0, 5);
	static {
		CLOSE_COMBAT.power = 120;
		CLOSE_COMBAT.accuracy = 100;
		CLOSE_COMBAT.statDownsSelf.add("D");
		CLOSE_COMBAT.statDownsSelf.add("SD");
		CLOSE_COMBAT.statAccuracy = 100;
	}

	public static Move CONFUSE_RAY = new Move("Confuse Ray", Type.GHOST, 2, 10);
	static {
		CONFUSE_RAY.accuracy = 100;
		// TODO: confusion!
	}

	public static Move COTTON_GUARD = new Move("Cotton Guard", Type.GRASS, 2, 10);
	static {
		COTTON_GUARD.accuracy = 0;
		COTTON_GUARD.statUpsSelf.add("D");
		COTTON_GUARD.statUpsSelf.add("D");
		COTTON_GUARD.statUpsSelf.add("D");
		COTTON_GUARD.statAccuracy = 0;
	}

	public static Move COVET = new Move("Covet", Type.NORMAL, 0, 40);
	static {
		COVET.power = 60;
		COVET.accuracy = 100;
	}

	public static Move CRABHAMMER = new Move("Crabhammer", Type.WATER, 0, 10);
	static {
		CRABHAMMER.power = 90;
		CRABHAMMER.accuracy = 90;
		CRABHAMMER.critical = true;
	}

	public static Move CROSS_CHOP = new Move("Cross Chop", Type.FIGHTING, 0, 5);
	static {
		CROSS_CHOP.power = 100;
		CROSS_CHOP.accuracy = 80;
		CROSS_CHOP.critical = true;
	}

	public static Move CROSS_POISON = new Move("Cross Poison", Type.POISON, 0, 20);
	static {
		CROSS_POISON.power = 70;
		CROSS_POISON.accuracy = 100;
		CROSS_POISON.effect = Status.POISON;
		CROSS_POISON.effectAccuracy = 10;
		CROSS_POISON.critical = true;
	}

	public static Move CRUNCH = new Move("Crunch", Type.DARK, 0, 15);
	static {
		CRUNCH.power = 80;
		CRUNCH.accuracy = 100;
		CRUNCH.statAccuracy = 20;
		CRUNCH.statDownsFoe.add("D");
	}

	public static Move DARK_PULSE = new Move("Dark Pulse", Type.DARK, 1, 15);
	static {
		DARK_PULSE.power = 80;
		DARK_PULSE.accuracy = 100;
		DARK_PULSE.flinchAccuracy = 20;
	}

	public static Move DISCHARGE = new Move("Discharge", Type.ELECTRIC, 1, 15);
	static {
		DISCHARGE.power = 80;
		DISCHARGE.accuracy = 100;
		DISCHARGE.effect = Status.PARALYSIS;
		DISCHARGE.effectAccuracy = 30;
	}

	public static Move DOUBLE_EDGE = new Move("Double-Edge", Type.NORMAL, 0, 15);
	static {
		DOUBLE_EDGE.power = 120;
		DOUBLE_EDGE.accuracy = 100;
		// TODO: recoil
	}

	public static Move DRAGON_CLAW = new Move("Dragon Claw", Type.DRAGON, 0, 15);
	static {
		DRAGON_CLAW.power = 80;
		DRAGON_CLAW.accuracy = 100;
	}

	public static Move DRAGON_DANCE = new Move("Dragon Dance", Type.DRAGON, 0, 20);
	static {
		DRAGON_DANCE.accuracy = 0;
		DRAGON_DANCE.statUpsSelf.add("A");
		DRAGON_DANCE.statUpsSelf.add("SP");
		DRAGON_DANCE.statAccuracy = 0;
	}

	public static Move DRAGON_TAIL = new Move("Dragon Tail", Type.DRAGON, 0, 10);
	static {
		DRAGON_TAIL.power = 60;
		DRAGON_TAIL.accuracy = 90;
		DRAGON_TAIL.priority = -6;
	}

	public static Move DRAIN_PUNCH = new Move("Drain Punch", Type.FIGHTING, 0, 10);
	static {
		DRAIN_PUNCH.power = 75;
		DRAIN_PUNCH.accuracy = 100;
		DRAIN_PUNCH.isPunch = true;
		// TODO: leech damage
	}

	public static Move DRILL_PECK = new Move("Drill Peck", Type.FLYING, 0, 20);
	static {
		DRILL_PECK.power = 80;
		DRILL_PECK.accuracy = 100;
	}

	public static Move DRILL_RUN = new Move("Drill Run", Type.GROUND, 0, 10);
	static {
		DRILL_RUN.power = 80;
		DRILL_RUN.accuracy = 95;
		DRILL_RUN.critical = true;
	}

	public static Move DYNAMICPUNCH = new Move("DynamicPunch", Type.FIGHTING, 0, 5);
	static {
		DYNAMICPUNCH.power = 100;
		DYNAMICPUNCH.accuracy = 50;
		DYNAMICPUNCH.isPunch = true;
		// TODO: confusion
	}

	public static Move EARTH_POWER = new Move("Earth Power", Type.GROUND, 1, 16);
	static {
		EARTH_POWER.power = 90;
		EARTH_POWER.accuracy = 100;
		EARTH_POWER.statDownsFoe.add("SD");
		EARTH_POWER.statAccuracy = 10;
	}

	public static Move EARTHQUAKE = new Move("Earthquake", Type.GROUND, 0, 10);
	static {
		EARTHQUAKE.power = 100;
		EARTHQUAKE.accuracy = 100;
		// TODO: hit dig for double damage
	}

	public static Move ENERGY_BALL = new Move("Energy Ball", Type.GRASS, 1, 10);
	static {
		ENERGY_BALL.power = 80;
		ENERGY_BALL.accuracy = 100;
		ENERGY_BALL.statDownsFoe.add("SD");
		ENERGY_BALL.statAccuracy = 10;
	}

	public static Move ERUPTION = new Move("Eruption", Type.FIRE, 1, 5);
	static {
		ERUPTION.power = 150; // TODO: varies with user's health
		ERUPTION.accuracy = 100;
	}

	public static Move EXTRASENSORY = new Move("Extrasensory", Type.PSYCHIC, 1, 30);
	static {
		EXTRASENSORY.power = 80;
		EXTRASENSORY.accuracy = 100;
		EXTRASENSORY.flinchAccuracy = 10;
	}

	public static Move EXTREMESPEED = new Move("ExtremeSpeed", Type.NORMAL, 0, 5);
	static {
		EXTREMESPEED.power = 80;
		EXTREMESPEED.accuracy = 100;
		EXTREMESPEED.priority = 2;
	}

	public static Move FACADE = new Move("Facade", Type.NORMAL, 0, 20);
	static {
		FACADE.power = 70;
		FACADE.accuracy = 100;
		// TODO: variable damage
	}

	public static Move FAINT_ATTACK = new Move("Faint Attack", Type.DARK, 0, 20);
	static {
		FAINT_ATTACK.power = 60;
		FAINT_ATTACK.accuracy = 0;
	}

	public static Move FAKE_OUT = new Move("Fake Out", Type.NORMAL, 0, 10);
	static {
		FAKE_OUT.power = 40;
		FAKE_OUT.accuracy = 100;
		FAKE_OUT.priority = 3;
		// TODO: only works on first turn
	}

	public static Move FEATHERDANCE = new Move("FeatherDance", Type.FLYING, 2, 15);
	static {
		FEATHERDANCE.accuracy = 100;
		FEATHERDANCE.statAccuracy = 0;
		FEATHERDANCE.statDownsFoe.add("A");
		FEATHERDANCE.statDownsFoe.add("A");
	}

	public static Move FIRE_BLAST = new Move("Fire Blast", Type.FIRE, 1, 5);
	static {
		FIRE_BLAST.power = 120;
		FIRE_BLAST.accuracy = 85;
		FIRE_BLAST.effect = Status.BURN;
		FIRE_BLAST.effectAccuracy = 10;
	}

	public static Move FIRE_FANG = new Move("Fire Fang", Type.FIRE, 0, 15);
	static {
		FIRE_FANG.power = 65;
		FIRE_FANG.accuracy = 95;
		FIRE_FANG.effect = Status.BURN;
		FIRE_FANG.effectAccuracy = 10;
		FIRE_FANG.flinchAccuracy = 10;
	}

	public static Move FIRE_PUNCH = new Move("Fire Punch", Type.FIRE, 0, 15);
	static {
		FIRE_PUNCH.power = 75;
		FIRE_PUNCH.accuracy = 100;
		FIRE_PUNCH.effect = Status.BURN;
		FIRE_PUNCH.effectAccuracy = 10;
		FIRE_PUNCH.isPunch = true;
	}

	public static Move FLAIL = new Move("Flail", Type.NORMAL, 0, 15);
	static {
		FLAIL.power = 20;
		FLAIL.accuracy = 100;
		// TODO: variable power
	}

	public static Move FLAME_CHARGE = new Move("Flame Charge", Type.FIRE, 0, 20);
	static {
		FLAME_CHARGE.power = 50;
		FLAME_CHARGE.accuracy = 100;
		FLAME_CHARGE.statUpsSelf.add("SP");
		FLAME_CHARGE.statAccuracy = 100;
	}

	public static Move FLAME_WHEEL = new Move("Flame Wheel", Type.FIRE, 0, 25);
	static {
		FLAME_WHEEL.power = 60;
		FLAME_WHEEL.accuracy = 100;
		FLAME_WHEEL.effect = Status.BURN;
		FLAME_WHEEL.effectAccuracy = 10;
		// TODO: thaws user if frozen
	}

	public static Move FLAMETHROWER = new Move("Flamethrower", Type.FIRE, 1, 15);
	static {
		FLAMETHROWER.power = 95;
		FLAMETHROWER.accuracy = 100;
		FLAMETHROWER.effect = Status.BURN;
		FLAMETHROWER.effectAccuracy = 10;
	}

	public static Move FLARE_BLITZ = new Move("Flare Blitz", Type.FIRE, 0, 15);
	static {
		FLARE_BLITZ.power = 120;
		FLARE_BLITZ.accuracy = 100;
		FLARE_BLITZ.effect = Status.BURN;
		FLARE_BLITZ.effectAccuracy = 10;
		// TODO: recoil, thaws user
	}

	public static Move FLASH_CANNON = new Move("Flash Cannon", Type.STEEL, 1, 10);
	static {
		FLASH_CANNON.power = 80;
		FLASH_CANNON.accuracy = 100;
		FLASH_CANNON.statDownsFoe.add("SD");
		FLASH_CANNON.statAccuracy = 10;
	}

	public static Move FOCUS_PUNCH = new Move("Focus Punch", Type.FIGHTING, 0, 20);
	static {
		FOCUS_PUNCH.power = 150;
		FOCUS_PUNCH.accuracy = 100;
		FOCUS_PUNCH.priority = -3;
		FOCUS_PUNCH.isPunch = true;
		// TODO: interrupted if struck
	}

	public static Move FORCE_PALM = new Move("Force Palm", Type.FIGHTING, 0, 10);
	static {
		FORCE_PALM.power = 60;
		FORCE_PALM.accuracy = 100;
		FORCE_PALM.effect = Status.PARALYSIS;
		FORCE_PALM.effectAccuracy = 30;
	}

	public static Move GIGA_DRAIN = new Move("Giga Drain", Type.GRASS, 1, 10);
	static {
		GIGA_DRAIN.power = 75;
		GIGA_DRAIN.accuracy = 100;
		// TODO: leech health
	}

	public static Move GLARE = new Move("Glare", Type.NORMAL, 2, 30);
	static {
		GLARE.accuracy = 90;
		GLARE.effect = Status.PARALYSIS;
		GLARE.effectAccuracy = 0;
		// TODO: Ghost-types are not immune!
	}

	public static Move GROWTH = new Move("Growth", Type.NORMAL, 2, 40);
	static {
		GROWTH.accuracy = 0;
		GROWTH.statAccuracy = 0;
		GROWTH.statUpsSelf.add("A");
		GROWTH.statUpsSelf.add("SA");
		// TODO: double stat boosts in sunlight
	}

	public static Move GUNK_SHOT = new Move("Gunk Shot", Type.POISON, 0, 5);
	static {
		GUNK_SHOT.power = 120;
		GUNK_SHOT.accuracy = 70;
		GUNK_SHOT.effect = Status.POISON;
		GUNK_SHOT.effectAccuracy = 30;
	}

	public static Move HAMMER_ARM = new Move("Hammer Arm", Type.FIGHTING, 0, 10);
	static {
		HAMMER_ARM.power = 100;
		HAMMER_ARM.accuracy = 90;
		HAMMER_ARM.statDownsSelf.add("SP");
		HAMMER_ARM.statAccuracy = 0;
		HAMMER_ARM.isPunch = true;
	}

	public static Move HEAD_SMASH = new Move("Head Smash", Type.ROCK, 0, 5);
	static {
		HEAD_SMASH.power = 150;
		HEAD_SMASH.accuracy = 80;
		// TODO: recoil (50%)
	}

	public static Move HEAT_WAVE = new Move("Heat Wave", Type.FIRE, 1, 10);
	static {
		HEAT_WAVE.power = 100;
		HEAT_WAVE.accuracy = 90;
		HEAT_WAVE.effect = Status.BURN;
		HEAT_WAVE.effectAccuracy = 10;
	}

	public static Move HEADBUTT = new Move("Headbutt", Type.NORMAL, 0, 15);
	static {
		HEADBUTT.power = 70;
		HEADBUTT.accuracy = 100;
		HEADBUTT.flinchAccuracy = 30;
	}

	public static Move HEX = new Move("Hex", Type.GHOST, 1, 10);
	static {
		HEX.power = 50;
		HEX.accuracy = 100;
		// TODO: variable power (double if target has status ailment)
	}

	public static Move HI_JUMP_KICK = new Move("Hi Jump Kick", Type.FIGHTING, 0, 10);
	static {
		HI_JUMP_KICK.power = 130;
		HI_JUMP_KICK.accuracy = 90;
		// TODO: recoil from miss
	}

	public static Move HONE_CLAWS = new Move("Hone Claws", Type.DARK, 2, 15);
	static {
		HONE_CLAWS.accuracy = 0;
		HONE_CLAWS.statAccuracy = 0;
		HONE_CLAWS.statUpsSelf.add("A");
		HONE_CLAWS.statUpsSelf.add("ACC");
	}

	public static Move HOWL = new Move("Howl", Type.NORMAL, 2, 40);
	static {
		HOWL.accuracy = 0;
		HOWL.statAccuracy = 0;
		HOWL.statUpsSelf.add("A");
	}

	public static Move HURRICANE = new Move("Hurricane", Type.FLYING, 1, 10);
	static {
		HURRICANE.power = 120;
		HURRICANE.accuracy = 70;
		// TODO: confusion (30%), weather-dependent accuracy, hits airborne targets
	}

	public static Move HYDRO_PUMP = new Move("Hydro Pump", Type.WATER, 1, 8);
	static {
		HYDRO_PUMP.power = 120;
		HYDRO_PUMP.accuracy = 80;
	}

	public static Move HYPER_VOICE = new Move("Hyper Voice", Type.NORMAL, 1, 10);
	static {
		HYPER_VOICE.power = 90;
		HYPER_VOICE.accuracy = 100;
		// TODO: affected by Soundproof
	}

	public static Move HYPNOSIS = new Move("Hypnosis", Type.PSYCHIC, 2, 20);
	static {
		HYPNOSIS.accuracy = 60;
		HYPNOSIS.effect = Status.SLEEP;
		HYPNOSIS.effectAccuracy = 0;
	}

	public static Move ICE_BEAM = new Move("Ice Beam", Type.ICE, 1, 10);
	static {
		ICE_BEAM.power = 95;
		ICE_BEAM.accuracy = 100;
		ICE_BEAM.effect = Status.FREEZE;
		ICE_BEAM.effectAccuracy = 10;
	}

	public static Move ICE_FANG = new Move("Ice Fang", Type.ICE, 0, 15);
	static {
		ICE_FANG.power = 65;
		ICE_FANG.accuracy = 95;
		ICE_FANG.effect = Status.FREEZE;
		ICE_FANG.effectAccuracy = 10;
		ICE_FANG.flinchAccuracy = 10;
	}

	public static Move ICE_PUNCH = new Move("Ice Punch", Type.ICE, 0, 15);
	static {
		ICE_PUNCH.power = 75;
		ICE_PUNCH.accuracy = 100;
		ICE_PUNCH.effect = Status.FREEZE;
		ICE_PUNCH.effectAccuracy = 10;
		ICE_PUNCH.isPunch = true;
	}

	public static Move ICE_SHARD = new Move("Ice Shard", Type.ICE, 0, 30);
	static {
		ICE_SHARD.power = 40;
		ICE_SHARD.accuracy = 100;
		ICE_SHARD.priority = 1;
	}

	public static Move ICICLE_SPEAR = new Move("Icicle Spear", Type.ICE, 0, 30);
	static {
		ICICLE_SPEAR.power = 25;
		ICICLE_SPEAR.accuracy = 100;
		// TODO: multi-hit move
	}

	public static Move ICY_WIND = new Move("Icy Wind", Type.ICE, 1, 15);
	static {
		ICY_WIND.power = 55;
		ICY_WIND.accuracy = 95;
		ICY_WIND.statDownsFoe.add("SP");
		ICY_WIND.statAccuracy = 0;
	}

	public static Move IRON_HEAD = new Move("Iron Head", Type.STEEL, 0, 15);
	static {
		IRON_HEAD.power = 80;
		IRON_HEAD.accuracy = 100;
		IRON_HEAD.flinchAccuracy = 30;
	}

	public static Move IRON_TAIL = new Move("Iron Tail", Type.STEEL, 0, 15);
	static {
		IRON_TAIL.power = 100;
		IRON_TAIL.accuracy = 75;
		IRON_TAIL.statDownsFoe.add("D");
		IRON_TAIL.statAccuracy = 30;
	}

	public static Move JUMP_KICK = new Move("Jump Kick", Type.FIGHTING, 0, 10);
	static {
		JUMP_KICK.power = 100;
		JUMP_KICK.accuracy = 95;
		// TODO: recoil from miss; can't use during Gravity
	}

	public static Move KNOCK_OFF = new Move("Knock Off", Type.DARK, 0, 20);
	static {
		KNOCK_OFF.power = 20;
		KNOCK_OFF.accuracy = 100;
		// TODO: removes foe's item
	}

	public static Move LAVA_PLUME = new Move("Lava Plume", Type.FIRE, 1, 15);
	static {
		LAVA_PLUME.power = 80;
		LAVA_PLUME.accuracy = 100;
		LAVA_PLUME.effect = Status.BURN;
		LAVA_PLUME.effectAccuracy = 30;
	}

	public static Move LEAF_STORM = new Move("Leaf Storm", Type.GRASS, 1, 5);
	static {
		LEAF_STORM.power = 140;
		LEAF_STORM.accuracy = 90;
		LEAF_STORM.statDownsSelf.add("SA");
		LEAF_STORM.statDownsSelf.add("SA");
		LEAF_STORM.statAccuracy = 0;
	}

	public static Move MACH_PUNCH = new Move("Mach Punch", Type.FIGHTING, 0, 30);
	static {
		MACH_PUNCH.power = 40;
		MACH_PUNCH.accuracy = 100;
		MACH_PUNCH.priority = 1;
		MACH_PUNCH.isPunch = true;
	}

	public static Move MEGAHORN = new Move("Megahorn", Type.BUG, 0, 10);
	static {
		MEGAHORN.power = 120;
		MEGAHORN.accuracy = 85;
	}

	public static Move METAL_BURST = new Move("Metal Burst", Type.STEEL, 0, 10);
	static {
		METAL_BURST.power = 1;
		METAL_BURST.accuracy = 100;
		// TODO: variable power (complex)
	}

	public static Move NASTY_PLOT = new Move("Nasty Plot", Type.DARK, 2, 20);
	static {
		NASTY_PLOT.accuracy = 0;
		NASTY_PLOT.statUpsSelf.add("SA");
		NASTY_PLOT.statUpsSelf.add("SA");
		NASTY_PLOT.statAccuracy = 0;
	}

	// TODO: note - becomes Earthquake in wifi and common simulators
	public static Move NATURE_POWER = new Move("Nature Power", Type.GROUND, 0, 20);
	static {
		NATURE_POWER.power = 100;
		NATURE_POWER.accuracy = 100;
	}

	public static Move NIGHT_DAZE = new Move("Night Daze", Type.DARK, 1, 10);
	static {
		NIGHT_DAZE.power = 85;
		NIGHT_DAZE.accuracy = 95;
		NIGHT_DAZE.statDownsFoe.add("ACC");
		NIGHT_DAZE.statAccuracy = 40;
	}

	public static Move NIGHT_SLASH = new Move("Night Slash", Type.DARK, 0, 15);
	static {
		NIGHT_SLASH.power = 70;
		NIGHT_SLASH.accuracy = 100;
		NIGHT_SLASH.critical = true;
	}

	public static Move OUTRAGE = new Move("Outrage", Type.DRAGON, 0, 15);
	static {
		OUTRAGE.power = 120;
		OUTRAGE.accuracy = 100;
		// TODO: lasts 3-4 turns, confuses user after
	}

	public static Move OVERHEAT = new Move("Overheat", Type.FIRE, 1, 5);
	static {
		OVERHEAT.power = 140;
		OVERHEAT.accuracy = 90;
		OVERHEAT.statDownsSelf.add("SA");
		OVERHEAT.statDownsSelf.add("SA");
		OVERHEAT.statAccuracy = 0;
	}

	public static Move PAYBACK = new Move("Payback", Type.DARK, 0, 10);
	static {
		PAYBACK.power = 50;
		PAYBACK.accuracy = 100;
		// TODO: variable power
	}

	public static Move PLUCK = new Move("Pluck", Type.FLYING, 0, 20);
	static {
		PLUCK.power = 60;
		PLUCK.accuracy = 100;
		// TODO: steals targets berry
	}

	public static Move POISON_JAB = new Move("Poison Jab", Type.POISON, 0, 20);
	static {
		POISON_JAB.power = 80;
		POISON_JAB.accuracy = 100;
		POISON_JAB.effect = Status.POISON;
		POISON_JAB.effectAccuracy = 30;
	}

	public static Move POISON_POWDER = new Move("Poison Powder", Type.POISON, 2, 35);
	static {
		POISON_POWDER.accuracy = 75;
		POISON_POWDER.effect = Status.POISON;
		POISON_POWDER.effectAccuracy = 0;
		POISON_POWDER.setFlags(false, true, true, false, false, false);
	}

	public static Move POISON_STING = new Move("Poison Sting", Type.POISON, 0, 35);
	static {
		POISON_STING.power = 15;
		POISON_STING.accuracy = 100;
		POISON_STING.effect = Status.POISON;
		POISON_STING.effectAccuracy = 30;
	}

	public static Move PROTECT = new Move("Protect", Type.NORMAL, 2, 16);
	static {
		PROTECT.priority = 3;
	}

	public static Move PSYCHIC = new Move("Psychic", Type.PSYCHIC, 1, 16);
	static {
		PSYCHIC.power = 90;
		PSYCHIC.accuracy = 100;
		PSYCHIC.setFlags(false, true, false, false, true, false);
		PSYCHIC.statDownsFoe.add("SD");
		PSYCHIC.statAccuracy = 10;
	}

	public static Move PSYCHO_CUT = new Move("Psycho Cut", Type.PSYCHIC, 0, 20);
	static {
		PSYCHO_CUT.power = 70;
		PSYCHO_CUT.accuracy = 100;
		PSYCHO_CUT.critical = true;
	}

	public static Move PSYSHOCK = new Move("Psyshock", Type.PSYCHIC, 1, 10);
	static {
		PSYSHOCK.power = 80;
		PSYSHOCK.accuracy = 100;
		// TODO: uses target's defence stat for calculation
	}

	public static Move PUNISHMENT = new Move("Punishment", Type.DARK, 0, 5);
	static {
		PUNISHMENT.power = 60;
		PUNISHMENT.accuracy = 100;
		// TODO: variable damage
	}

	public static Move PURSUIT = new Move("Pursuit", Type.DARK, 0, 20);
	static {
		PURSUIT.power = 40;
		PURSUIT.accuracy = 100;
		// TODO: variable power
	}

	public static Move QUICK_ATTACK = new Move("Quick Attack", Type.NORMAL, 0, 30);
	static {
		QUICK_ATTACK.power = 40;
		QUICK_ATTACK.accuracy = 100;
		QUICK_ATTACK.priority = 1;
	}

	public static Move RAPID_SPIN = new Move("Rapid Spin", Type.NORMAL, 0, 40);
	static {
		RAPID_SPIN.power = 20;
		RAPID_SPIN.accuracy = 100;
		// TODO: clears hazards
	}

	public static Move RAZOR_SHELL = new Move("Razor Shell", Type.WATER, 0, 10);
	static {
		RAZOR_SHELL.power = 75;
		RAZOR_SHELL.accuracy = 95;
		RAZOR_SHELL.statDownsFoe.add("D");
		RAZOR_SHELL.statAccuracy = 50;
	}

	public static Move RECOVER = new Move("Recover", Type.NORMAL, 2, 10);

	public static Move RETURN = new Move("Return", Type.NORMAL, 0, 20);
	static {
		RETURN.power = 102;
		RETURN.accuracy = 100;
	}

	public static Move ROCK_BLAST = new Move("Rock Blast", Type.ROCK, 0, 10);
	static {
		ROCK_BLAST.power = 25;
		ROCK_BLAST.accuracy = 90;
		// TODO: multi-hit move
	}

	public static Move ROCK_POLISH = new Move("Rock Polish", Type.ROCK, 2, 20);
	static {
		ROCK_POLISH.accuracy = 0;
		ROCK_POLISH.statAccuracy = 0;
		ROCK_POLISH.statUpsSelf.add("SP");
		ROCK_POLISH.statUpsSelf.add("SP");
	}

	public static Move ROCK_SLIDE = new Move("Rock Slide", Type.ROCK, 0, 10);
	static {
		ROCK_SLIDE.power = 75;
		ROCK_SLIDE.accuracy = 90;
		ROCK_SLIDE.flinchAccuracy = 30;
	}
	
	public static Move SAND_ATTACK = new Move("Sand Attack", Type.GROUND, 2, 15);
	static {
		SAND_ATTACK.accuracy = 100;
		SAND_ATTACK.statAccuracy = 0;
		SAND_ATTACK.statDownsFoe.add("ACC");
	}

	public static Move SCALD = new Move("Scald", Type.WATER, 1, 15);
	static {
		SCALD.power = 80;
		SCALD.effect = Status.BURN;
		SCALD.effectAccuracy = 30;
		// TODO: thaws user
	}

	public static Move SEED_BOMB = new Move("Seed Bomb", Type.GRASS, 0, 15);
	static {
		SEED_BOMB.power = 80;
		SEED_BOMB.accuracy = 100;
	}

	public static Move SIGNAL_BEAM = new Move("Signal Beam", Type.BUG, 1, 15);
	static {
		SIGNAL_BEAM.power = 75;
		SIGNAL_BEAM.accuracy = 100;
		// TODO: confusion (10%)
	}

	public static Move SLEEP_POWDER = new Move("Sleep Powder", Type.GRASS, 2, 15);
	static {
		SLEEP_POWDER.accuracy = 75;
		SLEEP_POWDER.effect = Status.SLEEP;
		SLEEP_POWDER.effectAccuracy = 100;
		SLEEP_POWDER.setFlags(false, true, true, false, false, false);
	}

	public static Move SHADOW_BALL = new Move("Shadow Ball", Type.GHOST, 1, 24);
	static {
		SHADOW_BALL.power = 80;
		SHADOW_BALL.accuracy = 100;
		// TODO: flags
		SHADOW_BALL.statDownsFoe.add("SD");
		SHADOW_BALL.statAccuracy = 20;
	}

	public static Move SHADOW_CLAW = new Move("Shadow Claw", Type.GHOST, 0, 15);
	static {
		SHADOW_CLAW.power = 70;
		SHADOW_CLAW.accuracy = 100;
		SHADOW_CLAW.critical = true;
	}

	public static Move SHADOW_SNEAK = new Move("Shadow Sneak", Type.GHOST, 0, 30);
	static {
		SHADOW_SNEAK.power = 40;
		SHADOW_SNEAK.accuracy = 100;
		SHADOW_SNEAK.priority = 1;
	}

	public static Move SHELL_SMASH = new Move("Shell Smash", Type.NORMAL, 2, 15);
	static {
		SHELL_SMASH.accuracy = 0;
		SHELL_SMASH.statAccuracy = 0;
		SHELL_SMASH.statUpsSelf.add("A");
		SHELL_SMASH.statUpsSelf.add("A");
		SHELL_SMASH.statUpsSelf.add("SA");
		SHELL_SMASH.statUpsSelf.add("SA");
		SHELL_SMASH.statUpsSelf.add("SP");
		SHELL_SMASH.statUpsSelf.add("SP");
		SHELL_SMASH.statDownsSelf.add("D");
		SHELL_SMASH.statDownsSelf.add("SD");
	}

	public static Move SLUDGE_BOMB = new Move("Sludge Bomb", Type.POISON, 1, 10);
	static {
		SLUDGE_BOMB.power = 90;
		SLUDGE_BOMB.accuracy = 100;
		SLUDGE_BOMB.effect = Status.POISON;
		SLUDGE_BOMB.effectAccuracy = 30;
	}

	public static Move SLUDGE_WAVE = new Move("Sludge Wave", Type.POISON, 1, 10);
	static {
		SLUDGE_WAVE.power = 95;
		SLUDGE_WAVE.accuracy = 100;
		SLUDGE_WAVE.effect = Status.POISON;
		SLUDGE_WAVE.effectAccuracy = 10;
	}

	public static Move SOFTBOILED = new Move("Softboiled", Type.NORMAL, 2, 10); // TODO: healing moves

	public static Move SOLARBEAM = new Move("SolarBeam", Type.GRASS, 1, 10);
	static {
		SOLARBEAM.power = 120;
		SOLARBEAM.accuracy = 100;
		// TODO: charge turn (no charge in sunlight)
	}

	public static Move SPARK = new Move("Spark", Type.ELECTRIC, 0, 20);
	static {
		SPARK.power = 65;
		SPARK.accuracy = 100;
		SPARK.effect = Status.PARALYSIS;
		SPARK.effectAccuracy = 30;
	}

	public static Move SPLASH = new Move("Splash", Type.NORMAL, 2, 64);

	public static Move SPORE = new Move("Spore", Type.GRASS, 2, 15);
	static {
		SPORE.accuracy = 100;
		SPORE.effect = Status.SLEEP;
		SPORE.effectAccuracy = 0;
	}

	public static Move STEEL_WING = new Move("Steel Wing", Type.STEEL, 0, 25);
	static {
		STEEL_WING.power = 70;
		STEEL_WING.accuracy = 90;
		STEEL_WING.statUpsSelf.add("D");
		STEEL_WING.statAccuracy = 10;
	}

	public static Move STOCKPILE = new Move("Stockpile", Type.NORMAL, 2, 20);
	static {
		STOCKPILE.accuracy = 0;
		STOCKPILE.statUpsSelf.add("D");
		STOCKPILE.statUpsSelf.add("SD");
		STOCKPILE.statAccuracy = 100;
		// TODO: stockpile counter
	}

	public static Move STONE_EDGE = new Move("Stone Edge", Type.ROCK, 0, 5);
	static {
		STONE_EDGE.power = 100;
		STONE_EDGE.accuracy = 80;
		STONE_EDGE.critical = true;
	}

	public static Move STRING_SHOT = new Move("String Shot", Type.BUG, 2, 40);
	static {
		STRING_SHOT.accuracy = 95;
		STRING_SHOT.statAccuracy = 0;
		STRING_SHOT.statDownsFoe.add("SP");
	}

	public static Move STRUGGLE_BUG = new Move("Struggle Bug", Type.BUG, 1, 20);
	static {
		STRUGGLE_BUG.power = 30;
		STRUGGLE_BUG.accuracy = 100;
		STRUGGLE_BUG.statDownsFoe.add("SA");
		STRUGGLE_BUG.statAccuracy = 100;
	}

	public static Move STUN_SPORE = new Move("Stun Spore", Type.GRASS, 2, 30);
	static {
		STUN_SPORE.accuracy = 75;
		STUN_SPORE.effect = Status.PARALYSIS;
		STUN_SPORE.effectAccuracy = 100;
	}

	public static Move SUCKER_PUNCH = new Move("Sucker Punch", Type.DARK, 0, 5);
	static {
		SUCKER_PUNCH.power = 80;
		SUCKER_PUNCH.priority = 1;
		// TODO: other features
	}

	public static Move SUPERPOWER = new Move("Superpower", Type.FIGHTING, 0, 5);
	static {
		SUPERPOWER.power = 120;
		SUPERPOWER.accuracy = 100;
		SUPERPOWER.statAccuracy = 0;
		SUPERPOWER.statDownsSelf.add("A");
		SUPERPOWER.statDownsSelf.add("SA");
	}

	public static Move SURF = new Move("Surf", Type.WATER, 1, 24);
	static {
		SURF.power = 95;
		SURF.accuracy = 100;
	}

	public static Move SWORDS_DANCE = new Move("Swords Dance", Type.NORMAL, 2, 30);
	static {
		SWORDS_DANCE.accuracy = 0;
		SWORDS_DANCE.statUpsSelf.add("A");
		SWORDS_DANCE.statUpsSelf.add("A");
		SWORDS_DANCE.statAccuracy = 0;
	}

	public static Move TACKLE = new Move("Tackle", Type.NORMAL, 0, 35);
	static {
		TACKLE.power = 35;
		TACKLE.accuracy = 95;
		TACKLE.contact = true;
		TACKLE.protect = true;
		TACKLE.kingsRock = true;
	}

	public static Move TAIL_SLAP = new Move("Tail Slap", Type.NORMAL, 0, 10);
	static {
		TAIL_SLAP.power = 25;
		TAIL_SLAP.accuracy = 85;
		// TODO: multi-hit move
	}

	public static Move THUNDER = new Move("Thunder", Type.ELECTRIC, 1, 10);
	static {
		THUNDER.power = 120;
		THUNDER.accuracy = 70;
		THUNDER.effect = Status.PARALYSIS;
		THUNDER.effectAccuracy = 30;
		// TODO: variable accuracy (100% in rain, 50% in sun); can hit airborne target
	}

	public static Move THUNDER_WAVE = new Move("Thunder Wave", Type.ELECTRIC, 2, 20);
	static {
		THUNDER_WAVE.accuracy = 100;
		THUNDER_WAVE.effect = Status.PARALYSIS;
		THUNDER_WAVE.effectAccuracy = 100;
	}

	public static Move THUNDERBOLT = new Move("Thunderbolt", Type.ELECTRIC, 1, 15);
	static {
		THUNDERBOLT.power = 95;
		THUNDERBOLT.accuracy = 100;
		THUNDERBOLT.effect = Status.PARALYSIS;
		THUNDERBOLT.effectAccuracy = 10;
	}

	public static Move THUNDERPUNCH = new Move("ThunderPunch", Type.ELECTRIC, 0, 15);
	static {
		THUNDERPUNCH.power = 75;
		THUNDERPUNCH.accuracy = 100;
		THUNDERPUNCH.effect = Status.PARALYSIS;
		THUNDERPUNCH.effectAccuracy = 10;
		THUNDERPUNCH.isPunch = true;
	}

	public static Move TICKLE = new Move("Tickle", Type.NORMAL, 2, 20);
	static {
		TICKLE.accuracy = 100;
		TICKLE.statAccuracy = 0;
		TICKLE.statDownsFoe.add("A");
		TICKLE.statDownsFoe.add("D");
	}

	public static Move TOXIC = new Move("Toxic", Type.POISON, 2, 10);
	static {
		TOXIC.accuracy = 90;
		TOXIC.effect = Status.BAD_POISON;
		TOXIC.effectAccuracy = 100;
	}

	public static Move TRI_ATTACK = new Move("Tri Attack", Type.NORMAL, 1, 10);
	static {
		TRI_ATTACK.power = 80;
		TRI_ATTACK.accuracy = 100;
		// TODO: has multiple possible statuses
	}

	public static Move U_TURN = new Move("U-Turn", Type.BUG, 0, 20);
	static {
		U_TURN.power = 70;
		U_TURN.accuracy = 100;
	}

	public static Move UPROAR = new Move("Uproar", Type.NORMAL, 1, 10);
	static {
		UPROAR.power = 90;
		UPROAR.accuracy = 100;
		// TODO: 3-turn move, wakes sleeping pokemon on first turn, prevents sleep, affected by Soundproof
	}

	public static Move VACUUM_WAVE = new Move("Vacuum Wave", Type.FIGHTING, 1, 30);
	static {
		VACUUM_WAVE.power = 40;
		VACUUM_WAVE.accuracy = 100;
		VACUUM_WAVE.priority = 1;
	}

	public static Move VINE_WHIP = new Move("Vine Whip", Type.GRASS, 0, 10);
	static {
		VINE_WHIP.power = 35;
		VINE_WHIP.accuracy = 100;
		VINE_WHIP.contact = true;
		VINE_WHIP.protect = true;
		VINE_WHIP.kingsRock = true;
	}

	public static Move VOLT_TACKLE = new Move("Volt Tackle", Type.ELECTRIC, 0, 15);
	static {
		VOLT_TACKLE.power = 120;
		VOLT_TACKLE.accuracy = 100;
		VOLT_TACKLE.effect = Status.PARALYSIS;
		VOLT_TACKLE.effectAccuracy = 10;
		// TODO: recoil
	}

	public static Move VOLT_SWITCH = new Move("Volt Switch", Type.ELECTRIC, 1, 20);
	static {
		VOLT_SWITCH.power = 70;
		VOLT_SWITCH.accuracy = 100;
	}

	public static Move WATER_PULSE = new Move("Water Pulse", Type.WATER, 1, 20);
	static {
		WATER_PULSE.power = 60;
		WATER_PULSE.accuracy = 100;
		// TODO: confusion (20%)
	}

	public static Move WATER_SPOUT = new Move("Water Spout", Type.WATER, 1, 5);
	static {
		WATER_SPOUT.power = 150; // TODO: varies with user's health
		WATER_SPOUT.accuracy = 100;
	}

	public static Move WATERFALL = new Move("Waterfall", Type.WATER, 0, 15);
	static {
		WATERFALL.power = 80;
		WATERFALL.accuracy = 100;
		WATERFALL.flinchAccuracy = 20;
	}

	public static Move WEATHER_BALL = new Move("Weather Ball", Type.NORMAL, 1, 10);
	static {
		WEATHER_BALL.power = 50;
		WEATHER_BALL.accuracy = 100;
		// TODO: type and power changes in weather
	}

	public static Move WILD_CHARGE = new Move("Wild Charge", Type.ELECTRIC, 0, 15);
	static {
		WILD_CHARGE.power = 90;
		WILD_CHARGE.accuracy = 100;
		// TODO: recoil (1/4, rounded up, at least 1HP)
	}

	public static Move WILL_O_WISP = new Move("Will-O-Wisp", Type.FIRE, 2, 15);
	static {
		WILL_O_WISP.accuracy = 75;
		WILL_O_WISP.effect = Status.BURN;
		WILL_O_WISP.effectAccuracy = 100;
	}

	public static Move WORK_UP = new Move("Work Up", Type.NORMAL, 2, 30);
	static {
		WORK_UP.accuracy = 0;
		WORK_UP.statUpsSelf.add("A");
		WORK_UP.statUpsSelf.add("SA");
		WORK_UP.statAccuracy = 0;
	}

	public static Move X_SCISSOR = new Move("X-Scissor", Type.BUG, 0, 15);
	static {
		X_SCISSOR.power = 80;
		X_SCISSOR.accuracy = 100;
	}

	public static Move ZEN_HEADBUTT = new Move("Zen Headbutt", Type.PSYCHIC, 0, 15);
	static {
		ZEN_HEADBUTT.power = 80;
		ZEN_HEADBUTT.accuracy = 90;
		ZEN_HEADBUTT.flinchAccuracy = 20;
	}


	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public int getCategory() {
		return category;
	}

	public int getPower() {
		return power;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public Status getEffect() {
		return effect;
	}

	public int getEffectAccuracy() {
		return effectAccuracy;
	}

	public int getPp() {
		return pp;
	}

	public int getPriority() {
		return priority;
	}

	public boolean isContact() {
		return contact;
	}

	public boolean isProtect() {
		return protect;
	}

	public boolean isMagicCoat() {
		return magicCoat;
	}

	public boolean isSnatch() {
		return snatch;
	}

	public boolean isMirrorMove() {
		return mirrorMove;
	}

	public boolean isKingsRock() {
		return kingsRock;
	}
	
	public boolean isCriticalHit() {
		return critical;
	}

	String name;

	Type type;
	int category; // 0 = physical, 1 = special, 2 = status
	// TODO: status moves

	int power;
	int accuracy;

	Status effect;
	int effectAccuracy;
	
	int flinchAccuracy = 0;

	/* Valid strings are:
	 * "A" = attack
	 * "D" = defence
	 * "SA" = special attack
	 * "SD" = special defence
	 * "SP" = speed
	 * "ACC" = accuracy
	 * "E" = evasion
	 */
	List<String> statUpsSelf;
	List<String> statDownsSelf;
	List<String> statUpsFoe;
	List<String> statDownsFoe;
	int statAccuracy;
	
	boolean critical;

	int pp;

	int priority;

	boolean contact;
	boolean protect;
	boolean magicCoat;
	boolean snatch;
	boolean mirrorMove;
	boolean kingsRock;
	
	boolean isPunch = false; // for Iron Fist ability

	// Requires: cat is 0 or 1 (for now) (TODO: status moves)
	public Move(String name, Type t, int cat, int pp) {
		this.name = name;
		type = t;
		category = cat;
		this.pp = pp;
		power = 0;
		accuracy = 100;
		priority = 0;
		contact = false;
		protect = false;
		magicCoat = false;
		snatch = false;
		mirrorMove = false;
		kingsRock = false;
		statUpsSelf = new ArrayList<String>();
		statDownsSelf = new ArrayList<String>();
		statUpsFoe = new ArrayList<String>();
		statDownsFoe = new ArrayList<String>();
		critical = false;
	}

	//	public Move(String name, Type t, int pp) {
	//		
	//	}

	public List<String> getStatUpsSelf() {
		return statUpsSelf;
	}

	public List<String> getStatDownsSelf() {
		return statDownsSelf;
	}

	public List<String> getStatUpsFoe() {
		return statUpsFoe;
	}

	public List<String> getStatDownsFoe() {
		return statDownsFoe;
	}

	public int getStatAccuracy() {
		return statAccuracy;
	}

	private void setFlags(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
		contact = a;
		protect = b;
		magicCoat = c;
		snatch = d;
		mirrorMove = e;
		kingsRock = f;
	}

	// Requires: move has PP > 0
	// Requires: other move-specific conditions are satisfied (eg. user must be sleeping for Snore)
	public void useMove(Pkmn user, Pkmn target, boolean showText) {
		if (showText) {
			System.out.println(user.species.name + " used " + this.name + "!");
		}
		
		double moveAcc = accuracy;
		if (user.ability == Ability.COMPOUND_EYES) { moveAcc = Math.min(accuracy*1.3, 100); }
		if (user.ability == Ability.HUSTLE && category == 0) { moveAcc = moveAcc * 0.8; }
		if (user.ability == Ability.NO_GUARD || target.ability == Ability.NO_GUARD) { moveAcc = 0; } // TODO: test this....
		// wonder skin must go last (overrides other mods)
		if (target.ability == Ability.WONDER_SKIN && category == 2 && (accuracy == 0 || accuracy > 50)) {
			moveAcc = 50; // TODO: confirm case: accuracy == 0
		}
		double effectiveAcc = moveAcc * user.getModifiedAccuracy() / target.getModifiedEvasion();

		if (category == 2) {
			
			// motor drive
			// TODO: check that move hits first
			if (target.ability == Ability.MOTOR_DRIVE && this.type == Type.ELECTRIC) {
				target.incSpeedMod();
				if (showText) {
					System.out.println(target.getName() + "'s Motor Drive absorbed the attack!");
					System.out.println(target.getName() + "'s speed rose!");
				}
				return;
			}
			
			// dry skin
			// TODO: check that Dry Skin activates for status Water attacks (in-game testing needed -- websites give no definite answer)
			if ((target.ability == Ability.DRY_SKIN || target.ability == Ability.WATER_ABSORB) && this.type == Type.WATER) {
				if (showText) {
					System.out.println(target.getName() + "'s " + target.ability.getName() + " absorbed the attack!");
				}
				target.heal((int) (target.totalHP/4), showText);
				return;
			}
			
			// volt absorb
			if (target.ability == Ability.VOLT_ABSORB && this.type == Type.ELECTRIC) {
				if (showText) {
					System.out.println(target.getName() + "'s " + target.ability.getName() + " absorbed the attack!"); // TODO: different text when at full health
				}
				target.heal((int) (target.totalHP/4), showText);
				return;
			}
			
			// flash fire
			if (target.ability == Ability.FLASH_FIRE && this.type == Type.FIRE) {
				if (showText) {
					System.out.println(target.getName() + "'s " + target.ability.getName() + " absorbed the attack!"); // TODO: different text when at full health
				}
				target.flashFire = true;
				return;
			}
			
			// sap sipper
			if (target.ability == Ability.SAP_SIPPER && this.type == Type.GRASS && name != "Aromatherapy") {
				if (showText) {
					System.out.println(target.getName() + "'s " + target.ability.getName() + " absorbed the attack!");
					System.out.println(target.getName() + "'s special attack rose!");
				}
				target.incAttackMod();
				return;
			}

			if (effect != null) {

				boolean targetImmune = (target.species.type1.statusImmunities.contains(effect) || (target.species.type1.defendImmune.contains(this.type)
						&& !(this == SAND_ATTACK && target.species.type1 == Type.FLYING)
						&& !(user.ability == Ability.SCRAPPY && target.species.type1 == Type.GHOST // TODO: test this
						&& (this.type == Type.NORMAL || this.type == Type.FIGHTING))));
				if (!targetImmune && target.species.type2 != null) {
					targetImmune = (target.species.type2.statusImmunities.contains(effect)  || (target.species.type2.defendImmune.contains(this.type)
							&& !(this == SAND_ATTACK && target.species.type2 == Type.FLYING)
							&& !(user.ability == Ability.SCRAPPY && target.species.type1 == Type.GHOST // TODO: test this
							&& (this.type == Type.NORMAL || this.type == Type.FIGHTING))));
				}
				
				targetImmune = targetImmune || ((effect == Status.POISON || effect == Status.BAD_POISON) && target.ability == Ability.IMMUNITY);
				targetImmune = targetImmune || (effect == Status.SLEEP && (target.ability == Ability.INSOMNIA ||target.ability == Ability.VITAL_SPIRIT));
				targetImmune = targetImmune || (effect == Status.PARALYSIS && target.ability == Ability.LIMBER);
				targetImmune = targetImmune || (effect == Status.FREEZE && target.ability == Ability.MAGMA_ARMOR);
				targetImmune = targetImmune || (effect == Status.BURN && target.ability == Ability.WATER_VEIL);
				
				targetImmune = targetImmune || (this.type == Type.GROUND && target.ability == Ability.LEVITATE && this != SAND_ATTACK);
				
				// TODO: proper text for ability-based immunity
				if (targetImmune) {
					if (showText) {
						System.out.println("It doesn't affect foe " + target.species.name + "!");
					}
					return;
				}

				if (!target.getStatus().equals(Status.OKAY)) {
					if (showText) {
						System.out.println("But it failed!"); // TODO: different text for same status already applied (poisons count as one)
					}
					return;
				}

				double randSpecialAcc = Math.random()*100;
				if (moveAcc != 0 && effectiveAcc <= randSpecialAcc) {

					if (showText) {
						System.out.println(user.species.name + "'s attack missed!");
					}
					return;

				}

				if (showText) {
					// TODO: proper text
					System.out.println(target.species.name + " has status: " + effect.name);
				}
				target.setStatus(effect);
				if (effect == Status.SLEEP) {
					target.sleepCounter = (int) (Math.random() * 3 + 2);
					target.sleepCounter--;
					if (target.ability == Ability.EARLY_BIRD) { target.sleepCounter--; }
				}
				if (effect == Status.BAD_POISON) {
					target.setBadPsnCounter(0);
				}
				
				if (target.statusCondition == Status.SLEEP && target.sleepCounter <= 0) {
					target.setStatus(Status.OKAY);
					if (showText) {
						System.out.println(target.getName() + " woke up!");
					}
				}
			}

			double randSpecialAcc = Math.random()*100;
			if (accuracy != 0 && effectiveAcc <= randSpecialAcc) {

				if (showText) {
					System.out.println(user.species.name + "'s attack missed!");
				}
				return;

			}

			// stat changes
			// TODO: stat change immunities d/t abilities, active field effects (eg. haze)
			// TODO: better text
			double randStatAcc = Math.random()*100;
			if (!(statUpsSelf.isEmpty() && statDownsSelf.isEmpty() && statUpsFoe.isEmpty() && statDownsFoe.isEmpty()) &&
					(statAccuracy == 0 || statAccuracy > randStatAcc)) {

				for(String s : statUpsSelf) {
					switch (s) {
					case "A":
						user.incAttackMod();
						if (showText) {
							System.out.println(user.getName() + "'s attack rose!");
						}
						break;
					case "D":
						user.incDefenceMod();
						if (showText) {
							System.out.println(user.getName() + "'s defence rose!");
						}
						break;
					case "SA":
						user.incSpAttackMod();
						if (showText) {
							System.out.println(user.getName() + "'s special attack rose!");
						}
						break;
					case "SD":
						user.incSpDefenceMod();
						if (showText) {
							System.out.println(user.getName() + "'s special defence rose!");
						}
						break;
					case "SP":
						user.incSpeedMod();
						if (showText) {
							System.out.println(user.getName() + "'s speed rose!");
						}
						break;
					case "ACC":
						user.incAccuracyMod();
						if (showText) {
							System.out.println(user.getName() + "'s accuracy rose!");
						}
						break;
					case "E":
						user.incEvasionMod();
						if (showText) {
							System.out.println(user.getName() + "'s evasion rose!");
						}
						break;
					}
				}

				for(String s : statDownsSelf) {
					switch (s) {
					case "A":
						user.decAttackMod();
						if (showText) {
							System.out.println(user.getName() + "'s attack fell!");
						}
						break;
					case "D":
						user.decDefenceMod();
						if (showText) {
							System.out.println(user.getName() + "'s defence fell!");
						}
						break;
					case "SA":
						user.decSpAttackMod();
						if (showText) {
							System.out.println(user.getName() + "'s special attack fell!");
						}
						break;
					case "SD":
						user.decSpDefenceMod();
						if (showText) {
							System.out.println(user.getName() + "'s special defence fell!");
						}
						break;
					case "SP":
						user.decSpeedMod();
						if (showText) {
							System.out.println(user.getName() + "'s speed fell!");
						}
						break;
					case "ACC":
						user.decAccuracyMod();
						if (showText) {
							System.out.println(user.getName() + "'s accuracy fell!");
						}
						break;
					case "E":
						user.decEvasionMod();
						if (showText) {
							System.out.println(user.getName() + "'s evasion fell!");
						}
						break;
					}
				}


				for(String s : statUpsFoe) {
					switch (s) {
					case "A":
						target.incAttackMod();
						if (showText) {
							System.out.println("Foe " + target.getName() + "'s attack rose!");
						}
						break;
					case "D":
						target.incDefenceMod();
						if (showText) {
							System.out.println("Foe " + target.getName() + "'s defence rose!");
						}
						break;
					case "SA":
						target.incSpAttackMod();
						if (showText) {
							System.out.println("Foe " + target.getName() + "'s special attack rose!");
						}
						break;
					case "SD":
						target.incSpDefenceMod();
						if (showText) {
							System.out.println("Foe " + target.getName() + "'s special defence rose!");
						}
						break;
					case "SP":
						target.incSpeedMod();
						if (showText) {
							System.out.println("Foe " + target.getName() + "'s speed rose!");
						}
						break;
					case "ACC":
						target.incAccuracyMod();
						if (showText) {
							System.out.println("Foe " + target.getName() + "'s accuracy rose!");
						}
						break;
					case "E":
						target.incEvasionMod();
						if (showText) {
							System.out.println("Foe " + target.getName() + "'s evasion rose!");
						}
						break;
					}
				}
				
				if (target.ability == Ability.CLEAR_BODY || target.ability == Ability.WHITE_SMOKE) {
					if (showText) {
						System.out.println(target.getName() + "'s " + target.ability.getName() + " prevents stat reduction!");
					}
				} else {
					for(String s : statDownsFoe) {
						switch (s) {
						case "A":
							if (target.ability == Ability.HYPER_CUTTER) {
								if (showText) {
									System.out.println(target.getName() + "'s Hyper Cutter prevents attack reduction!");
								}
								break;
							} else {
								target.decAttackMod();
								if (showText) {
									System.out.println("Foe " + target.getName() + "'s attack fell!");
								}
							}
							break;
						case "D":
							if (target.ability == Ability.BIG_PECKS) {
								if (showText) {
									System.out.println(target.getName() + "'s Big Pecks prevents defence reduction!");
								}
								break;
							} else {
								target.decDefenceMod();
								if (showText) {
									System.out.println("Foe " + target.getName() + "'s defence fell!");
								}
							}
							break;
						case "SA":
							target.decSpAttackMod();
							if (showText) {
								System.out.println("Foe " + target.getName() + "'s special attack fell!");
							}
							break;
						case "SD":
							target.decSpDefenceMod();
							if (showText) {
								System.out.println("Foe " + target.getName() + "'s special defence fell!");
							}
							break;
						case "SP":
							target.decSpeedMod();
							if (showText) {
								System.out.println("Foe " + target.getName() + "'s speed fell!");
							}
							break;
						case "ACC":
							if (target.ability == Ability.KEEN_EYE) {
								if (showText) {
									System.out.println(target.getName() + "'s Keen Eye prevents accuracy reduction!");
								}
								break;
							} else {
								target.decAccuracyMod();
								if (showText) {
									System.out.println("Foe " + target.getName() + "'s accuracy fell!");
								}
							}
							break;
						case "E":
							target.decEvasionMod();
							if (showText) {
								System.out.println("Foe " + target.getName() + "'s evasion fell!");
							}
							break;
						}
					}
				}

			}

			return;
		}

		int damage;
		int level = user.level;
		int attack = 0;
		int defence = 1;
		double base = power;
		double modifier;

		double stab = 1;
		double type = 1;
		double critical = 1; // TODO: critical calculation, stages
		double other = 1; // TODO: other stuff!
		double rand = Math.floor((Math.random()*16 + 85))/100;

		if (user.species.type1.equals(this.type) || (user.species.type2 != null && user.species.type2.equals(this.type))) { stab = 1.5; }

		if (this.type.attackEffective.contains(target.species.type1)) { type = type*2; }
		if (this.type.attackIneffective.contains(target.species.type1)) { type = type/2; }
		if (this.type.attackImmune.contains(target.species.type1)
				&& !(user.ability == Ability.SCRAPPY && target.species.type1 == Type.GHOST // TODO: test this
				&& (this.type == Type.NORMAL || this.type == Type.FIGHTING))) { type = 0; }

		if (target.species.type2 != null) {
			if (this.type.attackEffective.contains(target.species.type2)) { type = type*2; }
			if (this.type.attackIneffective.contains(target.species.type2)) { type = type/2; }
			if (this.type.attackImmune.contains(target.species.type2)
					&& !(user.ability == Ability.SCRAPPY && target.species.type2 == Type.GHOST
					&& (this.type == Type.NORMAL || this.type == Type.FIGHTING))) { type = 0; }
		}

		// TODO: stages; extra effects, negations, etc
		if (((!this.critical && Math.random() < 0.0625) || (this.critical && Math.random() < 0.125)) &&
				target.ability != Ability.BATTLE_ARMOR && target.ability != Ability.SHELL_ARMOR) {
			critical = critical * 2;
			if (user.ability == Ability.SNIPER) { critical = critical * 1.5; } // sniper
		}

		// physical damage reduction from burn
		if (user.getStatus().equals(Status.BURN) && this.category == 0 && user.ability != Ability.GUTS) {
			other = other/2;
		}
		
		// blaze, overgrow, swarm, torrent
		if ((user.ability == Ability.BLAZE && this.type == Type.FIRE) ||
				(user.ability == Ability.OVERGROW && this.type == Type.GRASS) ||
				(user.ability == Ability.SWARM && this.type == Type.BUG) ||
				(user.ability == Ability.TORRENT && this.type == Type.WATER)) {
			if (user.currHP <= user.totalHP) {
				other = other*1.5;
			}
		}
		
		// Levitate
		// TODO: proper text for levitate
		if (target.ability == Ability.LEVITATE && this.type == Type.GROUND) {
			other = 0;
			if (showText) {
				System.out.println(target.getName() + "'s Levitate makes the attack miss!");
			}
			return;
		}
		
		// thick fat
		if (target.ability == Ability.THICK_FAT && (this.type == Type.FIRE || this.type == Type.ICE)) {
			other = other/2;
		}
		
		// wonder guard
		if (target.ability == Ability.WONDER_GUARD && type <= 1 && this.type != Type.TYPELESS) {
			other = 0;
			if (showText) {
				System.out.println(target.getName() + " was protected by Wonder Guard!");
				// TODO: proper text
			}
			return;
		}
		
		// filter
		if ((target.ability == Ability.FILTER || target.ability == Ability.SOLID_ROCK) && type > 1) {
			other = other * 0.75;
		}
		
		// tinted lens
		if (user.ability == Ability.TINTED_LENS && type < 1) {
			other = other * 2;
		}
		
		// heatproof
		if (target.ability == Ability.HEATPROOF && this.type == Type.FIRE) {
			other = other * 0.5;
		}
		
		// iron fist
		if (user.ability == Ability.IRON_FIST && isPunch) {
			other = other * 1.2;
		}
		
		// multiscale
		if (target.ability == Ability.MULTISCALE && target.currHP == target.currHP) {
			other = other * 0.5;
		}
		
		// dry skin (fire damage increase)
		if (target.ability == Ability.DRY_SKIN && this.type == Type.FIRE) {
			other = other * 1.25;
		}
		
		// flash fire (boost)
		if (user.flashFire && this.type == Type.FIRE) {
			other = other * 1.5;
		}
		
		// technician
		// TODO: does not activate for confusion damage (power 40)
		// TODO: some moves change *base power* when conditions met (eg. Pursuit double base power to 80 when foe switches out)
		if (user.ability == Ability.TECHNICIAN && base <= 60) {
			base = base * 1.5;
		}
		
		// adaptability
		if (user.ability == Ability.ADAPTABILITY && stab > 1) {
			stab = 2;
		}

		modifier = stab*type*critical*other*rand;

		if (this.category == 0) {
			attack = user.getModifiedAttack();
			defence = target.getModifiedDefence();
		} else {
			attack = user.getModifiedSpAttack();
			defence = target.getModifiedSpDefence();
		}

		double damageAcc = 2*level;
		damageAcc += 10;
		damageAcc = damageAcc/250;
		damageAcc = damageAcc*attack;
		damageAcc = damageAcc/defence;
		damageAcc = damageAcc*base;
		damageAcc += 2;
		damageAcc = damageAcc*modifier;
		damage = (int) damageAcc;
		//		damage = (int) ((((2*level + 10)/250)*(attack/defence)*base + 2)*modifier);

		// accuracy check
		double randAcc = Math.random()*100;
		boolean doesHit = (effectiveAcc > randAcc || moveAcc == 0);

		if (type == 0) {
			if (showText) { System.out.println("It doesn't affect " + target.species.name + "..."); }
			return;
		}

		if (!doesHit) {
			if (showText) { System.out.println(user.species.name + "'s attack missed!"); }
			return;
		}

		// storm drain
		if (target.ability == Ability.STORM_DRAIN && this.type == Type.WATER) {
			target.incSpAttackMod();
			if (showText) {
				System.out.println(target.getName() + "'s Storm Drain absorbed the attack!");
				System.out.println(target.getName() + "'s special attack rose!");
			}
			return;
		}
		
		// motor drive
		if (target.ability == Ability.MOTOR_DRIVE && this.type == Type.ELECTRIC) {
			target.incSpeedMod();
			if (showText) {
				System.out.println(target.getName() + "'s Motor Drive absorbed the attack!");
				System.out.println(target.getName() + "'s speed rose!");
			}
			return;
		}
		
		// dry skin (heal) / water absorb
		if ((target.ability == Ability.DRY_SKIN || target.ability == Ability.WATER_ABSORB) && this.type == Type.WATER) {
			if (showText) {
				System.out.println(target.getName() + "'s " + target.ability.getName() + " absorbed the attack!"); // TODO: different text when at full health
			}
			target.heal((int) (target.totalHP/4), showText);
			return;
		}
		
		// volt absorb
		if (target.ability == Ability.VOLT_ABSORB && this.type == Type.ELECTRIC) {
			if (showText) {
				System.out.println(target.getName() + "'s " + target.ability.getName() + " absorbed the attack!"); // TODO: different text when at full health
			}
			target.heal((int) (target.totalHP/4), showText);
			return;
		}
		
		// flash fire
		if (target.ability == Ability.FLASH_FIRE && this.type == Type.FIRE) {
			if (showText) {
				System.out.println(target.getName() + "'s " + target.ability.getName() + " absorbed the attack!"); // TODO: text for boost
			}
			target.flashFire = true;
			return;
		}
		
		// sap sipper
		if (target.ability == Ability.SAP_SIPPER && this.type == Type.GRASS && name != "Aromatherapy") {
			if (showText) {
				System.out.println(target.getName() + "'s " + target.ability.getName() + " absorbed the attack!");
				System.out.println(target.getName() + "'s special attack rose!");
			}
			target.incAttackMod();
			return;
		}

		if (critical > 1) {
			if (showText) { System.out.println("Critical hit!"); }
		}

		if (showText) {
			if (type > 1) { System.out.println("It's super effective!"); }
			if (0 < type && type < 1) { System.out.println("It's not very effective..."); }
		}

		target.damage(damage, showText);
		
		// anger point
		if (target.ability == Ability.ANGER_POINT && critical > 1 && target.statusCondition != Status.FAINT) {
			target.attackMod = 6;
			if (showText) {
				System.out.println(target.getName() + "'s Anger Point maxed its attack!!");
			}
			// TODO: proper text
		}
		
		// justified
		if (target.ability == Ability.JUSTIFIED && this.type == Type.DARK) {
			target.incAttackMod();
			if (showText) {
				System.out.println(target.getName() + "'s Justified raised its attack!"); // TODO: proper text
			}
		}
		
		// rattled
		if (target.ability == Ability.RATTLED && (this.type == Type.BUG || this.type == Type.DARK || this.type == Type.GHOST)) {
			target.incSpeedMod();
			if (showText) {
				System.out.println(target.getName() + "'s Rattled raised its speed!"); // TODO: proper text
			}
		}
		
		// weak armor
		// TODO: activates for every hit of multi-hit moves
		if (target.ability == Ability.WEAK_ARMOR && category == 0) {
			target.incSpeedMod();
			target.decDefenceMod();
			if (showText) {
				System.out.println(target.getName() + "'s Weak Armor raised its speed and lowered its defence!"); // TODO: proper text
			}
		}
		
		// doubling of additional effect odds from serene grace
		// TODO: add other effects here as they are implemented (eg. confusion, attraction)
		// TODO: doubles effect of King's Rock and Razor Fang (items)
		if (user.ability == Ability.SERENE_GRACE) {
			flinchAccuracy = Math.min(flinchAccuracy*2, 100);
			effectAccuracy = Math.min(effectAccuracy*2, 100);
			statAccuracy = Math.min(statAccuracy*2, 100);
		}
		
		// shield dust (set to -1 b/c 0 is used for guaranteed events)
		if (target.ability == Ability.SHIELD_DUST) {
			flinchAccuracy = -1;
			effectAccuracy = -1;
			statAccuracy = -1;
		}
		
		// flinch
		if (Math.random()*100 < flinchAccuracy) {
			target.setFlinch(true, showText);
			if (target.ability == Ability.STEADFAST) { // TODO: check timing of ability
				target.incSpeedMod();
				if (showText) {
					System.out.println(target.getName() + "'s Steadfast increased its speed!"); // TODO: check text
				}
			}
		}

		// TODO: exceptions to status immunities (eg. Fire immune to burn from Fire moves, but not from Scald, Tri-Attack, etc)
		if (effect != null) {
			double randEffectAcc = Math.random()*100;
			if ((effectAccuracy > randEffectAcc || effectAccuracy == 0) && target.getStatus().equals(Status.OKAY)) {
				boolean targetImmune = target.species.type1.statusImmunities.contains(effect);
				if (!targetImmune && target.species.type2 != null) {
					targetImmune = target.species.type2.statusImmunities.contains(effect);
				}

				targetImmune = targetImmune || ((effect == Status.POISON || effect == Status.BAD_POISON) && target.ability == Ability.IMMUNITY);
				targetImmune = targetImmune || (effect == Status.SLEEP && (target.ability == Ability.INSOMNIA || target.ability == Ability.VITAL_SPIRIT));
				targetImmune = targetImmune || (effect == Status.PARALYSIS && target.ability == Ability.LIMBER);
				targetImmune = targetImmune || (effect == Status.FREEZE && target.ability == Ability.MAGMA_ARMOR);
				targetImmune = targetImmune || (effect == Status.BURN && target.ability == Ability.WATER_VEIL);
				
				if (!targetImmune) {
					target.setStatus(effect);

					if (effect == Status.SLEEP) {
						target.sleepCounter = (int) (Math.random() * 3 + 2);
						target.sleepCounter--;
						if (target.ability == Ability.EARLY_BIRD) { target.sleepCounter--; }
					}

					if (showText) {
						// TODO: proper text
						System.out.println(target.species.name + " has status: " + effect.name);
					}
					
					if (target.statusCondition == Status.SLEEP && target.sleepCounter <= 0) {
						target.setStatus(Status.OKAY);
						if (showText) {
							System.out.println(target.getName() + " woke up!");
						}
					}

				}
			}
		}

		// stat changes
		// TODO: stat change immunities d/t abilities, active field effects (eg. haze)
		// TODO: better text
		double randStatAcc = Math.random()*100;
		if (!(statUpsSelf.isEmpty() && statDownsSelf.isEmpty() && statUpsFoe.isEmpty() && statDownsFoe.isEmpty()) &&
				(statAccuracy == 0 || statAccuracy > randStatAcc)) {

			for(String s : statUpsSelf) {
				switch (s) {
				case "A":
					user.incAttackMod();
					if (showText) {
						System.out.println(user.getName() + "'s attack rose!");
					}
					break;
				case "D":
					user.incDefenceMod();
					if (showText) {
						System.out.println(user.getName() + "'s defence rose!");
					}
					break;
				case "SA":
					user.incSpAttackMod();
					if (showText) {
						System.out.println(user.getName() + "'s special attack rose!");
					}
					break;
				case "SD":
					user.incSpDefenceMod();
					if (showText) {
						System.out.println(user.getName() + "'s special defence rose!");
					}
					break;
				case "SP":
					user.incSpeedMod();
					if (showText) {
						System.out.println(user.getName() + "'s speed rose!");
					}
					break;
				case "ACC":
					user.incAccuracyMod();
					if (showText) {
						System.out.println(user.getName() + "'s accuracy rose!");
					}
					break;
				case "E":
					user.incEvasionMod();
					if (showText) {
						System.out.println(user.getName() + "'s evasion rose!");
					}
					break;
				}
			}

			for(String s : statDownsSelf) {
				switch (s) {
				case "A":
					user.decAttackMod();
					if (showText) {
						System.out.println(user.getName() + "'s attack fell!");
					}
					break;
				case "D":
					user.decDefenceMod();
					if (showText) {
						System.out.println(user.getName() + "'s defence fell!");
					}
					break;
				case "SA":
					user.decSpAttackMod();
					if (showText) {
						System.out.println(user.getName() + "'s special attack fell!");
					}
					break;
				case "SD":
					user.decSpDefenceMod();
					if (showText) {
						System.out.println(user.getName() + "'s special defence fell!");
					}
					break;
				case "SP":
					user.decSpeedMod();
					if (showText) {
						System.out.println(user.getName() + "'s speed fell!");
					}
					break;
				case "ACC":
					user.decAccuracyMod();
					if (showText) {
						System.out.println(user.getName() + "'s accuracy fell!");
					}
					break;
				case "E":
					user.decEvasionMod();
					if (showText) {
						System.out.println(user.getName() + "'s evasion fell!");
					}
					break;
				}
			}


			for(String s : statUpsFoe) {
				switch (s) {
				case "A":
					target.incAttackMod();
					if (showText) {
						System.out.println("Foe " + target.getName() + "'s attack rose!");
					}
					break;
				case "D":
					target.incDefenceMod();
					if (showText) {
						System.out.println("Foe " + target.getName() + "'s defence rose!");
					}
					break;
				case "SA":
					target.incSpAttackMod();
					if (showText) {
						System.out.println("Foe " + target.getName() + "'s special attack rose!");
					}
					break;
				case "SD":
					target.incSpDefenceMod();
					if (showText) {
						System.out.println("Foe " + target.getName() + "'s special defence rose!");
					}
					break;
				case "SP":
					target.incSpeedMod();
					if (showText) {
						System.out.println("Foe " + target.getName() + "'s speed rose!");
					}
					break;
				case "ACC":
					target.incAccuracyMod();
					if (showText) {
						System.out.println("Foe " + target.getName() + "'s accuracy rose!");
					}
					break;
				case "E":
					target.incEvasionMod();
					if (showText) {
						System.out.println("Foe " + target.getName() + "'s evasion rose!");
					}
					break;
				}
			}
			
			if (target.ability != Ability.CLEAR_BODY && target.ability != Ability.WHITE_SMOKE) {
				for(String s : statDownsFoe) {
					switch (s) {
					case "A":
						if (target.ability != Ability.HYPER_CUTTER) {
							target.decAttackMod();
							if (showText) {
								System.out.println("Foe " + target.getName() + "'s attack fell!");
							}
						}
						break;
					case "D":
						if (target.ability != Ability.BIG_PECKS) {
							target.decDefenceMod();
							if (showText) {
								System.out.println("Foe " + target.getName() + "'s defence fell!");
							}
						}
						break;
					case "SA":
						target.decSpAttackMod();
						if (showText) {
							System.out.println("Foe " + target.getName() + "'s special attack fell!");
						}
						break;
					case "SD":
						target.decSpDefenceMod();
						if (showText) {
							System.out.println("Foe " + target.getName() + "'s special defence fell!");
						}
						break;
					case "SP":
						target.decSpeedMod();
						if (showText) {
							System.out.println("Foe " + target.getName() + "'s speed fell!");
						}
						break;
					case "ACC":
						if (target.ability != Ability.KEEN_EYE) {
							target.decSpeedMod();
							if (showText) {
								System.out.println("Foe " + target.getName() + "'s accuracy fell!");
							}
						}
						break;
					case "E":
						target.decEvasionMod();
						if (showText) {
							System.out.println("Foe " + target.getName() + "'s evasion fell!");
						}
						break;
					}
				}
			}

		}

	}

	public double getExpectedDamage(Pkmn user, Pkmn target) {

		double damage = 0;

		if (category != 2) {
			double moveAcc = accuracy;
			if (user.ability == Ability.COMPOUND_EYES) { moveAcc = Math.min(accuracy*1.3, 100); }
			if (user.ability == Ability.HUSTLE && category == 0) { moveAcc = moveAcc * 0.8; }
			if (user.ability == Ability.NO_GUARD || target.ability == Ability.NO_GUARD) { moveAcc = 0; } // TODO: test this...
			double effectiveAcc = moveAcc * user.getModifiedAccuracy() / target.getModifiedEvasion();

			int level = user.getLevel();
			int attack = 0;
			int defence = 1;
			double base = this.getPower();
			double modifier;
			
			double criticalAcc = 1/16;
			if (this.critical) { criticalAcc = criticalAcc * 2; }
			double criticalPower = 2;
			if (user.ability == Ability.SNIPER) {criticalPower = criticalPower * 1.5; }

			double stab = 1;
			double type = 1;
			double critical = (1 - criticalAcc) + criticalAcc * criticalPower; // TODO: test/check
//			if (this.critical) { critical = 9/8; }
			if (target.ability == Ability.BATTLE_ARMOR || target.ability == Ability.SHELL_ARMOR) { critical = 1; }
			double other = 1;
			double rand = 0.925;

			if (user.getSpecies().getType1().equals(this.getType()) || (user.getSpecies().getType2() != null && user.getSpecies().getType2().equals(this.getType()))) { stab = 1.5; }

			if (this.getType().getAttackEffective().contains(target.getSpecies().getType1())) { type = type*2; }
			if (this.getType().getAttackIneffective().contains(target.getSpecies().getType1())) { type = type/2; }
			if (this.getType().getAttackImmune().contains(target.getSpecies().getType1())
					&& !(user.ability == Ability.SCRAPPY && target.species.type1 == Type.GHOST
					&& (this.type == Type.NORMAL || this.type == Type.FIGHTING))) { type = 0; }

			if (target.getSpecies().getType2() != null) {
				if (this.getType().getAttackEffective().contains(target.getSpecies().getType2())) { type = type*2; }
				if (this.getType().getAttackIneffective().contains(target.getSpecies().getType2())) { type = type/2; }
				if (this.getType().getAttackImmune().contains(target.getSpecies().getType2())
						&& !(user.ability == Ability.SCRAPPY && target.species.type2 == Type.GHOST
						&& (this.type == Type.NORMAL || this.type == Type.FIGHTING))) { type = 0; }
			}

			// physical damage reduction from burn
			if (user.getStatus().equals(Status.BURN) && this.category == 0 && user.ability != Ability.GUTS) {
				other = other/2;
			}
			
			// blaze, overgrow, swarm, torrent
			if ((user.ability == Ability.BLAZE && this.type == Type.FIRE) ||
					(user.ability == Ability.OVERGROW && this.type == Type.GRASS) ||
					(user.ability == Ability.SWARM && this.type == Type.BUG) ||
					(user.ability == Ability.TORRENT && this.type == Type.WATER)) {
				if (user.currHP <= user.totalHP) {
					other = other*1.5;
				}
			}
			
			// Levitate
			if (target.ability == Ability.LEVITATE && this.type == Type.GROUND) {
				other = 0;
				return 0;
			}
			
			// thick fat
			if (target.ability == Ability.THICK_FAT && (this.type == Type.FIRE || this.type == Type.ICE)) {
				other = other/2;
			}
			
			// wonder guard
			if (target.ability == Ability.WONDER_GUARD && type <= 1 && this.type != Type.TYPELESS) {
				other = 0;
				return 0;
			}
			
			// filter
			if ((target.ability == Ability.FILTER || target.ability == Ability.SOLID_ROCK) && type > 1) {
				other = other * 0.75;
			}
			
			// tinted lens
			if (user.ability == Ability.TINTED_LENS && type < 1) {
				other = other * 2;
			}
			
			// heatproof
			if (target.ability == Ability.HEATPROOF && this.type == Type.FIRE) {
				other = other * 0.5;
			}
			
			// iron fist
			if (user.ability == Ability.IRON_FIST && isPunch) {
				other = other * 1.2;
			}
			
			// multiscale
			if (target.ability == Ability.MULTISCALE && target.currHP == target.currHP) {
				other = other * 0.5;
			}
			
			// storm drain
			if (target.ability == Ability.STORM_DRAIN && this.type == Type.WATER) {
				other = 0;
				return 0;
			}
			
			// motor drive
			if (target.ability == Ability.MOTOR_DRIVE && this.type == Type.ELECTRIC) {
				return 0;
			}
			
			// dry skin (fire)
			if (target.ability == Ability.DRY_SKIN && this.type == Type.FIRE) {
				other = other * 1.25;
			}
			// dry skin (water) / water absorb
			if ((target.ability == Ability.DRY_SKIN || target.ability == Ability.WATER_ABSORB) && this.type == Type.WATER) {
				return 0;
			}
			
			// volt absorb
			if (target.ability == Ability.VOLT_ABSORB && this.type == Type.ELECTRIC) {
				return 0;
			}
			
			// flash fire
			if (target.ability == Ability.FLASH_FIRE && this.type == Type.FIRE) {
				return 0;
			}
			
			// flash fire (boost)
			if (user.flashFire && this.type == Type.FIRE) {
				other = other * 1.5;
			}
			
			// sap sipper
			if (target.ability == Ability.SAP_SIPPER && this.type == Type.GRASS && name != "Aromatherapy") {
				return 0;
			}
			
			// technician
			// TODO: does not activate for confusion damage (power 40)
			// TODO: some moves change *base power* when conditions met (eg. Pursuit double base power to 80 when foe switches out)
			if (user.ability == Ability.TECHNICIAN && base <= 60) {
				base = base * 1.5;
			}
			
			// adaptability
			if (user.ability == Ability.ADAPTABILITY && stab > 1) {
				stab = 2;
			}

			modifier = stab*type*critical*other*rand;

			if (this.getCategory() == 0) {
				attack = user.getModifiedAttack();
				defence = target.getModifiedDefence();
			} else {
				attack = user.getModifiedSpAttack();
				defence = target.getModifiedSpDefence();
			}

			damage = 2*level;
			damage += 10;
			damage = damage/250;
			damage = damage*attack;
			damage = damage/defence;
			damage = damage*base;
			damage += 2;
			damage = damage*modifier;

			if (effectiveAcc != 0) {
				damage = damage*effectiveAcc;
			}
		}

		return damage;
	}
	
	public boolean isStatMove() {
		boolean ret = (category == 2 && !(statUpsSelf.isEmpty() && statDownsSelf.isEmpty() && statUpsFoe.isEmpty() && statDownsFoe.isEmpty()));
		
		return ret;
	}
	
	public boolean isStatusMove() {
		return (category == 2 && effect != null && (effectAccuracy == 0 || effectAccuracy == 100));
	}

	public int getFlinchAccuracy() {
		return flinchAccuracy;
	}

}

