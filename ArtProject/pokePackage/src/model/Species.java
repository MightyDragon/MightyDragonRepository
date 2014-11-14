package src.model;

import java.util.ArrayList;
import java.util.List;

public class Species {
	
	public static int counter = 0;
	
	public static Species ABRA = new Species("Abra", Type.PSYCHIC);
	static {
		ABRA.setStats(25, 20, 15, 90, 105, 55);
		ABRA.abilities.add(Ability.INNER_FOCUS);
	}
	
	public static Species AIPOM = new Species("Aipom", Type.NORMAL);
	static {
		AIPOM.setStats(55, 70, 55, 85, 40, 55);
	}
	
	public static Species ANORITH = new Species("Anorith", Type.ROCK, Type.BUG);
	static {
		ANORITH.setStats(45, 95, 50, 75, 40, 50);
		ANORITH.abilities.add(Ability.BATTLE_ARMOR);
	}
	
	public static Species ARCHEN = new Species("Archen", Type.ROCK, Type.FLYING);
	static {
		ARCHEN.setStats(55, 112, 45, 70, 74, 45);
		ARCHEN.abilities.add(Ability.DEFEATIST);
	}
	
	public static Species ARON = new Species("Aron", Type.STEEL, Type.ROCK);
	static {
		ARON.setStats(50, 70, 100, 30, 40, 40);
		ARON.abilities.add(Ability.STURDY);
	}
	
	public static Species AXEW = new Species("Axew", Type.DRAGON);
	static {
		AXEW.setStats(46, 87, 60, 57, 30, 40);
	}
	
	public static Species AZURILL = new Species("Azurill", Type.NORMAL);
	static {
		AZURILL.setStats(50, 20, 40, 20, 20, 40);
		AZURILL.abilities.add(Ability.THICK_FAT);
		AZURILL.abilities.add(Ability.HUGE_POWER);
		AZURILL.abilities.add(Ability.SAP_SIPPER);
	}
	
	public static Species BAGON = new Species("Bagon", Type.DRAGON);
	static {
		BAGON.setStats(45, 75, 60, 50, 40, 30);
	}
	
	public static Species BALTOY = new Species("Baltoy", Type.GROUND, Type.PSYCHIC);
	static {
		BALTOY.setStats(40, 40, 55, 55, 40, 70);
		BALTOY.abilities.add(Ability.LEVITATE);
	}
	
	public static Species BARBOACH = new Species("Barboach", Type.WATER, Type.GROUND);
	static {
		BARBOACH.setStats(50, 48, 43, 60, 46, 41);
	}
	
	public static Species BELDUM = new Species("Beldum", Type.STEEL, Type.PSYCHIC);
	static {
		BELDUM.setStats(40, 55, 80, 30, 35, 60);
		BELDUM.abilities.add(Ability.CLEAR_BODY);
	}
	
	public static Species BELLSPROUT = new Species("Bellsprout", Type.GRASS, Type.POISON);
	static {
		BELLSPROUT.setStats(50, 75, 35, 40, 70, 30);
	}
	
	public static Species BIDOOF = new Species("Bidoof", Type.NORMAL);
	static {
		BIDOOF.setStats(59, 45, 40, 31, 35, 40);
		BIDOOF.abilities.add(Ability.SIMPLE);
	}
	
	public static Species BLITZLE = new Species("Blitzle", Type.ELECTRIC);
	static {
		BLITZLE.setStats(45, 60, 32, 76, 50, 32);
		BLITZLE.abilities.add(Ability.MOTOR_DRIVE);
		BLITZLE.abilities.add(Ability.SAP_SIPPER);
	}
	
	public static Species BONSLY = new Species("Bonsly", Type.ROCK);
	static {
		BONSLY.setStats(50, 80, 95, 10, 10, 45);
		BONSLY.abilities.add(Ability.STURDY);
		BONSLY.abilities.add(Ability.RATTLED);
	}
	
	public static Species BRONZOR = new Species("Bronzor", Type.STEEL, Type.PSYCHIC);
	static {
		BRONZOR.setStats(57, 24, 86, 23, 24, 86);
		BRONZOR.abilities.add(Ability.LEVITATE);
		BRONZOR.abilities.add(Ability.HEATPROOF);
	}
	
	public static Species BUDEW = new Species("Budew", Type.GRASS, Type.POISON);
	static {
		BUDEW.setStats(40, 30, 35, 55, 50, 70);
	}
	
	public static Species BUIZEL = new Species("Buizel", Type.WATER);
	static {
		BUIZEL.setStats(55, 65, 35, 85, 60, 30);
		BUIZEL.abilities.add(Ability.WATER_VEIL);
	}
	
	public static Species BULBASAUR = new Species("Bulbasaur", Type.GRASS, Type.POISON);
	static {
//		BULBASAUR.ability1 = Ability.OVERGROW;
		BULBASAUR.levelUpType = 3;
		BULBASAUR.setStats(45, 49, 49, 45, 65, 65);
		BULBASAUR.abilities.add(Ability.OVERGROW);
	}
	
	public static Species BUNEARY = new Species("Buneary", Type.NORMAL);
	static {
		BUNEARY.setStats(55, 66, 44, 85, 44, 56);
		BUNEARY.abilities.add(Ability.LIMBER);
	}
	
	public static Species BURMY = new Species("Burmy", Type.BUG);
	static {
		BURMY.setStats(40, 29, 45, 36, 29, 45);
		BURMY.abilities.add(Ability.SHED_SKIN);
	}
	
	public static Species CACNEA = new Species("Cacnea", Type.GRASS);
	static {
		CACNEA.setStats(50, 85, 40, 35, 85, 40);
		CACNEA.abilities.add(Ability.WATER_ABSORB);
	}
	
	// note: banned in LC
	public static Species CARVANHA = new Species("Carvanha", Type.WATER, Type.DARK);
	static {
		CARVANHA.setStats(45, 90, 20, 65, 65, 20);
		CARVANHA.abilities.add(Ability.SPEED_BOOST);
	}
	
	public static Species CATERPIE = new Species("Caterpie", Type.BUG);
	static {
		CATERPIE.setStats(45, 30, 45, 45, 20, 20);
		CATERPIE.abilities.add(Ability.SHIELD_DUST);
	}
	
	public static Species CHARMANDER = new Species("Charmander", Type.FIRE);
	static {
		CHARMANDER.setStats(39, 52, 43, 65, 60, 50);
		CHARMANDER.abilities.add(Ability.BLAZE);
	}
	
	public static Species CHERUBI = new Species("Cherubi", Type.GRASS);
	static {
		CHERUBI.setStats(45, 35, 45, 35, 62, 52);
	}
	
	public static Species CHIKORITA = new Species("Chikorita", Type.GRASS);
	static {
		CHIKORITA.setStats(45, 49, 65, 45, 49, 65);
		CHIKORITA.abilities.add(Ability.OVERGROW);
	}
	
	public static Species CHIMCHAR = new Species("Chimchar", Type.FIRE);
	static {
		CHIMCHAR.setStats(44, 58, 44, 61, 58, 44);
		CHIMCHAR.abilities.add(Ability.BLAZE);
		CHIMCHAR.abilities.add(Ability.IRON_FIST);
	}
	
	public static Species CHINCHOU = new Species("Chinchou", Type.WATER, Type.ELECTRIC);
	static {
		CHINCHOU.setStats(75, 38, 38, 67, 56, 56);
		CHINCHOU.abilities.add(Ability.VOLT_ABSORB);
		CHINCHOU.abilities.add(Ability.WATER_ABSORB);
	}
	
