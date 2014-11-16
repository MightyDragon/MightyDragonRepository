package src.simulator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import src.model.Ability;
import src.model.Move;
import src.model.Nature;
import src.model.Pkmn;
import src.model.Species;

@SuppressWarnings("unused")
public class Client {

	public Client(){
		//this.mainPokemon();
	}
	public static void mainFile() {
		
		List<Pkmn> battleList = new ArrayList<Pkmn>();
		List<Pkmn> battleList2 = new ArrayList<Pkmn>();
		System.out.println(Thread.getAllStackTraces());

		
		Pkmn abra1 = new Pkmn(Species.ABRA, 5, Nature.TIMID);
		abra1.code = "abra1";
		abra1.setMoveset(Move.PSYCHIC, Move.SHADOW_BALL, Move.HIDDEN_POWER_FIGHTING); // TODO: Protect or Substitute
		abra1.setAbility(Ability.INNER_FOCUS); // TODO: Magic Guard
		abra1.setAllEVs(0, 0, 0, 240, 0, 200);
		battleList.add(abra1);
		battleList2.add(abra1);
		
		Pkmn archen1 = new Pkmn(Species.ARCHEN, 5, Nature.JOLLY);
		archen1.code = "arch1";
		archen1.setMoveset(Move.STONE_EDGE, Move.ACROBATICS, Move.U_TURN, Move.EARTHQUAKE); // TODO: Roost; or Rock Slide for Stone Edge
		archen1.setAbility(Ability.DEFEATIST);
		archen1.setAllEVs(76, 180, 0, 0, 0, 196);
		battleList.add(archen1);
		
		Pkmn archen2 = new Pkmn(Species.ARCHEN, 5, Nature.ADAMANT);
		archen2.code = "arch2";
		archen2.setMoveset(Move.STONE_EDGE, Move.ACROBATICS, Move.U_TURN, Move.EARTHQUAKE); // TODO: Roost; or Rock Slide for Stone Edge
		archen2.setAbility(Ability.DEFEATIST);
		archen2.setAllEVs(236, 100, 76, 0, 76, 0);
		battleList.add(archen2);
		
		Pkmn axew1 = new Pkmn(Species.AXEW, 5);
		axew1.code = "axew1";
		axew1.setMoveset(Move.AQUA_TAIL, Move.OUTRAGE, Move.DRAGON_CLAW, Move.SUPERPOWER);
//		battleList.add(axew1);
		
		Pkmn axew2 = new Pkmn(Species.AXEW, 5, Nature.JOLLY);
		axew2.code = "axew2";
		axew2.setMoveset(Move.AQUA_TAIL, Move.OUTRAGE, Move.DRAGON_CLAW, Move.DRAGON_DANCE); // or Superpower for Dragon Claw
		// TODO: Mold Breaker
		axew2.setAllEVs(68, 220, 0, 0, 0, 220);
		battleList.add(axew2);
		
		Pkmn bidoof1 = new Pkmn(Species.BIDOOF, 5);
		bidoof1.code = "bido1";
		bidoof1.setMoveset(Move.RETURN, Move.AQUA_TAIL, Move.QUICK_ATTACK);
		// TODO: ability = Simple
//		battleList.add(bidoof1);
		
		Pkmn bronzor1 = new Pkmn(Species.BRONZOR, 5, Nature.CAREFUL); // TODO: Recycle + Berry set
		bronzor1.code = "bron1";
		bronzor1.setMoveset(Move.EARTHQUAKE, Move.PSYCHIC, Move.TOXIC, Move.HYPNOSIS); // TODO: Stealth Rock, Flash Cannon(!!)
		bronzor1.setAbility(Ability.LEVITATE); // or Heatproof, but Levitate generally better
		bronzor1.setAllEVs(220, 4, 68, 4, 148, 16);
		battleList.add(bronzor1);
		
		Pkmn bronzor2 = new Pkmn(Species.BRONZOR, 5, Nature.CAREFUL); // Heatproof version of bronzor1 (with Levitate)
		bronzor2.code = "bron2";
		bronzor2.setMoveset(Move.EARTHQUAKE, Move.PSYCHIC, Move.TOXIC, Move.HYPNOSIS); // TODO: Stealth Rock, Flash Cannon(!!)
		bronzor2.setAbility(Ability.HEATPROOF); // or Levitate
		bronzor2.setAllEVs(220, 4, 68, 4, 148, 16);
		battleList.add(bronzor2);
		
		Pkmn bulbasaur1 = new Pkmn(Species.BULBASAUR, 5, Nature.MODEST);
		bulbasaur1.code = "bulb1";
		bulbasaur1.setMoveset(Move.SLEEP_POWDER, Move.LEAF_STORM, Move.SLUDGE_BOMB, Move.HIDDEN_POWER_FIRE);
		bulbasaur1.setAbility(Ability.OVERGROW); // Chlorophyll illegal
		bulbasaur1.setAllEVs(0, 0, 0, 240, 0, 240);
		battleList.add(bulbasaur1);
		
		Pkmn charmander1 = new Pkmn(Species.CHARMANDER, 5, Nature.ADAMANT);
		charmander1.code = "char1";
		charmander1.setMoveset(Move.FLARE_BLITZ, Move.THUNDERPUNCH, Move.BRICK_BREAK, Move.DRAGON_DANCE); // or Rock Slide for Brick Break
		charmander1.setAbility(Ability.BLAZE); // Solar Power illegal
		charmander1.setIVHP(21); // for Life Orb
		charmander1.setAllEVs(0, 180, 92, 0, 0, 236);
		battleList.add(charmander1);
		
		Pkmn charmander2 = new Pkmn(Species.CHARMANDER, 5, Nature.ADAMANT);
		charmander2.code = "char2";
		charmander2.setMoveset(Move.FLARE_BLITZ, Move.THUNDERPUNCH, Move.BRICK_BREAK, Move.ROCK_SLIDE);
		charmander2.setAbility(Ability.BLAZE); // Solar Power illegal
		charmander2.setAllEVs(44, 180, 16, 0, 0, 236);
		battleList.add(charmander2);
		
		Pkmn chikorita1 = new Pkmn(Species.CHIKORITA, 5, Nature.CALM);
		chikorita1.code = "chik1";
		chikorita1.setMoveset(Move.GIGA_DRAIN, Move.TOXIC, Move.LEAF_STORM, Move.HIDDEN_POWER_FIRE); // TODO: ++ support moves
		chikorita1.setAbility(Ability.OVERGROW); // Leaf Guard illegal
		chikorita1.setAllEVs(156, 0, 156, 0, 156, 0);
		battleList.add(chikorita1);
		battleList2.add(chikorita1);
		
		Pkmn chimchar1 = new Pkmn(Species.CHIMCHAR, 5, Nature.HASTY);
		chimchar1.code = "chim1";
		chimchar1.setMoveset(Move.FAKE_OUT, Move.FIRE_BLAST, Move.HIDDEN_POWER_GRASS, Move.OVERHEAT); // TODO: Stealth Rock, Taunt, Protect
		chimchar1.setAbility(Ability.BLAZE); // Iron Fist illegal
		chimchar1.setAllEVs(4, 56, 0, 216, 4, 188);
		battleList.add(chimchar1);
		
		Pkmn chinchou1 = new Pkmn(Species.CHINCHOU, 5, Nature.MODEST);
		chinchou1.code = "chin1";
		chinchou1.setMoveset(Move.HYDRO_PUMP, Move.THUNDERBOLT, Move.ICE_BEAM, Move.VOLT_SWITCH); // TODO: other movesets
		chinchou1.setAbility(Ability.VOLT_ABSORB);
		chinchou1.setAllEVs(0, 0, 52, 232, 0, 224);
		battleList.add(chinchou1);
		
		Pkmn clamperl1 = new Pkmn(Species.CLAMPERL, 5, Nature.TIMID);
		clamperl1.code = "clam1";
		clamperl1.setMoveset(Move.SURF, Move.ICE_BEAM, Move.HIDDEN_POWER_GRASS, Move.SHELL_SMASH); // TODO: or Substitute for Ice Beam; or HP Fire
		clamperl1.setAbility(Ability.RATTLED);
		clamperl1.setIVA(30);
		clamperl1.setIVSA(30);
		clamperl1.setAllEVs(76, 0, 0, 248, 0, 180);
		battleList.add(clamperl1);
		
		Pkmn cottonee1 = new Pkmn(Species.COTTONEE, 5);
		cottonee1.code = "cott1";
		cottonee1.setMoveset(Move.STUN_SPORE); // TODO: defensive moves
//		battleList.add(cottonee1);
		
		Pkmn cranidos1 = new Pkmn(Species.CRANIDOS, 5, Nature.ADAMANT); // or Jolly
		cranidos1.code = "cran1";
		cranidos1.setMoveset(Move.HEAD_SMASH, Move.STONE_EDGE, Move.EARTHQUAKE, Move.ZEN_HEADBUTT); // or Fire Punch for Zen Headbutt
		// TODO: Mold Breaker
		cranidos1.setAllEVs(60, 236, 0, 0, 0, 212); // TODO: alternate Rock Polish set
		battleList.add(cranidos1);
		
		Pkmn croagunk1 = new Pkmn(Species.CROAGUNK, 5, Nature.QUIET);
		croagunk1.code = "croa1";
		croagunk1.setMoveset(Move.DRAIN_PUNCH, Move.VACUUM_WAVE, Move.SHADOW_BALL, Move.KNOCK_OFF); // or Fake Out for Knock Off
		croagunk1.setAbility(Ability.DRY_SKIN);
		croagunk1.setAllEVs(212, 28, 36, 108, 116, 0);
		battleList.add(croagunk1);
		
		Pkmn croagunk2 = new Pkmn(Species.CROAGUNK, 5, Nature.ADAMANT);
		croagunk2.code = "croa2";
		croagunk2.setMoveset(Move.DRAIN_PUNCH, Move.SUCKER_PUNCH, Move.BULK_UP, Move.PAYBACK); // or Knock Off or Vacuum Wave for Payback
		croagunk2.setAbility(Ability.DRY_SKIN);
		croagunk2.setAllEVs(212, 28, 116, 0, 116, 36);
		battleList.add(croagunk2);
		
		Pkmn cyndaquil1 = new Pkmn(Species.CYNDAQUIL, 5, Nature.MODEST);
		cyndaquil1.code = "cynd1";
		cyndaquil1.setMoveset(Move.ERUPTION, Move.FIRE_BLAST, Move.HIDDEN_POWER_GRASS, Move.NATURE_POWER);
		cyndaquil1.setAbility(Ability.BLAZE); // Flash Fire illegal (but good!!)
		cyndaquil1.setAllEVs(44, 24, 0, 200, 0, 236);
		battleList.add(cyndaquil1);
		
		Pkmn darumaka1 = new Pkmn(Species.DARUMAKA, 5, Nature.JOLLY); // TODO: support set
		darumaka1.code = "daru1";
		darumaka1.setMoveset(Move.FLARE_BLITZ, Move.SUPERPOWER, Move.ROCK_SLIDE, Move.U_TURN);
		darumaka1.setAbility(Ability.HUSTLE);
		darumaka1.setAllEVs(116, 196, 0, 0, 0, 196);
		battleList.add(darumaka1);
		
		Pkmn deino1 = new Pkmn(Species.DEINO, 5, Nature.JOLLY);
		deino1.code = "dein1";
		deino1.setMoveset(Move.OUTRAGE, Move.CRUNCH, Move.SUPERPOWER, Move.HEAD_SMASH); // or Zen Headbutt for Head Smash
		deino1.setAbility(Ability.HUSTLE);
		deino1.setAllEVs(20, 236, 36, 0, 0, 212);
		battleList.add(deino1);
		
		Pkmn diglett1 = new Pkmn(Species.DIGLETT, 5, Nature.JOLLY);
		diglett1.code = "digl1";
		diglett1.setMoveset(Move.EARTHQUAKE, Move.ROCK_SLIDE, Move.SUCKER_PUNCH); // TODO: other moves
		// TODO: Arena Trap
		diglett1.setAllEVs(36, 236, 0, 0, 0, 236);
		battleList.add(diglett1);
		
		Pkmn doduo1 = new Pkmn(Species.DODUO, 5, Nature.JOLLY);
		doduo1.code = "dodu1";
		doduo1.setMoveset(Move.BRAVE_BIRD, Move.RETURN, Move.PURSUIT, Move.TOXIC); // TODO: Roost (for Toxic, opt.); or Double-Edge for Return
		doduo1.setAbility(Ability.EARLY_BIRD);
		doduo1.setAllEVs(0, 236, 0, 0, 0, 236);
		battleList.add(doduo1);
		
		Pkmn doduo2 = new Pkmn(Species.DODUO, 5, Nature.NAIVE);
		doduo2.code = "dodu2";
		doduo2.setMoveset(Move.WORK_UP, Move.BRAVE_BIRD, Move.RETURN, Move.HIDDEN_POWER_GROUND); // or Drill Peck for Brave Bird, Double-Edge for Return, HP Grass
		doduo2.setAbility(Ability.EARLY_BIRD);
		doduo2.setAllEVs(0, 236, 0, 0, 0, 236);
		battleList.add(doduo2);
		
		Pkmn dratini1 = new Pkmn(Species.DRATINI, 5, Nature.LONELY); // or Hasty (see website)
		dratini1.code = "drat1";
		dratini1.setMoveset(Move.OUTRAGE, Move.EXTREMESPEED, Move.FIRE_BLAST, Move.DRAGON_DANCE); // TODO: RestTalk set
		dratini1.setAbility(Ability.SHED_SKIN);
//		dratini1.setIVHP(0); // for Life Orb (optional - Eviolite also good)
		dratini1.setAllEVs(0, 244, 0, 36, 0, 196);
		battleList.add(dratini1);
		
		Pkmn drifloon1 = new Pkmn(Species.DRIFLOON, 5, Nature.NAIVE); // or Naughty
		drifloon1.code = "drif1";
		drifloon1.setMoveset(Move.ACROBATICS, Move.SHADOW_BALL, Move.HIDDEN_POWER_ICE, Move.WILL_O_WISP);
		drifloon1.setAbility(Ability.FLARE_BOOST); // TODO: Unburden
		drifloon1.setAllEVs(36, 200, 8, 40, 8, 200);
		battleList.add(drifloon1);
		
		Pkmn drifloon2 = new Pkmn(Species.DRIFLOON, 5, Nature.MODEST);
		drifloon2.code = "drif2";
		drifloon2.setMoveset(Move.CALM_MIND, Move.SHADOW_BALL, Move.HIDDEN_POWER_FIGHTING, Move.THUNDERBOLT); // TODO: substitute
		drifloon2.setAbility(Ability.FLARE_BOOST); // TODO: Unburden
		drifloon2.setAllEVs(116, 0, 8, 200, 8, 120);
		battleList.add(drifloon2);
		
		Pkmn drilbur1 = new Pkmn(Species.DRILBUR, 5, Nature.ADAMANT); // TODO: mold breaker drilbur (ability)
		drilbur1.code = "dril1";
		drilbur1.setMoveset(Move.EARTHQUAKE, Move.X_SCISSOR, Move.ROCK_SLIDE, Move.SHADOW_CLAW); // TODO: Rapid Spin
		// TODO: ability options (multiple); Sandstorm!
		drilbur1.setAllEVs(0, 236, 36, 0, 0, 212);
		battleList.add(drilbur1);
		
		Pkmn drilbur2 = new Pkmn(Species.DRILBUR, 5, Nature.ADAMANT);
		drilbur2.code = "dril2";
		drilbur2.setMoveset(Move.EARTHQUAKE, Move.SWORDS_DANCE, Move.ROCK_SLIDE, Move.SHADOW_CLAW);
		// TODO: ability options (multiple)
		drilbur2.setAllEVs(0, 236, 36, 0, 0, 212);
		battleList.add(drilbur2);
		
		Pkmn dwebble1 = new Pkmn(Species.DWEBBLE, 5, Nature.ADAMANT);
		dwebble1.code = "dweb1";
		dwebble1.setMoveset(Move.ROCK_BLAST, Move.X_SCISSOR, Move.EARTHQUAKE, Move.SHELL_SMASH);
		dwebble1.setAbility(Ability.STURDY);
		dwebble1.setAllEVs(36, 236, 0, 0, 0, 236);
		battleList.add(dwebble1);
		
		Pkmn eevee1 = new Pkmn(Species.EEVEE, 5, Nature.NAIVE); // or Hasty
		eevee1.code = "eeve1";
		eevee1.setMoveset(Move.QUICK_ATTACK, Move.SHADOW_BALL, Move.HIDDEN_POWER_FIRE, Move.RETURN); // TODO: alternate set; also, multiple alternatives in this set
		eevee1.setAbility(Ability.ADAPTABILITY);
		eevee1.setAllEVs(0, 236, 0, 0, 0, 240);
		battleList.add(eevee1);
		
		Pkmn elekid1 = new Pkmn(Species.ELEKID, 5, Nature.JOLLY);
		elekid1.code = "elek1";
		elekid1.setMoveset(Move.WILD_CHARGE, Move.CROSS_CHOP, Move.FIRE_PUNCH, Move.ICE_PUNCH); // or HP Grass for Fire Punch
		elekid1.setAbility(Ability.VITAL_SPIRIT); // TODO: Static
		elekid1.setIVHP(0); // for Life Orb
		elekid1.setAllEVs(0, 252, 0, 0, 0, 236);
		battleList.add(elekid1);
		
		Pkmn elgyem1 = new Pkmn(Species.ELGYEM, 5, Nature.MODEST);
		elgyem1.code = "elgy1";
		elgyem1.setMoveset(Move.PSYCHIC, Move.THUNDERBOLT, Move.HIDDEN_POWER_FIGHTING); // TODO: Recover
		// TODO: Analytic
		elgyem1.setAllEVs(76, 0, 0, 240, 0, 120);
		battleList.add(elgyem1);
		
		Pkmn exeggcute1 = new Pkmn(Species.EXEGGCUTE, 5, Nature.TIMID); // TODO: other sets
		exeggcute1.code = "exeg1";
		exeggcute1.setMoveset(Move.SLEEP_POWDER, Move.LEAF_STORM, Move.GIGA_DRAIN, Move.PSYCHIC); // TODO: Substitute
		// TODO: Chlorophyll or Harvest
		exeggcute1.setAllEVs(36, 0, 36, 196, 0, 196);
		battleList.add(exeggcute1);
		
		Pkmn ferroseed1 = new Pkmn(Species.FERROSEED, 5);
		ferroseed1.code = "ferr1";
		ferroseed1.setMoveset(Move.THUNDER_WAVE, Move.BULLET_SEED);
//		battleList.add(ferroseed1);
		
		Pkmn frillish1 = new Pkmn(Species.FRILLISH, 5, Nature.BOLD); // or Calm
		frillish1.code = "fril1";
		frillish1.setMoveset(Move.SURF, Move.SHADOW_BALL, Move.TOXIC, Move.WILL_O_WISP); // TODO: recover; or Scald for Surf
		frillish1.setAbility(Ability.WATER_ABSORB); // TODO: Cursed Body
		frillish1.setAllEVs(236, 0, 196, 0, 76, 0);
		battleList.add(frillish1);
		
		Pkmn frillish2 = new Pkmn(Species.FRILLISH, 5, Nature.TIMID);
		frillish2.code = "fril2";
		frillish2.setMoveset(Move.HYDRO_PUMP, Move.SHADOW_BALL, Move.ICE_BEAM, Move.GIGA_DRAIN); // TODO: or water spout (instead of hydro pump)
		frillish2.setAbility(Ability.WATER_ABSORB);
		frillish2.setAllEVs(76, 0, 0, 236, 0, 196);
		battleList.add(frillish2);
		
		Pkmn gastly1 = new Pkmn(Species.GASTLY, 5, Nature.TIMID); // or Modest (more power)
		gastly1.code = "gast1";
		gastly1.setMoveset(Move.SHADOW_BALL, Move.SLUDGE_BOMB, Move.HIDDEN_POWER_FIGHTING, Move.HYPNOSIS); // TODO: substitute
		gastly1.setAbility(Ability.LEVITATE);
		gastly1.setAllEVs(68, 0, 40, 200, 0, 200);
		battleList.add(gastly1);
		battleList2.add(gastly1);
		
		Pkmn happiny1 = new Pkmn(Species.HAPPINY, 5);
		happiny1.code = "happ1";
		happiny1.setMoveset(Move.THUNDER_WAVE, Move.TOXIC, Move.FLAMETHROWER); // TODO: heal bell, light screen
		happiny1.setAbility(Ability.SERENE_GRACE); // TODO: Natural Cure
//		battleList.add(happiny1);
		
		Pkmn hippopotas1 = new Pkmn(Species.HIPPOPOTAS, 5, Nature.IMPISH);
		hippopotas1.code = "hipp1";
		hippopotas1.setMoveset(Move.EARTHQUAKE, Move.CRUNCH); // TODO: other moves
		// TODO: Sand Stream
		hippopotas1.setAllEVs(132, 20, 212, 0, 100, 20);
		battleList.add(hippopotas1);
		
		Pkmn hoothoot1 = new Pkmn(Species.HOOTHOOT, 5);
		hoothoot1.code = "hoot1";
		hoothoot1.setMoveset(Move.AIR_SLASH, Move.HYPNOSIS); // TODO: roost, reflect
		hoothoot1.setAbility(Ability.INSOMNIA);
//		battleList.add(hoothoot1);
		
		Pkmn horsea1 = new Pkmn(Species.HORSEA, 5, Nature.MODEST); // or Timid
		horsea1.code = "hors1";
		horsea1.setMoveset(Move.HYDRO_PUMP, Move.ICE_BEAM, Move.HIDDEN_POWER_GRASS); // TODO: rain dance/rain!; or Surf for Hydro Pump, HP Electric
		horsea1.setAbility(Ability.SNIPER); // TODO: Swift Swim
		horsea1.setAllEVs(0, 0, 36, 200, 76, 196);
		battleList.add(horsea1);
		
		Pkmn houndour1 = new Pkmn(Species.HOUNDOUR, 5, Nature.LONELY);
		houndour1.code = "houn1";
		houndour1.setMoveset(Move.CRUNCH, Move.FIRE_BLAST, Move.SUCKER_PUNCH, Move.DARK_PULSE);
		houndour1.setAbility(Ability.EARLY_BIRD);
		houndour1.setIVHP(0);
		houndour1.setAllEVs(0, 196, 0, 36, 36, 236);
		battleList.add(houndour1);
		battleList2.add(houndour1);
		
		Pkmn houndour2 = new Pkmn(Species.HOUNDOUR, 5, Nature.LONELY);
		houndour2.code = "houn2";
		houndour2.setMoveset(Move.CRUNCH, Move.FIRE_BLAST, Move.SUCKER_PUNCH, Move.DARK_PULSE);
		houndour2.setAbility(Ability.FLASH_FIRE);
		houndour2.setIVHP(0);
		houndour2.setAllEVs(0, 196, 0, 36, 36, 236);
//		battleList.add(houndour2);
		
		Pkmn joltik1 = new Pkmn(Species.JOLTIK, 5, Nature.MODEST); // or Timid
		joltik1.code = "jolt1";
		joltik1.setMoveset(Move.THUNDERBOLT, Move.BUG_BUZZ, Move.VOLT_SWITCH, Move.ENERGY_BALL);
		joltik1.setAbility(Ability.COMPOUND_EYES); // TODO: Unnerve
		joltik1.setAllEVs(36, 0, 0, 220, 0, 236);
		battleList.add(joltik1);
		
		Pkmn koffing1 = new Pkmn(Species.KOFFING, 5, Nature.BOLD);
		koffing1.code = "koff1";
		koffing1.setMoveset(Move.CLEAR_SMOG, Move.FIRE_BLAST, Move.WILL_O_WISP, Move.SLUDGE_BOMB);
		koffing1.setAbility(Ability.LEVITATE);
		koffing1.setAllEVs(36, 0, 236, 0, 236, 0);
		battleList.add(koffing1);
		
		Pkmn larvesta1 = new Pkmn(Species.LARVESTA, 5, Nature.ADAMANT);
		larvesta1.code = "larve1";
		larvesta1.setMoveset(Move.U_TURN, Move.FLARE_BLITZ, Move.WILD_CHARGE, Move.WILL_O_WISP); // TODO: morning sun
		larvesta1.setAbility(Ability.SWARM); // TODO: Flame Body
		larvesta1.setAllEVs(76, 236, 156, 0, 0, 36);
		battleList.add(larvesta1);
		
		Pkmn larvitar1 = new Pkmn(Species.LARVITAR, 5, Nature.JOLLY);
		larvitar1.code = "larvi1";
		larvitar1.setMoveset(Move.DRAGON_DANCE, Move.EARTHQUAKE, Move.STONE_EDGE, Move.CRUNCH); // TODO: alternatives
		larvitar1.setAbility(Ability.GUTS);
		larvitar1.setAllEVs(36, 244, 36, 0, 0, 188);
		battleList.add(larvitar1);
		
		Pkmn ledyba1 = new Pkmn(Species.LEDYBA, 5, Nature.BOLD);
		ledyba1.code = "ledy1";
		ledyba1.setMoveset(Move.KNOCK_OFF, Move.BUG_BUZZ); // TODO: roost, encore, reflect
		ledyba1.setAbility(Ability.EARLY_BIRD);
		ledyba1.setAllEVs(196, 0, 196, 0, 116, 0);
//		battleList.add(ledyba1);
		
		Pkmn lickitung1 = new Pkmn(Species.LICKITUNG, 5, Nature.CAREFUL);
		lickitung1.code = "lick1";
		lickitung1.setMoveset(Move.DRAGON_TAIL, Move.TOXIC);
		// TODO: Own Tempo, Oblivious, Cloud Nine
		lickitung1.setAllEVs(196, 0, 76, 0, 236, 0);
//		battleList.add(lickitung1);
		
		Pkmn lileep1 = new Pkmn(Species.LILEEP, 5, Nature.BOLD);
		lileep1.code = "lile1";
		lileep1.setMoveset(Move.GIGA_DRAIN, Move.ANCIENTPOWER, Move.TOXIC); // TODO: recover
		lileep1.setAbility(Ability.STORM_DRAIN);
		lileep1.setAllEVs(228, 0, 220, 0, 60, 0);
		battleList.add(lileep1);
		
		Pkmn lillipup1 = new Pkmn(Species.LILLIPUP, 5, Nature.JOLLY);
		lillipup1.code = "lill1";
		lillipup1.setMoveset(Move.RETURN, Move.WILD_CHARGE, Move.FIRE_FANG, Move.CRUNCH);
		lillipup1.setAbility(Ability.VITAL_SPIRIT);
		lillipup1.setAllEVs(0, 200, 0, 0, 0, 236);
		battleList.add(lillipup1);
		
		Pkmn lillipup2 = new Pkmn(Species.LILLIPUP, 5, Nature.JOLLY);
		lillipup2.code = "lill2";
		lillipup2.setMoveset(Move.RETURN, Move.WILD_CHARGE, Move.FIRE_FANG, Move.ICE_FANG);
		lillipup2.setAbility(Ability.VITAL_SPIRIT);
		lillipup2.setAllEVs(0, 200, 0, 0, 0, 236);
//		battleList.add(lillipup2);
		
		Pkmn litwick1 = new Pkmn(Species.LITWICK, 5, Nature.QUIET);
		litwick1.code = "litw1";
		litwick1.setMoveset(Move.FIRE_BLAST, Move.SHADOW_BALL, Move.HIDDEN_POWER_GROUND, Move.ENERGY_BALL); // TODO: trick room
		litwick1.setAbility(Ability.FLASH_FIRE);
		litwick1.setIVSA(30);
		litwick1.setIVSD(30);
		litwick1.setIVS(3); // for trick room
		litwick1.setAllEVs(116, 0, 76, 240, 0, 0);
		battleList.add(litwick1);
		
		Pkmn lotad1 = new Pkmn(Species.LOTAD, 5);
		lotad1.code = "lota1";
		lotad1.setMoveset(Move.SURF, Move.GIGA_DRAIN, Move.ICE_BEAM);
//		battleList.add(lotad1);
		
		Pkmn machop1 = new Pkmn(Species.MACHOP, 5, Nature.JOLLY);
		machop1.code = "mach1";
		machop1.setMoveset(Move.DYNAMICPUNCH, Move.PAYBACK, Move.ICE_PUNCH, Move.ROCK_SLIDE);
		machop1.setAbility(Ability.NO_GUARD);
		machop1.setAllEVs(36, 196, 36, 0, 0, 236);
		battleList.add(machop1);
		
		Pkmn machop2 = new Pkmn(Species.MACHOP, 5, Nature.JOLLY);
		machop2.code = "mach2";
		machop2.setMoveset(Move.DYNAMICPUNCH, Move.PAYBACK, Move.ICE_PUNCH, Move.THUNDERPUNCH);
		machop2.setAbility(Ability.NO_GUARD);
		machop2.setAllEVs(36, 196, 36, 0, 0, 236);
		battleList.add(machop2);
		
		Pkmn magby1 = new Pkmn(Species.MAGBY, 5, Nature.HASTY);
		magby1.code = "magb1";
		magby1.setMoveset(Move.FLARE_BLITZ, Move.MACH_PUNCH, Move.THUNDERPUNCH, Move.OVERHEAT);
		magby1.setAbility(Ability.VITAL_SPIRIT); // TODO: should be Flame Body
		magby1.setIVHP(0); // for Life Orb recoil
		magby1.setAllEVs(0, 236, 0, 0, 0, 252);
		battleList.add(magby1);
		
		Pkmn magby2 = new Pkmn(Species.MAGBY, 5, Nature.TIMID);
		magby2.code = "magb2";
		magby2.setMoveset(Move.FIRE_BLAST, Move.CROSS_CHOP, Move.HIDDEN_POWER_GRASS, Move.THUNDERPUNCH);
		magby2.setAbility(Ability.VITAL_SPIRIT); // TODO: should be Flame Body
		magby2.setIVHP(2); // for Life Orb recoil
		magby2.setAllEVs(0, 0, 0, 200, 0, 252);
		battleList.add(magby2);
		
		Pkmn magby3 = new Pkmn(Species.MAGBY, 5, Nature.NAIVE); // or Mild
		magby3.code = "magb3";
		magby3.setMoveset(Move.FIRE_BLAST, Move.CROSS_CHOP, Move.HIDDEN_POWER_GRASS, Move.FLAME_CHARGE);
		magby3.setAbility(Ability.VITAL_SPIRIT); // TODO: should be Flame Body
		magby3.setIVHP(2); // for Life Orb recoil
		magby3.setAllEVs(0, 160, 60, 196, 0, 92);
//		battleList.add(magby3);
		
		Pkmn magby4 = new Pkmn(Species.MAGBY, 5, Nature.LONELY); // or Hasty
		magby4.code = "magb4";
		magby4.setMoveset(Move.FLARE_BLITZ, Move.BRICK_BREAK, Move.THUNDERPUNCH, Move.HIDDEN_POWER_GRASS); // or Overheat for HP Grass
		magby4.setAbility(Ability.VITAL_SPIRIT); // TODO: should be Flame Body
		magby4.setAllEVs(0, 240, 0, 0, 0, 252);
		
		Pkmn magikarp1 = new Pkmn(Species.MAGIKARP, 5);
		magikarp1.code = "magi1";
		magikarp1.setMoveset(Move.SPLASH, Move.TACKLE, Move.FLAIL, Move.BOUNCE);
//		battleList.add(magikarp1);
		
		Pkmn magikarp2 = new Pkmn(Species.MAGIKARP, 5);
		magikarp2.code = "magi2";
		magikarp2.setMoveset(Move.SPLASH);
		// no add
		
		Pkmn magnemite1 = new Pkmn(Species.MAGNEMITE, 5, Nature.MODEST);
		magnemite1.code = "magn1";
		magnemite1.setMoveset(Move.VOLT_SWITCH, Move.FLASH_CANNON, Move.THUNDERBOLT, Move.HIDDEN_POWER_FIRE); // TODO: magnet rise
		magnemite1.setAbility(Ability.STURDY); // TODO: Magnet Pull (or Analytic)
		magnemite1.setAllEVs(156, 0, 36, 240, 76, 0);
		battleList.add(magnemite1);
		
		Pkmn mankey1 = new Pkmn(Species.MANKEY, 5, Nature.JOLLY); // or Adamant
		mankey1.code = "mank1";
		mankey1.setMoveset(Move.CLOSE_COMBAT, Move.U_TURN, Move.PUNISHMENT, Move.ICE_PUNCH); // TODO: final gambit?
		mankey1.setAbility(Ability.VITAL_SPIRIT); // or Anger Point or Defiant
		mankey1.setAllEVs(116, 196, 0, 0, 0, 196);
		battleList.add(mankey1);
		
		Pkmn mantyke1 = new Pkmn(Species.MANTYKE, 5, Nature.MODEST); // TODO: RestTalk set
		mantyke1.code = "mant1";
		mantyke1.setMoveset(Move.HYDRO_PUMP, Move.ICE_BEAM, Move.AIR_SLASH); // TODO: rain dance
		mantyke1.setAbility(Ability.WATER_ABSORB); // TODO: Swift Swim
//		mantyke1.setIVHP(0); // for life orb (eviolite is alternative and doesn't require low HP IV)
		mantyke1.setAllEVs(0, 0, 36, 196, 36, 196);
		battleList.add(mantyke1);
		
		Pkmn mareep1 = new Pkmn(Species.MAREEP, 5);
		mareep1.code = "mare1";
		mareep1.setMoveset(Move.THUNDERBOLT, Move.THUNDER_WAVE); // TODO: dual screens
//		battleList.add(mareep1);
		
		Pkmn meowth1 = new Pkmn(Species.MEOWTH, 5);
		meowth1.code = "meow1";
		meowth1.setMoveset(Move.FAKE_OUT, Move.U_TURN, Move.COVET, Move.BITE);
//		battleList.add(meowth1);
		
		Pkmn mienfoo1 = new Pkmn(Species.MIENFOO, 5, Nature.ADAMANT); // TODO: other movesets!!
		mienfoo1.code = "mien1";
		mienfoo1.setMoveset(Move.HI_JUMP_KICK, Move.U_TURN, Move.STONE_EDGE, Move.DRAIN_PUNCH);
		mienfoo1.setAbility(Ability.INNER_FOCUS); // TODO: Regenerator (or Reckless)
		mienfoo1.setAllEVs(0, 236, 36, 0, 0, 236);
		battleList.add(mienfoo1);
		
		Pkmn minccino1 = new Pkmn(Species.MINCCINO, 5, Nature.ADAMANT); // or Jolly
		minccino1.code = "minc1";
		minccino1.setMoveset(Move.TAIL_SLAP, Move.AQUA_TAIL, Move.U_TURN, Move.SEED_BOMB); // or Knock Off for Seed Bomb
		minccino1.setAbility(Ability.TECHNICIAN); // TODO: Skill Link
		minccino1.setAllEVs(0, 196, 0, 0, 76, 236);
		battleList.add(minccino1);
		
		Pkmn misdreavus1 = new Pkmn(Species.MISDREAVUS, 5, Nature.TIMID); // TODO: some other sets
		misdreavus1.code = "misd1";
		misdreavus1.setMoveset(Move.SHADOW_BALL, Move.HIDDEN_POWER_FIGHTING, Move.NASTY_PLOT, Move.WILL_O_WISP); // TODO: HP can be thunderbolt instead
		misdreavus1.setAbility(Ability.LEVITATE);
		misdreavus1.setAllEVs(0, 0, 0, 240, 0, 240);
		battleList.add(misdreavus1);
		
		Pkmn mudkip1 = new Pkmn(Species.MUDKIP, 5, Nature.JOLLY); // or Naive
		mudkip1.code = "mudk1";
		mudkip1.setMoveset(Move.WATERFALL, Move.ROCK_SLIDE, Move.DOUBLE_EDGE, Move.ICE_BEAM);
		mudkip1.setAbility(Ability.TORRENT);
		mudkip1.setAllEVs(116, 196, 0, 0, 0, 196);
		battleList.add(mudkip1);
		
		Pkmn munchlax1 = new Pkmn(Species.MUNCHLAX, 5, Nature.ADAMANT);
		munchlax1.code = "munc1";
		munchlax1.setMoveset(Move.RETURN, Move.FIRE_PUNCH, Move.EARTHQUAKE, Move.PURSUIT); // or Focus Punch for Pursuit
		munchlax1.setAbility(Ability.THICK_FAT);
		munchlax1.setAllEVs(0, 236, 36, 0, 236, 0);
		battleList.add(munchlax1);
		
		Pkmn munna1 = new Pkmn(Species.MUNNA, 5);
		munna1.code = "munn1";
		munna1.setMoveset(Move.PSYCHIC, Move.HIDDEN_POWER_FIGHTING, Move.HYPNOSIS); // TODO: trick room, yawn
		// TODO: Synchronize
//		battleList.add(munna1);
		
		Pkmn munna2 = new Pkmn(Species.MUNNA, 5, Nature.BOLD); // TODO: another set
		munna2.code = "munn2";
		munna2.setMoveset(Move.CALM_MIND, Move.PSYCHIC, Move.HIDDEN_POWER_FIGHTING, Move.SHADOW_BALL); // TODO: stored power, moonlight
		// TODO: Synchronize
		munna2.setAllEVs(228, 0, 0, 224, 0, 8);
		battleList.add(munna2);
		
		Pkmn murkrow1 = new Pkmn(Species.MURKROW, 5, Nature.NAIVE);
		murkrow1.code = "murk1";
		murkrow1.setMoveset(Move.BRAVE_BIRD, Move.HEAT_WAVE, Move.SUCKER_PUNCH, Move.HIDDEN_POWER_GRASS);
		murkrow1.setAbility(Ability.INSOMNIA); // or Super Luck
		murkrow1.setAllEVs(0, 240, 0, 80, 0, 188);
		battleList.add(murkrow1);
		
//		Pkmn murkrow2 = new Pkmn(Species.MURKROW, 5);
//		murkrow2.setMoveset(Move.THUNDER_WAVE, m3, m4); // TODO: need confuse ray (need confusion!)
		
		Pkmn natu1 = new Pkmn(Species.NATU, 5, Nature.TIMID);
		natu1.code = "natu1";
		natu1.setMoveset(Move.HIDDEN_POWER_FIGHTING, Move.U_TURN, Move.TOXIC, Move.FEATHERDANCE); // TODO: roost
		natu1.setAbility(Ability.EARLY_BIRD); // TODO: Magic Bounce
		natu1.setAllEVs(200, 0, 80, 0, 0, 196);
		battleList.add(natu1);
		
		Pkmn nidoranM1 = new Pkmn(Species.NIDORAN_M, 5, Nature.NAIVE);
		nidoranM1.code = "nido1"; // change if nidoranF added
		nidoranM1.setMoveset(Move.POISON_JAB, Move.SUCKER_PUNCH, Move.THUNDERBOLT, Move.HIDDEN_POWER_FIRE);
		nidoranM1.setAbility(Ability.HUSTLE);
		nidoranM1.setIVHP(3); // for Life Orb
		nidoranM1.setIVA(30);
		nidoranM1.setIVSA(30);
		nidoranM1.setIVS(30);
		nidoranM1.setAllEVs(0, 224, 36, 40, 0, 200);
		battleList.add(nidoranM1);
		
		Pkmn nosepass1 = new Pkmn(Species.NOSEPASS, 5, Nature.IMPISH);
		nosepass1.code = "nose1";
		nosepass1.setMoveset(Move.STONE_EDGE, Move.FIRE_PUNCH, Move.THUNDER_WAVE, Move.ROCK_SLIDE); // TODO: Pain Split
		nosepass1.setAbility(Ability.STURDY); // TODO: Magnet Pull, (Sand Force)
		nosepass1.setAllEVs(196, 76, 156, 0, 36, 36);
		battleList.add(nosepass1);
		
		Pkmn numel1 = new Pkmn(Species.NUMEL, 5, Nature.MODEST); // TODO: RestTalk set
		numel1.code = "nume1"; // nume1 = numel!
		numel1.setMoveset(Move.FLAME_CHARGE, Move.FIRE_BLAST, Move.EARTH_POWER, Move.HIDDEN_POWER_ELECTRIC);
		numel1.setAbility(Ability.SIMPLE);
		numel1.setAllEVs(0, 0, 0, 240, 0, 236);
		battleList.add(numel1);
		
		Pkmn oddish1 = new Pkmn(Species.ODDISH, 5, Nature.TIMID);
		oddish1.code = "oddi1";
		oddish1.setMoveset(Move.SOLARBEAM, Move.HIDDEN_POWER_FIRE, Move.SLUDGE_BOMB, Move.SLEEP_POWDER); // TODO: Sunny Day!!!
		// TODO: Chlorophyll!!
		oddish1.setIVHP(0); // for Life Orb
		oddish1.setAllEVs(0, 0, 0, 240, 0, 200);
		battleList.add(oddish1);
		
		Pkmn omanyte1 = new Pkmn(Species.OMANYTE, 5, Nature.MODEST);
		omanyte1.code = "oman1";
		omanyte1.setMoveset(Move.HYDRO_PUMP, Move.SHELL_SMASH, Move.EARTH_POWER, Move.HIDDEN_POWER_ELECTRIC);
		omanyte1.setAbility(Ability.SHELL_ARMOR); // TODO: Swift Swim
		omanyte1.setIVA(2); // TODO: check these!!!!!
		omanyte1.setIVSA(30);
		omanyte1.setIVS(30);
		omanyte1.setAllEVs(0, 0, 36, 200, 0, 240);
		battleList.add(omanyte1);
		
		Pkmn onix1 = new Pkmn(Species.ONIX, 5, Nature.IMPISH);
		onix1.code = "onix1";
		onix1.setMoveset(Move.DRAGON_TAIL, Move.STONE_EDGE, Move.EARTHQUAKE);
		onix1.setAbility(Ability.STURDY);
		onix1.setAllEVs(236, 0, 116, 0, 156, 0);
		battleList.add(onix1);
		
		Pkmn oshawott1 = new Pkmn(Species.OSHAWOTT, 5, Nature.ADAMANT);
		oshawott1.code = "osha1";
		oshawott1.setMoveset(Move.SWORDS_DANCE, Move.WATERFALL, Move.AQUA_JET, Move.X_SCISSOR);
		oshawott1.setAbility(Ability.TORRENT);
		oshawott1.setAllEVs(0, 240, 0, 16, 0, 240);
		battleList.add(oshawott1);
		
		Pkmn panpour1 = new Pkmn(Species.PANPOUR, 5, Nature.TIMID);
		panpour1.code = "panp1";
		panpour1.setMoveset(Move.NASTY_PLOT, Move.HYDRO_PUMP, Move.ICE_BEAM, Move.HIDDEN_POWER_GRASS);
		// TODO: Gluttony (Torrent is not yet released/legal)
		panpour1.setAllEVs(36, 0, 52, 176, 0, 244);
		battleList.add(panpour1);
		
		Pkmn pansage1 = new Pkmn(Species.PANSAGE, 5, Nature.TIMID);
		pansage1.code = "pansa1";
		pansage1.setMoveset(Move.LEAF_STORM, Move.ENERGY_BALL, Move.NASTY_PLOT, Move.HIDDEN_POWER_ICE);
		// TODO: Gluttony (Overgrow is not yet released/legal)
		pansage1.setAllEVs(0, 0, 0, 252, 0, 244);
		battleList.add(pansage1);
		
		Pkmn pansear1 = new Pkmn(Species.PANSEAR, 5, Nature.TIMID);
		pansear1.code = "panse1";
		pansear1.setMoveset(Move.NASTY_PLOT, Move.FIRE_BLAST, Move.HIDDEN_POWER_ELECTRIC, Move.SOLARBEAM); // TODO: alternate movesets (Sunny Day!)
		// TODO: Gluttony (Blaze is not yet released/legal)
		pansear1.setAllEVs(0, 0, 0, 244, 0, 252);
		battleList.add(pansear1);
		
//		Pkmn paras1 = new Pkmn(Species.PARAS, 5);
//		paras1.setMoveset(Move.SPORE, Move.X_SCISSOR, Move.BULLET_SEED); // TODO: 4th move = synthesis
//		battleList.add(paras1);
		
		Pkmn paras2 = new Pkmn(Species.PARAS, 5, Nature.JOLLY);
		paras2.code = "para2";
		paras2.setMoveset(Move.AGILITY, Move.SPORE, Move.X_SCISSOR, Move.BULLET_SEED);
		paras2.setAbility(Ability.DRY_SKIN);
		paras2.setAllEVs(76, 196, 0, 0, 0, 236);
		battleList.add(paras2);
		
		Pkmn patrat1 = new Pkmn(Species.PATRAT, 5, Nature.JOLLY);
		patrat1.code = "patr1";
		patrat1.setMoveset(Move.SWORDS_DANCE, Move.HYPNOSIS, Move.RETURN, Move.CRUNCH); // TODO: moveset
		patrat1.setAbility(Ability.KEEN_EYE); // TODO: Analytic
		patrat1.setAllEVs(76, 0, 124, 0, 124, 180);
		battleList.add(patrat1);
		
		Pkmn pawniard1 = new Pkmn(Species.PAWNIARD, 5, Nature.JOLLY);
		pawniard1.code = "pawn1";
		pawniard1.setMoveset(Move.SUCKER_PUNCH, Move.BRICK_BREAK, Move.IRON_HEAD, Move.SWORDS_DANCE);
		pawniard1.setAbility(Ability.INNER_FOCUS); // TODO: Defiant
		pawniard1.setAllEVs(0, 156, 36, 0, 116, 196);
		battleList.add(pawniard1);
		
		Pkmn petilil1 = new Pkmn(Species.PETILIL, 5, Nature.TIMID);
		petilil1.code = "peti1";
		petilil1.setMoveset(Move.GIGA_DRAIN, Move.HIDDEN_POWER_FIRE, Move.SLEEP_POWDER, Move.SOLARBEAM);  // TODO: sunny day set
		// TODO: Chlorophyll
		petilil1.setAllEVs(0, 0, 36, 200, 36, 200);
		battleList.add(petilil1);
		
		Pkmn phanpy1 = new Pkmn(Species.PHANPY, 5, Nature.IMPISH);
		phanpy1.code = "phan1";
		phanpy1.setMoveset(Move.EARTHQUAKE, Move.ICE_SHARD, Move.TOXIC, Move.KNOCK_OFF); // TODO: moveset
		// TODO: Sand Veil
		phanpy1.setAllEVs(196, 0, 196, 0, 116, 0);
		battleList.add(phanpy1);
		
		Pkmn pichu1 = new Pkmn(Species.PICHU, 5, Nature.ADAMANT);
		pichu1.code = "pich1";
		pichu1.setMoveset(Move.VOLT_TACKLE, Move.RETURN, Move.THUNDERPUNCH, Move.IRON_TAIL);
		// TODO: Lightningrod
		pichu1.setAllEVs(116, 196, 0, 0, 0, 196);
		battleList.add(pichu1);
		
		Pkmn pidgey1 = new Pkmn(Species.PIDGEY, 5, Nature.JOLLY); // or Adamant
		pidgey1.code = "pidg1";
		pidgey1.setMoveset(Move.BRAVE_BIRD, Move.U_TURN, Move.FAINT_ATTACK, Move.RETURN);
		pidgey1.setAbility(Ability.KEEN_EYE);
		pidgey1.setAllEVs(36, 236, 0, 0, 0, 228);
		battleList.add(pidgey1);
		
		Pkmn pineco1 = new Pkmn(Species.PINECO, 5);
		pineco1.code = "pine1";
		pineco1.setMoveset(Move.RAPID_SPIN, Move.PAYBACK, Move.BUG_BITE); // TODO: entry hazards
//		battleList.add(pineco1);
		
		Pkmn piplup1 = new Pkmn(Species.PIPLUP, 5, Nature.CALM);
		piplup1.code = "pipl1";
		piplup1.setMoveset(Move.SCALD, Move.ICE_BEAM, Move.TOXIC);
		piplup1.setAbility(Ability.TORRENT);
		piplup1.setAllEVs(0, 0, 192, 88, 0, 228);
		battleList.add(piplup1);
		
		Pkmn poliwag1 = new Pkmn(Species.POLIWAG, 5, Nature.TIMID); // or Modest
		poliwag1.code = "poli1";
		poliwag1.setMoveset(Move.HYDRO_PUMP, Move.ICE_BEAM, Move.HIDDEN_POWER_GRASS, Move.HYPNOSIS); // TODO: alternate moves
		poliwag1.setAbility(Ability.WATER_ABSORB); // TODO: or Swift Swim
		poliwag1.setAllEVs(0, 0, 36, 200, 36, 196);
		battleList.add(poliwag1);
		
		Pkmn poliwag2 = new Pkmn(Species.POLIWAG, 5, Nature.JOLLY);
		poliwag2.code = "poli2";
		poliwag2.setMoveset(Move.BELLY_DRUM, Move.WATERFALL, Move.RETURN, Move.HYPNOSIS);
		poliwag2.setAbility(Ability.WATER_ABSORB); // TODO: or Swift Swim
		poliwag2.setAllEVs(0, 196, 36, 0, 36, 196);
		battleList.add(poliwag2);
		
		Pkmn ponyta1 = new Pkmn(Species.PONYTA, 5, Nature.JOLLY); // TODO: "Eviolite" set (includes Sunny Day, Morning Sun)
		ponyta1.code = "pony1";
		ponyta1.setMoveset(Move.FLARE_BLITZ, Move.WILD_CHARGE, Move.RETURN, Move.FLAME_CHARGE);
		ponyta1.setAbility(Ability.FLASH_FIRE);
		ponyta1.setAllEVs(36, 236, 0, 0, 0, 196);
		battleList.add(ponyta1);
		
		Pkmn poochyena1 = new Pkmn(Species.POOCHYENA, 5);
		poochyena1.code = "pooc1";
		poochyena1.setMoveset(Move.HOWL, Move.FACADE, Move.CRUNCH, Move.FIRE_FANG);
//		battleList.add(poochyena1);
		
		Pkmn porygon1 = new Pkmn(Species.PORYGON, 5, Nature.CALM); // TODO: alternate moveset
		porygon1.code = "pory1";
		porygon1.setMoveset(Move.TRI_ATTACK, Move.SHADOW_BALL, Move.THUNDER_WAVE, Move.ICE_BEAM); // TODO: recover
//		porygon1.setAbility(Ability.DOWNLOAD); // TODO: Trace!! (Download illegal with Tri Attack)
		porygon1.setAllEVs(236, 0, 196, 0, 0, 76);
		battleList.add(porygon1);
		
		Pkmn porygon2 = new Pkmn(Species.PORYGON, 5, Nature.TIMID);
		porygon2.code = "pory2";
		porygon2.setMoveset(Move.TRI_ATTACK, Move.SHADOW_BALL, Move.ICE_BEAM, Move.HIDDEN_POWER_GRASS);
		// TODO: Trace!! (Download illegal with Tri Attack)
		porygon2.setAllEVs(76, 0, 0, 236, 0, 196);
		battleList.add(porygon2);
		
		Pkmn psyduck1 = new Pkmn(Species.PSYDUCK, 5, Nature.MODEST);
		psyduck1.code = "psyd1";
		psyduck1.setMoveset(Move.HYDRO_PUMP, Move.ICE_BEAM, Move.HIDDEN_POWER_FIRE, Move.SIGNAL_BEAM); // TODO: alt: hidden power grass
		// TODO: Cloud Nine
		psyduck1.setAllEVs(0, 0, 0, 240, 0, 240);
		battleList.add(psyduck1);
		
		Pkmn rattata1 = new Pkmn(Species.RATTATA, 5, Nature.JOLLY); // TODO: carry toxic or flame orb?
		rattata1.code = "ratt1";
		rattata1.setMoveset(Move.FACADE, Move.SUCKER_PUNCH, Move.FLAME_WHEEL, Move.WILD_CHARGE); // TODO: alternate moveset (quite different, same stats)
		rattata1.setAbility(Ability.GUTS);
		rattata1.setAllEVs(36, 228, 0, 0, 0, 180);
		battleList.add(rattata1);
		
		Pkmn remoraid1 = new Pkmn(Species.REMORAID, 5, Nature.TIMID);
		remoraid1.code = "remo1";
		remoraid1.setMoveset(Move.WATER_SPOUT, Move.SURF, Move.FIRE_BLAST, Move.HIDDEN_POWER_GRASS);
		remoraid1.setAbility(Ability.SNIPER);
		remoraid1.setAllEVs(0, 0, 0, 236, 0, 236);
		battleList.add(remoraid1);
		
		Pkmn remoraid2 = new Pkmn(Species.REMORAID, 5, Nature.NAIVE);
		remoraid2.code = "remo2";
		remoraid2.setMoveset(Move.WATERFALL, Move.SEED_BOMB, Move.RETURN, Move.FIRE_BLAST); // or Water Spout for Fire Blast(???)
		remoraid2.setAbility(Ability.HUSTLE);
		remoraid2.setAllEVs(0, 236, 0, 0, 0, 236);
		battleList.add(remoraid2);
		
		Pkmn remoraid3 = new Pkmn(Species.REMORAID, 5, Nature.NAUGHTY);
		remoraid3.code = "remo3";
		remoraid3.setMoveset(Move.WATERFALL, Move.WATER_SPOUT, Move.SEED_BOMB, Move.FIRE_BLAST);
		remoraid3.setAbility(Ability.HUSTLE);
		remoraid3.setAllEVs(0, 0, 0, 236, 0, 236);
		battleList.add(remoraid3);
		
		Pkmn rhyhorn1 = new Pkmn(Species.RHYHORN, 5, Nature.ADAMANT); // TODO: alternate moveset
		rhyhorn1.code = "rhyh1";
		rhyhorn1.setMoveset(Move.EARTHQUAKE, Move.ROCK_BLAST, Move.MEGAHORN, Move.AQUA_TAIL); // or Fire Fang for Aqua Tail
		// TODO: Lightingrod, Rock Head, Reckless
		rhyhorn1.setAllEVs(156, 236, 0, 0, 36, 76);
		battleList.add(rhyhorn1);
		
		Pkmn riolu1 = new Pkmn(Species.RIOLU, 5, Nature.IMPISH);
		riolu1.code = "riol1";
		riolu1.setMoveset(Move.DRAIN_PUNCH, Move.CRUNCH, Move.TOXIC); // TODO: COPYCAT!!!!
		riolu1.setAbility(Ability.STEADFAST); // TODO: Prankster!!
		riolu1.setAllEVs(196, 0, 196, 0, 116, 0);
		battleList.add(riolu1);
		
		Pkmn roggenrola1 = new Pkmn(Species.ROGGENROLA, 5, Nature.JOLLY);
		roggenrola1.code = "rogg1";
		roggenrola1.setMoveset(Move.AUTOTOMIZE, Move.STONE_EDGE, Move.EARTHQUAKE); // TODO: alternate movesets
		roggenrola1.setAbility(Ability.STURDY); // TODO: Sand Force
		roggenrola1.setAllEVs(0, 236, 0, 0, 0, 236);
		battleList.add(roggenrola1);
		
		Pkmn rufflet1 = new Pkmn(Species.RUFFLET, 5, Nature.JOLLY); // or Adamant
		rufflet1.code = "ruff1";
		rufflet1.setMoveset(Move.PLUCK, Move.RETURN, Move.U_TURN, Move.SUPERPOWER); // TODO: alternate
		rufflet1.setAbility(Ability.KEEN_EYE); // Sheer Force if Rock Slide used instead of Superpower
		rufflet1.setAllEVs(0, 252, 36, 0, 0, 196);
		battleList.add(rufflet1);
		
		Pkmn sandile1 = new Pkmn(Species.SANDILE, 5, Nature.ADAMANT);
		sandile1.code = "sandi1";
		sandile1.setMoveset(Move.EARTHQUAKE, Move.CRUNCH, Move.FIRE_FANG, Move.STONE_EDGE);
		sandile1.setAbility(Ability.ANGER_POINT); // TODO: Moxie
		sandile1.setAllEVs(0, 180, 76, 0, 0, 236);
		battleList.add(sandile1);
		
		Pkmn sandile2 = new Pkmn(Species.SANDILE, 5, Nature.JOLLY); // or Adamant
		sandile2.code = "sandi2";
		sandile2.setMoveset(Move.EARTHQUAKE, Move.CRUNCH, Move.HONE_CLAWS, Move.STONE_EDGE);
		sandile1.setAbility(Ability.ANGER_POINT); // TODO: Moxie
		sandile1.setAllEVs(0, 180, 76, 0, 0, 236);
		battleList.add(sandile2);
		
		Pkmn sandshrew1 = new Pkmn(Species.SANDSHREW, 5, Nature.ADAMANT); // or Jolly
		sandshrew1.code = "sands1";
		sandshrew1.setMoveset(Move.EARTHQUAKE, Move.ROCK_SLIDE, Move.NIGHT_SLASH, Move.SWORDS_DANCE);
		// TODO: Sand Rush
		sandshrew1.setAllEVs(36, 236, 0, 0, 36, 196);
		battleList.add(sandshrew1);
		
		Pkmn scraggy1 = new Pkmn(Species.SCRAGGY, 5, Nature.JOLLY);
		scraggy1.code = "scra1";
		scraggy1.setMoveset(Move.HI_JUMP_KICK, Move.CRUNCH, Move.ZEN_HEADBUTT, Move.HEAD_SMASH);
		scraggy1.setAbility(Ability.SHED_SKIN); // TODO: Moxie
		scraggy1.setAllEVs(36, 236, 0, 0, 0, 212);
		battleList.add(scraggy1);
		
		Pkmn scraggy2 = new Pkmn(Species.SCRAGGY, 5, Nature.JOLLY);
		scraggy2.code = "scra2";
		scraggy2.setMoveset(Move.HI_JUMP_KICK, Move.CRUNCH, Move.DRAIN_PUNCH, Move.DRAGON_DANCE);
		scraggy2.setAbility(Ability.SHED_SKIN); // TODO: or Moxie (Shed Skin is prefered)
		scraggy2.setAllEVs(0, 236, 0, 0, 36, 212);
		battleList.add(scraggy2);
		
		Pkmn seedot1 = new Pkmn(Species.SEEDOT, 5);
		seedot1.code = "seed1";
		seedot1.setMoveset(Move.GROWTH, Move.SOLARBEAM, Move.HIDDEN_POWER_FIRE); // TODO: sunlight
//		battleList.add(seedot1);
		
		Pkmn seel1 = new Pkmn(Species.SEEL, 5, Nature.ADAMANT); // or Jolly
		seel1.code = "seel1";
		seel1.setMoveset(Move.FAKE_OUT, Move.AQUA_JET, Move.ICE_SHARD, Move.RETURN); // or Waterfall for Return
		seel1.setAbility(Ability.THICK_FAT); // TODO: or Ice Body
		seel1.setAllEVs(0, 236, 0, 0, 36, 236);
		battleList.add(seel1);
		
		Pkmn sentret1 = new Pkmn(Species.SENTRET, 5, Nature.MODEST);
		sentret1.code = "sent1";
		sentret1.setMoveset(Move.HYPER_VOICE, Move.FLAMETHROWER, Move.SHADOW_BALL, Move.SURF); // TODO: trick
		sentret1.setAbility(Ability.KEEN_EYE); // actually Frisk, but no utility in simulator (possibly heuristic...)
		sentret1.setAllEVs(76, 0, 0, 236, 0, 196);
		battleList.add(sentret1);
		
		Pkmn shellder1 = new Pkmn(Species.SHELLDER, 5, Nature.JOLLY); // TODO: another slightly different alternative (no Shell Smash)
		shellder1.code = "shelld1";
		shellder1.setMoveset(Move.ROCK_BLAST, Move.ICICLE_SPEAR, Move.HYDRO_PUMP, Move.SHELL_SMASH); // TODO: skill link set
		shellder1.setAbility(Ability.SHELL_ARMOR); // TODO: Skill Link!!
		shellder1.setAllEVs(36, 156, 36, 0, 76, 196);
		battleList.add(shellder1);
		
		Pkmn shellder2 = new Pkmn(Species.SHELLDER, 5, Nature.NAIVE);
		shellder2.code = "shelld2";
		shellder2.setMoveset(Move.ROCK_BLAST, Move.ICICLE_SPEAR, Move.ICE_SHARD, Move.SHELL_SMASH); // TODO: skill link set
		shellder2.setAbility(Ability.SHELL_ARMOR); // TODO: Skill Link!!
		shellder2.setAllEVs(36, 156, 36, 0, 76, 196);
		battleList.add(shellder2);
		
		Pkmn shellos1 = new Pkmn(Species.SHELLOS, 5, Nature.BOLD);
		shellos1.code = "shello1";
		shellos1.setMoveset(Move.SURF, Move.CLEAR_SMOG, Move.TOXIC); // TODO: recover, yawn
		shellos1.setAbility(Ability.STORM_DRAIN);
		shellos1.setAllEVs(228, 0, 132, 0, 100, 4);
		battleList.add(shellos1);
		
		Pkmn shelmet1 = new Pkmn(Species.SHELMET, 5, Nature.BOLD);
		shelmet1.code = "shelm1";
		shelmet1.setMoveset(Move.BUG_BUZZ, Move.HIDDEN_POWER_FLYING, Move.ACID_ARMOR); // TODO: recover, spikes
		shelmet1.setAbility(Ability.SHELL_ARMOR);
		shelmet1.setAllEVs(116, 0, 156, 0, 0, 236);
		battleList.add(shelmet1);
		
		Pkmn shieldon1 = new Pkmn(Species.SHIELDON, 5);
		shieldon1.code = "shie1";
		shieldon1.setMoveset(Move.FIRE_BLAST, Move.ICE_BEAM, Move.EARTHQUAKE, Move.ROCK_SLIDE); // TODO: more moves (Metal Burst!!)
		shieldon1.setAbility(Ability.STURDY);
		shieldon1.setIVS(0); // to make Metal Burst go last (does not have negative priority)
		shieldon1.setAllEVs(196, 20, 56, 20, 212, 0);
		battleList.add(shieldon1);
		
		Pkmn shinx1 = new Pkmn(Species.SHINX, 5, Nature.JOLLY);
		shinx1.code = "shin1";
		shinx1.setMoveset(Move.FACADE, Move.WILD_CHARGE, Move.ICE_FANG, Move.FIRE_FANG); // or Crunch for Fire Fang (or for Ice Fang)
		shinx1.setAbility(Ability.GUTS); // TODO: hold Toxic/Flame Orb?
		shinx1.setAllEVs(0, 236, 4, 0, 4, 236);
		battleList.add(shinx1);
		
		Pkmn shroomish1 = new Pkmn(Species.SHROOMISH, 5);
		shroomish1.code = "shro1";
		shroomish1.setMoveset(Move.SPORE, Move.GIGA_DRAIN, Move.TOXIC); // TODO: alternate, synthesis
//		battleList.add(shroomish1);
		
		Pkmn skitty1 = new Pkmn(Species.SKITTY, 5, Nature.JOLLY); // or Adamant
		skitty1.code = "skit1";
		skitty1.setMoveset(Move.FAKE_OUT, Move.RETURN, Move.SUCKER_PUNCH, Move.ZEN_HEADBUTT); // TODO: alternate Normalize moveset
		skitty1.setAbility(Ability.WONDER_SKIN); // TODO: Cute Charm
		skitty1.setAllEVs(0, 236, 0, 0, 76, 196);
		battleList.add(skitty1);
		
		Pkmn skorupi1 = new Pkmn(Species.SKORUPI, 5, Nature.JOLLY);
		skorupi1.code = "skor1";
		skorupi1.setMoveset(Move.CROSS_POISON, Move.X_SCISSOR, Move.KNOCK_OFF); // TODO: other moves (Rest, Toxic Spikes, Acupressure, etc)
		skorupi1.setAbility(Ability.SNIPER);
		skorupi1.setAllEVs(36, 196, 36, 0, 0, 236);
		battleList.add(skorupi1);
		
		Pkmn slowpoke1 = new Pkmn(Species.SLOWPOKE, 5, Nature.BOLD); // TODO: Trick Room moveset
		slowpoke1.code = "slow1";
		slowpoke1.setMoveset(Move.SURF, Move.PSYCHIC, Move.TOXIC, Move.FIRE_BLAST); // TODO: slack off; possibly Scald for Fire Blast
		// TODO: Regenerator
		slowpoke1.setAllEVs(196, 0, 156, 36, 116, 0);
		battleList.add(slowpoke1);
		
		Pkmn slugma1 = new Pkmn(Species.SLUGMA, 5, Nature.CALM); // TODO: alternate moveset
		slugma1.code = "slug1";
		slugma1.setMoveset(Move.STOCKPILE, Move.WILL_O_WISP, Move.FLAMETHROWER, Move.HIDDEN_POWER_GRASS); // or Lava Plume for Will-O-Wisp/Flamethrower
		slugma1.setAbility(Ability.MAGMA_ARMOR); // TODO: Flame Body
		slugma1.setAllEVs(196, 0, 116, 0, 196, 0);
		battleList.add(slugma1);
		
		Pkmn smoochum1 = new Pkmn(Species.SMOOCHUM, 5, Nature.MODEST);
		smoochum1.code = "smoo1";
		smoochum1.setMoveset(Move.ICE_BEAM, Move.HIDDEN_POWER_FIRE, Move.PSYSHOCK, Move.SHADOW_BALL); // TODO: Trick
		// TODO: Oblivious, Hydration (should be Forewarn)
		smoochum1.setAllEVs(156, 0, 0, 236, 0, 76);
		battleList.add(smoochum1);
		
		Pkmn snivy1 = new Pkmn(Species.SNIVY, 5);
		snivy1.code = "sniv1";
		snivy1.setMoveset(Move.LEAF_STORM, Move.GIGA_DRAIN); // TODO: dual screens
//		battleList.add(snivy1);
		
		Pkmn snorunt1 = new Pkmn(Species.SNORUNT, 5, Nature.NAIVE);
		snorunt1.code = "snor1";
		snorunt1.setMoveset(Move.ICE_BEAM, Move.HIDDEN_POWER_GROUND, Move.ICE_SHARD, Move.CRUNCH); // TODO: spikes, alternate (Disable)
		snorunt1.setAbility(Ability.INNER_FOCUS); // TODO: or Ice Body (if with Hail support)
		snorunt1.setAllEVs(36, 36, 36, 196, 0, 196);
		battleList.add(snorunt1);
		
		Pkmn snover1 = new Pkmn(Species.SNOVER, 5, Nature.NAIVE); // TODO: Choice Scarf
		snover1.code = "snov1";
		snover1.setMoveset(Move.BLIZZARD, Move.GIGA_DRAIN, Move.ICE_SHARD, Move.HIDDEN_POWER_FIRE); // or HP Rock
		// TODO: Snow Warning!!!
		snover1.setAllEVs(0, 104, 0, 184, 0, 200);
		battleList.add(snover1);
		
		Pkmn snover2 = new Pkmn(Species.SNOVER, 5, Nature.NAIVE); // TODO: Eviolite
		snover2.code = "snov2";
		snover2.setMoveset(Move.BLIZZARD, Move.GIGA_DRAIN, Move.ICE_SHARD, Move.HIDDEN_POWER_FIRE); // or HP Rock
		// TODO: Snow Warning!!!
		snover2.setAllEVs(36, 104, 36, 184, 116, 0);
		battleList.add(snover2);
		
		Pkmn snubbull1 = new Pkmn(Species.SNUBBULL, 5, Nature.ADAMANT);
		snubbull1.code = "snub1";
		snubbull1.setMoveset(Move.THUNDER_WAVE, Move.RETURN, Move.CRUNCH, Move.CLOSE_COMBAT); // TODO: alternates
		snubbull1.setAbility(Ability.INTIMIDATE);
		snubbull1.setAllEVs(36, 196, 36, 0, 116, 116);
		battleList.add(snubbull1);
		
		Pkmn solosis1 = new Pkmn(Species.SOLOSIS, 5, Nature.QUIET);
		solosis1.code = "solo1";
		solosis1.setMoveset(Move.PSYCHIC, Move.HIDDEN_POWER_FIGHTING, Move.THUNDER, Move.SHADOW_BALL); // TODO: trick room
		// TODO: Magic Guard
		solosis1.setIVD(30);
		solosis1.setIVSA(30);
		solosis1.setIVSD(30);
		solosis1.setIVS(2); // for Trick Room
		solosis1.setAllEVs(236, 0, 0, 240, 0, 0);
		battleList.add(solosis1);
		
		Pkmn spearow1 = new Pkmn(Species.SPEAROW, 5, Nature.ADAMANT); // or Jolly (Adamant prefered)
		spearow1.code = "spea1";
		spearow1.setMoveset(Move.DRILL_PECK, Move.RETURN, Move.PURSUIT, Move.QUICK_ATTACK); // TODO: u-turn
		spearow1.setAbility(Ability.SNIPER);
		spearow1.setAllEVs(36, 200, 36, 0, 36, 196);
		battleList.add(spearow1);
		
		Pkmn spheal1 = new Pkmn(Species.SPHEAL, 5, Nature.BOLD); // or Calm
		spheal1.code = "sphe1";
		spheal1.setMoveset(Move.BLIZZARD, Move.SURF, Move.TOXIC); // TODO: other defensive moves
		spheal1.setAbility(Ability.THICK_FAT); // TODO: Ice Body
		spheal1.setAllEVs(36, 0, 196, 76, 196, 0); // TODO: Hail support
		battleList.add(spheal1);
		
		Pkmn spinarak1 = new Pkmn(Species.SPINARAK, 5, Nature.ADAMANT);
		spinarak1.code = "spin1";
		spinarak1.setMoveset(Move.AGILITY, Move.NIGHT_SLASH, Move.BUG_BITE, Move.POISON_JAB);
		spinarak1.setAbility(Ability.SWARM);
		spinarak1.setIVHP(0); // for Life Orb
		spinarak1.setAllEVs(0, 196, 36, 0, 36, 196);
		battleList.add(spinarak1);
		
		Pkmn spinarak2 = new Pkmn(Species.SPINARAK, 5, Nature.ADAMANT);
		spinarak2.code = "spin2";
		spinarak2.setMoveset(Move.AGILITY, Move.NIGHT_SLASH, Move.BUG_BITE, Move.CROSS_POISON);
		spinarak2.setAbility(Ability.SNIPER);
		spinarak2.setIVHP(0); // for Life Orb
		spinarak2.setAllEVs(0, 196, 36, 0, 36, 196);
		battleList.add(spinarak2);
		
		Pkmn spoink1 = new Pkmn(Species.SPOINK, 5, Nature.TIMID);
		spoink1.code = "spoi1";
		spoink1.setMoveset(Move.CALM_MIND, Move.PSYCHIC, Move.SHADOW_BALL, Move.HIDDEN_POWER_FIGHTING);
		spoink1.setAbility(Ability.THICK_FAT);
		spoink1.setAllEVs(36, 0, 0, 200, 40, 200);
		battleList.add(spoink1);
		
		Pkmn squirtle1 = new Pkmn(Species.SQUIRTLE, 5, Nature.TIMID);
		squirtle1.code = "squi1";
		squirtle1.setMoveset(Move.WATER_SPOUT, Move.HYDRO_PUMP, Move.ICE_BEAM, Move.HIDDEN_POWER_GRASS); // or HP Fire (Grass prefered)
		squirtle1.setAbility(Ability.TORRENT);
		squirtle1.setAllEVs(4, 0, 0, 200, 4, 252);
		battleList.add(squirtle1);
		
		Pkmn squirtle2 = new Pkmn(Species.SQUIRTLE, 5, Nature.ADAMANT);
		squirtle2.code = "squi2";
		squirtle2.setMoveset(Move.FAKE_OUT, Move.AQUA_JET, Move.WATERFALL, Move.BRICK_BREAK); // or Ice Punch for Brick Break (not as much coverage)
		squirtle2.setAbility(Ability.TORRENT);
		squirtle2.setIVHP(0); // for Life Orb
		squirtle2.setAllEVs(0, 212, 0, 0, 4, 252);
		battleList.add(squirtle2);
		
		Pkmn starly1 = new Pkmn(Species.STARLY, 5, Nature.ADAMANT);
		starly1.code = "starl1";
		starly1.setMoveset(Move.BRAVE_BIRD, Move.RETURN, Move.U_TURN, Move.PURSUIT); // TODO: final gambit?
		starly1.setAbility(Ability.KEEN_EYE);
		starly1.setAllEVs(36, 236, 36, 0, 0, 196);
		battleList.add(starly1);
		
		Pkmn staryu1 = new Pkmn(Species.STARYU, 5, Nature.TIMID);
		staryu1.code = "stary1";
		staryu1.setMoveset(Move.HYDRO_PUMP, Move.HIDDEN_POWER_FIRE, Move.ICE_BEAM, Move.THUNDERBOLT); // TODO: recover
		// TODO: Natural Cure (or Analytic)
		staryu1.setAllEVs(0, 0, 0, 200, 0, 240);
		battleList.add(staryu1);
		
		Pkmn stunky1 = new Pkmn(Species.STUNKY, 5, Nature.HASTY); // TODO: alternate
		stunky1.code = "stun1";
		stunky1.setMoveset(Move.PURSUIT, Move.CRUNCH, Move.FIRE_BLAST, Move.HIDDEN_POWER_GROUND);
		stunky1.setAbility(Ability.KEEN_EYE); // TODO: Aftermath
		stunky1.setAllEVs(12, 252, 0, 0, 0, 244);
		battleList.add(stunky1);
		
		Pkmn sunkern1 = new Pkmn(Species.SUNKERN, 5);
		sunkern1.code = "sunk1";
		sunkern1.setMoveset(Move.SEED_BOMB, Move.RETURN, Move.HIDDEN_POWER_FIRE, Move.SWORDS_DANCE); // TODO: HP Ice?
//		battleList.add(sunkern1);
		
		Pkmn surskit1 = new Pkmn(Species.SURSKIT, 5, Nature.MODEST); // or Timid
		surskit1.code = "surs1";
		surskit1.setMoveset(Move.HYDRO_PUMP, Move.SIGNAL_BEAM, Move.GIGA_DRAIN, Move.HIDDEN_POWER_FIGHTING); // or HP Fire
		// TODO: Swift Swim (and Rain!!)
		surskit1.setIVHP(19); // for Life Orb
		surskit1.setIVA(30); // TODO: check these IVs (website lists these for HP Fire and Fighting)
		surskit1.setIVSA(30);
		surskit1.setIVS(30);
		surskit1.setAllEVs(0, 0, 20, 200, 20, 236);
		battleList.add(surskit1);
		
		Pkmn swablu1 = new Pkmn(Species.SWABLU, 5, Nature.CAREFUL);
		swablu1.code = "swab1";
		swablu1.setMoveset(Move.TOXIC, Move.PLUCK, Move.HYPER_VOICE, Move.COTTON_GUARD); // TODO: roost
		// TODO: Cloud Nine
		swablu1.setAllEVs(236, 0, 36, 0, 236, 0);
		battleList.add(swablu1);
		
		Pkmn swinub1 = new Pkmn(Species.SWINUB, 5, Nature.JOLLY);
		swinub1.code = "swin1";
		swinub1.setMoveset(Move.EARTHQUAKE, Move.SUPERPOWER, Move.ICICLE_SPEAR, Move.ICE_SHARD); // TODO: stealth rock
		swinub1.setAbility(Ability.THICK_FAT); // TODO: Snow Cloak (and Hail)
		swinub1.setAllEVs(116, 196, 0, 0, 0, 196);
		battleList.add(swinub1);
		
		Pkmn taillow1 = new Pkmn(Species.TAILLOW, 5, Nature.JOLLY); // TODO: alternative moveset
		taillow1.code = "tail1";
		taillow1.setMoveset(Move.FACADE, Move.BRAVE_BIRD, Move.QUICK_ATTACK, Move.U_TURN);
		taillow1.setAbility(Ability.GUTS); // TODO: hold Toxic Orb
		taillow1.setAllEVs(36, 236, 0, 0, 0, 236);
		battleList.add(taillow1);
		
		Pkmn teddiursa1 = new Pkmn(Species.TEDDIURSA, 5, Nature.JOLLY);
		teddiursa1.code = "tedd1";
		teddiursa1.setMoveset(Move.SWORDS_DANCE, Move.FACADE, Move.CLOSE_COMBAT, Move.CRUNCH);
		teddiursa1.setAbility(Ability.QUICK_FEET); // TODO: hold Toxic Orb
		teddiursa1.setAllEVs(0, 196, 0, 0, 116, 196);
		battleList.add(teddiursa1);
		
		Pkmn tentacool1 = new Pkmn(Species.TENTACOOL, 5, Nature.CALM);
		tentacool1.code = "tent1";
		tentacool1.setMoveset(Move.RAPID_SPIN, Move.KNOCK_OFF, Move.SCALD, Move.GIGA_DRAIN); // Toxic Spikes
		tentacool1.setAbility(Ability.CLEAR_BODY); // TODO: Liquid Ooze
		tentacool1.setAllEVs(196, 0, 76, 0, 196, 36);
		battleList.add(tentacool1);
		
		Pkmn timburr1 = new Pkmn(Species.TIMBURR, 5, Nature.CAREFUL);
		timburr1.code = "timb1";
		timburr1.setMoveset(Move.DRAIN_PUNCH, Move.MACH_PUNCH, Move.PAYBACK, Move.BULK_UP);
		timburr1.setAbility(Ability.GUTS);
		timburr1.setAllEVs(76, 196, 0, 0, 236, 0);
		battleList.add(timburr1);
		
		Pkmn tirtouga1 = new Pkmn(Species.TIRTOUGA, 5, Nature.ADAMANT);
		tirtouga1.code = "tirt1";
		tirtouga1.setMoveset(Move.AQUA_TAIL, Move.STONE_EDGE, Move.AQUA_JET, Move.SHELL_SMASH); // TODO: setup variant, minor other variant
		tirtouga1.setAbility(Ability.STURDY);
		tirtouga1.setAllEVs(84, 212, 12, 0, 0, 180);
		battleList.add(tirtouga1);
		
		Pkmn togepi1 = new Pkmn(Species.TOGEPI, 5);
		togepi1.code = "toge1";
		togepi1.setMoveset(Move.TOXIC, Move.FIRE_BLAST); // TODO: wish, protect
//		battleList.add(togepi1);
		
//		Pkmn togepi2 = new Pkmn(Species.TOGEPI, 5);
//		togepi2.setMoveset(Move.HEADBUTT); // TODO: more moves
//		battleList.add(togepi2);
		
		Pkmn torchic1 = new Pkmn(Species.TORCHIC, 5, Nature.TIMID);
		torchic1.code = "torc1";
		torchic1.setMoveset(Move.FIRE_BLAST, Move.HIDDEN_POWER_GRASS, Move.AGILITY); // TODO: Baton Pass, Substitute
		torchic1.setAbility(Ability.BLAZE); // Speed Boost illegal :(
		torchic1.setIVHP(3); // for Life Orb
		torchic1.setIVA(30);
		torchic1.setIVSA(30);
		torchic1.setAllEVs(0, 0, 36, 200, 36, 236);
		battleList.add(torchic1);
		
		Pkmn totodile1 = new Pkmn(Species.TOTODILE, 5, Nature.ADAMANT);
		totodile1.code = "toto1";
		totodile1.setMoveset(Move.ICE_PUNCH, Move.CRUNCH, Move.WATERFALL, Move.DRAGON_DANCE);
		totodile1.setAbility(Ability.TORRENT);
		totodile1.setAllEVs(0, 236, 4, 0, 0, 252);
		battleList.add(totodile1);
		
		Pkmn totodile2 = new Pkmn(Species.TOTODILE, 5, Nature.ADAMANT);
		totodile2.code = "toto2";
		totodile2.setMoveset(Move.ICE_PUNCH, Move.CRUNCH, Move.AQUA_JET, Move.SWORDS_DANCE);
		totodile2.setAbility(Ability.TORRENT);
		totodile2.setAllEVs(0, 236, 4, 0, 0, 252);
		battleList.add(totodile2);
		
		Pkmn trapinch1 = new Pkmn(Species.TRAPINCH, 5, Nature.BRAVE); // TODO: Trick Room!
		trapinch1.code = "trap1";
		trapinch1.setMoveset(Move.EARTHQUAKE, Move.ROCK_SLIDE, Move.CRUNCH, Move.HIDDEN_POWER_FIRE);
		trapinch1.setAbility(Ability.HYPER_CUTTER); // TODO: Arena Trap (or Sheer Force)
		trapinch1.setIVHP(3); // for Life Orb
		trapinch1.setIVS(2); // for Trick Room
		trapinch1.setAllEVs(0, 200, 0, 240, 0, 0);
		battleList.add(trapinch1);
		
		Pkmn treecko1 = new Pkmn(Species.TREECKO, 5, Nature.HASTY); // or Naive
		treecko1.code = "tree1";
		treecko1.setMoveset(Move.LEAF_STORM, Move.HIDDEN_POWER_FIRE, Move.GIGA_DRAIN, Move.QUICK_ATTACK);
		treecko1.setAbility(Ability.OVERGROW);
		treecko1.setAllEVs(36, 0, 0, 240, 0, 200);
		battleList.add(treecko1);
		
		Pkmn treecko2 = new Pkmn(Species.TREECKO, 5, Nature.JOLLY); // or Naive if HP Ice used
		treecko2.code = "tree2";
		treecko2.setMoveset(Move.SWORDS_DANCE, Move.BULLET_SEED, Move.DRAIN_PUNCH, Move.ROCK_SLIDE); // or HP Ice for Rock Slide
		treecko2.setAbility(Ability.OVERGROW);
		treecko2.setIVHP(3); // for Life Orb
		treecko2.setAllEVs(0, 236, 0, 0, 0, 200);
		battleList.add(treecko2);
		
		Pkmn trubbish1 = new Pkmn(Species.TRUBBISH, 5);
		trubbish1.code = "trub1";
		trubbish1.setMoveset(Move.CLEAR_SMOG, Move.PAYBACK); // TODO: hazards
//		battleList.add(trubbish1);
		
		Pkmn turtwig1 = new Pkmn(Species.TURTWIG, 5);
		turtwig1.code = "turt1";
		turtwig1.setMoveset(Move.SEED_BOMB, Move.HIDDEN_POWER_FIRE);
//		battleList.add(turtwig1);
		
		Pkmn tympole1 = new Pkmn(Species.TYMPOLE, 5);
		tympole1.code = "tymp1";
		tympole1.setMoveset(Move.HYDRO_PUMP, Move.SLUDGE_WAVE, Move.EARTH_POWER, Move.HIDDEN_POWER_ELECTRIC); // TODO: rain for swift swim
		battleList.add(tympole1);
		
		Pkmn tynamo1 = new Pkmn(Species.TYNAMO, 5);
		tynamo1.code = "tyna1";
		tynamo1.setMoveset(Move.CHARGE_BEAM, Move.SPARK, Move.TACKLE, Move.THUNDER_WAVE);
//		battleList.add(tynamo1);
		
		Pkmn tyrogue1 = new Pkmn(Species.TYROGUE, 5);
		tyrogue1.code = "tyro1";
		tyrogue1.setMoveset(Move.HI_JUMP_KICK, Move.FAKE_OUT, Move.MACH_PUNCH, Move.BULLET_PUNCH);
//		battleList.add(tyrogue1);
		
		Pkmn vanillite1 = new Pkmn(Species.VANILLITE, 5, Nature.MODEST);
		vanillite1.code = "vani1";
		vanillite1.setMoveset(Move.ICE_BEAM, Move.FLASH_CANNON, Move.WATER_PULSE, Move.HIDDEN_POWER_GRASS); // TODO: alt HP: fighting; blizzard in hail
		// TODO: Ice Body (with Hail)
		vanillite1.setAllEVs(72, 0, 36, 160, 120, 88);
		battleList.add(vanillite1);
		
		Pkmn vanillite2 = new Pkmn(Species.VANILLITE, 5, Nature.MODEST);
		vanillite2.code = "vani2";
		vanillite2.setMoveset(Move.ICE_BEAM, Move.AUTOTOMIZE, Move.HIDDEN_POWER_GRASS, Move.BLIZZARD); // TODO: alt HP: fighting; substitute/taunt; blizzard in hail
		vanillite2.setAbility(Ability.WEAK_ARMOR);
		vanillite2.setIVHP(27); // for Life Orb
		vanillite2.setIVA(30); // for HP Grass (different for HP Fighting)
		vanillite2.setIVSA(30);
		vanillite2.setAllEVs(0, 0, 0, 240, 0, 248);
		battleList.add(vanillite2);
		
		Pkmn voltorb1 = new Pkmn(Species.VOLTORB, 5, Nature.HASTY); // or Timid
		voltorb1.code = "volt1";
		voltorb1.setMoveset(Move.THUNDERBOLT, Move.HIDDEN_POWER_ICE, Move.SIGNAL_BEAM, Move.CHARGE_BEAM); // TODO: substitute, taunt
		// TODO: Static, Soundproof, Aftermath
		voltorb1.setAllEVs(36, 36, 0, 236, 0, 200);
		battleList.add(voltorb1);
		
		Pkmn vullaby1 = new Pkmn(Species.VULLABY, 5, Nature.BOLD);
		vullaby1.code = "vull1";
		vullaby1.setMoveset(Move.AIR_SLASH, Move.DARK_PULSE, Move.HEAT_WAVE, Move.TOXIC); // TODO: roost, some other moves (taunt)
		vullaby1.setAbility(Ability.BIG_PECKS); // TODO: Overcoat
		vullaby1.setAllEVs(116, 0, 76, 76, 236, 0);
		battleList.add(vullaby1);
		
		Pkmn vullaby2 = new Pkmn(Species.VULLABY, 5, Nature.TIMID);
		vullaby2.code = "vull2";
		vullaby2.setMoveset(Move.AIR_SLASH, Move.DARK_PULSE, Move.HEAT_WAVE, Move.NASTY_PLOT); // TODO: roost
		vullaby2.setAbility(Ability.WEAK_ARMOR);
		vullaby2.setAllEVs(0, 0, 0, 236, 76, 196);
		battleList.add(vullaby2);
		
		Pkmn wailmer1 = new Pkmn(Species.WAILMER, 5, Nature.TIMID);
		wailmer1.code = "wail1";
		wailmer1.setMoveset(Move.WATER_SPOUT, Move.HYDRO_PUMP, Move.ICE_BEAM, Move.HIDDEN_POWER_GRASS); // TODO: alt HP (electric); resttalk moveset
		wailmer1.setAbility(Ability.WATER_VEIL);
		wailmer1.setAllEVs(36, 0, 76, 200, 0, 196);
		battleList.add(wailmer1);
		
		Pkmn weedle1 = new Pkmn(Species.WEEDLE, 5);
		weedle1.code = "weed1";
		weedle1.setMoveset(Move.BUG_BITE, Move.POISON_STING, Move.STRING_SHOT);
//		battleList.add(weedle1);
		
		Pkmn whismur1 = new Pkmn(Species.WHISMUR, 5, Nature.QUIET);
		whismur1.code = "whis1";
		whismur1.setMoveset(Move.HYPER_VOICE, Move.FIRE_BLAST, Move.SHADOW_BALL, Move.ICE_BEAM); // TODO: trick room!!
		whismur1.setAbility(Ability.RATTLED); // TODO: Soundproof
		whismur1.setIVS(0); // for Trick Room
		whismur1.setAllEVs(244, 0, 12, 188, 12, 0);
		battleList.add(whismur1);
		
		Pkmn wingull1 = new Pkmn(Species.WINGULL, 5, Nature.NAIVE); // Timid for Rain Dance set
		wingull1.code = "wing1";
		wingull1.setMoveset(Move.SCALD, Move.ICE_BEAM, Move.AIR_SLASH, Move.U_TURN); // TODO: rain dance(!!) for U-turn (then Hurricane for Air Slash)
		wingull1.setAbility(Ability.KEEN_EYE); // TODO: Rain Dish
		wingull1.setAllEVs(36, 0, 0, 236, 0, 236);
		battleList.add(wingull1);
		
		Pkmn woobat1 = new Pkmn(Species.WOOBAT, 5, Nature.TIMID);
		woobat1.code = "woob1";
		woobat1.setMoveset(Move.CALM_MIND, Move.PSYCHIC, Move.AIR_SLASH, Move.HEAT_WAVE); // TODO: roost (for Air Slash)
		woobat1.setAbility(Ability.SIMPLE);
		woobat1.setAllEVs(76, 0, 0, 236, 12, 180);
		battleList.add(woobat1);
		
		Pkmn wooper1 = new Pkmn(Species.WOOPER, 5, Nature.IMPISH);
		wooper1.code = "woop1";
		wooper1.setMoveset(Move.EARTHQUAKE, Move.WATERFALL, Move.ICE_PUNCH, Move.TOXIC); // TODO: encore, recover
		wooper1.setAbility(Ability.WATER_ABSORB); // TODO: or Unaware
		wooper1.setAllEVs(236, 76, 156, 0, 0, 0);
		battleList.add(wooper1);
		
		Pkmn wurmple1 = new Pkmn(Species.WURMPLE, 5);
		wurmple1.code = "wurm1";
		wurmple1.setMoveset(Move.BUG_BITE, Move.POISON_STING, Move.STRING_SHOT, Move.TACKLE);
//		battleList.add(wurmple1);
		
		Pkmn wynaut1 = new Pkmn(Species.WYNAUT, 5);
		wynaut1.code = "wyna1";
		wynaut1.setMoveset(Move.TICKLE); // TODO: defensive moves
//		battleList.add(wynaut1);
		
		Pkmn yamask1 = new Pkmn(Species.YAMASK, 5, Nature.QUIET);
		yamask1.code = "yama1";
		yamask1.setMoveset(Move.SHADOW_BALL, Move.HIDDEN_POWER_FIGHTING, Move.NASTY_PLOT); // TODO: trick room!!
		// TODO: Mummy
		yamask1.setIVS(2); // for Trick Room
		yamask1.setAllEVs(216, 0, 0, 160, 80, 0);
		battleList.add(yamask1);
		
		Pkmn yamask2 = new Pkmn(Species.YAMASK, 5, Nature.BOLD);
		yamask2.code = "yama2";
		yamask2.setMoveset(Move.CALM_MIND, Move.HEX, Move.HIDDEN_POWER_FIGHTING, Move.WILL_O_WISP); // TODO: get Hex working!!
		// TODO: Mummy
		yamask2.setAllEVs(212, 0, 80, 0, 160, 40);
		battleList.add(yamask2);
		
		Pkmn zigzagoon1 = new Pkmn(Species.ZIGZAGOON, 5, Nature.ADAMANT);
		zigzagoon1.code = "zigz1";
		zigzagoon1.setMoveset(Move.BELLY_DRUM, Move.EXTREMESPEED, Move.SEED_BOMB, Move.HIDDEN_POWER_DARK); // TODO: protect (HP Dark not actually good move)
		// TODO: Pickup (Quick Feet illegal with ExtremeSpeed!!!)
		zigzagoon1.setAllEVs(0, 196, 188, 0, 108, 0);
		battleList.add(zigzagoon1);
		
		Pkmn zorua1 = new Pkmn(Species.ZORUA, 5, Nature.NAIVE); // TODO: Choice Scarf set
		zorua1.code = "zoru1";
		zorua1.setMoveset(Move.DARK_PULSE, Move.SUCKER_PUNCH, Move.HIDDEN_POWER_FIGHTING, Move.EXTRASENSORY);
		// TODO: Illusion
		zorua1.setIVHP(2); // for Life Orb
		zorua1.setAllEVs(0, 200, 40, 0, 0, 240);
		battleList.add(zorua1);
		
		Pkmn zorua2 = new Pkmn(Species.ZORUA, 5, Nature.TIMID); // or Naive, if using Sucker Punch (for Extrasensory)
		zorua2.code = "zoru2";
		zorua2.setMoveset(Move.NIGHT_DAZE, Move.NASTY_PLOT, Move.HIDDEN_POWER_FIGHTING, Move.EXTRASENSORY); // or Dark Pulse for Night Daze (latter is signature so ruins illusion)
		// TODO: Illusion
		zorua2.setIVHP(2); // for Life Orb
		zorua2.setAllEVs(0, 0, 40, 200, 0, 240);
		battleList.add(zorua2);
		
		Pkmn zubat1 = new Pkmn(Species.ZUBAT, 5, Nature.NAIVE); // or Hasty (or Jolly/Adamant if Heat Wave not used)
		zubat1.code = "zuba1";
		zubat1.setMoveset(Move.BRAVE_BIRD, Move.BITE, Move.HEAT_WAVE, Move.STEEL_WING); // TODO: alternate moveset (Super Fang, Taunt, etc)
		zubat1.setAbility(Ability.INNER_FOCUS); // TODO: or Infiltrator
		zubat1.setAllEVs(36, 236, 0, 0, 0, 236);
		battleList.add(zubat1);
		
//		Pkmn mudkip2 = new Pkmn(Species.MUDKIP, 55);
//		mudkip2.setMoveset(Move.WATERFALL);
//		
//		Pkmn mudkip3 = new Pkmn(Species.MUDKIP, 50);
//		mudkip3.setMoveset(Move.WATERFALL);
		
		
		
//		GenVSim sim = new GenVSim(bronzor2, teddiursa1, 10000);
//		
//		sim.oneBattle(true);
		
//		sim.allBattles();
//		sim.runBattles(10000);
		
		
//		
		Collections.sort(battleList, new Comparator<Pkmn>() {

			@Override
			public int compare(Pkmn arg0, Pkmn arg1) {
				return arg0.getName().compareTo(arg1.getName());
			}
			
		});
		
		String sumList = "";
		
		for (Pkmn p : battleList) {
			sumList = sumList + p.code + ",";
		}
		System.out.println(sumList);

		long startTime = System.currentTimeMillis();
		System.out.println("Current time: " + startTime);
		
		List<List<Double>> payoffMatrix = generatePayoffMatrix(battleList);
		
				
		String outputString = matrixToString(payoffMatrix, battleList);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (endTime - startTime));
		
//		System.out.println(outputString);
		