	public static Species CHINGLING = new Species("Chingling", Type.PSYCHIC);
	static {
		CHINGLING.setStats(45, 30, 50, 45, 65, 50);
		CHINGLING.abilities.add(Ability.LEVITATE);
	}
	
	public static Species CLAMPERL = new Species("Clamperl", Type.WATER);
	static {
		CLAMPERL.setStats(35, 64, 85, 32, 74, 55);
		CLAMPERL.abilities.add(Ability.SHELL_ARMOR);
		CLAMPERL.abilities.add(Ability.RATTLED);
	}
	
	public static Species CLEFFA = new Species("Cleffa", Type.NORMAL);
	static {
		CLEFFA.setStats(50, 25, 28, 15, 45, 55);
	}
	
	public static Species COMBEE = new Species("Combee", Type.BUG, Type.FLYING);
	static {
		COMBEE.setStats(30, 30, 42, 70, 30, 42);
		COMBEE.abilities.add(Ability.HUSTLE);
	}
	
	public static Species CORPHISH = new Species("Corphish", Type.WATER);
	static {
		CORPHISH.setStats(43, 80, 65, 35, 50, 35);
		CORPHISH.abilities.add(Ability.HYPER_CUTTER);
		CORPHISH.abilities.add(Ability.SHELL_ARMOR);
		CORPHISH.abilities.add(Ability.ADAPTABILITY);
	}
	
	public static Species COTTONEE = new Species("Cottonee", Type.GRASS);
	static {
		COTTONEE.setStats(40, 27, 60, 66, 37, 50);
	}
	
	public static Species CRANIDOS = new Species("Cranidos", Type.ROCK);
	static {
		CRANIDOS.setStats(67, 125, 40, 58, 30, 30);
	}
	
	public static Species CROAGUNK = new Species("Croagunk", Type.POISON, Type.FIGHTING);
	static {
		CROAGUNK.setStats(48, 61, 40, 50, 61, 40);
		CROAGUNK.abilities.add(Ability.DRY_SKIN);
	}
	
	public static Species CUBCHOO = new Species("Cubchoo", Type.ICE);
	static {
		CUBCHOO.setStats(55, 70, 40, 40, 60, 40);
		CUBCHOO.abilities.add(Ability.RATTLED);
	}
	
	public static Species CUBONE = new Species("Cubone", Type.GROUND);
	static {
		CUBONE.setStats(50, 50, 95, 35, 40, 50);
		CUBONE.abilities.add(Ability.BATTLE_ARMOR);
	}
	
	public static Species CYNDAQUIL = new Species("Cyndaquil", Type.FIRE);
	static {
		CYNDAQUIL.setStats(39, 52, 43, 65, 60, 50);
		CYNDAQUIL.abilities.add(Ability.BLAZE);
		CYNDAQUIL.abilities.add(Ability.FLASH_FIRE);
	}
	
	public static Species DARUMAKA = new Species("Darumaka", Type.FIRE);
	static {
		DARUMAKA.setStats(70, 90, 45, 50, 15, 45);
		DARUMAKA.abilities.add(Ability.HUSTLE);
		DARUMAKA.abilities.add(Ability.INNER_FOCUS);
	}
	
	public static Species DEERLING = new Species("Deerling", Type.NORMAL, Type.GRASS);
	static {
		DEERLING.setStats(60, 60, 50, 75, 40, 50);
		DEERLING.abilities.add(Ability.SAP_SIPPER);
		DEERLING.abilities.add(Ability.SERENE_GRACE);
	}
	
	public static Species DEINO = new Species("Deino", Type.DARK, Type.DRAGON);
	static {
		DEINO.setStats(52, 65, 50, 38, 45, 50);
		DEINO.abilities.add(Ability.HUSTLE);
	}
	
	public static Species DIGLETT = new Species("Diglett", Type.GROUND);
	static {
		DIGLETT.setStats(10, 55, 25, 95, 35, 45);
	}
	
	public static Species DODUO = new Species("Doduo", Type.NORMAL, Type.FLYING);
	static {
		DODUO.setStats(35, 85, 45, 75, 35, 35);
		DODUO.abilities.add(Ability.EARLY_BIRD);
	}
	
	public static Species DRATINI = new Species("Dratini", Type.DRAGON);
	static {
		DRATINI.setStats(41, 64, 45, 50, 50, 50);
		DRATINI.abilities.add(Ability.SHED_SKIN);
		DRATINI.abilities.add(Ability.MARVEL_SCALE);
	}
	
	public static Species DRIFLOON = new Species("Drifloon", Type.GHOST, Type.FLYING);
	static {
		DRIFLOON.setStats(90, 50, 34, 60, 44, 70);
		DRIFLOON.abilities.add(Ability.FLARE_BOOST);
	}
	
	public static Species DRILBUR = new Species("Drilbur", Type.GROUND);
	static {
		DRILBUR.setStats(60, 85, 40, 68, 30, 45);
	}
	
	public static Species DROWZEE = new Species("Drowzee", Type.PSYCHIC);
	static {
		DROWZEE.setStats(60, 48, 45, 42, 43, 90);
		DROWZEE.abilities.add(Ability.INSOMNIA);
		DROWZEE.abilities.add(Ability.INNER_FOCUS);
	}
	
	public static Species DUCKLETT = new Species("Ducklett", Type.WATER, Type.FLYING);
	static {
		DUCKLETT.setStats(62, 44, 50, 55, 44, 50);
		DUCKLETT.abilities.add(Ability.KEEN_EYE);
		DUCKLETT.abilities.add(Ability.BIG_PECKS);
	}
	
	public static Species DUSKULL = new Species("Duskull", Type.GHOST);
	static {
		DUSKULL.setStats(20, 40, 90, 25, 30, 90);
		DUSKULL.abilities.add(Ability.LEVITATE);
	}
	
	public static Species DWEBBLE = new Species("Dwebble", Type.BUG, Type.ROCK);
	static {
		DWEBBLE.setStats(50, 65, 85, 35, 35, 55);
		DWEBBLE.abilities.add(Ability.STURDY);
		DWEBBLE.abilities.add(Ability.SHELL_ARMOR);
		DWEBBLE.abilities.add(Ability.WEAK_ARMOR);
	}
	
	public static Species EEVEE = new Species("Eevee", Type.NORMAL);
	static {
		EEVEE.setStats(55, 55, 50, 55, 45, 65);
		EEVEE.abilities.add(Ability.ADAPTABILITY);
	}
	
	public static Species EKANS = new Species("Ekans", Type.POISON);
	static {
		EKANS.setStats(35, 60, 44, 55, 40, 54);
		EKANS.abilities.add(Ability.INTIMIDATE);
		EKANS.abilities.add(Ability.SHED_SKIN);
	}
	
	public static Species ELECTRIKE = new Species("Electrike", Type.ELECTRIC);
	static {
		ELECTRIKE.setStats(40, 45, 40, 65, 65, 40);
	}
	
	public static Species ELEKID = new Species("Elekid", Type.ELECTRIC);
	static {
		ELEKID.setStats(45, 63, 37, 95, 65, 55);
		ELEKID.abilities.add(Ability.VITAL_SPIRIT);
	}
	
	public static Species ELGYEM = new Species("Elgyem", Type.PSYCHIC);
	static {
		ELGYEM.setStats(55, 55, 55, 30, 85, 55);
	}
	
	public static Species EXEGGCUTE = new Species("Exeggcute", Type.GRASS, Type.PSYCHIC);
	static {
		EXEGGCUTE.setStats(60, 40, 80, 40, 60, 45);
	}
	
	public static Species FEEBAS = new Species("Feebas", Type.WATER);
	static {
		FEEBAS.setStats(20, 15, 20, 80, 10, 55);
		FEEBAS.abilities.add(Ability.ADAPTABILITY);
	}
	
	public static Species FERROSEED = new Species("Ferroseed", Type.GRASS, Type.STEEL);
	static {
		FERROSEED.setStats(44, 50, 91, 10, 24, 86);
	}
	
	public static Species FINNEON = new Species("Finneon", Type.WATER);
	static {
		FINNEON.setStats(49, 49, 56, 66, 49, 61);
		FINNEON.abilities.add(Ability.STORM_DRAIN);
		FINNEON.abilities.add(Ability.WATER_VEIL);
	}
	
	public static Species FOONGUS = new Species("Foongus", Type.GRASS, Type.POISON);
	static {
		FOONGUS.setStats(69, 55, 45, 15, 55, 55);
	}
	
	public static Species FRILLISH = new Species("Frillish", Type.WATER, Type.GHOST);
	static {
		FRILLISH.setStats(55, 40, 50, 40, 65, 85);
		FRILLISH.abilities.add(Ability.WATER_ABSORB);
	}
	
	public static Species GASTLY = new Species("Gastly", Type.GHOST, Type.POISON);
	static {
		GASTLY.setStats(30, 35, 30, 80, 100, 35);
		GASTLY.abilities.add(Ability.LEVITATE);
	}
	
	public static Species GEODUDE = new Species("Geodude", Type.ROCK, Type.GROUND);
	static {
		GEODUDE.setStats(40, 80, 100, 20, 30, 30);
		GEODUDE.abilities.add(Ability.STURDY);
	}
	
	public static Species GIBLE = new Species("Gible", Type.DRAGON, Type.GROUND);
	static {
		GIBLE.setStats(58, 70, 45, 42, 40, 45);
	}
	
	public static Species GLAMEOW = new Species("Glameow", Type.NORMAL);
	static {
		GLAMEOW.setStats(49, 55, 42, 85, 42, 37);
		GLAMEOW.abilities.add(Ability.LIMBER);
		GLAMEOW.abilities.add(Ability.KEEN_EYE);
	}
	
	// banned in LC
	public static Species GLIGAR = new Species("Gligar", Type.GROUND, Type.FLYING);
	static {
		GLIGAR.setStats(65, 75, 105, 85, 35, 65);
		GLIGAR.abilities.add(Ability.HYPER_CUTTER);
		GLIGAR.abilities.add(Ability.IMMUNITY);
	}
	
	public static Species GOLDEEN = new Species("Goldeen", Type.WATER);
	static {
		GOLDEEN.setStats(45, 67, 60, 63, 35, 50);
		GOLDEEN.abilities.add(Ability.WATER_VEIL);
	}
	
	public static Species GOLETT = new Species("Golett", Type.GROUND, Type.GHOST);
	static {
		GOLETT.setStats(59, 74, 50, 35, 35, 50);
		GOLETT.abilities.add(Ability.IRON_FIST);
		GOLETT.abilities.add(Ability.NO_GUARD);
	}
	
	public static Species GOTHITA = new Species("Gothita", Type.PSYCHIC);
	static {
		GOTHITA.setStats(45, 30, 50, 45, 55, 65);
	}
	
	public static Species GRIMER = new Species("Grimer", Type.POISON);
	static {
		GRIMER.setStats(80, 80, 50, 25, 40, 50);
	}
	
	public static Species GROWLITHE = new Species("Growlithe", Type.FIRE);
	static {
		GROWLITHE.setStats(55, 70, 45, 60, 70, 50);
		GROWLITHE.abilities.add(Ability.INTIMIDATE);
		GROWLITHE.abilities.add(Ability.FLASH_FIRE);
		GROWLITHE.abilities.add(Ability.JUSTIFIED);
	}
	
	public static Species GULPIN = new Species("Gulpin", Type.POISON);
	static {
		GULPIN.setStats(70, 43, 53, 40, 43, 53);
	}
	
	public static Species HAPPINY = new Species("Happiny", Type.NORMAL);
	static {
		HAPPINY.setStats(100, 5, 5, 30, 15, 65);
		HAPPINY.abilities.add(Ability.SERENE_GRACE);
	}
	
	public static Species HIPPOPOTAS = new Species("Hippopotas", Type.GROUND);
	static {
		HIPPOPOTAS.setStats(68, 72, 78, 32, 38, 42);
	}
	
	public static Species HOOTHOOT = new Species("Hoothoot", Type.NORMAL, Type.FLYING);
	static {
		HOOTHOOT.setStats(60, 30, 30, 50, 36, 56);
		HOOTHOOT.abilities.add(Ability.INSOMNIA);
		HOOTHOOT.abilities.add(Ability.KEEN_EYE);
		HOOTHOOT.abilities.add(Ability.TINTED_LENS);
	}
	
	public static Species HOPPIP = new Species("Hoppip", Type.GRASS, Type.FLYING);
	static {
		HOPPIP.setStats(35, 35, 40, 50, 35, 55);
	}
	
	public static Species HORSEA = new Species("Horsea", Type.WATER);
	static {
		HORSEA.setStats(30, 40, 70, 60, 70, 25);
		HORSEA.abilities.add(Ability.SNIPER);
	}
	
	public static Species HOUNDOUR = new Species("Houndour", Type.DARK, Type.FIRE);
	static {
		HOUNDOUR.setStats(45, 60, 30, 65, 80, 50);
		HOUNDOUR.abilities.add(Ability.EARLY_BIRD);
		HOUNDOUR.abilities.add(Ability.FLASH_FIRE);
	}
	
	public static Species IGGLYBUFF = new Species("Igglybuff", Type.NORMAL);
	static {
		IGGLYBUFF.setStats(90, 30, 15, 15, 40, 20);
	}
	
	public static Species JOLTIK = new Species("Joltik", Type.BUG, Type.ELECTRIC);
	static {
		JOLTIK.setStats(50, 47, 50, 65, 57, 50);
		JOLTIK.abilities.add(Ability.COMPOUND_EYES);
		JOLTIK.abilities.add(Ability.SWARM);
	}
	
	public static Species KABUTO = new Species("Kabuto", Type.ROCK, Type.WATER);
	static {
		KABUTO.setStats(30, 80, 90, 55, 55, 45);
		KABUTO.abilities.add(Ability.BATTLE_ARMOR);
		KABUTO.abilities.add(Ability.WEAK_ARMOR);
	}
	
	public static Species KARRABLAST = new Species("Karrablast", Type.BUG);
	static {
		KARRABLAST.setStats(50, 75, 45, 60, 40, 45);
		KARRABLAST.abilities.add(Ability.SWARM);
		KARRABLAST.abilities.add(Ability.SHED_SKIN);
		KARRABLAST.abilities.add(Ability.NO_GUARD);
	}
	
	public static Species KLINK = new Species("Klink", Type.STEEL);
	static {
		KLINK.setStats(40, 55, 70, 30, 45, 60);
		KLINK.abilities.add(Ability.CLEAR_BODY);
	}
	
	public static Species KOFFING = new Species("Koffing", Type.POISON);
	static {
		KOFFING.setStats(40, 65, 95, 35, 60, 45);
		KOFFING.abilities.add(Ability.LEVITATE);
	}
	