		outputString = sumList + ";\n" + outputString;
		
		
		Charset charset = Charset.forName("US-ASCII");
		Path path = FileSystems.getDefault().getPath("results", "results(" + endTime + ").txt");
		
		
		try {
			BufferedWriter writer = Files.newBufferedWriter(path, charset);
		    writer.write(outputString, 0, outputString.length());
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
		
	}
	
	private static String matrixToString(List<List<Double>> payoffMatrix, List<Pkmn> pkmnList) {
		int size = payoffMatrix.size();
//		String acc = "[";
		String acc = "";
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
//				acc = acc + " - " + payoffMatrix.get(i).get(j).toString() + pkmnList.get(j).code;
				acc = acc + Integer.toString(payoffMatrix.get(i).get(j).intValue());
				if (j != size - 1) {
					acc = acc + ",";
				}
			}
			if (i != size - 1) {
				acc = acc + ";\n";
			}
		}
		
//		acc = acc + "]";
		return acc;
	}

	/*
	 * Generates the payoff matrix of the pokemon in the list and returns as a LinkedList<LinkedList<double>>
	 * Number of battles is set in the method itself
	 * Mirror matches return 0.5 (no simulation)
	 */
	private static List<List<Double>> generatePayoffMatrix(List<Pkmn> list) {
		List<List<Double>> accMatrix = new ArrayList<List<Double>>();
		
		int i;
		int j;
		int size = list.size();
		int count = 10000; // number of battles per matchup
		GenVSim sim;
		
		for (i = 0; i < size; i++) {
			List<Double> row = new ArrayList<Double>();
			
			for (j = 0; j < size; j++) {
				double result;
				
				if (j < i) {
					result = count - accMatrix.get(j).get(i);
				} else	if (i == j) {
					result = count/2;
				} else {
					sim = new GenVSim(list.get(i), list.get(j), 10000); // coefficients = ratio of loss/win for row player against column player
					result = sim.runBattles(count);
				}
				
				row.add(j, result);
			}
			
			accMatrix.add(i, row);
		}
		
//		for (i = 0; i < size; i++) {
//			List<Double> row2 = accMatrix.get(i);
//			
//			for (j = 0; j < size; j++) {
//				double element = row2.get(j);
//				element = element/count;
//				row2.set(j, element);
//			}
//			
//			accMatrix.set(i, row2);
//		}
		
		return accMatrix;
		
	}

}