	public static Species KRABBY = new Species("Krabby", Type.WATER);
	static {
		KRABBY.setStats(30, 105, 90, 50, 25, 25);
		KRABBY.abilities.add(Ability.HYPER_CUTTER);
		KRABBY.abilities.add(Ability.SHELL_ARMOR);
	}
	
	public static Species KRICKETOT = new Species("Kricketot", Type.BUG);
	static {
		KRICKETOT.setStats(37, 25, 41, 25, 25, 41);
		KRICKETOT.abilities.add(Ability.SHED_SKIN);
	}
	
	public static Species LARVESTA = new Species("Larvesta", Type.BUG, Type.FIRE);
	static {
		LARVESTA.setStats(55, 85, 55, 60, 50, 55);
		LARVESTA.abilities.add(Ability.SWARM);
	}
	
	public static Species LARVITAR = new Species("Larvitar", Type.ROCK, Type.GROUND);
	static {
		LARVITAR.setStats(50, 64, 50, 41, 45, 50);
		LARVITAR.abilities.add(Ability.GUTS);
	}
	
	public static Species LEDYBA = new Species("Ledyba", Type.BUG, Type.FLYING);
	static {
		LEDYBA.setStats(40, 20, 30, 55, 40, 80);
		LEDYBA.abilities.add(Ability.SWARM);
		LEDYBA.abilities.add(Ability.EARLY_BIRD);
		LEDYBA.abilities.add(Ability.RATTLED);
	}
	
	public static Species LICKITUNG = new Species("Lickitung", Type.NORMAL);
	static {
		LICKITUNG.setStats(90, 55, 75, 30, 60, 75);
	}
	
	public static Species LILEEP = new Species("Lileep", Type.ROCK, Type.GRASS);
	static {
		LILEEP.setStats(66, 41, 77, 23, 61, 87);
		LILEEP.abilities.add(Ability.STORM_DRAIN);
	}
	
	public static Species LILLIPUP = new Species("Lillipup", Type.NORMAL);
	static {
		LILLIPUP.setStats(45, 60, 45, 55, 25, 45);
		LILLIPUP.abilities.add(Ability.VITAL_SPIRIT);
	}
	
	public static Species LITWICK = new Species("Litwick", Type.GHOST, Type.FIRE);
	static {
		LITWICK.setStats(50, 30, 55, 20, 65, 55);
		LITWICK.abilities.add(Ability.FLASH_FIRE);
	}
	
	public static Species LOTAD = new Species("Lotad", Type.WATER, Type.GRASS);
	static {
		LOTAD.setStats(40, 30, 30, 30, 40, 50);
	}
	
	public static Species MACHOP = new Species("Machop", Type.FIGHTING);
	static {
		MACHOP.setStats(70, 80, 50, 35, 35, 35);
		MACHOP.abilities.add(Ability.GUTS);
		MACHOP.abilities.add(Ability.NO_GUARD);
		MACHOP.abilities.add(Ability.STEADFAST);
	}
	
	public static Species MAGBY = new Species("Magby", Type.FIRE);
	static {
		MAGBY.setStats(45, 75, 37, 83, 70, 55);
		MAGBY.abilities.add(Ability.VITAL_SPIRIT);
	}
	
	public static Species MAGIKARP = new Species("Magikarp", Type.WATER);
	static {
		MAGIKARP.setStats(20, 10, 55, 80, 15, 20);
		MAGIKARP.abilities.add(Ability.RATTLED);
	}
	
	public static Species MAGNEMITE = new Species("Magnemite", Type.ELECTRIC, Type.STEEL);
	static {
		MAGNEMITE.setStats(25, 35, 70, 45, 95, 55);
		MAGNEMITE.abilities.add(Ability.STURDY);
	}
	
	public static Species MAKUHITA = new Species("Makuhita", Type.FIGHTING);
	static {
		MAKUHITA.setStats(72, 60, 30, 25, 20, 30);
		MAKUHITA.abilities.add(Ability.THICK_FAT);
		MAKUHITA.abilities.add(Ability.GUTS);
	}
	
	public static Species MANKEY = new Species("Mankey", Type.FIGHTING);
	static {
		MANKEY.setStats(40, 80, 35, 70, 35, 45);
		MANKEY.abilities.add(Ability.VITAL_SPIRIT);
		MANKEY.abilities.add(Ability.ANGER_POINT);
	}
	
	public static Species MANTYKE = new Species("Mantyke", Type.WATER, Type.FLYING);
	static {
		MANTYKE.setStats(45, 20, 50, 50, 60, 120);
		MANTYKE.abilities.add(Ability.WATER_ABSORB);
		MANTYKE.abilities.add(Ability.WATER_VEIL);
	}
	
	public static Species MAREEP = new Species("Mareep", Type.ELECTRIC);
	static {
		MAREEP.setStats(55, 40, 40, 35, 65, 45);
	}
	
	// banned in LC
	public static Species MEDITITE = new Species("Meditite", Type.FIGHTING, Type.PSYCHIC);
	static {
		MEDITITE.setStats(30, 40, 55, 60, 40, 55);
		MEDITITE.abilities.add(Ability.PURE_POWER);
	}
	
	public static Species MEOWTH = new Species("Meowth", Type.NORMAL);
	static {
		MEOWTH.setStats(40, 45, 35, 90, 40, 40);
		MEOWTH.abilities.add(Ability.TECHNICIAN);
	}
	
	public static Species MIENFOO = new Species("Mienfoo", Type.FIGHTING);
	static {
		MIENFOO.setStats(45, 85, 50, 65, 55, 50);
		MIENFOO.abilities.add(Ability.INNER_FOCUS);
	}
	
	public static Species MIME_JR = new Species("Mime Jr.", Type.PSYCHIC);
	static {
		MIME_JR.setStats(20, 25, 45, 60, 70, 90);
		MIME_JR.abilities.add(Ability.FILTER);
		MIME_JR.abilities.add(Ability.TECHNICIAN);
	}
	
	public static Species MINCCINO = new Species("Minccino", Type.NORMAL);
	static {
		MINCCINO.setStats(55, 50, 40, 75, 40, 40);
		MINCCINO.abilities.add(Ability.TECHNICIAN);
	}
	
	public static Species MISDREAVUS = new Species("Misdreavus", Type.GHOST);
	static {
		MISDREAVUS.setStats(60, 60, 60, 85, 85, 85);
		MISDREAVUS.abilities.add(Ability.LEVITATE);
	}
	
	public static Species MUDKIP = new Species("Mudkip", Type.WATER);
	static {
		MUDKIP.setStats(50, 70, 50, 40, 50, 50);
		MUDKIP.abilities.add(Ability.TORRENT);
	}
	
	public static Species MUNCHLAX = new Species("Munchlax", Type.NORMAL);
	static {
		MUNCHLAX.setStats(135, 85, 40, 5, 40, 85);
		MUNCHLAX.abilities.add(Ability.THICK_FAT);
	}
	
	public static Species MUNNA = new Species("Munna", Type.PSYCHIC);
	static {
		MUNNA.setStats(76, 25, 45, 24, 67, 55);
	}
	
	public static Species MURKROW = new Species("Murkrow", Type.DARK, Type.FLYING);
	static {
		MURKROW.setStats(60, 85, 42, 91, 85, 42);
		MURKROW.abilities.add(Ability.INSOMNIA);
	}
	
	public static Species NATU = new Species("Natu", Type.PSYCHIC, Type.FLYING);
	static {
		NATU.setStats(40, 50, 45, 70, 45, 70);
		NATU.abilities.add(Ability.EARLY_BIRD);
	}
	
	public static Species NIDORAN_F = new Species("Nidoran-F", Type.POISON);
	static {
		NIDORAN_F.setStats(55, 47, 52, 41, 40, 40);
		NIDORAN_F.abilities.add(Ability.HUSTLE);
	}
	
	public static Species NIDORAN_M = new Species("Nidoran-M", Type.POISON);
	static {
		NIDORAN_M.setStats(46, 57, 40, 50, 40, 40);
		NIDORAN_M.abilities.add(Ability.HUSTLE);
	}
	
	public static Species NINCADA = new Species("Nincada", Type.BUG, Type.GROUND);
	static {
		NINCADA.setStats(31, 45, 90, 40, 30, 30);
		NINCADA.abilities.add(Ability.COMPOUND_EYES);
	}
	
	public static Species NOSEPASS = new Species("Nosepass", Type.ROCK);
	static {
		NOSEPASS.setStats(30, 45, 135, 30, 45, 90);
		NOSEPASS.abilities.add(Ability.STURDY);
	}
	
	public static Species NUMEL = new Species("Numel", Type.FIRE, Type.GROUND);
	static {
		NUMEL.setStats(60, 60, 40, 35, 65, 45);
		NUMEL.abilities.add(Ability.SIMPLE);
	}
	
	public static Species ODDISH = new Species("Oddish", Type.GRASS, Type.POISON);
	static {
		ODDISH.setStats(45, 50, 55, 30, 75, 65);
	}
	
	public static Species OMANYTE = new Species("Omanyte", Type.ROCK, Type.WATER);
	static {
		OMANYTE.setStats(35, 40, 100, 35, 90, 55);
		OMANYTE.abilities.add(Ability.SHELL_ARMOR);
		OMANYTE.abilities.add(Ability.WEAK_ARMOR);
	}
	
	public static Species ONIX = new Species("Onix", Type.ROCK, Type.GROUND);
	static {
		ONIX.setStats(35, 45, 160, 70, 30, 45);
		ONIX.abilities.add(Ability.STURDY);
		ONIX.abilities.add(Ability.WEAK_ARMOR);
	}
	
	public static Species OSHAWOTT = new Species("Oshawott", Type.WATER);
	static {
		OSHAWOTT.setStats(55, 55, 45, 45, 63, 45);
		OSHAWOTT.abilities.add(Ability.TORRENT);
		OSHAWOTT.abilities.add(Ability.SHELL_ARMOR);
	}
	
	public static Species PANPOUR = new Species("Panpour", Type.WATER);
	static {
		PANPOUR.setStats(50, 53, 48, 64, 53, 48);
		PANPOUR.abilities.add(Ability.TORRENT);
	}
	
	public static Species PANSAGE = new Species("Pansage", Type.GRASS);
	static {
		PANSAGE.setStats(50, 53, 48, 64, 53, 48);
		PANSAGE.abilities.add(Ability.OVERGROW);
	}
	
	public static Species PANSEAR = new Species("Pansear", Type.FIRE);
	static {
		PANSEAR.setStats(50, 53, 48, 64, 53, 48);
		PANSEAR.abilities.add(Ability.BLAZE);
	}
	
	public static Species PARAS = new Species("Paras", Type.BUG, Type.GRASS);
	static {
		PARAS.setStats(35, 70, 55, 25, 45, 55);
		PARAS.abilities.add(Ability.DRY_SKIN);
	}
	
	public static Species PATRAT = new Species("Patrat", Type.NORMAL);
	static {
		PATRAT.setStats(45, 55, 39, 42, 35, 39);
		PATRAT.abilities.add(Ability.KEEN_EYE);
	}
	
	public static Species PAWNIARD = new Species("Pawniard", Type.DARK, Type.STEEL);
	static {
		PAWNIARD.setStats(45, 85, 70, 60, 40, 40);
		PAWNIARD.abilities.add(Ability.INNER_FOCUS);
	}
	
	public static Species PETILIL = new Species("Petilil", Type.GRASS);
	static {
		PETILIL.setStats(45, 35, 50, 30, 70, 50);
	}
	
	public static Species PHANPY = new Species("Phanpy", Type.GROUND);
	static {
		PHANPY.setStats(90, 60, 60, 40, 40, 40);
	}
	
	public static Species PICHU = new Species("Pichu", Type.ELECTRIC);
	static {
		PICHU.setStats(20, 40, 15, 60, 35, 35);
	}
	
	public static Species PIDGEY = new Species("Pidgey", Type.NORMAL, Type.FLYING);
	static {
		PIDGEY.setStats(40, 45, 40, 56, 35, 35);
		PIDGEY.abilities.add(Ability.KEEN_EYE);
		PIDGEY.abilities.add(Ability.BIG_PECKS);
	}
	
	public static Species PIDOVE = new Species("Pidove", Type.NORMAL, Type.FLYING);
	static {
		PIDOVE.setStats(50, 55, 50, 43, 36, 30);
		PIDOVE.abilities.add(Ability.BIG_PECKS);
	}
	
	public static Species PINECO = new Species("Pineco", Type.BUG);
	static {
		PINECO.setStats(50, 65, 90, 15, 35, 35);
		PINECO.abilities.add(Ability.STURDY);
	}
	
	public static Species PIPLUP = new Species("Piplup", Type.WATER);
	static {
		PIPLUP.setStats(53, 51, 53, 40, 61, 56);
		PIPLUP.abilities.add(Ability.TORRENT);
	}
	
	public static Species POLIWAG = new Species("Poliwag", Type.WATER);
	static {
		POLIWAG.setStats(40, 50, 40, 90, 40, 40);
		POLIWAG.abilities.add(Ability.WATER_ABSORB);
	}
	
	public static Species PONYTA = new Species("Ponyta", Type.FIRE);
	static {
		PONYTA.setStats(50, 85, 55, 90, 65, 65);
		PONYTA.abilities.add(Ability.FLASH_FIRE);
	}
	
	public static Species POOCHYENA = new Species("Poochyena", Type.DARK);
	static {
		POOCHYENA.setStats(35, 55, 35, 35, 30, 30);
		POOCHYENA.abilities.add(Ability.QUICK_FEET);
		POOCHYENA.abilities.add(Ability.RATTLED);
	}
	
	public static Species PORYGON = new Species("Porygon", Type.NORMAL);
	static {
		PORYGON.setStats(65, 60, 70, 40, 85, 75);
		PORYGON.abilities.add(Ability.DOWNLOAD);
	}
	
	public static Species PSYDUCK = new Species("Psyduck", Type.WATER);
	static {
		PSYDUCK.setStats(50, 53, 48, 55, 65, 50);
	}
	
	public static Species PURRLOIN = new Species("Purrloin", Type.DARK);
	static {
		PURRLOIN.setStats(41, 50, 37, 66, 50, 37);
		PURRLOIN.abilities.add(Ability.LIMBER);
	}
	
	public static Species RALTS = new Species("Ralts", Type.PSYCHIC);
	static {
		RALTS.setStats(28, 25, 25, 40, 45, 35);
	}
	
	public static Species RATTATA = new Species("Rattata", Type.NORMAL);
	static {
		RATTATA.setStats(30, 56, 35, 72, 25, 35);
		RATTATA.abilities.add(Ability.GUTS);
		RATTATA.abilities.add(Ability.HUSTLE);
	}
	
	public static Species REMORAID = new Species("Remoraid", Type.WATER);
	static {
		REMORAID.setStats(35, 65, 35, 65, 65, 35);
		REMORAID.abilities.add(Ability.HUSTLE);
		REMORAID.abilities.add(Ability.SNIPER);
	}
	
	public static Species RHYHORN = new Species("Rhyhorn", Type.GROUND, Type.ROCK);
	static {
		RHYHORN.setStats(80, 85, 95, 25, 30, 30);
	}
	
	public static Species RIOLU = new Species("Riolu", Type.FIGHTING);
	static {
		RIOLU.setStats(40, 70, 40, 60, 35, 40);
		RIOLU.abilities.add(Ability.STEADFAST);
		RIOLU.abilities.add(Ability.INNER_FOCUS);
	}
	
	public static Species ROGGENROLA = new Species("Roggenrola", Type.ROCK);
	static {
		ROGGENROLA.setStats(55, 75, 85, 15, 25, 25);
		ROGGENROLA.abilities.add(Ability.STURDY);
	}
	
	public static Species RUFFLET = new Species("Rufflet", Type.NORMAL, Type.FLYING);
	static {
		RUFFLET.setStats(70, 83, 50, 60, 37, 50);
		RUFFLET.abilities.add(Ability.KEEN_EYE);
		RUFFLET.abilities.add(Ability.HUSTLE);
	}
	
	public static Species SANDILE = new Species("Sandile", Type.GROUND, Type.DARK);
	static {
		SANDILE.setStats(50, 72, 35, 65, 35, 35);
		SANDILE.abilities.add(Ability.INTIMIDATE);
		SANDILE.abilities.add(Ability.ANGER_POINT);
	}
	
	public static Species SANDSHREW = new Species("Sandshrew", Type.GROUND);
	static {
		SANDSHREW.setStats(50, 75, 85, 40, 20, 30);
	}
	
	public static Species SCRAGGY = new Species("Scraggy", Type.DARK, Type.FIGHTING);
	static {
		SCRAGGY.setStats(50, 75, 70, 48, 35, 70);
		SCRAGGY.abilities.add(Ability.SHED_SKIN);
		SCRAGGY.abilities.add(Ability.INTIMIDATE);
	}
	
	// banned in LC
	public static Species SCYTHER = new Species("Scyther", Type.BUG, Type.FLYING);
	static {
		SCYTHER.setStats(70, 110, 80, 105, 55, 80);
		SCYTHER.abilities.add(Ability.SWARM);
		SCYTHER.abilities.add(Ability.TECHNICIAN);
		SCYTHER.abilities.add(Ability.STEADFAST);
	}
	
	public static Species SEEDOT = new Species("Seedot", Type.GRASS);
	static {
		SEEDOT.setStats(40, 40, 50, 30, 30, 30);
		SEEDOT.abilities.add(Ability.EARLY_BIRD);
	}
	
	public static Species SEEL = new Species("Seel", Type.WATER);
	static {
		SEEL.setStats(65, 45, 55, 45, 45, 70);
		SEEL.abilities.add(Ability.THICK_FAT);
	}
	
	public static Species SENTRET = new Species("Sentret", Type.NORMAL);
	static {
		SENTRET.setStats(35, 46, 34, 20, 35, 45);
		SENTRET.abilities.add(Ability.KEEN_EYE);
	}
	
	public static Species SHELLDER = new Species("Shellder", Type.WATER);
	static {
		SHELLDER.setStats(30, 65, 100, 40, 45, 25);
		SHELLDER.abilities.add(Ability.SHELL_ARMOR);
	}
	
	public static Species SHELLOS = new Species("Shellos", Type.WATER);
	static {
		SHELLOS.setStats(76, 48, 48, 34, 57, 62);
		SHELLOS.abilities.add(Ability.STORM_DRAIN);
	}
	
	public static Species SHELMET = new Species("Shelmet", Type.BUG);
	static {
		SHELMET.setStats(50, 40, 85, 25, 40, 65);
		SHELMET.abilities.add(Ability.SHELL_ARMOR);
	}
	
	public static Species SHIELDON = new Species("Shieldon", Type.ROCK, Type.STEEL);
	static {
		SHIELDON.setStats(30, 42, 118, 30, 42, 88);
		SHIELDON.abilities.add(Ability.STURDY);
	}
	
	public static Species SHINX = new Species("Shinx", Type.ELECTRIC);
	static {
		SHINX.setStats(45, 65, 34, 45, 40, 34);
		SHINX.abilities.add(Ability.INTIMIDATE);
		SHINX.abilities.add(Ability.GUTS);
	}
	
	public static Species SHROOMISH = new Species("Shroomish", Type.GRASS);
	static {
		SHROOMISH.setStats(60, 40, 60, 35, 40, 60);
		SHROOMISH.abilities.add(Ability.POISON_HEAL);
		SHROOMISH.abilities.add(Ability.QUICK_FEET);
	}
	
	public static Species SHUPPET = new Species("Shuppet", Type.GHOST);
	static {
		SHUPPET.setStats(44, 75, 35, 45, 63, 33);
		SHUPPET.abilities.add(Ability.INSOMNIA);
	}
	
	public static Species SKITTY = new Species("Skitty", Type.NORMAL);
	static {
		SKITTY.setStats(50, 45, 45, 50, 35, 35);
		SKITTY.abilities.add(Ability.WONDER_SKIN);
	}
	
	public static Species SKORUPI = new Species("Skorupi", Type.POISON, Type.BUG);
	static {
		SKORUPI.setStats(40, 50, 90, 65, 30, 55);
		SKORUPI.abilities.add(Ability.BATTLE_ARMOR);
		SKORUPI.abilities.add(Ability.SNIPER);
	}
	
	public static Species SLAKOTH = new Species("Slakoth", Type.NORMAL);
	static {
		SLAKOTH.setStats(60, 60, 60, 30, 35, 35);
	}
	
	public static Species SLOWPOKE = new Species("Slowpoke", Type.WATER, Type.PSYCHIC);
	static {
		SLOWPOKE.setStats(90, 65, 65, 15, 40, 40);
	}
	
	public static Species SLUGMA = new Species("Slugma", Type.FIRE);
	static {
		SLUGMA.setStats(40, 40, 40, 20, 70, 40);
		SLUGMA.abilities.add(Ability.MAGMA_ARMOR);
		SLUGMA.abilities.add(Ability.WEAK_ARMOR);
	}
	
	public static Species SMOOCHUM = new Species("Smoochum", Type.ICE, Type.PSYCHIC);
	static {
		SMOOCHUM.setStats(45, 30, 15, 65, 85, 65);
	}
	
	// banned in LC
	public static Species SNEASEL = new Species("Sneasel", Type.DARK, Type.ICE);
	static {
		SNEASEL.setStats(55, 95, 55, 115, 35, 75);
		SNEASEL.abilities.add(Ability.INNER_FOCUS);
		SNEASEL.abilities.add(Ability.KEEN_EYE);
	}
	
	public static Species SNIVY = new Species("Snivy", Type.GRASS);
	static {
		SNIVY.setStats(45, 45, 55, 63, 45, 55);
		SNIVY.abilities.add(Ability.OVERGROW);
	}
	
	public static Species SNORUNT = new Species("Snorunt", Type.ICE);
	static {
		SNORUNT.setStats(50, 50, 50, 50, 50, 50);
		SNORUNT.abilities.add(Ability.INNER_FOCUS);
	}
	
	public static Species SNOVER = new Species("Snover", Type.GRASS, Type.ICE);
	static {
		SNOVER.setStats(60, 62, 50, 40, 62, 60);
	}
	
	public static Species SNUBBULL = new Species("Snubbull", Type.NORMAL);
	static {
		SNUBBULL.setStats(60, 80, 50, 30, 40, 40);
		SNUBBULL.abilities.add(Ability.INTIMIDATE);
		SNUBBULL.abilities.add(Ability.RATTLED);
	}
	
	public static Species SOLOSIS = new Species("Solosis", Type.PSYCHIC);
	static {
		SOLOSIS.setStats(45, 30, 40, 20, 105, 50);
	}
	
	public static Species SPEAROW = new Species("Spearow", Type.NORMAL, Type.FLYING);
	static {
		SPEAROW.setStats(40, 60, 30, 70, 31, 31);
		SPEAROW.abilities.add(Ability.KEEN_EYE);
		SPEAROW.abilities.add(Ability.SNIPER);
	}
	
	public static Species SPHEAL = new Species("Spheal", Type.ICE, Type.WATER);
	static {
		SPHEAL.setStats(70, 40, 50, 25, 55, 50);
		SPHEAL.abilities.add(Ability.THICK_FAT);
	}
	
	public static Species SPINARAK = new Species("Spinarak", Type.BUG, Type.POISON);
	static {
		SPINARAK.setStats(40, 60, 40, 30, 40, 40);
		SPINARAK.abilities.add(Ability.SWARM);
		SPINARAK.abilities.add(Ability.INSOMNIA);
		SPINARAK.abilities.add(Ability.SNIPER);
	}
	
	public static Species SPOINK = new Species("Spoink", Type.PSYCHIC);
	static {
		SPOINK.setStats(60, 25, 35, 60, 70, 80);
		SPOINK.abilities.add(Ability.THICK_FAT);
	}
	
	public static Species SQUIRTLE = new Species("Squirtle", Type.WATER);
	static {
		SQUIRTLE.setStats(44, 48, 65, 43, 64, 43);
		SQUIRTLE.abilities.add(Ability.TORRENT);
	}
	
	public static Species STARLY = new Species("Starly", Type.NORMAL, Type.FLYING);
	static {
		STARLY.setStats(40, 55, 30, 60, 30, 30);
		STARLY.abilities.add(Ability.KEEN_EYE);
	}
	
	public static Species STARYU = new Species("Staryu", Type.WATER);
	static {
		STARYU.setStats(30, 45, 55, 85, 70, 55);
	}
	
	public static Species STUNKY = new Species("Stunky", Type.POISON, Type.DARK);
	static {
		STUNKY.setStats(63, 63, 47, 74, 41, 41);
		STUNKY.abilities.add(Ability.KEEN_EYE);
	}
	
	public static Species SUNKERN = new Species("Sunkern", Type.GRASS);
	static {
		SUNKERN.setStats(30, 30, 30, 30, 30, 30);
		SUNKERN.abilities.add(Ability.EARLY_BIRD);
	}
	
	public static Species SURSKIT = new Species("Surskit", Type.BUG, Type.WATER);
	static {
		SURSKIT.setStats(40, 30, 32, 65, 50, 52);
	}
	
	public static Species SWABLU = new Species("Swablu", Type.NORMAL, Type.FLYING);
	static {
		SWABLU.setStats(45, 40, 60, 50, 40, 75);
	}
	
	public static Species SWINUB = new Species("Swinub", Type.ICE, Type.GROUND);
	static {
		SWINUB.setStats(50, 50, 40, 50, 30, 30);
		SWINUB.abilities.add(Ability.THICK_FAT);
	}
	
	// banned in LC
	public static Species TANGELA = new Species("Tangela", Type.GRASS);
	static {
		TANGELA.setStats(65, 55, 115, 60, 100, 40);
	}
	
	public static Species TAILLOW = new Species("Taillow", Type.NORMAL, Type.FLYING);
	static {
		TAILLOW.setStats(40, 55, 30, 85, 30, 30);
		TAILLOW.abilities.add(Ability.GUTS);
		TAILLOW.abilities.add(Ability.SCRAPPY);
	}
	
	public static Species TEDDIURSA = new Species("Teddiursa", Type.NORMAL);
	static {
		TEDDIURSA.setStats(60, 80, 50, 40, 50, 50);
		TEDDIURSA.abilities.add(Ability.QUICK_FEET);
	}
	
	public static Species TENTACOOL = new Species("Tentacool", Type.WATER, Type.POISON);
	static {
		TENTACOOL.setStats(40, 40, 35, 70, 50, 100);
		TENTACOOL.abilities.add(Ability.CLEAR_BODY);
	}
	
	public static Species TIMBURR = new Species("Timburr", Type.FIGHTING);
	static {
		TIMBURR.setStats(75, 80, 55, 35, 25, 35);
		TIMBURR.abilities.add(Ability.GUTS);
		TIMBURR.abilities.add(Ability.IRON_FIST);
	}
	
	public static Species TIRTOUGA = new Species("Tirtouga", Type.WATER, Type.ROCK);
	static {
		TIRTOUGA.setStats(54, 78, 103, 22, 53, 45);
		TIRTOUGA.abilities.add(Ability.SOLID_ROCK);
		TIRTOUGA.abilities.add(Ability.STURDY);
	}
	
	public static Species TOGEPI = new Species("Togepi", Type.NORMAL);
	static {
		TOGEPI.setStats(35, 20, 65, 20, 40, 65);
		TOGEPI.abilities.add(Ability.HUSTLE);
		TOGEPI.abilities.add(Ability.SERENE_GRACE);
	}
	
	public static Species TORCHIC = new Species("Torchic", Type.FIRE);
	static {
		TORCHIC.setStats(45, 60, 40, 45, 70, 50);
		TORCHIC.abilities.add(Ability.BLAZE);
		TORCHIC.abilities.add(Ability.SPEED_BOOST);
	}
	
	public static Species TOTODILE = new Species("Totodile", Type.WATER);
	static {
		TOTODILE.setStats(50, 65, 64, 43, 44, 48);
		TOTODILE.abilities.add(Ability.TORRENT);
	}
	
	public static Species TRAPINCH = new Species("Trapinch", Type.GROUND);
	static {
		TRAPINCH.setStats(45, 100, 45, 10, 45, 45);
		TRAPINCH.abilities.add(Ability.HYPER_CUTTER);
	}
	
	public static Species TREECKO = new Species("Treecko", Type.GRASS);
	static {
		TREECKO.setStats(40, 45, 35, 70, 65, 55);
		TREECKO.abilities.add(Ability.OVERGROW);
	}
	
	public static Species TRUBBISH = new Species("Trubbish", Type.POISON);
	static {
		TRUBBISH.setStats(50, 50, 62, 65, 40, 62);
	}
	
	public static Species TURTWIG = new Species("Turtwig", Type.GRASS);
	static {
		TURTWIG.setStats(55, 68, 64, 31, 45, 55);
		TURTWIG.abilities.add(Ability.OVERGROW);
		TURTWIG.abilities.add(Ability.SHELL_ARMOR);
	}
	
	public static Species TYMPOLE = new Species("Tympole", Type.WATER);
	static {
		TYMPOLE.setStats(50, 50, 40, 64, 50, 40);
		TYMPOLE.abilities.add(Ability.WATER_ABSORB);
	}
	
	public static Species TYNAMO = new Species("Tynamo", Type.ELECTRIC);
	static {
		TYNAMO.setStats(35, 55, 40, 60, 45, 40);
		TYNAMO.abilities.add(Ability.LEVITATE);
	}
	
	public static Species TYROGUE = new Species("Tyrogue", Type.FIGHTING);
	static {
		TYROGUE.setStats(35, 35, 35, 35, 35, 35);
		TYROGUE.abilities.add(Ability.GUTS);
		TYROGUE.abilities.add(Ability.STEADFAST);
		TYROGUE.abilities.add(Ability.VITAL_SPIRIT);
	}
	
	public static Species VANILLITE = new Species("Vanillite", Type.ICE);
	static {
		VANILLITE.setStats(36, 50, 50, 44, 65, 60);
		VANILLITE.abilities.add(Ability.WEAK_ARMOR);
	}
	
	public static Species VENIPEDE = new Species("Venipede", Type.BUG, Type.POISON);
	static {
		VENIPEDE.setStats(30, 45, 59, 57, 30, 39);
		VENIPEDE.abilities.add(Ability.SWARM);
		// Note: hidden ability is Speed Boost for Gen VI +
	}
	
	public static Species VENONAT = new Species("Venonat", Type.BUG, Type.POISON);
	static {
		VENONAT.setStats(60, 55, 50, 45, 40, 55);
		VENONAT.abilities.add(Ability.COMPOUND_EYES);
		VENONAT.abilities.add(Ability.TINTED_LENS);
	}
	
	public static Species VOLTORB = new Species("Voltorb", Type.ELECTRIC);
	static {
		VOLTORB.setStats(40, 30, 50, 100, 55, 55);
	}
	
	public static Species VULLABY = new Species("Vullaby", Type.DARK, Type.FIGHTING);
	static {
		VULLABY.setStats(70, 55, 75, 60, 45, 65);
		VULLABY.abilities.add(Ability.BIG_PECKS);
		VULLABY.abilities.add(Ability.WEAK_ARMOR);
	}
	
	// banned in LC
	public static Species VULPIX = new Species("Vulpix", Type.FIRE);
	static {
		VULPIX.setStats(38, 41, 40, 65, 50, 65);
		VULPIX.abilities.add(Ability.FLASH_FIRE);
	}
	
	public static Species WAILMER = new Species("Wailmer", Type.WATER);
	static {
		WAILMER.setStats(130, 70, 35, 60, 70, 35);
		WAILMER.abilities.add(Ability.WATER_VEIL);
	}
	
	public static Species WEEDLE = new Species("Weedle", Type.BUG, Type.POISON);
	static {
		WEEDLE.setStats(40, 35, 30, 50, 20, 20);
		WEEDLE.abilities.add(Ability.SHIELD_DUST);
	}
	
	public static Species WHISMUR = new Species("Whismur", Type.NORMAL);
	static {
		WHISMUR.setStats(64, 51, 23, 28, 51, 23);
		WHISMUR.abilities.add(Ability.RATTLED);
	}
	
	public static Species WINGULL = new Species("Wingull", Type.WATER, Type.FLYING);
	static {
		WINGULL.setStats(40, 30, 30, 85, 55, 30);
		WINGULL.abilities.add(Ability.KEEN_EYE);
	}
	
	public static Species WOOBAT = new Species("Woobat", Type.PSYCHIC, Type.FLYING);
	static {
		WOOBAT.setStats(55, 45, 43, 72, 55, 43);
		WOOBAT.abilities.add(Ability.SIMPLE);
	}
	
	public static Species WOOPER = new Species("Wooper", Type.WATER, Type.GROUND);
	static {
		WOOPER.setStats(55, 45, 45, 15, 25, 25);
		WOOPER.abilities.add(Ability.WATER_ABSORB);
	}
	
	public static Species WURMPLE = new Species("Wurmple", Type.BUG);
	static {
		WURMPLE.setStats(45, 45, 35, 20, 20, 30);
		WURMPLE.abilities.add(Ability.SHIELD_DUST);
	}
	
	public static Species WYNAUT = new Species("Wynaut", Type.PSYCHIC);
	static {
		WYNAUT.setStats(95, 23, 48, 23, 23, 48);
	}
	
	public static Species YAMASK = new Species("Yamask", Type.GHOST);
	static {
		YAMASK.setStats(38, 30, 85, 30, 55, 65);
	}
	
	// banned in LC
	public static Species YANMA = new Species("Yanma", Type.BUG, Type.FLYING);
	static {
		YANMA.setStats(65, 65, 45, 95, 75, 45);
		YANMA.abilities.add(Ability.SPEED_BOOST);
		YANMA.abilities.add(Ability.COMPOUND_EYES);
	}
	
	public static Species ZIGZAGOON = new Species("Zigzagoon", Type.NORMAL);
	static {
		ZIGZAGOON.setStats(38, 30, 41, 60, 30, 41);
		ZIGZAGOON.abilities.add(Ability.QUICK_FEET);
	}
	
	public static Species ZORUA = new Species("Zorua", Type.DARK);
	static {
		ZORUA.setStats(40, 65, 40, 65, 80, 40);
	}
	
	public static Species ZUBAT = new Species("Zubat", Type.POISON, Type.FLYING);
	static {
		ZUBAT.setStats(40, 45, 35, 55, 30, 40);
		ZUBAT.abilities.add(Ability.INNER_FOCUS);
	}
	
	String name;
	
	private int baseHP;
	private int baseAttack;
	private int baseDefence;
	private int baseSpeed;
	private int baseSpAttack;
	private int baseSpDefence;
	
	Type type1;
	Type type2;
	
	int levelUpType;
	/*
	 * 0 = Medium Fast
	 * 1 = Erratic
	 * 2 = Fluctuating
	 * 3 = Medium Slow
	 * 4 = Fast
	 * 5 = Slow
	 */
	
	Ability ability1;
	Ability ability2;
	
	List<Ability> abilities;
	
	public Species(String name, Type t1, Type t2) {
		this.name = name;
		type1 = t1;
		type2 = t2;
		setStats(1, 0, 1, 0, 0, 1);
		abilities = new ArrayList<Ability>(3);
		counter++;
	}
	
	public Species(String name, Type t1) {
		this.name = name;
		type1 = t1;
		setStats(1, 0, 1, 0, 0, 1);
		abilities = new ArrayList<Ability>(3);
		counter++;
	}

	private void setStats(int hp, int att, int def, int spd, int spAtt, int spDef) {
		setHP(hp);
		setAttack(att);
		setDefence(def);
		setSpeed(spd);
		setSpAttack(spAtt);
		setSpDefence(spDef);
	}
	
	public Type getType1() {
		return type1;
	}

	public Type getType2() {
		return type2;
	}

	private void setHP(int hp) {
		baseHP = hp;
	}
	
	public int getHP() {
		return baseHP;
	}
	
	private void setAttack(int att) {
		baseAttack = att;
	}
	
	public int getAttack() {
		return baseAttack;
	}
	
	private void setDefence(int def) {
		baseDefence = def;
	}
	
	public int getDefence() {
		return baseDefence;
	}
	
	private void setSpeed(int spd) {
		baseSpeed = spd;
	}

	public int getSpeed() {
		return baseSpeed;
	}
	
	private void setSpAttack(int spAtt) {
		baseSpAttack = spAtt;
	}
	
	public int getSpAttack() {
		return baseSpAttack;
	}
	
	private void setSpDefence(int spDef) {
		baseSpDefence = spDef;
	}
	
	public int getSpDefence() {
		return baseSpDefence;
	}
	
	public static int getCounter() {
	    return counter;
	}

}
